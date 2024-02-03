package com.alinesno.infra.base.cms.utils;

import cn.hutool.core.util.IdUtil;
import lombok.Data;
import lombok.SneakyThrows;
import org.apache.poi.xwpf.model.XWPFHeaderFooterPolicy;
import org.apache.poi.xwpf.usermodel.*;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * 转换成word文档
 */
public class PaperConvertToWord {

    @SneakyThrows
    public static void demo() {

        List<ChapterContentBean> list = new ArrayList<>() ;

        // 示例数据
        ChapterContentBean chapter1 = new ChapterContentBean("概念和定义", "第一章", "内容管理系统（Content Management System，简称CMS）是一种用于管理和发布内容的软件系统。它提供了一个集中化的平台，帮助企业或个人更加高效地创建、编辑、组织和发布内容，从而提高工作效率和用户体验。\n" +
                "    CMS的主要功能包括内容创建、内容编辑、内容组织、内容发布和内容管理。通过CMS，用户可以使用简单的界面来创建和编辑文本、图片、视频等多种形式的内容，无需编写代码或依赖技术人员。同时，CMS还提供了灵活的内容组织和分类功能，使得用户可以轻松地管理大量的内容，并根据需要进行检索和筛选。\n" +
                "    内容管理系统在企业和个人中都有广泛的应用。在企业中，CMS可以用于内部知识管理，帮助员工共享和获取信息，提高团队协作和工作效率。此外，CMS还可以用于构建和管理企业网站、博客和电子商务平台，提供统一的内容管理和发布渠道，提升品牌形象和用户体验。\n" +
                "    在个人领域，CMS可以帮助个人建立个人网站、博客和在线商店，展示个人作品、分享经验和知识，甚至进行个人品牌推广和销售。CMS的易用性和灵活性使得个人无需具备专业的技术知识，即可快速搭建和管理自己的在线平台，实现个人价值的最大化。\n" +
                "    总之，内容管理系统在现代社会中具有重要的意义。它不仅提供了高效的内容管理和发布功能，还带来了更好的工作效率和用户体验。无论是企业还是个人，都可以通过选择和使用适合自己需求的CMS，实现内容的有效管理和传播，推动个人和组织的发展。");

        ChapterContentBean chapter2 = new ChapterContentBean("功能和特点", "第二章", "内容管理系统具备多种功能和特点，以满足不同用户的需求。下面是一些常见的功能和特点：\n" +
                "    1. 内容创建和编辑：内容管理系统提供了一个直观的界面，使用户可以轻松地创建和编辑内容。用户可以使用富文本编辑器来格式化文本、插入图片和视频等多媒体内容，以及添加链接和标签。\n" +
                "    2. 内容组织和分类：内容管理系统允许用户将内容组织成层次结构，例如创建页面、文章和分类等。用户可以使用标签、分类和目录等方式对内容进行分类和归档，便于用户浏览和检索。\n" +
                "    3. 多用户和权限管理：内容管理系统支持多用户管理，可以设置不同用户的权限和角色。管理员可以控制用户的访问权限，例如编辑、发布和删除内容的权限，确保内容的安全性和一致性。\n" +
                "    4. 多语言支持：内容管理系统可以支持多语言的内容管理和发布。用户可以根据需要创建和管理不同语言版本的内容，以满足全球化和本地化的需求。\n" +
                "    5. 响应式设计：内容管理系统可以提供响应式设计，使内容在不同设备上呈现良好的用户体验。无论是在桌面电脑、平板电脑还是手机上访问，用户都可以获得适应屏幕大小和分辨率的内容。\n" +
                "    6. SEO优化：内容管理系统可以提供搜索引擎优化（SEO）功能，帮助用户提升网站在搜索引擎结果中的排名。用户可以设置页面标题、关键字和描述等元数据，以及创建友好的URL结构，提高网站的可见性和流量。\n" +
                "    7. 数据分析和统计：内容管理系统可以集成数据分析和统计工具，帮助用户了解访问者的行为和偏好。用户可以查看网站的访问量、页面浏览量、用户来源等数据，以便做出优化和决策。\n" +
                "    内容管理系统的功能和特点可以根据具体需求进行定制和扩展。用户可以根据自己的业务需求选择合适的内容管理系统，提高工作效率和用户体验。");

        ChapterContentBean chapter3 = new ChapterContentBean("企业内部知识管理", "第三章", "企业内部知识管理是内容管理系统的一种重要应用场景。在现代企业中，知识是一项非常宝贵的资源，它包括公司的核心业务知识、经验教训、最佳实践等。有效地管理和共享这些知识对于企业的发展和竞争力至关重要。\n" +
                "    内容管理系统可以提供一个集中化的平台，帮助企业组织和管理内部知识。通过CMS，企业可以创建和维护一个知识库，将各种类型的知识资料进行分类、标签化和归档，使其易于查找和访问。同时，CMS还可以提供权限管理功能，确保只有授权人员可以访问和编辑特定的知识内容。\n" +
                "    企业内部知识管理的好处是显而易见的。首先，它可以促进知识的共享和传承。不同部门和团队之间可以共享自己的经验和最佳实践，避免重复工作，提高工作效率。此外，新员工可以通过查阅知识库快速掌握公司的业务和流程，缩短学习曲线。\n" +
                "    其次，企业内部知识管理可以提高决策的准确性和效率。通过CMS，企业可以收集和整理各种数据和信息，包括市场调研、竞争情报、客户反馈等，为决策者提供准确、及时的信息支持。这样可以帮助企业做出更明智的决策，降低风险。\n" +
                "    此外，企业内部知识管理还可以促进团队协作和沟通。通过CMS，团队成员可以共同编辑和更新知识库中的内容，进行实时协作。这有助于加强团队之间的合作和沟通，提高工作效率和质量。\n" +
                "    总之，企业内部知识管理是内容管理系统的重要应用场景之一。它可以帮助企业更好地组织和管理内部知识，促进知识的共享和传承，提高决策的准确性和效率，促进团队协作和沟通。对于现代企业来说，建立一个有效的知识管理系统是非常重要的，它将为企业的发展和竞争力提供有力支持。");

        ChapterContentBean chapter4 = new ChapterContentBean("网站和博客建设", "第四章", "网站和博客建设是内容管理系统最常见的应用场景之一。随着互联网的普及和发展，越来越多的企业和个人需要建立自己的网站或博客来展示信息、推广产品或分享知识。\n" +
                "    内容管理系统为网站和博客建设提供了一种简单而高效的方式。通过CMS，用户可以轻松地创建和编辑页面内容，包括文字、图片、视频等多种形式的内容。而无需了解复杂的编程知识，用户可以通过直观的界面进行操作，实现页面的定制和布局。\n" +
                "    另外，内容管理系统还提供了丰富的主题和插件库，用户可以根据自己的需求选择合适的主题和插件，实现网站和博客的个性化定制。这些主题和插件可以帮助用户快速搭建出具有吸引力和专业性的网站和博客，提高用户体验和品牌形象。\n" +
                "    此外，内容管理系统还具备良好的扩展性和可维护性。通过插件和模块的安装和配置，用户可以方便地添加新的功能和扩展现有功能。同时，CMS提供了便捷的更新和维护机制，用户可以及时获取系统的安全性和功能性更新，保证网站和博客的稳定运行。\n" +
                "    总的来说，内容管理系统在网站和博客建设中具有重要的作用。它为用户提供了简单、高效、个性化的建站方式，帮助用户快速搭建具有吸引力和专业性的网站和博客。同时，CMS的扩展性和可维护性保证了网站和博客的持续发展和稳定运行。");

        ChapterContentBean chapter5 = new ChapterContentBean("电子商务平台", "第五章", "内容管理系统在电子商务平台中扮演着重要的角色。电子商务平台通常需要管理大量的商品信息、订单数据、用户评论等内容，而内容管理系统可以帮助企业更好地组织和管理这些内容。\n" +
                "    首先，内容管理系统可以提供丰富的商品管理功能。通过内容管理系统，企业可以方便地添加、编辑和删除商品信息，包括商品名称、价格、库存、描述、图片等。同时，内容管理系统还可以支持商品分类、标签、属性等维度的管理，帮助用户更快速地找到所需商品。\n" +
                "    其次，内容管理系统可以提供强大的订单管理功能。电子商务平台需要处理大量的订单数据，包括订单状态、支付信息、配送信息等。内容管理系统可以帮助企业实时跟踪订单状态，及时处理订单变更和退款申请，提高订单处理效率和用户满意度。\n" +
                "    此外，内容管理系统还可以支持用户评论和评分管理。用户评论是电子商务平台重要的用户反馈渠道，可以帮助其他用户了解商品的真实评价和使用体验。内容管理系统可以帮助企业及时审核和回复用户评论，维护良好的用户关系和口碑。\n" +
                "    最后，内容管理系统还可以提供个性化推荐和营销功能。通过分析用户的浏览和购买行为，内容管理系统可以根据用户的兴趣和偏好推荐相关的商品和促销活动，提高用户购买转化率和复购率。\n" +
                "    总之，内容管理系统在电子商务平台中的应用可以帮助企业更好地管理商品信息、订单数据和用户评论，提高运营效率和用户体验。选择适合自己业务需求的内容管理系统，并合理使用其功能，将为电子商务平台的发展带来巨大的价值和竞争优势。");

        ChapterContentBean chapter6 = new ChapterContentBean("选择和使用指南", "第六章", "内容管理系统（CMS）在企业和个人中有广泛的应用场景。以下是一些常见的应用场景：\n" +
                "    1. 企业内部知识管理：CMS可以帮助企业集中管理和组织内部知识和文档，提供一个统一的平台供员工查阅和共享。通过CMS，企业可以建立一个知识库，方便员工快速获取所需信息，提高工作效率和团队协作能力。\n" +
                "    2. 网站和博客建设：CMS是建立和管理网站和博客的理想工具。它提供了易于使用的界面和模板，使得用户无需具备专业的编程知识，就能够创建和编辑网站内容。CMS还提供了丰富的插件和扩展功能，可以满足不同网站和博客的需求。\n" +
                "    3. 电子商务平台：CMS可以帮助企业建立和管理电子商务平台。它提供了商品管理、订单管理、支付接口等功能，使得企业能够快速搭建自己的电子商务网站。CMS还支持多语言和多货币功能，方便企业进行全球化业务拓展。\n" +
                "    无论是企业内部知识管理，还是网站和博客建设，亦或是电子商务平台，CMS都能够提供高效、便捷和灵活的内容管理解决方案。通过使用CMS，企业和个人可以更加高效地创建、编辑、组织和发布内容，提高工作效率和用户体验。");

        // 将示例添加到列表中
        list.add(chapter1);
        list.add(chapter2);
        list.add(chapter3);
        list.add(chapter4);
        list.add(chapter5);
        list.add(chapter6);

        // 生成word文档
        createPaperWord(list);
    }

