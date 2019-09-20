<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<aside class="main-sidebar">
	<!-- sidebar: style can be found in sidebar.less -->
	<section class="sidebar">
		<!-- Sidebar user panel -->
		<div class="user-panel">
			<div class="pull-left image">
				<img src="${pageContext.request.contextPath}/img/user2-160x160.jpg"
					class="img-circle" alt="User Image">
			</div>
			<div class="pull-left info">
				<p><security:authentication property="principal.username"></security:authentication></p>
				<a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
			</div>
		</div>

		<!-- sidebar menu: : style can be found in sidebar.less -->
		<ul class="sidebar-menu">
			<li class="header">菜单</li>
			<li id="admin-index"><a
				href="${pageContext.request.contextPath}/pages/main.jsp"><i
					class="fa fa-dashboard"></i> <span>首页</span></a></li>

			<%--设置权限 只有权限为USER时 系统管理方可见--%>
			<%--<security:authorize access="hasRole('USER')">--%>
			<li class="treeview"><a href="#"> <i class="fa fa-cogs"></i>
					<span>系统管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">
					<li id="system-setting">
						<a
						href="${pageContext.request.contextPath}/user/findAll.do"> <i
							class="fa fa-circle-o"></i> 用户管理
					</a>
					</li>
					<li ><a
						href="${pageContext.request.contextPath}/role/findAll.do"> <i
							class="fa fa-circle-o"></i> 角色管理
					</a></li>
					<li ><a
						href="${pageContext.request.contextPath}/permission/findAll.do">
							<i class="fa fa-circle-o"></i> 资源权限管理
					</a></li>
					<li ><a
						href="${pageContext.request.contextPath}/sysLog/findAll.do"> <i
							class="fa fa-circle-o"></i> 访问日志
					</a></li>
				</ul>
			</li>

			<li class="treeview"><a href="#"> <i class="fa fa-bathtub"></i>
				<span>无纸化点检</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">
					<li>
						<a
							href="${pageContext.request.contextPath}/pages/paperless-list.jsp"> <i
							class="fa fa-circle-o"></i> 工艺参数表
						</a>
					</li>
					<li ><a
							href="${pageContext.request.contextPath}/pages/paperless-JYy-list.jsp"> <i
							class="fa fa-circle-o"></i> 检验员审核
					</a></li>
					<li ><a
							href="${pageContext.request.contextPath}/pages/paperless-TJY-list.jsp">
						<i class="fa fa-circle-o"></i> 调机员、班组
					</a></li>
					<li ><a
							href="${pageContext.request.contextPath}/pages/paperless-ZK-list.jsp"> <i
							class="fa fa-circle-o"></i> 质控确认
					</a></li>
					<li ><a
							href="${pageContext.request.contextPath}/pages/paperless-GY-list.jsp">
						<i class="fa fa-circle-o"></i> 工艺确认
					</a></li>
					<li ><a
							href="${pageContext.request.contextPath}/pages/Paperless_ProcessQuery.jsp"> <i
							class="fa fa-circle-o"></i> 进程查询
					</a></li>
				</ul>
			</li>

			<li class="treeview"><a href="#"> <i class="fa fa-wordpress"></i>
				<span>报废管理</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">
					<li >
						<a
							href="${pageContext.request.contextPath}/scrap/findNewPage.do"> <i
							class="fa fa-circle-o"></i> 填写报废单
						</a>
					</li>
					<li ><a
							href="${pageContext.request.contextPath}/scrap/findAll.do?count=1"> <i
							class="fa fa-circle-o"></i> 调试员审核
					</a></li>
					<li ><a
							href="${pageContext.request.contextPath}/scrap/findAll.do?count=2">
						<i class="fa fa-circle-o"></i> 组长审核
					</a></li>
					<li ><a
							href="${pageContext.request.contextPath}/scrap/findAll.do?count=3"> <i
							class="fa fa-circle-o"></i> 检验员审核
					</a></li>
					<li ><a
							href="${pageContext.request.contextPath}/scrap/findAll.do?count=5"> <i
							class="fa fa-circle-o"></i> 质量科长审核
					</a></li>
					<li ><a
							href="${pageContext.request.contextPath}/scrap/findAll.do?count=6"> <i
							class="fa fa-circle-o"></i> 厂长审核
					</a></li>
					<li ><a
							href="${pageContext.request.contextPath}/scrap/findAll.do?count=4">
						<i class="fa fa-circle-o"></i> 接收员核实
					</a></li>
					<li ><a
							href="${pageContext.request.contextPath}/scrap/findNewPage.do"> <i
							class="fa fa-circle-o"></i> 进程查询
					</a></li>
				</ul>
			</li>
			<li class="treeview"><a href="#"> <i class="fa fa-gear"></i>
				<span>工艺参数检查记录</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li ><a
							href="${pageContext.request.contextPath}/pages/Charting_Query_list.jsp">
						<i class="fa fa-circle-o"></i> 工艺参数记录
					</a></li>
					<li ><a
					<%--表示分页时 默认它为第一页 每页显示4条--%>
							href="${pageContext.request.contextPath}/pages/Charting_list.jsp"> <i
							class="fa fa-circle-o"></i> 记录表查询
					</a></li>

				</ul>
			</li>




			<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
					<span>用户设置</span> <span class="pull-right-container"> <i
						class="fa fa-angle-left pull-right"></i>
				</span>
			</a>
				<ul class="treeview-menu">

					<li ><a
						href="${pageContext.request.contextPath}/pages/ChangePassword.jsp">
							<i class="fa fa-circle-o"></i> 修改密码
					</a></li>
					<li ><a
							                                       <%--表示分页时 默认它为第一页 每页显示4条--%>
						href="${pageContext.request.contextPath}/pages/ForgetPassword.jsp"> <i
							class="fa fa-circle-o"></i> 忘记密码
					</a></li>

				</ul>
			</li>
			<%--<li class="treeview"><a href="#"> <i class="fa fa-cube"></i>
            <span>基础数据</span> <span class="pull-right-container"> <i
                    class="fa fa-angle-left pull-right"></i>
            </span>
        </a>
            <ul class="treeview-menu">

                <li ><a
                        href="${pageContext.request.contextPath}/product/findAll.do">
                    <i class="fa fa-circle-o"></i> 产品管理
                </a></li>
                <li ><a
                &lt;%&ndash;表示分页时 默认它为第一页 每页显示4条&ndash;%&gt;
                        href="${pageContext.request.contextPath}/orders/findAll.do?page=1&pageSize=4"> <i
                        class="fa fa-circle-o"></i> 订单管理
                </a></li>
            </ul>
        </li>--%>
		</ul>
	</section>
	<!-- /.sidebar -->
</aside>