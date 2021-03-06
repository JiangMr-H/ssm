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

<body class="hold-transition skin-purple sidebar-mini">

<div class="wrapper">

	<!-- 页面头部 -->
	<jsp:include page="header.jsp"></jsp:include>
	<!-- 页面头部 /-->
	<!-- 导航侧栏 -->
	<jsp:include page="aside.jsp"></jsp:include>
	<!-- 导航侧栏 /-->

	<!-- 内容区域 -->
	<!-- @@master = admin-layout.html-->
	<!-- @@block = content -->

	<div class="content-wrapper">

		<!-- 内容头部 -->
		<section class="content-header">
			<h1>
				数据列表<small>调机员审核</small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
				<li><a href="#">无纸化点检</a></li>
				<li class="active">调机员审核</li>
			</ol>
		</section>
		<!-- 内容头部 /-->



			<!-- .box-body -->
			<div class="box box-primary">
				<div class="box-header with-border">
					<h3 class="box-title">列表</h3>
				</div>

				<%--<div class="box-body">

					<!-- 数据表格 -->
					<div class="table-box">

						<!-- 客户编辑对话框 -->
						<div class="modal fade bs-example-modal-lg" id="customerEditDialog" tabindex="-1" role="dialog"
							 aria-labelledby="myModalLabel">--%>
							<div class="modal-dialog modal-lg"  role="document"  style="width: 950px">
								<div class="modal-content">

									<form action="${pageContext.request.contextPath}/GYCS/updateTJY.do?id=${TSYscrap.id}&count=3"
											method="post">

									<div class="modal-header">
										<h4 class="modal-title " name="id" id="gridSystemModalLabel" >
											工艺参数记录表</h4>
									</div>
									<div class="modal-body modal-lg"  style="width: 950px">
											<table class="table table-bordered modal-lg" >
												<tr>
													<td class="text-center"><i style="color: red">* </i>
														产品名称：</td>
													<td colspan="4"><input type="text"  name="CPMC" placeholder="" value="${TSYscrap.CPMC}"></td>
													<td class="text-center" ><i style="color: red">* </i>操作员：</td>
													<td colspan="3"><input type="text" style="width: 150px" name="JYY"
																		   placeholder="" value="${TSYscrap.JYY}"></td>
													<td colspan="4" rowspan="2" style="padding-top:27px ">参数变化情况</td>

												</tr>
												<tr>
													<td class="text-center"><i style="color: red">* </i>
														机床编码：</td>
													<td colspan="2"><input type="text"  name="JCBM" placeholder="" value="${TSYscrap.JCBM}"></td>
													<td class="text-center"><i style="color: red">* </i>
														班次：</td>
													<td ><input type="text" style="width: 80px" name="BC" placeholder="" value="${TSYscrap.BC}"></td>
													<td class="text-center"><i style="color: red">* </i>
														检查日期：</td>
													<td colspan="3"><input type="date"  name="JCRQ" placeholder="" value="${TSYscrap.JCRQ}"></td>

												</tr>
												<tr>
													<td class="text-center" rowspan="5"style="padding-top: 60px">注塑</br>工艺参数</td>
													<td class="text-center">压力</td>
													<td class="text-center"><input type="text"  style="width: 50px" name="YL1" value="${TSYscrap.YL1}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="YL2" value="${TSYscrap.YL2}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="YL3" value="${TSYscrap.YL3}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="YL4" value="${TSYscrap.YL4}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="YL5" value="${TSYscrap.YL5}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="YL6" value="${TSYscrap.YL6}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="YL7" value="${TSYscrap.YL7}"></td>

													<td><input type="text"  style="width: 80px"></td>
												</tr>
												<tr>
													<td class="text-center">速度</td>
													<td class="text-center"><input type="text"  style="width: 50px" name="SD1" value="${TSYscrap.SD1}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="SD2" value="${TSYscrap.SD2}"></td>
													<td class="text-center"><input type="text"  style="width: 50px"name="SD3" value="${TSYscrap.SD3}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="SD4" value="${TSYscrap.SD4}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="SD5" value="${TSYscrap.SD5}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="SD6" value="${TSYscrap.SD6}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="SD7" value="${TSYscrap.SD7}"></td>

													<td><input type="text"  style="width: 80px"></td>
												</tr>
												<tr>
													<td class="text-center">位置</td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WZ1" value="${TSYscrap.WZ1}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WZ2" value="${TSYscrap.WZ2}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WZ3" value="${TSYscrap.WZ3}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WZ4" value="${TSYscrap.WZ4}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WZ5" value="${TSYscrap.WZ5}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WZ6" value="${TSYscrap.WZ6}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WZ7" value="${TSYscrap.WZ7}"></td>

													<td><input type="text"  style="width: 80px"></td>
												</tr>
												<tr>
													<td class="text-center">温度</td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WD1" value="${TSYscrap.WD1}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WD2" value="${TSYscrap.WD2}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WD3" value="${TSYscrap.WD3}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WD4" value="${TSYscrap.WD4}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WD5" value="${TSYscrap.WD5}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WD6" value="${TSYscrap.WD6}"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WD7" value="${TSYscrap.WD7}"></td>

													<td><input type="text"  style="width: 80px"></td>
												</tr>
												<tr>
													<td class="text-center">射胶</td>
													<td class="text-right"><input type="text"  style="width: 50px;margin-right: 10px" name="SJ" value="${TSYscrap.SJ}"><i>秒</i></td>
													<td class="text-center">冷却</td>
													<td class="text-right"><input type="text"  style="width: 50px" NAME="LQ" value="${TSYscrap.LQ}"><i>秒</i></td>
													<td class="text-center">保压</td>
													<td class="text-right"><input type="text"  style="width: 50px;margin-left: 5px" NAME="BYA" value="${TSYscrap.BYA}"><i>秒</i></td>
													<td class="text-center">检查时间点</td>
													<td class="text-right"><input type="datetime" placeholder="00:00" style="width: 50px" NAME="JCSJ" value="${TSYscrap.JCSJ}"></td>

													<td><input type="text"  style="width: 80px"></td>
												</tr>
												<tr>
													<td rowspan="2" class="text-left">备注</td>
													<td colspan="8"><input type="text" cols="40" rows="5" style="width: 600px;height: 30px" name="BZ" placeholder="" value="${TSYscrap.BZ}"></td>
												</tr>

											</table>


											<span style="color: red;font-size: 14px">注：*为必填项</span>

									</div>
									<section class="content"> <!--产品信息-->

										<div class="panel panel-default">
											<div class="panel-heading" name="count">调机员审核</div>
											<div class="row data-type">

												<div class="col-md-2 title">审核人</div>
												<div class="col-md-4 data">
													<input type="text" class="form-control" name="roleName"
														   placeholder="角色名称" value="">
												</div>
												<div class="col-md-2 title">描述</div>
												<div class="col-md-4 data">
													<input type="text" class="form-control" name="roleDesc"
														   placeholder="角色描述" value="">
												</div>
											</div>
										</div>
										<!--订单信息/--> <!--工具栏-->
										<div class="box-tools text-center">
											<button type="submit" class="btn bg-maroon">保存</button>
											<button type="button" class="btn bg-default"
													onclick="history.back(-1);">返回</button>
										</div>
										<!--工具栏/--> </section>
								</form>
								</div>

							</div>
						</div>
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