    /**
     * 文章内容
     */
    @Data
    public static class ChapterContentBean {

        private String sub ; // 子章节内容
        private String chapter ; // 章节名称
        private String content ; // 保存内容

        public ChapterContentBean(String chapter, String sub, String content) {
            this.chapter = chapter ;
            this.sub = sub ;
            this.content = content ;
        }

    }

    /**
     * 生成Word文档
     * @throws IOException
     */
    public static void createPaperWord(List<ChapterContentBean> list) throws IOException {

        //创建文本对象
        XWPFDocument docxDocument = new XWPFDocument();

        // 创建目录结构
        // setTable(docxDocument) ;

        // 处理内容 -->> 循环形式输出_start
        for(ChapterContentBean chapterContent : list) {

            String title = chapterContent.getChapter() ;
            String content = chapterContent.getContent() ;

            List<String> contentArr = List.of(content.split("\\n"));

            //创建第一段落
            XWPFParagraph firstParagraphX = docxDocument.createParagraph();
            firstParagraphX.setAlignment(ParagraphAlignment.LEFT);
            setLineSpace(firstParagraphX , 20) ;

            XWPFRun runTitle = firstParagraphX.createRun();
            runTitle.setText(title);
            runTitle.setBold(true);
            runTitle.setFontSize(13);
            runTitle.setFontFamily("宋体");
            runTitle.addCarriageReturn();//回车键
            runTitle.setKerning(30);

            XWPFParagraph paragraphX = docxDocument.createParagraph();

            paragraphX.setAlignment(ParagraphAlignment.LEFT);//对齐方式
            paragraphX.setFirstLineIndent(400);//首行缩进

            //创建段落中的run
            for(String cont : contentArr){
                XWPFRun run = paragraphX.createRun();
                run.setText(cont) ;
                run.setFontSize(11);
                run.setKerning(25);
                run.setTextPosition(15);
                run.setFontFamily("宋体");
                run.addCarriageReturn();//回车键
            }

        }
        // 处理内容 -->> 循环形式输出_end

        // 生成页脚
        createDefaultFooter(docxDocument);

        String path="/Users/luodong/Desktop/docs/docBroke_"+ IdUtil.getSnowflakeNextIdStr() +".docx";
        File file = new File(path);
        FileOutputStream stream = new FileOutputStream(file);
        docxDocument.write(stream);
        stream.close();
        System.out.println("文件生成完成!");
    }

