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

		<div class="content-wrapper" style="height: 1650px">

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
			<section class="content" >

				<!-- .box-body -->
				<div class="box box-primary">
					<div class="box-header with-border">
						<h3 class="box-title">列表</h3>
					</div>

					<div class="box-body"  >

						<!-- 数据表格 -->
						<div class="table-box">
							<!-- 报废单  -->
							<!-- 客户编辑对话框 -->
									<div class="modal-content" style="width: 950px;margin-top: 25px;margin-left: 400px">
										<div class="modal-header">
											<h3 class="modal-title " id="gridSystemModalLabel" style="margin-left: 400px">
												<b>零件首检表</b></h3>
										</div>
										<div class="modal-body modal-lg"  style="width: 950px">
											<form class="form-horizontal" id="edit_customer_form"
												  action="${pageContext.request.contextPath}/ljsjb/updateZKSK.do?id=${LsjbList.id}"
												  method="post" onsubmit="return check(this)">
												<table class="table table-bordered modal-lg" >
													<tr>
														<td style='width:85px;text-align: center;'><b>零件名称</b></td>
														<td colspan="2" style='width:250px'><input type="text" style="width: 250px" name="LJMC"
																								   placeholder="" value="${LsjbList.LJMC}"></td>
														<td style='width:85px'><b>工装编号</b></td>
														<td colspan="2" style='width:130px'><input type="text" style="width: 150px" name="GZBM"
																								   placeholder="" value="${LsjbList.GZBM}"></td>
														<td style='width:85px'><b>包装</b></td>
														<td style='width:130px'><input type="text" style="width: 100px" name="BZ"
																					   placeholder="" value="${LsjbList.BZ}"> </td>
													</tr>
													<tr>
														<td style='width:85px' class="tds">零件图号</td>
														<td colspan="2" style='width:250px'><input type="text" style="width: 250px" name="LJTH"
																								   placeholder="" value="${LsjbList.LJTH}"></td>
														<td style='width:85px'class="tds">整形周期</td>
														<td colspan="2" style='width:130px'><input type="text" style="width: 150px" name="ZXZQ"
																								   placeholder="" value="${LsjbList.ZXZQ}"></td>
														<td style='width:85px'class="tds">机床</td>
														<td style='width:130px'><input type="text" style="width: 100px" name="JC"
																					   placeholder="" value="${LsjbList.JC}"></td>
													</tr>
													<tr>
														<td style='width:85px'class="tds">物料编码</td>
														<td colspan="2" style='width:250px'><input type="text" style="width: 250px" name="WLBM"
																								   placeholder="" value="${LsjbList.WLBM}"></td>
														<td style='width:85px'class="tds">冷却时间</td>
														<td colspan="2" style='width:130px'><input type="text" style="width: 150px" name="LQSJ"
																								   placeholder="" value="${LsjbList.LQSJ}"></td>
														<td style='width:85px'class="tds">日期</td>
														<td style='width:130px'><input type="text" style="width: 100px" name="RQ"
																					   placeholder="" value="${LsjbList.RQ}"></td>
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
																			   placeholder="" value="${LsjbList.CL_YQ}"></td>
														<td colspan="3"><input type="text" style="width: 250px" name="CL_JG"
																			   placeholder="" value="${LsjbList.CL_JG}"></td>
														<td colspan="2"><input type="text" style="width: 200px" name="CL_JL"
																			   placeholder="" value="${LsjbList.CL_JL}"></td>
													</tr>
													<tr>

														<td class="tds">颜色</td>
														<td colspan="2"><input type="text" style="width: 250px" name="YS_YQ"
																			   placeholder="" value="${LsjbList.YS_YQ}"></td>
														<td colspan="3"><input type="text" style="width: 250px" name="YS_JG"
																			   placeholder="" value="${LsjbList.YS_JG}"></td>
														<td colspan="2"><input type="text" style="width: 200px" name="YS_JL"
																			   placeholder="" value="${LsjbList.YS_JL}"></td>

													</tr>
													<tr>

														<td class="tds">色差值</td>
														<td colspan="2"><input type="text" style="width: 250px" name="SCZ_YQ"
																			   placeholder="" value="${LsjbList.SCZ_YQ}"></td>
														<td colspan="3"><input type="text" style="width: 250px" name="SCZ_JG"
																			   placeholder="" value="${LsjbList.SCZ_JG}"></td>
														<td colspan="2"><input type="text" style="width: 200px" name="SCZ_JL"
																			   placeholder="" value="${LsjbList.SCZ_JL}"></td>

													</tr>
													<tr>
														<td class="tds">ROHS</td>
														<td colspan="2"><input type="text" style="width: 250px" name="ROHS_YQ"
																			   placeholder="" value="${LsjbList.ROHS_YQ}"></td>
														<td colspan="3"><input type="text" style="width: 250px" name="ROHS_JG"
																			   placeholder="" value="${LsjbList.ROHS_JG}"></td>
														<td colspan="2"><input type="text" style="width: 200px" name="ROHS_JL"
																			   placeholder="" value="${LsjbList.ROHS_JL}"></td>
													</tr>
													<tr>

														<td class="tds">尺寸</td>
														<td colspan="2"><input type="text" style="width: 250px" name="CC_YQ1"
																			   placeholder="" value="${LsjbList.CC_YQ1}"></td>
														<td colspan="3"><input type="text" style="width: 250px" name="CC_JG1"
																			   placeholder="" value="${LsjbList.CC_JG1}"></td>
														<td colspan="2"><input type="text" style="width: 200px" name="CC_JL1"
																			   placeholder="" value="${LsjbList.CC_JL1}"></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="2"><input type="text" style="width: 250px" name="CC_YQ2"
																			   placeholder="" value="${LsjbList.CC_YQ2}"></td>
														<td colspan="3"><input type="text" style="width: 250px" name="CC_YQ3"
																			   placeholder="" value="${LsjbList.CC_YQ3}"></td>
														<td colspan="2"><input type="text" style="width: 200px" name="CC_YQ4"
																			   placeholder="" value="${LsjbList.CC_YQ4}"></td>
													</tr>
													<tr>

														<td></td>
														<td colspan="2"><input type="text" style="width: 250px" name="CC_YQ5"
																			   placeholder="" value="${LsjbList.CC_YQ5}"></td>
														<td colspan="3"><input type="text" style="width: 250px" name="CC_YQ6"
																			   placeholder="" value="${LsjbList.CC_YQ6}"></td>
														<td colspan="2"><input type="text" style="width: 200px" name="CC_JG2"
																			   placeholder="" value="${LsjbList.CC_JG2}"></td>

													</tr>
													<tr>
														<td></td>
														<td colspan="2"><input type="text" style="width: 250px" name="CC_JG3"
																			   placeholder="" value="${LsjbList.CC_JG3}"></td>
														<td colspan="3"><input type="text" style="width: 250px" name="CC_JG4"
																			   placeholder="" value="${LsjbList.CC_JG4}"></td>
														<td colspan="2"><input type="text" style="width: 200px" name="CC_JG5"
																			   placeholder="" value="${LsjbList.CC_JG5}"></td>


													</tr>
													<tr>
														<td></td>
														<td colspan="2"><input type="text" style="width: 250px" name="CC_JG6"
																			   placeholder="" value="${LsjbList.CC_JG6}"></td>
														<td colspan="3"><input type="text" style="width: 250px" name="CC_JL2"
																			   placeholder="" value="${LsjbList.CC_JL2}"></td>
														<td colspan="2"><input type="text" style="width: 200px" name="CC_JL3"
																			   placeholder="" value="${LsjbList.CC_JL3}"></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="2"><input type="text" style="width: 250px" name="CC_JL4"
																			   placeholder="" value="${LsjbList.CC_JL4}"></td>
														<td colspan="3"><input type="text" style="width: 250px" name="CC_JL5"
																			   placeholder="" value="${LsjbList.CC_JL5}"></td>
														<td colspan="2"><input type="text" style="width: 200px" name="CC_JL6"
																			   placeholder="" value="${LsjbList.CC_JL6}"></td>
													</tr>
													<tr>
														<td style="text-align: center;" class="tds">结构外观强度</td>
														<td colspan="3" style='word-wrap: break-word ;width:25px;word-break:break-all'>各个部位无毛刺、缺料、多料、刀伤、拉裂、偏位、烧焦等</td>
														<td colspan="2"><input type="text" style="width: 150px" name="JG1"
																			   placeholder="" value="${LsjbList.JG1}"></td>
														<td colspan="2"><input type="text" style="width: 150px" name="JL1"
																			   placeholder="" value="${LsjbList.JL1}"></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3" style='word-wrap: break-word ;width:25px;word-break:break-all'>表面无不可接受的锈斑、缩水、顶白、熔接痕、拉伤、拉白、划伤、气纹、水花、油纹、波纹、黑点、油污、色纹等缺陷</td>

														<td colspan="2"><input type="text" style="width: 150px;margin-top: 15px" name="JG2"
																			   placeholder="" value="${LsjbList.JG2}"></td>
														<td colspan="2"><input type="text" style="width: 150px;margin-top: 15px" name="JL2"
																			   placeholder="" value="${LsjbList.JL2}"></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3">有回收及材料标识和型腔标识</td>

														<td colspan="2"><input type="text" style="width: 150px" name="JG3"
																			   placeholder="" value="${LsjbList.JG3}"></td>
														<td colspan="2"><input type="text" style="width: 150px" name="JL3"
																			   placeholder="" value="${LsjbList.JL3}"></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3" style='word-wrap: break-word ;width:25px;word-break:break-all'>各边或网格、按钮无不可接受或超出工艺要求的变形</td>

														<td colspan="2"><input type="text" style="width: 150px" name="JG4"
																			   placeholder="" value="${LsjbList.JG4}"></td>
														<td colspan="2"><input type="text" style="width: 150px" name="JL4"
																			   placeholder="" value="${LsjbList.JL4}"></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3" style='word-wrap: break-word ;width:25px;word-break:break-all'>螺钉孔无不可接受的堵孔、偏位、错位、螺钉孔壁料薄等</td>

														<td colspan="2"><input type="text" style="width: 150px" name="JG5"
																			   placeholder="" value="${LsjbList.JG5}"></td>
														<td colspan="2"><input type="text" style="width: 150px" name="JL5"
																			   placeholder="" value="${LsjbList.JL5}"></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3" style='word-wrap: break-word ;width:25px;word-break:break-all'>扣位、齿位、网格及转角处等薄弱位置不容易断、易裂，是否需要用增加R角或加筋</td>

														<td colspan="2"><input type="text" style="width: 150px" name="JG6"
																			   placeholder="" value="${LsjbList.JG6}"></td>
														<td colspan="2"><input type="text" style="width: 150px" name="JL6"
																			   placeholder="" value="${LsjbList.JL6}"></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3" style='word-wrap: break-word ;width:25px;word-break:break-all'>风叶高速运转、跌落、摆动、动平衡、重量合格，平台无明显缩水、叶片无裂痕、变形，包装符合特殊要求</td>
														<td colspan="2"><input type="text" style="width: 150px" name="JG7"
																			   placeholder="" value="${LsjbList.JG7}"></td>
														<td colspan="2"><input type="text" style="width: 150px" name="JL7"
																			   placeholder="" value="${LsjbList.JL7}"></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3" style='word-wrap: break-word ;width:25px;word-break:break-all'>关键部位（如底壳出水口、底壳风道、接水盘排水口、导风板转轴和轴孔、接水盘轴孔、控制盖板按钮等）不存在毛刺；关键部位（如底壳和接水盘的水槽、水箱）无料薄或穿孔现象</td>
														<td colspan="2"><input type="text" style="width: 150px;margin-top: 25px" name="JG8"
																			   placeholder="" value="${LsjbList.JG8}"></td>
														<td colspan="2"><input type="text" style="width: 150px;margin-top: 25px" name="JL8"
																			   placeholder="" value="${LsjbList.JL8}"></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3" style='word-wrap: break-word ;width:25px;word-break:break-all'>与相邻或相关联的注塑件进行组装，配合是否异常（如配合错位、缝隙过大、面板扣不紧或打不开等现象）</td>
														<td colspan="2"><input type="text" style="width: 150px" name="JG9"
																			   placeholder="" value="${LsjbList.JG9}"></td>
														<td colspan="2"><input type="text" style="width: 150px" name="JL9"
																			   placeholder="" value="${LsjbList.JL9}"></td>
													</tr>
													<tr>
														<td></td>
														<td colspan="3">无异物危害现象</td>
														<td colspan="2"><input type="text" style="width: 150px" name="JG10"
																			   placeholder="" value="${LsjbList.JG10}"></td>
														<td colspan="2"><input type="text" style="width: 150px" name="JL10"
																			   placeholder="" value="${LsjbList.JL10}"></td>
													</tr>
													<tr>
														<td class="tds">操作工</td>
														<td colspan="2"><input type="text" style="width: 200px" name="CZG"
																			   placeholder="" value="${LsjbList.CZG}"></td>
														<td class="tds">首检人</td>
														<td colspan="4"><input type="text" style="width: 250px" name="JYY"
																			   placeholder="" value="${LsjbList.JYY}"></td>

													</tr>
													<tr>
														<td class="tds">测量仪器</td>
														<td colspan="2"><input type="text" style="width: 200px" name="CLYQ"
																			   placeholder="" value="${LsjbList.CLYQ}"></td>
														<td class="tds">首检班组</td>
														<td colspan="4"><input type="text" style="width: 250px" name="JYDW"
																			   placeholder="" value="${LsjbList.JYDW}"></td>

													</tr>
													<tr>
														<td class="tds">备注</td>
														<td colspan="2"><input type="text" style="width: 200px" name="BAZ"
																			   placeholder="" value="${LsjbList.BAZ}"></td>
														<td class="tds">首检结论</td>
														<td colspan="4"><input type="text" style="width: 250px" name="SJJL"
																			   placeholder="" value="${LsjbList.SJJL}"></td>
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
						<!-- 数据表格 /-->


					</div>


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