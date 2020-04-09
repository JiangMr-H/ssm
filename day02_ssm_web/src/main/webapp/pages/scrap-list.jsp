<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <!-- 页面meta -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">

    <title>注塑无纸化管理平台</title>
    <meta name="description" content="AdminLTE2定制版">
    <meta name="keywords" content="AdminLTE2定制版">


    <!-- Tell the browser to be responsive to screen width -->
    <meta
            content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
            name="viewport">

    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->


    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/morris/morris.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.theme.default.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/select2/select2.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/_all-skins.min.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/style.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.skinNice.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-slider/slider.css">
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.css">
</head>

<body class="hold-transition skin-purple sidebar-mini">

<div class="wrapper">

    <!-- 页面头部 -->
    <jsp:include page="header.jsp"></jsp:include>
    <!-- 页面头部 /-->
    <!-- 导航侧栏 -->
    <jsp:include page="aside.jsp"></jsp:include>
    <!-- 导航侧栏 /-->


    <div class="content-wrapper">

        <!-- 内容头部 -->
        <section class="content-header">
            <h1>
                数据列表
                <small>填写报废单</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
                <li><a href="#">报废管理</a></li>
                <li class="active">填写报废单</li>
            </ol>
        </section>
        <!-- 内容头部 /-->

        <!-- 正文区域 -->
        <section class="content">

            <!-- .box-body -->
            <div class="box box-primary">
                <div class="box-header with-border">
                    <h3 class="box-title">列表</h3>
                </div>

                <div class="box-body">

                    <!-- 数据表格 -->
                    <div class="table-box">

                        <!--工具栏-->
                        <div class="pull-left">
                            <div class="form-group form-inline">
                                <div class="btn-group">

                                    <button type="button" class="btn btn-primary" title="新建"
                                            data-toggle="modal"
                                            data-target="#exampleModal" data-whatever="@mdo">
                                        <%--<a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#customerEditDialog" onclick="editCustomer()">新建</a>--%>
                                        <i class="fa fa-file-o"></i> 新建
                                    </button>

                                <%--    <button type="button" class="btn btn-default" title="删除">
                                        <i class="fa fa-trash-o"></i> 删除
                                    </button>--%>
                                  <%--  <button type="button" class="btn btn-default" title="开启">
                                        <i class="fa fa-check"></i> 开启
                                    </button>
                                    <button type="button" class="btn btn-default" title="屏蔽">
                                        <i class="fa fa-ban"></i> 屏蔽
                                    </button>--%>
                                    <button type="button" class="btn btn-default" title="刷新">
                                        <i class="fa fa-refresh"></i> 刷新
                                    </button>
                                </div>
                            </div>
                        </div>

                        <!-- 报废单  -->
                        <!-- 客户编辑对话框 -->
                        <div class="modal fade bs-example-modal-lg" id="exampleModal" tabindex="-1" role="dialog"
                             aria-labelledby="myModalLabel">
                            <div class="modal-dialog modal-lg" style="width: 1700px" role="document">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                            <span aria-hidden="true">&times;</span>
                                        </button>
                                        <h4 class="modal-title " id="gridSystemModalLabel" style="margin-left: 750px">
                                            注塑件报废确认单</h4>
                                    </div>
                                    <div class="modal-body modal-lg" style="width: 1700px">
                                        <form class="form-horizontal" id="edit_customer_form"
                                              action="${pageContext.request.contextPath}/scrap/save.do"
                                              method="post" onsubmit="return check(this)">

                                            <table class="table table-bordered modal-lg" style="width: 1680px" name="">
                                                <tr>
                                                    <td class="text-center" colspan="3"><i style="color: red">* </i>
                                                        生产日期：
                                                    </td>
                                                    <td colspan="2"><input type="date" style="width: 150px" name="SCRQ"
                                                                           placeholder="生产日期"></td>
                                                    <td class="text-center" colspan="2"><i style="color: red">* </i>班组：
                                                    </td>
                                                    <td colspan="1"><input type="text" style="width: 50px" name="BZ"
                                                                           placeholder="班组"></td>
                                                    <td class="text-center" colspan="2"><i style="color: red">* </i>产品编码：
                                                    </td>
                                                    <td colspan="3"><input type="text" style="width: 150px" name="CPBM"
                                                                           placeholder="产品编码"></td>
                                                    <td class="text-center" colspan="2"><i style="color: red">* </i>工装编码：
                                                    </td>
                                                    <td colspan="2"><input type="text" style="width: 150px" name="GZBM"
                                                                           placeholder="工装编码"></td>
                                                    <td class="text-center" colspan="3"><i style="color: red">* </i>材料及颜色：
                                                    </td>
                                                    <td colspan="2"><input type="text" style="width: 100px" name="CLYS"
                                                                           placeholder="材料及颜色"></td>
                                                    <td class="text-center" colspan="3"><i style="color: red">* </i>机床编码：
                                                    </td>
                                                    <td colspan="2"><input type="text" style="width: 150px" name="JCBM"
                                                                           placeholder="机床编码"></td>
                                                </tr>
                                                <tr class="text-center">
                                                    <td colspan="2">报废项目</td>
                                                    <td>工艺调试</td>
                                                    <td>缺料</td>
                                                    <td>黑斑点</td>
                                                    <td>黑纹</td>
                                                    <td>气纹</td>
                                                    <td>银丝</td>
                                                    <td>水波纹</td>
                                                    <td>缩水</td>
                                                    <td>拉伤/裂</td>
                                                    <td>冷斑痕</td>
                                                    <td>烧焦</td>
                                                    <td>变形</td>
                                                    <td>水印</td>
                                                    <td>堵孔/多料</td>
                                                    <td>油污斑</td>
                                                    <td>色差</td>
                                                    <td>刀伤</td>
                                                    <td>划伤</td>
                                                    <td>粘模</td>
                                                    <td>毛刺</td>
                                                    <td>烫金不良</td>
                                                    <td>丝印不良</td>
                                                    <td>试模</td>
                                                    <td><i style="color: red">* </i>数量合计</td>
                                                    <td>胶块（KG）</td>

                                                </tr>
                                                <tr class="text-center">
                                                    <td colspan="2">数量小计</td>
                                                    <td><input id="GYTS" type="" style="width: 40px" onkeyup="sumAdd(this)" name="GYTS"></td>
                                                    <td><input id="QL" type="text" style="width: 40px" onkeyup="sumAdd(this)" name="QL"></td>
                                                    <td><input id="HBD" type="text" style="width: 40px" onkeyup="sumAdd(this)" name="HBD"></td>
                                                    <td><input id="HW" type="text" style="width: 40px" onkeyup="sumAdd(this)" name="HW"></td>
                                                    <td><input id="QW" type="text" style="width: 40px" onkeyup="sumAdd(this)" name="QW"></td>
                                                    <td><input id="YS" type="text" style="width: 40px" onkeyup="sumAdd(this)"name="YS"></td>
                                                    <td><input id="SBW" type="text" style="width: 40px" onkeyup="sumAdd(this)"name="SBW"></td>
                                                    <td><input id="SS" type="text" style="width: 40px"onkeyup="sumAdd(this)" name="SS"></td>
                                                    <td><input id="LSL" type="text" style="width: 40px" onkeyup="sumAdd(this)"name="LSL"></td>
                                                    <td><input id="LBH" type="text" style="width: 40px" onkeyup="sumAdd(this)"name="LBH"></td>
                                                    <td><input id="SJ" type="text" style="width: 40px" onkeyup="sumAdd(this)" name="SJ"></td>
                                                    <td><input id="BX" type="text" style="width: 40px" onkeyup="sumAdd(this)"name="BX"></td>
                                                    <td><input id="SY" type="text" style="width: 40px" onkeyup="sumAdd(this)"name="SY"></td>
                                                    <td><input id="DKDL" type="text" style="width: 40px" onkeyup="sumAdd(this)"name="DKDL"></td>
                                                    <td><input id="YWB" type="text" style="width: 40px" onkeyup="sumAdd(this)"name="YWB"></td>
                                                    <td><input id="SC" type="text" style="width: 40px" onkeyup="sumAdd(this)"name="SC"></td>
                                                    <td><input id="DS" type="text" style="width: 40px" onkeyup="sumAdd(this)"name="DS"></td>
                                                    <td><input id="HS" type="text" style="width: 40px" onkeyup="sumAdd(this)"name="HS"></td>
                                                    <td><input id="NM" type="text" style="width: 40px" onkeyup="sumAdd(this)"name="NM"></td>
                                                    <td><input id="MC" type="text" style="width: 40px" onkeyup="sumAdd(this)"name="MC"></td>
                                                    <td><input id="TJBL" type="text" style="width: 40px" onkeyup="sumAdd(this)"name="TJBL"></td>
                                                    <td><input id="SYBL" type="text" style="width: 40px" onkeyup="sumAdd(this)"name="SYBL"></td>
                                                    <td><input id="SM" type="text" style="width: 40px" onkeyup="sumAdd(this)"name="SM"></td>
                                                    <td><input id="SLHJ" type="text" style="width: 40px" name="SLHJ" onkeyup="sumAdd(this)"></td>
                                                    <td><input type="text" style="width: 40px" name="JK"></td>
                                                </tr>
                                                <tr>
                                                    <td colspan="3" class="text-center"><i style="color: red">* </i>操作工</td>
                                                    <td colspan="3"><input type="text" style="width: 150px" name="CZG"
                                                                           placeholder="操作工"></td>
                                                    <td colspan="2" class="text-center"></td>
                                                    <td colspan="3"></td>
                                                    <td colspan="2" class="text-center">班长</td>
                                                    <td colspan="3"><input type="text" style="width: 150px" name="BZZ"
                                                                           placeholder="班长" disabled></td>
                                                    <td colspan="2" class="text-center">检验员</td>
                                                    <td colspan="3"><input type="text" style="width: 150px" name="JYY"
                                                                           placeholder="检验员" disabled></td>
                                                    <td colspan="2" class="text-center">接收人</td>
                                                    <td colspan="4"><input type="text" style="width: 150px" name="JSY"
                                                                           placeholder="接收人" disabled></td>
                                                </tr>
                                                <tr>
                                                    <td colspan="4" class="text-center">质量技术领导意见:</td>
                                                    <td colspan="9"><input type="text" style="width: 520px" name="ZLYJ"
                                                                           placeholder="质量技术领导意见" disabled></td>
                                                    <td colspan="3" class="text-center">厂长意见:</td>
                                                    <td colspan="11"><input type="text" style="width: 520px" name="CZYJ"
                                                                            placeholder="厂长意见" disabled></td>
                                                </tr>
                                                <tr>
                                                    <td colspan="3" class="text-center">备注：</td>
                                                    <td colspan="24"><input type="text" style="width: 640px"
                                                                            name="remake" placeholder="备注"></td>
                                                </tr>
                                                <tr>
                                                    <td colspan="27">说明：<br/>
                                                        1、当生产机床型号≥530时报废30件-50件由质量技术员及以上领导签字确认，大于50件必须由厂长及以上领导签字确认；<br/>
                                                        2、当生产机床型号＜530和≥240时，报废50-100件由质量技术员及以上领导签字确认，大于100件必须由厂长及以上领导签字确认；<br/>
                                                        3、当生产机床型号＜240时，报废100件-200件由质量技术员及以上领导签字确认，大于200件必须由厂长及以上领导签字确认。
                                                    </td>

                                                </tr>
                                            </table>
                                        <span style="color: red;font-size: 14px">注：*为必填项</span>


                                    <div class="modal-footer">
                                        <button type="submit" class="btn btn-primary">保存</button>
                                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                                    </div>
                                        </form>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--报废单/-->
                        <div class="box-tools pull-right">
                            <div class="has-feedback">
                                <input type="text" class="form-control input-sm"
                                       placeholder="生产日期\班组\产品编码"> <span
                                    class="glyphicon glyphicon-search form-control-feedback"></span>
                            </div>
                        </div>
                        <!--工具栏/-->

                        <!--数据列表-->
                        <table id="dataList"
                               class="table table-bordered table-striped table-hover dataTable">
                            <thead>
                            <tr>
                                <th class="" style="padding-right: 0px;"><input
                                        id="selall" type="checkbox" class="icheckbox_square-blue">
                                </th>
                                <th class="sorting_asc">ID</th>
                                <th class="sorting_desc">生产日期</th>
                                <th class="sorting_asc sorting_asc_disabled">班组</th>
                                <th class="sorting_desc sorting_desc_disabled">产品编码</th>
                                <th class="sorting">工装编号</th>
                                <th class="text-center sorting">材料及颜色</th>
                                <th class="sorting">机床编号</th>
                                <th class="text-center sorting">进程</th>
                                <th class="text-center">操作</th>
                            </tr>
                            </thead>
                            <tbody>


                            <c:forEach items="${pageInfo.list}" var="scrap">

                                <tr>
                                    <td><input name="ids" type="checkbox"></td>
                                    <td>${scrap.id }</td>
                                    <td>${scrap.SCRQ }</td>
                                    <td>${scrap.BZ }</td>
                                    <td>${scrap.CPBM }</td>
                                    <td>${scrap.GZBM }</td>
                                    <td class="text-center">${scrap.CLYS }</td>
                                    <td>${scrap.JCBM }</td>
                                    <td class="text-center">${scrap.course }</td>
                                    <td class="text-center">
                                            <%--<button type="button" class="btn bg-olive btn-xs">订单</button>--%>
                                      <%--  <button type="button" class="btn bg-olive btn-xs"
                                                onclick="location.href='${pageContext.request.contextPath}/scrap/findById.do?id=${scrap.id}'">
                                            详情
                                        </button>--%>
                                                <a type="button" class="btn bg-olive btn-xs" data-toggle="modal"
                                                        data-target="#customerEditDialog" onclick="editCustomer(${scrap.id })">
                                                    详情
                                                </a>
                                            <%--<button type="button" class="btn bg-olive btn-xs">编辑</button>--%>
                                    </td>
                                </tr>
                            </c:forEach>
                            </tbody>

                        </table>
                        <!--数据列表/-->

                    </div>
                    <!-- 数据表格 /-->


                </div>
                <!-- /.box-body -->

                <!-- .box-footer-->
                <div class="box-footer">
                    <div class="pull-left">
                        <div class="form-group form-inline">
                            总共${pageInfo.pages} 页，共${pageInfo.total}条数据。 每页
                            <select class="form-control" id="changePageSize" onchange="changePageSize()">
                                <option>15</option>
                                <option>20</option>
                                <option>25</option>
                                <option>30</option>
                                <option>35</option>
                            </select> 条
                        </div>
                    </div>

                    <div class="box-tools pull-right">
                        <ul class="pagination">
                            <li>
                                <a href="${pageContext.request.contextPath}/scrap/findNewPage.do?page=1&size=${pageInfo.pageSize}"
                                   aria-label="Previous">首页</a></li>
                            <li>
                                <a href="${pageContext.request.contextPath}/scrap/findNewPage.do?page=${pageInfo.pageNum-1}&size=${pageInfo.pageSize}">上一页</a>
                            </li>
                            <c:forEach begin="${pageInfo.pageNum}" end="${pageInfo.pageNum}" var="pageNum">
                                <li>
                                    <a href="${pageContext.request.contextPath}/scrap/findNewPage.do?page=${pageNum}&size=${pageInfo.pageSize}">${pageNum}</a>
                                </li>
                            </c:forEach>
                            <li>
                                <a href="${pageContext.request.contextPath}/scrap/findNewPage.do?page=${pageInfo.pageNum+1}&size=${pageInfo.pageSize}">下一页</a>
                            </li>
                            <li>
                                <a href="${pageContext.request.contextPath}/scrap/findNewPage.do?page=${pageInfo.pages}&size=${pageInfo.pageSize}"
                                   aria-label="Next">尾页</a></li>
                        </ul>
                    </div>

                </div>
                <!-- /.box-footer-->


            </div>

        </section>
        <!-- 正文区域 /-->

    </div>
    <!-- @@close -->
    <!-- 内容区域 /-->

    <!-- 底部侧栏 -->
    <jsp:include page="foot.jsp"></jsp:include>
    <!-- 底部侧栏 /-->

