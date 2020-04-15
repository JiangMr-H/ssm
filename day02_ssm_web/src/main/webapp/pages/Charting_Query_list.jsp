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
	<meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
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

	<div class="content-wrapper">

		<!-- 内容头部 -->
		<section class="content-header">
			<h1>
				数据记录 <small>工艺参数记录表</small>
			</h1>
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> 首页</a></li>
				<li><a href="#">数据管理</a></li>
				<li class="active">工艺参数记录表</li>
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
										<h4 class="modal-title " id="gridSystemModalLabel" >
											工艺参数记录表</h4>
									</div>
									<div class="modal-body modal-lg"  style="width: 950px">
										<form class="form-horizontal" id="edit_customer_form"
											  action="${pageContext.request.contextPath}/GYCS/save.do"
											  method="post" onsubmit="return check(this)">
											<table class="table table-bordered modal-lg" >
												<tr>
													<td class="text-center"><i style="color: red">* </i>
														产品名称：</td>
													<td colspan="4"><input type="text"  name="CPMC" placeholder="产品名称"></td>
													<td class="text-center" ><i style="color: red">* </i>操作员：</td>
													<td colspan="3"><input type="text" style="width: 150px" name="JYY"
																		   placeholder="操作员" ></td>
													<td colspan="4" rowspan="2" style="padding-top:27px ">参数变化情况</td>

												</tr>
												<tr>
													<td class="text-center"><i style="color: red">* </i>
														机床编码：</td>
													<td colspan="2"><input type="text"  name="JCBM" placeholder="机床编码"></td>
													<td class="text-center"><i style="color: red">* </i>
														班次：</td>
													<td ><input type="text" style="width: 80px" name="BC" placeholder="班次"></td>
													<td class="text-center"><i style="color: red">* </i>
														检查日期：</td>
													<td colspan="3"><input type="date"  name="JCRQ" placeholder="检查日期"></td>

												</tr>
												<tr>
													<td class="text-center" rowspan="5"style="padding-top: 60px">注塑</br>工艺参数</td>
													<td class="text-center">压力</td>
													<td class="text-center"><input type="text"  style="width: 50px" name="YL1"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="YL2"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="YL3"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="YL4"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="YL5"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="YL6"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="YL7"></td>

													<td><input type="text"  style="width: 80px"></td>
												</tr>
												<tr>
													<td class="text-center">速度</td>
													<td class="text-center"><input type="text"  style="width: 50px" name="SD1"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="SD2"></td>
													<td class="text-center"><input type="text"  style="width: 50px"name="SD3"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="SD4"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="SD5"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="SD6"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="SD7"></td>

													<td><input type="text"  style="width: 80px"></td>
												</tr>
												<tr>
													<td class="text-center">位置</td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WZ1"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WZ2"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WZ3"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WZ4"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WZ5"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WZ6"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WZ7"></td>

													<td><input type="text"  style="width: 80px"></td>
												</tr>
												<tr>
													<td class="text-center">温度</td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WD1"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WD2"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WD3"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WD4"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WD5"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WD6"></td>
													<td class="text-center"><input type="text"  style="width: 50px" name="WD7"></td>

													<td><input type="text"  style="width: 80px"></td>
												</tr>
												<tr>
													<td class="text-center">射胶</td>
													<td class="text-right"><input type="text"  style="width: 50px;margin-right: 10px" name="SJ"><i>秒</i></td>
													<td class="text-center">冷却</td>
													<td class="text-right"><input type="text"  style="width: 50px" NAME="LQ"><i>秒</i></td>
													<td class="text-center">保压</td>
													<td class="text-right"><input type="text"  style="width: 50px;margin-left: 5px" NAME="BYA"><i>秒</i></td>
													<td class="text-center">检查时间点</td>
													<td class="text-right"><input type="datetime" placeholder="00:00" style="width: 50px" NAME="JCSJ"></td>

													<td><input type="text"  style="width: 80px"></td>
												</tr>
												<tr>
													<td rowspan="2" class="text-left">备注</td>
													<td colspan="8"><input type="text" cols="40" rows="5" style="width: 600px;height: 30px" name="BZ" placeholder="备注"></td>
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
								<th class="sorting_desc">产品名称</th>
								<th class="sorting_asc sorting_asc_disabled">检验员</th>
								<th class="sorting_desc sorting_desc_disabled">机床编码</th>
								<th class="sorting">班次</th>
								<th class="text-center sorting">检查日期</th>
								<th class="sorting text-center">当前进程</th>
								<th class="sorting">录入时间</th>
								<th class="text-center sorting">操作</th>
								<%--<th class="text-center">详细</th>--%>
							</tr>
							</thead>
							<tbody>


							<c:forEach items="${pageInfo.list}" var="gycs">

								<tr>
									<td><input name="ids" type="checkbox"></td>
									<td>${gycs.id }</td>
									<td>${gycs.CPMC }</td>
									<td>${gycs.JYY }</td>
									<td>${gycs.JCBM }</td>
									<td>${gycs.BC }</td>
									<td class="text-center">${gycs.JCRQ }</td>
									<td class="text-center">${gycs.LB_Id }</td>
									<td>${gycs.scantime }</td>
									<td class="text-center">
											<%--<button type="button" class="btn bg-olive btn-xs">订单</button>--%>
											<%--  <button type="button" class="btn bg-olive btn-xs"
                                                      onclick="location.href='${pageContext.request.contextPath}/scrap/findById.do?id=${scrap.id}'">
                                                  详情
                                              </button>--%>
										<a type="button" class="btn bg-olive btn-xs" data-toggle="modal"
											data-target="#exampleModal" onclick="location.href='${pageContext.request.contextPath}/GYCS/findGycsByGyId.do?id=${gycs.id }'">
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
								<a href="${pageContext.request.contextPath}/GYCS/findGycs.do?page=1&size=${pageInfo.pageSize}"
								   aria-label="Previous">首页</a></li>
							<li>
								<a href="${pageContext.request.contextPath}/GYCS/findGycs.do?page=${pageInfo.pageNum-1}&size=${pageInfo.pageSize}">上一页</a>
							</li>
							<c:forEach begin="${pageInfo.pageNum}" end="${pageInfo.pageNum}" var="pageNum">
								<li>
									<a href="${pageContext.request.contextPath}/GYCS/findGycs.do?page=${pageNum}&size=${pageInfo.pageSize}">${pageNum}</a>
								</li>
							</c:forEach>
							<li>
								<a href="${pageContext.request.contextPath}/GYCS/findGycs.do?page=${pageInfo.pageNum+1}&size=${pageInfo.pageSize}">下一页</a>
							</li>
							<li>
								<a href="${pageContext.request.contextPath}/GYCS/findGycs.do?page=${pageInfo.pages}&size=${pageInfo.pageSize}"
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
		if (form.CPMC.value == '') {
			alert("请输入产品名称！")
			form.CPMC.focus();
			return false;
		}else if (form.JYY.value == '') {
			alert("请输入检验员！")
			form.JYY.focus();
			return false;
		}else if (form.JCBM.value == '') {
			alert("请输入机床编码！")
			form.JCBM.focus();
			return false;
		}else if (form.BC.value == '') {
			alert("请输入班次！")
			form.BC.focus();
			return false;
		}else if (form.JCRQ.value == '') {
			alert("请输入检查日期！")
			form.JCRQ.focus();
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