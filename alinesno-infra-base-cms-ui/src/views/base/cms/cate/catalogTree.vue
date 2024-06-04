<template>
  <div class="catalog-tree">
    <div class="head-container">
      <el-button
          v-if="showNewBtn"
          type="text"
          icon="plus"
          @click="handleAdd"
          style="margin-top:2px;">{{ $t('CMS.Catalog.AddCatalog') }}
      </el-button>
      <el-input
          :placeholder="$t('CMS.Catalog.CatalogNamePlaceholder')"
          v-model="filterCatalogName"
          clearable
          size="default"
          suffix-icon="search">
      </el-input>
    </div>
    <div class="tree-container">
      <el-button
          :loading="loading"
          type="text"
          class="tree-header"
          icon="home"
          @click="handleTreeRootClick">{{ siteName }}
      </el-button>
      <el-tree
          :data="catalogOptions"
          :props="defaultProps"
          :expand-on-click-node="false"
          :default-expanded-keys="treeExpandedKeys"
          :filter-node-method="filterNode"
          node-key="id"
          ref="tree"
          highlight-current
          @node-click="handleNodeClick">
        <template class="tree-node" #default="{ node, data }">
          <span>{{ node.label }}</span>
          <span class="node-tool">
            <el-dropdown size="small" type="primary">
              <el-link :underline="false" class="row-more-btn" icon="more"></el-link>
              <template #dropdown>
                <el-dropdown-menu>
                  <el-dropdown-item @click.native="handlePreview(data)"><svg-icon icon-class="eye-open" class="mr5"></svg-icon>{{ $t('CMS.ContentCore.Preview') }}</el-dropdown-item>
                  <el-dropdown-item icon="promotion" @click.native="handlePublish(data)">{{ $t('CMS.ContentCore.Publish') }}</el-dropdown-item>
                  <el-dropdown-item icon="el-icon-sort-up" @click.native="handleSortUp(data)">{{ $t('CMS.Catalog.SortUp') }}</el-dropdown-item>
                  <el-dropdown-item icon="el-icon-sort-down" @click.native="handleSortDown(data)">{{ $t('CMS.Catalog.SortDown') }}</el-dropdown-item>
                </el-dropdown-menu>
              </template>
            </el-dropdown>
          </span>
        </template>
      </el-tree>
    </div>
    <!-- 添加栏目对话框 -->
    <el-dialog
        :title="$t('CMS.Catalog.AddCatalog')"
        v-model="diagOpen"
        :close-on-click-modal="false"
        width="600px"
        append-to-body>
      <el-form
          ref="form"
          :model="form"
          :rules="rules"
          label-width="120px">
        <el-form-item :label="$t('CMS.Catalog.ParentCatalog')" prop="parentId">
          <treeselect v-model="form.parentId" :options="catalogOptions" />
        </el-form-item>
        <el-form-item :label="$t('CMS.Catalog.Name')" prop="name">
          <el-input v-model="form.name"/>
        </el-form-item>
        <el-form-item :label="$t('CMS.Catalog.Alias')" prop="alias">
          <el-input v-model="form.alias"/>
        </el-form-item>
        <el-form-item :label="$t('CMS.Catalog.Path')" prop="path">
          <el-input v-model="form.path"/>
        </el-form-item>
        <el-form-item :label="$t('CMS.Catalog.CatalogType')" prop="catalogType">
          <el-select v-model="form.catalogType">
            <el-option
                v-for="ct in catalogTypeOptions"
                :key="ct.id"
                :label="ct.name"
                :value="ct.id"/>
          </el-select>
        </el-form-item>
      </el-form>
      <template #footer>
        <div class="dialog-footer">
          <el-button type="primary" @click="handleAddSave">{{ $t("Common.Confirm") }}</el-button>
          <el-button @click="cancel">{{ $t("Common.Cancel") }}</el-button>
        </div>
      </template>
    </el-dialog>

    <el-dialog
        :title="$t('CMS.Catalog.PublishDialogTitle')"
        v-model="publishDialogVisible"
        width="500px"
        class="publish-dialog">
      <div>
        <p>{{ $t('Common.Tips') }}</p>
        <p>{{ $t('CMS.Catalog.PublishTips') }}</p>
        <el-checkbox v-model="publishChild">{{ $t('CMS.Catalog.ContainsChildren') }}</el-checkbox>
      </div>
      <template #footer>
        <span class="dialog-footer">
        <el-button @click="publishDialogVisible = false">{{ $t("Common.Cancel") }}</el-button>
        <el-button type="primary" @click="handleDoPublish">{{ $t("Common.Confirm") }}</el-button>
      </span>
      </template>
    </el-dialog>
  </div>