</div>


<script
        src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
    $.widget.bridge('uibutton', $.ui.button);
</script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/raphael/raphael-min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/morris/morris.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/sparkline/jquery.sparkline.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/knob/jquery.knob.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/daterangepicker/moment.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datepicker/bootstrap-datepicker.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/fastclick/fastclick.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/adminLTE/js/app.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/select2/select2.full.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/markdown.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/ckeditor/ckeditor.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datatables/jquery.dataTables.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/chartjs/Chart.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.resize.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.pie.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/flot/jquery.flot.categories.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.min.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/bootstrap-datetimepicker.js"></script>
<script
        src="${pageContext.request.contextPath}/plugins/bootstrap-datetimepicker/locales/bootstrap-datetimepicker.zh-CN.js"></script>
<script>

    function check(form) {
        if(form.SCRQ.value==''){
            alert("请输入生产日期！")
            form.SCRQ.focus();
            return false;
        }else if(form.BZ.value==''){
            alert("请输入班组！")
            form.BZ.focus();
            return false;
        }else if(form.CPBM.value==''){
            alert("产品编码不能为空！")
            form.CPBM.focus();
            return false;
        }else if(form.GZBM.value==''){
            alert("工装编码不能为空！")
            form.GZBM.focus();
            return false;
        }else if(form.CLYS.value==''){
            alert("材料及颜色不能为空！")
            form.CLYS.focus();
            return false;
        }else if(form.JCBM.value==''){
            alert("机床编码不能为空！")
            form.JCBM.focus();
            return false;
        }else if(form.CZG.value==''){
            alert("操作工一栏不能为空！")
            form.CZG.focus();
            return false;
        }else if(form.SLHJ.value==''){
            alert("数量合计不能为空！")
            form.SLHJ.focus();
            return false;
        }
        return true;
    }

   var sumAdd =function ()
   {
       var num1 = document.getElementById("GYTS").value || 0;
       var num2 = document.getElementById("QL").value || 0;
       var num3 = document.getElementById("HBD").value || 0;
       var num4 = document.getElementById("HW").value || 0;
       var num5 = document.getElementById("QW").value || 0;
       var num6 = document.getElementById("YS").value || 0;
       var num7 = document.getElementById("SBW").value || 0;
       var num8 = document.getElementById("SS").value || 0;
       var num9 = document.getElementById("LSL").value || 0;
       var num10 = document.getElementById("LBH").value || 0;
       var num11 = document.getElementById("SJ").value || 0;
       var num12 = document.getElementById("BX").value || 0;
       var num13 = document.getElementById("SY").value || 0;
       var num14 = document.getElementById("DKDL").value || 0;
       var num15 = document.getElementById("YWB").value || 0;
       var num16 = document.getElementById("SC").value || 0;
       var num17 = document.getElementById("DS").value || 0;
       var num18 = document.getElementById("HS").value || 0;
       var num19 = document.getElementById("NM").value || 0;
       var num20 = document.getElementById("MC").value || 0;
       var num21 = document.getElementById("TJBL").value || 0;
       var num22 = document.getElementById("SYBL").value || 0;
       var num23 = document.getElementById("SM").value || 0;
       var SLHJ = document.getElementById("SLHJ").value || 0;

       var result = parseFloat(num1)+parseFloat(num2)+parseFloat(num3)+
           parseFloat(num4)+parseFloat(num5)+parseFloat(num6)+
           parseFloat(num7)+parseFloat(num8)+parseFloat(num9)+
           parseFloat(num10)+parseFloat(num11)+parseFloat(num12)+
           parseFloat(num13)+parseFloat(num14)+parseFloat(num15)+
           parseFloat(num16)+parseFloat(num17)+parseFloat(num18)+
           parseFloat(num19)+parseFloat(num20)+parseFloat(num21)+
           parseFloat(num22)+parseFloat(num23);
       document.getElementById("SLHJ").value = result;
   }

    function editCustomer(id) {
        $.ajax({
            type: "get",
            url: "${pageContext.request.contextPath}/scrap/findById.do",
            data: {"scrapId":id},
            success: function (data) {
                alert("哈哈");
                $("#edit_cust_id").val(data.cust_id);
                $("#edit_customerName").val(data.cust_name);
                $("#edit_customerFrom").val(data.cust_source)
                $("#edit_custIndustry").val(data.cust_industry)
                $("#edit_custLevel").val(data.cust_level)
                $("#edit_linkMan").val(data.cust_linkman);
                $("#edit_phone").val(data.cust_phone);
                $("#edit_mobile").val(data.cust_mobile);
                $("#edit_zipcode").val(data.cust_zipcode);
                $("#edit_address").val(data.cust_address);
            }
        });
    }


    $(document).ready(function () {
        // 选择框
        $(".select2").select2();

        // WYSIHTML5编辑器
        $(".textarea").wysihtml5({
            locale: 'zh-CN'
        });
    });

    // 设置激活菜单
    function setSidebarActive(tagUri) {
        var liObj = $("#" + tagUri);
        if (liObj.length > 0) {
            liObj.parent().parent().addClass("active");
            liObj.addClass("active");
        }
    }

    $(document).ready(function () {

        // 激活导航位置
        setSidebarActive("admin-datalist");

        // 列表按钮
        $("#dataList td input[type='checkbox']").iCheck({
            checkboxClass: 'icheckbox_square-blue',
            increaseArea: '20%'
        });
        // 全选操作
        $("#selall").click(function () {
            var clicks = $(this).is(':checked');
            if (!clicks) {
                $("#dataList td input[type='checkbox']").iCheck("uncheck");
            } else {
                $("#dataList td input[type='checkbox']").iCheck("check");
            }
            $(this).data("clicks", !clicks);
        });
    });
</script>
</body>

</html>