    /**
     * 设置行间距
     */
    public static void setLineSpace(XWPFParagraph titleParagraph,int size) {
        CTP ctp = titleParagraph.getCTP();
        CTPPr ppr = ctp.isSetPPr() ? ctp.getPPr() : ctp.addNewPPr();
        CTSpacing spacing = ppr.isSetSpacing()? ppr.getSpacing() : ppr.addNewSpacing();
        spacing.setAfter(BigInteger.valueOf(0));
        spacing.setBefore(BigInteger.valueOf(0));
        //设置行距类型为 EXACT
        spacing.setLineRule(STLineSpacingRule.EXACT);
        //1磅数是20
        spacing.setLine(BigInteger.valueOf(size* 20L));
    }

    /**
     * 生成菜单目录
     */
    private static void setTable(XWPFDocument document){
        // 创建目录
        XWPFParagraph toc = document.createParagraph();
        CTP ctP = toc.getCTP();
        CTSimpleField tocField = ctP.addNewFldSimple();
        tocField.setInstr("TOC \\o \"1-3\" \\h \\z \\u");
        tocField.setDirty(STOnOff.TRUE);

        // 创建chapter
        for(int i = 0 ; i < 5 ; i ++){
            XWPFParagraph chapter1 = document.createParagraph();
            XWPFRun chapterRun1 = chapter1.createRun();
            chapterRun1.setText("第"+i+"章");
        }
    }

