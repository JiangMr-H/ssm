<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<!-- Bootstrap 3.3.6 -->
<!-- Font Awesome -->
<!-- Ionicons -->
<!-- iCheck -->
<!-- Morris chart -->
<!-- jvectormap -->
<!-- Date Picker -->
<!-- Daterange picker -->
<!-- Bootstrap time Picker -->
<!--<link rel="stylesheet" href="${pageContext.request.contextPath}/${pageContext.request.contextPath}/${pageContext.request.contextPath}/plugins/timepicker/bootstrap-timepicker.min.css">-->
<!-- bootstrap wysihtml5 - text editor -->
<!--数据表格-->
<!-- 表格树 -->
<!-- select2 -->
<!-- Bootstrap Color Picker -->
<!-- bootstrap wysihtml5 - text editor -->
<!--bootstrap-markdown-->
<!-- Theme style -->
<!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
<!-- Ion Slider -->
<!-- ion slider Nice -->
<!-- bootstrap slider -->
<!-- bootstrap-datetimepicker -->

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->








<!-- jQuery 2.2.3 -->
<!-- jQuery UI 1.11.4 -->
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<!-- Bootstrap 3.3.6 -->
<!-- Morris.js charts -->
<!-- Sparkline -->
<!-- jvectormap -->
<!-- jQuery Knob Chart -->
<!-- daterangepicker -->
<!-- datepicker -->
<!-- Bootstrap WYSIHTML5 -->
<!-- Slimscroll -->
<!-- FastClick -->
<!-- iCheck -->
<!-- AdminLTE App -->
<!-- 表格树 -->
<!-- select2 -->
<!-- bootstrap color picker -->
<!-- bootstrap time picker -->
<!--<script src="${pageContext.request.contextPath}/${pageContext.request.contextPath}/${pageContext.request.contextPath}/plugins/timepicker/bootstrap-timepicker.min.js"></script>-->
<!-- Bootstrap WYSIHTML5 -->
<!--bootstrap-markdown-->
<!-- CK Editor -->
<!-- InputMask -->
<!-- DataTables -->
<!-- ChartJS 1.0.1 -->
<!-- FLOT CHARTS -->
<!-- FLOT RESIZE PLUGIN - allows the chart to redraw when the window is resized -->
<!-- FLOT PIE PLUGIN - also used to draw donut charts -->
<!-- FLOT CATEGORIES PLUGIN - Used to draw bar charts -->
<!-- jQuery Knob -->
<!-- Sparkline -->
<!-- Morris.js charts -->
<!-- Ion Slider -->
<!-- Bootstrap slider -->
<!-- bootstrap-datetimepicker -->
<!-- 页面meta /-->

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

<style>
	td{
		text-align:center;
	}
	.tds{
        font-weight: bold;
	}

</style>

