<template>
  <div class="app-container catalog-container">
    <el-row :gutter="20">
      <!--栏目数据-->
      <el-col :span="4" :xs="24">
        <cms-catalog-tree
          ref="catalogTree"
          :new-btn="true"
          @node-click="handleTreeNodeClick">
        </cms-catalog-tree>
      </el-col>
      <!--栏目数据-->
      <el-col :span="20" :xs="24">
        <el-tabs v-model="activeName" @tab-click="handleTabClick">
          <el-tab-pane :label="$t('CMS.Catalog.Tab.Basic')" name="basicInfo">
            <cms-catalog-info
              v-if="this.activeName=='basicInfo'"
              :cid="selectedCatalogId"
              @update="handleCatalogUpdate"
              @remove="handleCatalogDelete"
            ></cms-catalog-info>
          </el-tab-pane>
          <el-tab-pane :label="$t('CMS.Catalog.Tab.Extend')" name="extend" :disabled="!selectedCatalog">
          </el-tab-pane>
        </el-tabs>
      </el-col>
    </el-row>
  </div>
</template>
<script>
import CMSCatalogTree from '@/views/base/cms/cate/catalogTree';
import CMSCatalogInfo from '@/views/base/cms/cate/catalogInfo';

export default {
  name: "CMSCatalog",
  components: {
    'cms-catalog-tree': CMSCatalogTree,
    'cms-catalog-info': CMSCatalogInfo,
  },
  data () {
    return {
      activeName: 'basicInfo',
      selectedCatalogId: undefined
    };
  },
  watch: {
    filterCatalogName(val) {
      this.$refs.tree.filter(val);
    }
  },
  computed: {
    selectedCatalog() {
      return this.selectedCatalogId && this.selectedCatalogId.length > 0
    }
  },
  methods: {
    handleTabClick (tab, event) {
    },
    handleCatalogUpdate() {
      this.$refs.catalogTree.loadCatalogTreeData();
    },
    handleCatalogDelete() {
      this.$cache.local.remove("LastSelectedCatalogId");
      this.$refs.catalogTree.loadCatalogTreeData();
    },
    handleTreeNodeClick(data) {
      this.selectedCatalogId = data && data != null ? data.id : "";
    }
  }
};
</script>
<style scoped>
.catalog-container .el-tabs__header {
  margin-bottom: 10px;
}
</style>