</template>
<script>
import {getCatalogTypes, getCatalogTreeData, addCatalog, publishCatalog, sortCatalog} from "@/api/base/cms/catalog";
import Treeselect from 'vue3-treeselect'
import 'vue3-treeselect/dist/vue3-treeselect.css'
export default {
  name: "CMSCatalogTree",
  components: {
    Treeselect
  },
  props: {
    newBtn: {
      type: Boolean,
      default: false,
      required: false
    }
  },
  computed: {
    theme() {
      return this.$store.state.settings.theme;
    }
  },
  data() {
    return {
      loading: false,
      // 是否显示新增栏目按钮
      showNewBtn: this.newBtn,
      // 是否显示弹出层
      diagOpen: false,
      // 栏目类型
      catalogTypeOptions: [],
      // 栏目树过滤：栏目名称
      filterCatalogName: undefined,
      // 栏目树数据
      catalogOptions: undefined,
      // 站点名称
      siteName: undefined,
      // 当前选中栏目ID
      selectedCatalogId: undefined,
      selectedCatalogPath: "",
      treeExpandedKeys: [],
      defaultProps: {
        children: "children",
        label: "label"
      },
      // 新增栏目表单参数
      form: {},
      // 表单校验
      rules: {
        name: [
          {required: true, message: this.$t('CMS.Catalog.RuleTips.Name'), trigger: "blur"}
        ],
        alias: [
          {required: true, pattern: "^[A-Za-z0-9_]+$", message: this.$t('CMS.Catalog.RuleTips.Alias'), trigger: "blur"}
        ],
        path: [
          {required: true, pattern: "^[A-Za-z0-9_\/]+$", message: this.$t('CMS.Catalog.RuleTips.Path'), trigger: "blur"}
        ],
        catalogType: [
          {required: true, message: this.$t('CMS.Catalog.RuleTips.CatalogType'), trigger: "blur"}
        ]
      },
      publishCatalogId: 0,
      publishDialogVisible: false,
      publishChild: false,
      openProgress: false,
      taskId: "",
    };
  },
  watch: {
    filterCatalogName(val) {
      this.$refs.tree.filter(val);
    }
  },
  created() {
    this.loadCatalogTreeData();
    // 加载栏目类型数据
    getCatalogTypes().then(response => {
      this.catalogTypeOptions = response.data;
    });
  },
  methods: {
    /** 查询栏目树结构 */
    loadCatalogTreeData() {
      this.loading = true;
      getCatalogTreeData().then(response => {
        this.catalogOptions = response.data.rows;
        if (this.catalogOptions.length == 0) {
          this.$cache.local.remove("LastSelectedCatalogId");
        }
        this.siteName = response.data.siteName;
        this.loading = false;
        this.$nextTick(() => {
          this.selectedCatalogId = this.$cache.local.get("LastSelectedCatalogId");
          if (this.selectedCatalogId && this.$refs.tree) {
            this.$refs.tree.setCurrentKey(this.selectedCatalogId);
            this.treeExpandedKeys = [this.selectedCatalogId];
            this.$emit("node-click", this.$refs.tree.getCurrentNode());
          } else {
            this.$emit("node-click", null);
          }
        })
      });
    },
    // 筛选节点
    filterNode(value, data) {
      if (!value) return true;
      return data.label.indexOf(value) > -1;
    },
    // 根节点点击事件
    handleTreeRootClick() {
      this.selectedCatalogId = undefined;
      this.selectedCatalogPath = "";
      this.$cache.local.remove("LastSelectedCatalogId");
      this.$refs.tree.setCurrentKey(null);
      this.$emit("node-click", null);
    },
    // 节点单击事件
    handleNodeClick(data) {
      this.selectedCatalogId = data.id;
      this.selectedCatalogPath = data.props.path;
      this.$cache.local.set("LastSelectedCatalogId", this.selectedCatalogId);
      this.$emit("node-click", data);
    },
    // 取消按钮
    cancel() {
      this.diagOpen = false;
      this.resetAddForm();
    },
    // 表单重置
    resetAddForm() {
      this.resetForm("form");
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.resetAddForm();
      this.form = {parentId: this.selectedCatalogId, path: this.selectedCatalogPath};
      this.diagOpen = true;
    },
    /** 新增栏目提交 */
    handleAddSave: function () {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (!this.selectedCatalogId) {
            this.form.parentId = 0;
          }
          addCatalog(this.form).then(response => {
            this.diagOpen = false;
            this.$modal.msgSuccess(this.$t('Common.AddSuccess'));
            this.loadCatalogTreeData();
          });
        }
      });
    },
    handlePreview(data) {
      let routeData = this.$router.resolve({
        path: "/cms/preview",
        query: {type: "catalog", dataId: data.id},
      });
      window.open(routeData.href, '_blank');
    },
    handleSortUp(nodeData) {
      let data = {id: nodeData.id, sort: -1}
      sortCatalog(data).then(response => {
        this.$modal.msgSuccess(this.$t('Common.OpSuccess'));
        this.loadCatalogTreeData();
      });
    },
    handleSortDown(nodeData) {
      let data = {id: nodeData.id, sort: 1}
      sortCatalog(data).then(response => {
        this.$modal.msgSuccess(this.$t('Common.OpSuccess'));
        this.loadCatalogTreeData();
      });
    },
    handlePublish(nodeData) {
      this.publishCatalogId = nodeData.id;
      this.publishDialogVisible = true;
    },
    handleDoPublish() {
      const data = {
        id: this.publishCatalogId,
        publishChild: this.publishChild,
        publishDetail: false,
        publishStatus: 30
      };
      publishCatalog(data).then(response => {
        this.taskId = response.data;
        this.progressTitle = this.$t('CMS.Catalog.PublishProgressTitle');
        this.progressType = "Publish";
        this.openProgress = true;
        this.$cache.local.set('publish_flag', "true")
      });
      this.publishDialogVisible = false;
      this.publishChild = false;
    },
    handleCloseProgress() {
    },
  }
};
</script>
<style scoped>
.catalog-tree .head-container {
  margin-bottom: 10px;
}

.catalog-tree .tree-header {
  font-size: 16px;
  font-weight: 700;
  line-height: 22px;
  color: #424242;
  width: 100%;
  text-align: left;
  padding-left: 4px;
}

.catalog-tree-header:hover {
  background-color: #F5F7FA;
}

.catalog-tree .tree-node {
  width: 100%;
  line-height: 30px;
}

.catalog-tree .tree-node .node-tool {
  display: none;
  position: absolute;
  right: 5px;
}

.catalog-tree .tree-node:hover .node-tool {
  display: inline-block;
}

.catalog-tree .tree-node .node-tool .el-button {
  font-size: 14px;
}
</style>