<template>
  <div class="app-container">
    <el-row :gutter="20" v-loading="loading">
      <el-col :span="4" :xs="24">
      </el-col>
      <el-col :span="20" :xs="24">
        <el-tabs v-model="activeName" @tab-click="handleTabClick">
          <el-tab-pane :label="$t('CMS.Content.Tab.ContentList')" name="contentList">
              <cms-content-list v-if="activeName==='contentList'" :cid="selectedCatalogId"></cms-content-list>
          </el-tab-pane>
          <el-tab-pane :label="$t('CMS.Content.Tab.PageWidget')" name="pageWdiget">
          </el-tab-pane>
          <el-tab-pane :label="$t('CMS.Content.Tab.RecycleBin')" name="recycle">
          </el-tab-pane>
        </el-tabs>
      </el-col>
    </el-row>
  </div>
</template>
<script>
import CMSContentList from '@/views/base/cms/post/contentList';

export default {
  name: "CMSContent",
  components: {
    'cms-content-list': CMSContentList,
  },
  data () {
    return {
      loading: false,
      activeName: this.$route.params.tab || 'contentList',
      selectedCatalogId: '',
    };
  },
  methods: {
    handleTabClick (tab, event) {
    },
    handleTreeNodeClick(data) {
      this.selectedCatalogId = data && data != null ? data.id : '';
    }
  }
};
</script>