<body class="hold-transition skin-purple sidebar-mini">

	<div class="wrapper">

		<!-- 页面头部 -->
		<jsp:include page="header.jsp"></jsp:include>
		<!-- 页面头部 /-->
		<!-- 导航侧栏 -->
		<jsp:include page="aside.jsp"></jsp:include>
		<!-- 导航侧栏 /-->

		<!-- 内容区域 -->

		<div class="content-wrapper">

			<!-- 内容头部 -->
			<section class="content-header">
				<h1>
					数据记录 <small>零件首检表</small>
				</h1>
				<ol class="breadcrumb">
					<li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
					<li><a href="#">数据管理</a></li>
					<li class="active">零件首检列表</li>
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
								<div class="modal-dialog modal-lg"  role="document"  style="width: 950px">
									<div class="modal-content">
										<div class="modal-header">
											<button type="button" class="close" data-dismiss="modal" aria-label="Close">
												<span aria-hidden="true">&times;</span>
											</button>
											<h3 class="modal-title " id="gridSystemModalLabel" style="margin-left: 400px">
												<b>零件首检表</b></h3>
										</div>
										<div class="modal-body modal-lg"  style="width: 950px">
											<form class="form-horizontal" id="edit_customer_form"
												  action="${pageContext.request.contextPath}/ljsjb/saveLjsj.do"
												  method="post" onsubmit="return check(this)">
												<table class="table table-bordered modal-lg" >
													<tr>
														<td style='width:85px;text-align: center;'><i style="color: red">* </i><b>零件名称</b></td>
														<td colspan="2" style='width:250px'><input type="text" style="width: 250px" name="LJMC"
																								   placeholder=""></td>
														<td style='width:85px'><i style="color: red">* </i><b>工装编号</b></td>
														<td colspan="2" style='width:130px'><input type="text" style="width: 150px" name="GZBM"
																								   placeholder=""></td>
														<td style='width:85px'><i style="color: red">* </i><b>包装</b></td>
														<td style='width:130px'><input type="text" style="width: 100px" name="BZ"
																					   placeholder=""></td>
													</tr>
													<tr>
														<td style='width:85px' class="tds"><i style="color: red">* </i>零件图号</td>
														<td colspan="2" style='width:250px'><input type="text" style="width: 250px" name="LJTH"
																								   placeholder=""></td>
														<td style='width:85px'class="tds"><i style="color: red">* </i>整形周期</td>
														<td colspan="2" style='width:130px'><input type="text" style="width: 150px" name="ZXZQ"
																								   placeholder=""></td>
														<td style='width:85px'class="tds"><i style="color: red">* </i>机床</td>
														<td style='width:130px'><input type="text" style="width: 100px" name="JC"
																					   placeholder=""></td>
													</tr>
													<tr>
														<td style='width:85px'class="tds"><i style="color: red">* </i>物料编码</td>
														<td colspan="2" style='width:250px'><input type="text" style="width: 250px" name="WLBM"
																								   placeholder=""></td>
														<td style='width:85px'class="tds"><i style="color: red">* </i>冷却时间</td>
														<td colspan="2" style='width:130px'><input type="text" style="width: 150px" name="LQSJ"
																								   placeholder=""></td>
														<td style='width:85px'class="tds"><i style="color: red">* </i>日期</td>
														<td style='width:130px'><input type="text" style="width: 100px" name="RQ"
																					   placeholder=""></td>
													</tr>
													<tr>
														<td class="tds">检验项目</td>
														<td colspan="2" class="tds">检验要求</td>
														<td colspan="3" class="tds">检验结果</td>
														<td colspan="2" class="tds">结论</td>
													</tr>
													<tr>

														<td class="tds">材料</td>
														<td colspan="2"><input type="text" style="width: 250px" name="CL_YQ"
																			   placeholder=""></td>
														<td colspan="3"><input type="text" style="width: 250px" name="CL_JG"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 200px" name="CL_JL"
																			   placeholder=""></td>
													</tr>
													<tr>

														<td class="tds">颜色</td>
														<td colspan="2"><input type="text" style="width: 250px" name="YS_YQ"
																			   placeholder=""></td>
														<td colspan="3"><input type="text" style="width: 250px" name="YS_JG"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 200px" name="YS_JL"
																			   placeholder=""></td>

													</tr>
													<tr>

														<td class="tds">色差值</td>
														<td colspan="2"><input type="text" style="width: 250px" name="SCZ_YQ"
																			   placeholder=""></td>
														<td colspan="3"><input type="text" style="width: 250px" name="SCZ_JG"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 200px" name="SCZ_JL"
																			   placeholder=""></td>

													</tr>
													<tr>
														<td class="tds">ROHS</td>
														<td colspan="2"><input type="text" style="width: 250px" name="ROHS_YQ"
																			   placeholder=""></td>
														<td colspan="3"><input type="text" style="width: 250px" name="ROHS_JG"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 200px" name="ROHS_JL"
																			   placeholder=""></td>
													</tr>
													<tr>

														<td class="tds">尺寸</td>
														<td colspan="2"><input type="text" style="width: 250px" name="CC_YQ1"
																			   placeholder=""></td>
														<td colspan="3"><input type="text" style="width: 250px" name="CC_JG1"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 200px" name="CC_JL1"
																			   placeholder=""></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="2"><input type="text" style="width: 250px" name="CC_YQ2"
																			   placeholder=""></td>
														<td colspan="3"><input type="text" style="width: 250px" name="CC_YQ3"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 200px" name="CC_YQ4"
																			   placeholder=""></td>
													</tr>
													<tr>

														<td></td>
														<td colspan="2"><input type="text" style="width: 250px" name="CC_YQ5"
																			   placeholder=""></td>
														<td colspan="3"><input type="text" style="width: 250px" name="CC_YQ6"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 200px" name="CC_JG2"
																			   placeholder=""></td>

													</tr>
													<tr>
														<td></td>
														<td colspan="2"><input type="text" style="width: 250px" name="CC_JG3"
																			   placeholder=""></td>
														<td colspan="3"><input type="text" style="width: 250px" name="CC_JG4"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 200px" name="CC_JG5"
																			   placeholder=""></td>


													</tr>
													<tr>
														<td></td>
														<td colspan="2"><input type="text" style="width: 250px" name="CC_JG6"
																			   placeholder=""></td>
														<td colspan="3"><input type="text" style="width: 250px" name="CC_JL2"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 200px" name="CC_JL3"
																			   placeholder=""></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="2"><input type="text" style="width: 250px" name="CC_JL4"
																			   placeholder=""></td>
														<td colspan="3"><input type="text" style="width: 250px" name="CC_JL5"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 200px" name="CC_JL6"
																			   placeholder=""></td>
													</tr>
													<tr>
														<td style="text-align: center;" class="tds">结构外观强度</td>
														<td colspan="3" style='word-wrap: break-word ;width:25px;word-break:break-all'>各个部位无毛刺、缺料、多料、刀伤、拉裂、偏位、烧焦等</td>
														<td colspan="2"><input type="text" style="width: 150px" name="JG1"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 150px" name="JL1"
																			   placeholder=""></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3" style='word-wrap: break-word ;width:25px;word-break:break-all'>表面无不可接受的锈斑、缩水、顶白、熔接痕、拉伤、拉白、划伤、气纹、水花、油纹、波纹、黑点、油污、色纹等缺陷</td>

														<td colspan="2"><input type="text" style="width: 150px;margin-top: 15px" name="JG2"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 150px;margin-top: 15px" name="JL2"
																			   placeholder=""></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3">有回收及材料标识和型腔标识</td>

														<td colspan="2"><input type="text" style="width: 150px" name="JG3"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 150px" name="JL3"
																			   placeholder=""></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3" style='word-wrap: break-word ;width:25px;word-break:break-all'>各边或网格、按钮无不可接受或超出工艺要求的变形</td>

														<td colspan="2"><input type="text" style="width: 150px" name="JG4"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 150px" name="JL4"
																			   placeholder=""></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3" style='word-wrap: break-word ;width:25px;word-break:break-all'>螺钉孔无不可接受的堵孔、偏位、错位、螺钉孔壁料薄等</td>

														<td colspan="2"><input type="text" style="width: 150px" name="JG5"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 150px" name="JL5"
																			   placeholder=""></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3" style='word-wrap: break-word ;width:25px;word-break:break-all'>扣位、齿位、网格及转角处等薄弱位置不容易断、易裂，是否需要用增加R角或加筋</td>

														<td colspan="2"><input type="text" style="width: 150px" name="JG6"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 150px" name="JL6"
																			   placeholder=""></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3" style='word-wrap: break-word ;width:25px;word-break:break-all'>风叶高速运转、跌落、摆动、动平衡、重量合格，平台无明显缩水、叶片无裂痕、变形，包装符合特殊要求</td>
														<td colspan="2"><input type="text" style="width: 150px" name="JG7"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 150px" name="JL7"
																			   placeholder=""></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3" style='word-wrap: break-word ;width:25px;word-break:break-all'>关键部位（如底壳出水口、底壳风道、接水盘排水口、导风板转轴和轴孔、接水盘轴孔、控制盖板按钮等）不存在毛刺；关键部位（如底壳和接水盘的水槽、水箱）无料薄或穿孔现象</td>
														<td colspan="2"><input type="text" style="width: 150px;margin-top: 25px" name="JG8"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 150px;margin-top: 25px" name="JL8"
																			   placeholder=""></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3" style='word-wrap: break-word ;width:25px;word-break:break-all'>与相邻或相关联的注塑件进行组装，配合是否异常（如配合错位、缝隙过大、面板扣不紧或打不开等现象）</td>
														<td colspan="2"><input type="text" style="width: 150px" name="JG9"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 150px" name="JL9"
																			   placeholder=""></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3">无异物危害现象</td>
														<td colspan="2"><input type="text" style="width: 150px" name="JG10"
																			   placeholder=""></td>
														<td colspan="2"><input type="text" style="width: 150px" name="JL10"
																			   placeholder=""></td>
													</tr>
													<tr>
														<td class="tds"><i style="color: red">* </i>操作工</td>
														<td colspan="2"><input type="text" style="width: 200px" name="CZG"
																			   placeholder=""></td>
														<td class="tds"><i style="color: red">* </i>首检人</td>
														<td colspan="4"><input type="text" style="width: 250px" name="JYY"
																			   placeholder=""></td>

													</tr>
													<tr>
														<td class="tds"><i style="color: red">* </i>测量仪器</td>
														<td colspan="2"><input type="text" style="width: 200px" name="CLYQ"
																			   placeholder=""></td>
														<td class="tds"><i style="color: red">* </i>首检班组</td>
														<td colspan="4"><input type="text" style="width: 250px" name="JYDW"
																			   placeholder=""></td>

													</tr>
													<tr>
														<td class="tds">备注</td>
														<td colspan="2"><input type="text" style="width: 200px" name="BAZ"
																			   placeholder=""></td>
														<td class="tds">首检结论</td>
														<td colspan="4"><input type="text" style="width: 250px" name="SJJL"
																			   placeholder="" disabled></td>

													</tr>
												</table>


												<span style="color: red;font-size: 14px" class="tds">注：*为必填项</span>


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
									<th class="sorting_desc">零件名称</th>
									<th class="sorting_asc sorting_asc_disabled">工装编号</th>
									<th class="sorting_desc sorting_desc_disabled">包装</th>
									<th class="sorting">零件图号</th>
									<th class="text-center sorting">整形周期</th>
									<th class="sorting">机床</th>
									<th class="text-center sorting">物料编码</th>
									<th class="sorting">冷却时间</th>
									<th class="sorting">进程</th>
									<th class="text-center sorting">日期</th>
									<th class="sorting">操作</th>
									<%--<th class="text-center">详细</th>--%>
								</tr>
								</thead>
								<tbody>


								<c:forEach items="${pageInfo.list}" var="ljsjb">
									<tr>
										<td><input name="ids" type="checkbox"></td>
										<td>${ljsjb.id }</td>
										<td>${ljsjb.LJMC }</td>
										<td>${ljsjb.GZBM }</td>
										<td>${ljsjb.BZ }</td>
										<td>${ljsjb.LJTH }</td>
										<td class="text-center">${ljsjb.ZXZQ }</td>
										<td>${ljsjb.JC }</td>
										<td>${ljsjb.WLBM }</td>
										<td>${ljsjb.LQSJ }</td>
										<td>${ljsjb.LJSB_JC }</td>
										<td>${ljsjb.scantime }</td>
										<td class="text-center">
											<a type="button" class="btn bg-olive btn-xs" data-toggle="modal"
											   data-target="#exampleModal" onclick="location.href='${pageContext.request.contextPath}/ljsjb/findById.do?id=${ljsjb.id }'">
												详情
											</a>
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
									<a href="${pageContext.request.contextPath}/ljsjb/findAllljsj.do?page=1&size=${pageInfo.pageSize}"
									   aria-label="Previous">首页</a></li>
								<li>
									<a href="${pageContext.request.contextPath}/ljsjb/findAllljsj.do?page=${pageInfo.pageNum-1}&size=${pageInfo.pageSize}">上一页</a>
								</li>
								<c:forEach begin="${pageInfo.pageNum}" end="${pageInfo.pageNum}" var="pageNum">
									<li>
										<a href="${pageContext.request.contextPath}/ljsjb/findAllljsj.do?page=${pageNum}&size=${pageInfo.pageSize}">${pageNum}</a>
									</li>
								</c:forEach>
								<li>
									<a href="${pageContext.request.contextPath}/ljsjb/findAllljsj.do?page=${pageInfo.pageNum+1}&size=${pageInfo.pageSize}">下一页</a>
								</li>
								<li>
									<a href="${pageContext.request.contextPath}/ljsjb/findAllljsj.do?page=${pageInfo.pages}&size=${pageInfo.pageSize}"
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
			if(form.LJMC.value==''){
				alert("请输入零件名称！")
				form.LJMC.focus();
				return false;
			}else if(form.GZBM.value==''){
				alert("请输入工装编号！")
				form.GZBM.focus();
				return false;
			}else if(form.BZ.value==''){
				alert("包装不能为空！")
				form.BZ.focus();
				return false;
			}else if(form.LJTH.value==''){
				alert("零件图号不能为空！")
				form.LJTH.focus();
				return false;
			}else if(form.ZXZQ.value==''){
				alert("整形周期不能为空！")
				form.ZXZQ.focus();
				return false;
			}else if(form.JC.value==''){
				alert("机床不能为空！")
				form.JC.focus();
				return false;
			}else if(form.WLBM.value==''){
				alert("物料编码不能为空！")
				form.WLBM.focus();
				return false;
			}else if(form.LQSJ.value==''){
				alert("冷却时间不能为空！")
				form.LQSJ.focus();
				return false;
			}else if(form.RQ.value==''){
				alert("日期不能为空！")
				form.RQ.focus();
				return false;
			}else if(form.CZG.value==''){
				alert("操作工不能为空！")
				form.CZG.focus();
				return false;
			}else if(form.JYY.value==''){
				alert("首检人不能为空！")
				form.JYY.focus();
				return false;
			}else if(form.CLYQ.value==''){
				alert("测量仪器不能为空！")
				form.CLYQ.focus();
				return false;
			}else if(form.JYDW.value==''){
				alert("首检班组不能为空！")
				form.JYDW.focus();
				return false;
			}

			return true;
		}



		$(document).ready(function() {
			// 选择框
			$(".select2").select2();

			// WYSIHTML5编辑器
			$(".textarea").wysihtml5({
				locale : 'zh-CN'
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

		$(document).ready(function() {

			// 激活导航位置
			setSidebarActive("admin-datalist");

			// 列表按钮 
			$("#dataList td input[type='checkbox']").iCheck({
				checkboxClass : 'icheckbox_square-blue',
				increaseArea : '20%'
			});
			// 全选操作 
			$("#selall").click(function() {
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