    private static void setTableText(XWPFDocument docxDocument) {
        //获取第一个表格
        XWPFTable table = docxDocument.getTableArray(0);
        List<XWPFTableRow> rows = table.getRows();
        int i=1;
        for(XWPFTableRow row :rows){
            List<XWPFTableCell> cells = row.getTableCells();
            for(XWPFTableCell cell: cells){
                cell.setText("第"+String.valueOf(i++)+"格");
                cell.setVerticalAlignment(XWPFTableCell.XWPFVertAlign.CENTER);
                //cell.setWidthType(TableWidthType.PCT);
                //cell.setWidth("30%");
            }
        }

    }

    public static CTTcPr getCellCTTcPr(XWPFTableCell cell) {
        CTTc cttc = cell.getCTTc();
        CTTcPr tcPr = cttc.isSetTcPr() ? cttc.getTcPr() : cttc.addNewTcPr();
        return tcPr;
    }


    //生成目录结构时  需要这个功能 已达到生成下标的作用
    public static void createDefaultFooter(final XWPFDocument docx) {
        // TODO 设置页码起始值
        CTP pageNo = CTP.Factory.newInstance();
        XWPFParagraph footer = new XWPFParagraph(pageNo, docx);
        CTPPr begin = pageNo.addNewPPr();
        begin.addNewPStyle().setVal("系统页脚");
        begin.addNewJc().setVal(STJc.CENTER);
        pageNo.addNewR().addNewFldChar().setFldCharType(STFldCharType.BEGIN);
        pageNo.addNewR().addNewInstrText().setStringValue("PAGE   \\* MERGEFORMAT");
        pageNo.addNewR().addNewFldChar().setFldCharType(STFldCharType.SEPARATE);
        CTR end = pageNo.addNewR();
        CTRPr endRPr = end.addNewRPr();
        endRPr.addNewNoProof();
        endRPr.addNewLang().setVal("123");
        end.addNewFldChar().setFldCharType(STFldCharType.END);
        CTSectPr sectPr = docx.getDocument().getBody().getSectPr() ; //  .isSetSectPr() ? docx.getDocument().getBody().getSectPr() / docx.getDocument().getBody().addNewSectPr();
        XWPFHeaderFooterPolicy policy = new XWPFHeaderFooterPolicy(docx, sectPr);
        policy.createFooter(STHdrFtr.DEFAULT, new XWPFParagraph[]{footer});
    }

}
