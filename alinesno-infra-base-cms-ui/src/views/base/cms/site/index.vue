<template>
  <div class="app-container">
    <el-row :gutter="24" class="mb12">
      <el-col :span="12">
        <el-row :gutter="10">
          <el-col :span="1.5">
            <el-button plain
                       type="primary"
                       icon="plus"
                       size="default"
                       @click="handleAdd">{{ $t("Common.Add") }}</el-button>
          </el-col>
        </el-row>
      </el-col>
      <el-col :span="12" style="text-align:right">
        <el-form :model="queryParams"
                 ref="queryForm"
                 :inline="true"
                 size="default"
                 class="search">
          <el-form-item prop="siteName">
            <el-input :placeholder="$t('CMS.Site.Name')" v-model="queryParams.siteName"></el-input>
          </el-form-item>
          <el-form-item>
            <el-button-group>
              <el-button type="primary"
                         icon="search"
                         @click="handleQuery">{{ $t("Common.Search") }}</el-button>
              <el-button icon="refresh"
                         @click="resetQuery">{{ $t("Common.Reset") }}</el-button>
            </el-button-group>
          </el-form-item>
        </el-form>
      </el-col>
    </el-row>
    <el-row>
      <el-table v-loading="siteListLoading"
                :data="siteList"
                style="width:100%;line-height: normal;">
        <el-table-column label="ID" width="200" prop="id" />
        <el-table-column :label="$t('CMS.Site.Name')">
          <template #default="scope">
            <el-link type="primary" @click="handleEdit(scope.row)" class="link-type">
              <span>{{ scope.row.name }}</span>
            </el-link>
          </template>
        </el-table-column>
        <el-table-column :label="$t('CMS.Site.Path')" prop="path" />
        <el-table-column :label="$t('Common.Operation')" align="center" width="310" class-name="small-padding fixed-width">
          <template #default="scope">
            <span class="btn-cell-wrap">
              <el-button
                  type="text"
                  size="small"
                  @click="handlePreview(scope.row)"><svg-icon icon-class="eye-open" class="mr2"></svg-icon>{{ $t('CMS.ContentCore.Preview') }}</el-button>
            </span>
            <span class="btn-cell-wrap">
              <el-button
                  type="text"
                  icon="promotion"
                  size="small"
                  @click="handlePublish(scope.row)">{{ $t('CMS.Site.PublishHome') }}</el-button>
            </span>
            <span class="btn-cell-wrap">
              <el-button
                  type="text"
                  icon="edit"
                  size="small"
                  @click="handleEdit(scope.row)">{{ $t("Common.Edit") }}</el-button>
            </span>
            <span class="btn-cell-wrap">
              <el-button
                  type="text"
                  icon="delete"
                  size="small"
                  @click="handleDelete(scope.row)">{{ $t("Common.Delete") }}</el-button>
            </span>
          </template>
        </el-table-column>
      </el-table>
      <pagination
          v-show="siteTotal>0"
          :total="siteTotal"
          :page.sync="queryParams.pageNum"
          :limit.sync="queryParams.pageSize"
          @pagination="loadSiteList" />
    </el-row>
    <!-- 添加站点对话框 -->
    <el-dialog
        :title="$t('CMS.Site.Dialog.AddTitle')"
        v-model="open"
        width="600px"
        append-to-body>
      <el-form
          ref="form"
          :model="form"
          :rules="rules"
          label-width="135px"
          class="el-form-dialog">
        <el-form-item :label="$t('CMS.Site.Name')" prop="name">
          <el-input v-model="form.name" />
        </el-form-item>
        <el-form-item :label="$t('CMS.Site.Path')" prop="path">
          <el-input v-model="form.path" />
        </el-form-item>
        <el-form-item :label="$t('CMS.Site.ResourceUrl')" prop="resourceUrl">
          <el-input v-model="form.resourceUrl" />
        </el-form-item>
        <el-form-item :label="$t('CMS.Site.Desc')"
                      prop="description">
          <el-input v-model="form.description" type="textarea" :maxlength="300" />
        </el-form-item>
      </el-form>
      <template #footer>
        <div class="dialog-footer">
          <el-button type="primary"
                     @click="handleAddSave">{{ $t("Common.Confirm") }}</el-button>
          <el-button @click="cancel">{{ $t("Common.Cancel") }}</el-button>
        </div>
      </template>
    </el-dialog>
  </div>
</template>
<style scoped>
</style>
<script>
import { delSite, addSite, listSite, publishSite  } from "@/api/base/cms/site";

export default {
  name: "Site",
  components: {
  },
  data () {
    return {
      open: false,
      siteList: undefined,
      siteListLoading: true,
      siteTotal: 0,
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        siteName: undefined
      },
      // 表单参数
      form: {
      },
      // 表单校验
      rules: {
        name: [
          { required: true, message: this.$t("CMS.Site.RuleTips.Name"), trigger: "blur" }
        ],
        path: [
          { required: true, pattern: "^[A-Za-z0-9]+$", message: this.$t("CMS.Site.RuleTips.Path"), trigger: "blur" }
        ]
      },
      openProgress: false,
      taskId: ""
    };
  },
  created () {
    this.loadSiteList();
  },
  methods: {
    /** 查询站点列表 */
    loadSiteList () {
      this.siteListLoading = true;
      listSite(this.queryParams).then(response => {
        this.siteList = response.rows;
        this.siteTotal = parseInt(response.total);
        this.siteListLoading = false;
      });
    },
    /** 搜索按钮操作 */
    handleQuery () {
      this.queryParams.pageNum = 1;
      this.loadSiteList();
    },
    /** 重置按钮操作 */
    resetQuery () {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 取消按钮
    cancel () {
      this.open = false;
      this.resetAddForm();
    },
    // 表单重置
    resetAddForm () {
      this.form = {
        name: undefined,
        description: undefined,
        path: undefined,
        url: undefined
      };
      this.resetForm("form");
    },
    /** 新增按钮操作 */
    handleAdd () {
      this.resetAddForm();
      this.title = "添加站点";
      this.open = true;
    },
    /** 新增站点提交 */
    handleAddSave: function () {
      this.$refs["form"].validate(valid => {
        if (valid) {
          this.form.parentId = 0;
          addSite(this.form).then(response => {
            this.$modal.msgSuccess(this.$t("Common.AddSuccess"));
            this.open = false;
            if (this.siteList.length == 0) {
              this.$router.go(0); // 无站点时刷新下重置当前站点
            } else {
              this.loadSiteList();
            }
          });
        }
      });
    },
    handleEdit (row) {
      const id = row.id;
      this.$router.push({ path: "/cms/site/tabs", query: { id: id } });
    },
    /** 删除按钮操作 */
    handleDelete (row) {
      const id = row.id;
      this.$modal.confirm(this.$t("Common.ConfirmDelete")).then(function () {
        return delSite(id);
      }).then(response => {
        this.taskId = response.data;
        this.openProgress = true;
        this.loadSiteList();
      }).catch(function () { });
    },
    handleCloseProgress() {
      this.$router.go(0); // 删除站点时刷新下，当前站点删除需要重置当前站点
    },
    handlePreview(row) {
      const id = row.id;
      let routeData = this.$router.resolve({
        path: "/cms/preview",
        query: { type: "site", dataId: id },
      });
      window.open(routeData.href, '_blank');
    },
    handlePublish(row) {
      publishSite({ id: row.id, publishIndex: true }).then(response => {
        if (response.code === 200) {
          this.$modal.msgSuccess(this.$t("CMS.ContentCore.PublishSuccess"));
        }
      });
    }
  }
};
</script>