<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta charset="utf-8">
<title>驾校管理系统</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">

<!-- Bootstrap core CSS -->
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Font Awesome -->
<link href="css/font-awesome.min.css" rel="stylesheet">

<!-- ionicons -->
<link href="css/ionicons.min.css" rel="stylesheet">

<!-- Morris -->
<link href="css/morris.css" rel="stylesheet" />

<!-- Datepicker -->
<link href="css/datepicker.css" rel="stylesheet" />

<!-- Animate -->
<link href="css/animate.min.css" rel="stylesheet">

<!-- Owl Carousel -->
<link href="css/owl.carousel.min.css" rel="stylesheet">
<link href="css/owl.theme.default.min.css" rel="stylesheet">

<!-- Simplify -->
<link href="css/simplify.min.css" rel="stylesheet">

</head>

<body class="overflow-hidden">
	<div class="wrapper preload">
		<div class="sidebar-right">
			<div class="sidebar-inner scrollable-sidebar">
				<div class="sidebar-header clearfix">
					<input class="form-control dark-input" placeholder="Search"
						type="text">
					<div class="btn-group pull-right">
						<a href="#" class="sidebar-setting" data-toggle="dropdown"><i
							class="fa fa-cog fa-lg"></i></a>
						<ul class="dropdown-menu pull-right flipInV">
							<li><a href="#"><i class="fa fa-circle text-danger"></i><span
									class="m-left-xs">Busy</span></a></li>
							<li><a href="#"><i class="fa fa-circle-o"></i><span
									class="m-left-xs">Turn Off Chat</span></a></li>
						</ul>
					</div>
				</div>
				<div class="title-block">Group Chat</div>
				<div class="content-block">
					<ul class="sidebar-list">
						<li><a href="#"> <i class="fa fa-circle-o text-success"></i><span
								class="m-left-xs">Close Friends</span>
						</a></li>
						<li><a href="#"> <i class="fa fa-circle-o text-success"></i><span
								class="m-left-xs">Business</span>
						</a></li>
					</ul>
				</div>
				<div class="title-block">Favorites</div>
				<div class="content-block">
					<ul class="sidebar-list">
						<li><a href="#" class="clearfix"> <img
								src="pic/zerry.JPG" class="img-circle" alt="user avatar">
								<div class="chat-detail m-left-sm">
									<div class="chat-name">Zirui Zhu</div>
									<div class="chat-message">Where are you?</div>
								</div>
								<div class="chat-status">
									<i class="fa fa-circle-o text-success"></i>
								</div>
								<div class="chat-alert">
									<span class="badge badge-purple bounceIn animation-delay2">2</span>
								</div>
						</a></li>
						<li><a href="#" class="clearfix"> <img
								src="pic/zerry.JPG" class="img-circle" alt="user avatar">
								<div class="chat-detail m-left-sm">
									<div class="chat-name">Zirui Zhu</div>
									<div class="chat-message">Hello</div>
								</div>
								<div class="chat-status">
									<i class="fa fa-circle-o text-success"></i>
								</div>
								<div class="chat-alert">
									<span class="badge badge-info bounceIn animation-delay2">1</span>
								</div>
						</a></li>
						<li><a href="#" class="clearfix"> <img
								src="pic/zerry.JPG" class="img-circle" alt="user avatar">
								<div class="chat-detail m-left-sm">
									<div class="chat-name">Zirui Zhu</div>
									<div class="chat-message">See you again next week.</div>
								</div>
								<div class="chat-status">
									<i class="fa fa-circle-o text-danger"></i>
								</div>
								<div class="chat-alert">
									<i class="fa fa-check text-success"></i>
								</div>
						</a></li>
						<li><a href="#" class="clearfix"> <img
								src="pic/zerry.JPG" class="img-circle" alt="user avatar">
								<div class="chat-detail m-left-sm">
									<div class="chat-name">Zirui Zhu</div>
									<div class="chat-message">Hello, Are you there?</div>
								</div>
								<div class="chat-status">
									<i class="fa fa-circle-o text-danger"></i>
								</div>
								<div class="chat-alert">
									<i class="fa fa-reply"></i>
								</div>
						</a></li>
					</ul>
				</div>
				<div class="title-block">More friends</div>
				<div class="content-block">
					<ul class="sidebar-list">
						<li><a href="#" class="clearfix"> <img
								src="pic/zerry.JPG" class="img-circle" alt="user avatar">
								<div class="chat-detail m-left-sm">
									<div class="chat-name">Zirui Zhu</div>
									<div class="chat-message">Where are you?</div>
								</div>
								<div class="chat-status">
									<i class="fa fa-circle-o text-success"></i>
								</div>
								<div class="chat-alert">
									<span class="badge badge-success bounceIn animation-delay2">2</span>
								</div>
						</a></li>
						<li><a href="#" class="clearfix"> <img
								src="pic/zerry.JPG" class="img-circle" alt="user avatar">
								<div class="chat-detail m-left-sm">
									<div class="chat-name">Zirui Zhu</div>
									<div class="chat-message">Hello</div>
								</div>
								<div class="chat-status">
									<i class="fa fa-circle-o text-success"></i>
								</div>
								<div class="chat-alert">
									<span class="badge badge-danger bounceIn animation-delay2">1</span>
								</div>
						</a></li>
						<li><a href="#" class="clearfix"> <img
								src="pic/zerry.JPG" class="img-circle" alt="user avatar">
								<div class="chat-detail m-left-sm">
									<div class="chat-name">Zirui Zhu</div>
									<div class="chat-message">See you again next week.</div>
								</div>
								<div class="chat-status">
									<i class="fa fa-circle-o text-danger"></i>
								</div>
								<div class="chat-alert">
									<i class="fa fa-check text-success"></i>
								</div>
						</a></li>
						<li><a href="#" class="clearfix"> <img
								src="pic/zerry.JPG" class="img-circle" alt="user avatar">
								<div class="chat-detail m-left-sm">
									<div class="chat-name">Zirui Zhu</div>
									<div class="chat-message">Hello, Are you there?</div>
								</div>
								<div class="chat-status">
									<i class="fa fa-circle-o text-danger"></i>
								</div>
								<div class="chat-alert">
									<i class="fa fa-reply"></i>
								</div>
						</a></li>
					</ul>
				</div>
			</div>
			<!-- sidebar-inner -->
		</div>
		<!-- sidebar-right -->
		<header class="top-nav">
		<div class="top-nav-inner">
			<div class="nav-header">
				<button type="button" class="navbar-toggle pull-left sidebar-toggle"
					id="sidebarToggleSM">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>

				<ul class="nav-notification pull-right">
					<li><a href="#" class="dropdown-toggle" data-toggle="dropdown"><i
							class="fa fa-cog fa-lg"></i></a> <span
						class="badge badge-danger bounceIn">1</span>
						<ul class="dropdown-menu dropdown-sm pull-right user-dropdown">
							<li class="user-avatar"><img src="pic/zerry.JPG" alt=""
								class="img-circle">
								<div class="user-content">
									<h5 class="no-m-bottom">Zirui Zhu</h5>
									<div class="m-top-xs">
										<a href="profile.html" class="m-right-sm">Profile</a> <a
											href="signin.html">Log out</a>
									</div>
								</div></li>
							<li><a href="inbox.html"> Inbox <span
									class="badge badge-danger bounceIn animation-delay2 pull-right">1</span>
							</a></li>
							<li><a href="#"> Notification <span
									class="badge badge-purple bounceIn animation-delay3 pull-right">2</span>
							</a></li>
							<li><a href="#" class="sidebarRight-toggle"> Message <span
									class="badge badge-success bounceIn animation-delay4 pull-right">7</span>
							</a></li>
							<li class="divider"></li>
							<li><a href="#">Setting</a></li>
						</ul></li>
				</ul>

				<a href="index.html" class="brand"> <i class="fa fa-database"></i><span
					class="brand-name">驾校学员管理系统</span>
				</a>
			</div>
			<div class="nav-container">
				<button type="button" class="navbar-toggle pull-left sidebar-toggle"
					id="sidebarToggleLG">
					<span class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<ul class="nav-notification">
					<li class="search-list">
						<div class="search-input-wrapper">
							<div class="search-input">
								<input type="text" class="form-control input-sm inline-block">
								<a href="#" class="input-icon text-normal"><i
									class="ion-ios7-search-strong"></i></a>
							</div>
						</div>
					</li>
				</ul>
				<div class="pull-right m-right-sm">
					<div class="user-block hidden-xs">
						<a href="#" id="userToggle" data-toggle="dropdown"> <img
							src="pic/zerry.JPG" alt=""
							class="img-circle inline-block user-profile-pic">
							<div class="user-detail inline-block">
								Zirui Zhu <i class="fa fa-angle-down"></i>
							</div>
						</a>
						<div class="panel border dropdown-menu user-panel">
							<div class="panel-body paddingTB-sm">
								<ul>
									<li><a href="profile.html"> <i
											class="fa fa-edit fa-lg"></i><span class="m-left-xs">My
												Profile</span>
									</a></li>
									<li><a href="inbox.html"> <i class="fa fa-inbox fa-lg"></i><span
											class="m-left-xs">Inboxes</span> <span
											class="badge badge-danger bounceIn animation-delay3">2</span>
									</a></li>
									<li><a href="signin.html"> <i
											class="fa fa-power-off fa-lg"></i><span class="m-left-xs">Sign
												out</span>
									</a></li>
								</ul>
							</div>
						</div>
					</div>
					<ul class="nav-notification">
						<li><a href="#" data-toggle="dropdown"><i
								class="fa fa-envelope fa-lg"></i></a> <span
							class="badge badge-purple bounceIn animation-delay5 active">2</span>
							<ul class="dropdown-menu message pull-right">
								<li><a>You have 4 new unread messages</a></li>
								<li><a class="clearfix" href="#"> <img
										src="images/profile/profile2.jpg" alt="User Avatar">
										<div class="detail">
											<strong>John Doe</strong>
											<p class="no-margin">Lorem ipsum dolor sit amet...</p>
											<small class="text-muted"><i
												class="fa fa-check text-success"></i> 27m ago</small>
										</div>
								</a></li>
								<li><a class="clearfix" href="#"> <img
										src="images/profile/profile3.jpg" alt="User Avatar">
										<div class="detail">
											<strong>Jane Doe</strong>
											<p class="no-margin">Lorem ipsum dolor sit amet...</p>
											<small class="text-muted"><i
												class="fa fa-check text-success"></i> 5hr ago</small>
										</div>
								</a></li>
								<li><a class="clearfix" href="#"> <img
										src="images/profile/profile4.jpg" alt="User Avatar">
										<div class="detail m-left-sm">
											<strong>Bill Doe</strong>
											<p class="no-margin">Lorem ipsum dolor sit amet...</p>
											<small class="text-muted"><i class="fa fa-reply"></i>
												Yesterday</small>
										</div>
								</a></li>
								<li><a class="clearfix" href="#"> <img
										src="images/profile/profile5.jpg" alt="User Avatar">
										<div class="detail">
											<strong>Baby Doe</strong>
											<p class="no-margin">Lorem ipsum dolor sit amet...</p>
											<small class="text-muted"><i class="fa fa-reply"></i>
												9 Feb 2013</small>
										</div>
								</a></li>
								<li><a href="#">View all messages</a></li>
							</ul></li>
						<li><a href="#" data-toggle="dropdown"><i
								class="fa fa-bell fa-lg"></i></a> <span
							class="badge badge-info bounceIn animation-delay6 active">4</span>
							<ul class="dropdown-menu notification dropdown-3 pull-right">
								<li><a href="#">You have 5 new notifications</a></li>
								<li><a href="#"> <span
										class="notification-icon bg-warning"> <i
											class="fa fa-warning"></i>
									</span> <span class="m-left-xs">Server #2 not responding.</span> <span
										class="time text-muted">Just now</span>
								</a></li>
								<li><a href="#"> <span
										class="notification-icon bg-success"> <i
											class="fa fa-plus"></i>
									</span> <span class="m-left-xs">New user registration.</span> <span
										class="time text-muted">2m ago</span>
								</a></li>
								<li><a href="#"> <span
										class="notification-icon bg-danger"> <i
											class="fa fa-bolt"></i>
									</span> <span class="m-left-xs">Application error.</span> <span
										class="time text-muted">5m ago</span>
								</a></li>
								<li><a href="#"> <span
										class="notification-icon bg-success"> <i
											class="fa fa-usd"></i>
									</span> <span class="m-left-xs">2 items sold.</span> <span
										class="time text-muted">1hr ago</span>
								</a></li>
								<li><a href="#"> <span
										class="notification-icon bg-success"> <i
											class="fa fa-plus"></i>
									</span> <span class="m-left-xs">New user registration.</span> <span
										class="time text-muted">1hr ago</span>
								</a></li>
								<li><a href="#">View all notifications</a></li>
							</ul></li>
						<li class="chat-notification"><a href="#"
							class="sidebarRight-toggle"><i class="fa fa-comments fa-lg"></i></a>
							<span class="badge badge-danger bounceIn">1</span>

							<div class="chat-alert">Hello, Are you there?</div></li>
					</ul>
				</div>
			</div>
		</div>
		<!-- ./top-nav-inner --> </header>
		<aside class="sidebar-menu fixed">
		<div class="sidebar-inner scrollable-sidebar">
			<div class="main-menu">
				<ul class="accordion">
					<li class="menu-header">Main Menu</li>
					<li class="bg-palette1 active"><a href="index.jsp"> <span
							class="menu-content block"> <span class="menu-icon"><i
									class="block fa fa-home fa-lg"></i></span> <span
								class="text m-left-sm">总览</span>
						</span> <span class="menu-content-hover block"> Home </span>
					</a></li>
					<li class="openable bg-palette3"><a href="#"> <span
							class="menu-content block"> <span class="menu-icon"><i
									class="block fa fa-list fa-lg"></i></span> <span
								class="text m-left-sm">教学管理</span> <span class="submenu-icon"></span>
						</span> <span class="menu-content-hover block"> 教学 </span>
					</a>
						<ul class="submenu bg-palette4">
							<li><a href="stu_info.jsp"><span class="submenu-label">学员查询</span></a></li>
							<li><a href="stu_reg.jsp"><span class="submenu-label">新学员登记</span></a></li>
							<li class="openable"><a href="#"><small
									class="badge badge-success badge-square bounceIn animation-delay2 m-left-xs pull-right">2</small><span
									class="submenu-label">练车管理</span></a>
								<ul class="submenu third-level">
									<li><a href="train_car.jsp"><span
											class="submenu-label">练车记录查询</a></li>
									<li><a href="car_plan.jsp"><span
											class="submenu-label">练车安排</span></a></li>
								</ul></li>
							<li class="openable"><a href="#"> <small
									class="badge badge-success badge-square bounceIn animation-delay2 m-left-xs pull-right">2</small>
									<span class="submenu-label">考试管理</span>
							</a>
								<ul class="submenu third-level">
									<li><a href="static_table.html"><span
											class="submenu-label">考试查询</a></li>
									<li><a href="datatable.html"><span
											class="submenu-label">考试安排</span></a></li>
								</ul></li>
						</ul></li>
					<li class="openable bg-palette4"><a href="#"> <span
							class="menu-content block"> <span class="menu-icon"><i
									class="block fa fa-tags fa-lg"></i></span> <span
								class="text m-left-sm">个人信息管理</span> <span class="submenu-icon"></span>
						</span> <span class="menu-content-hover block"> 个人 </span>
					</a>
						<ul class="submenu">
							<li><a href="ui_element.html"><span
									class="submenu-label">密码修改</span></a></li>
						</ul></li>
					<li class="bg-palette1"><a href="inbox.html"> <span
							class="menu-content block"> <span class="menu-icon"><i
									class="block fa fa-envelope fa-lg"></i></span> <span
								class="text m-left-sm">学员留言</span> <small
								class="badge badge-danger badge-square bounceIn animation-delay5 m-left-xs">5</small>
						</span> <span class="menu-content-hover block"> 留言 </span>
					</a></li>
					<li class="bg-palette2"><a href="timeline.html"> <span
							class="menu-content block"> <span class="menu-icon"><i
									class="block fa fa-clock-o fa-lg"></i></span> <span
								class="text m-left-sm">学员交流</span> <small
								class="badge badge-warning badge-square bounceIn animation-delay6 m-left-xs pull-right">7</small>
						</span> <span class="menu-content-hover block"> 交流 </span>
					</a></li>
					<li class="menu-header">Others</li>
					<li class="openable bg-palette3"><a href="#"> <span
							class="menu-content block"> <span class="menu-icon"><i
									class="block fa fa-gift fa-lg"></i></span> <span
								class="text m-left-sm">Extra Pages</span> <span
								class="submenu-icon"></span>
						</span> <span class="menu-content-hover block"> Pages </span>
					</a>
						<ul class="submenu">
							<li><a href="signin.html"><span class="submenu-label">Sign
										in</span></a></li>
							<li><a href="signup.html"><span class="submenu-label">Sign
										Up</span></a></li>
							<li><a href="lockscreen.html"><span
									class="submenu-label">Lock Screen</span></a></li>
							<li><a href="profile.html"><span class="submenu-label">Profile</span></a></li>
							<li><a href="gallery.html"><span class="submenu-label">Gallery</span></a></li>
							<li><a href="blog.html"><span class="submenu-label">Blog</span></a></li>
							<li><a href="single_post.html"><span
									class="submenu-label">Single Post</span></a></li>
							<li><a href="pricing.html"><span class="submenu-label">Pricing</span></a></li>
							<li><a href="invoice.html"><span class="submenu-label">Invoice</span></a></li>
							<li><a href="error404.html"><span class="submenu-label">Error404</span></a></li>
							<li><a href="blank.html"><span class="submenu-label">Blank</span></a></li>
						</ul></li>
					<li class="openable bg-palette4"><a href="#"> <span
							class="menu-content block"> <span class="menu-icon"><i
									class="block fa fa-list fa-lg"></i></span> <span
								class="text m-left-sm">Menu Level</span> <span
								class="submenu-icon"></span>
						</span> <span class="menu-content-hover block"> Menu </span>
					</a>
						<ul class="submenu">
							<li class="openable"><a href="signin.html"> <span
									class="submenu-label">menu 2.1</span> <small
									class="badge badge-success badge-square bounceIn animation-delay2 m-left-xs pull-right">3</small>
							</a>
								<ul class="submenu third-level">
									<li><a href="#"><span class="submenu-label">menu
												3.1</span></a></li>
									<li><a href="#"><span class="submenu-label">menu
												3.2</span></a></li>
									<li class="openable"><a href="#"> <span
											class="submenu-label">menu 3.3</span> <small
											class="badge badge-danger badge-square bounceIn animation-delay2 m-left-xs pull-right">2</small>
									</a>
										<ul class="submenu fourth-level">
											<li><a href="#"><span class="submenu-label">menu
														4.1</span></a></li>
											<li><a href="#"><span class="submenu-label">menu
														4.2</span></a></li>
										</ul></li>
								</ul></li>
							<li><a href="#"><span class="submenu-label">menu
										2.2</span></a></li>
						</ul></li>
				</ul>
			</div>
			<div class="sidebar-fix-bottom clearfix">
				<div class="user-dropdown dropup pull-left">
					<a href="#" class="dropdwon-toggle font-18" data-toggle="dropdown"><i
						class="ion-person-add"></i> </a>
					<ul class="dropdown-menu">
						<li><a href="inbox.html"> Inbox <span
								class="badge badge-danger bounceIn animation-delay2 pull-right">1</span>
						</a></li>
						<li><a href="#"> Notification <span
								class="badge badge-purple bounceIn animation-delay3 pull-right">2</span>
						</a></li>
						<li><a href="#" class="sidebarRight-toggle"> Message <span
								class="badge badge-success bounceIn animation-delay4 pull-right">7</span>
						</a></li>
						<li class="divider"></li>
						<li><a href="#">Setting</a></li>
					</ul>
				</div>
				<a href="lockscreen.html" class="pull-right font-18"><i
					class="ion-log-out"></i></a>
			</div>
		</div>
		<!-- sidebar-inner --> </aside>

		<div class="main-container">
			<div class="padding-md">
				<h2 class="header-text">
					练车安排查询 <span class="sub-header"> orderCar info </span>
				</h2>
				<div class="smart-widget m-top-lg widget-dark-blue">
					<div class="smart-widget-header">
						日期选择 <span class="smart-widget-option"> <span
							class="refresh-icon-animated"> <i
								class="fa fa-circle-o-notch fa-spin"></i>
						</span> <a href="#" class="widget-toggle-hidden-option"> <i
								class="fa fa-cog"></i>
						</a> <a href="#" class="widget-collapse-option" data-toggle="collapse">
								<i class="fa fa-chevron-up"></i>
						</a> <a href="#" class="widget-refresh-option"> <i
								class="fa fa-refresh"></i>
						</a> <a href="#" class="widget-remove-option"> <i
								class="fa fa-times"></i>
						</a>
						</span>
					</div>
					<div class="smart-widget-inner">
						<div class="smart-widget-hidden-section">
							<ul class="widget-color-list clearfix">
								<li style="background-color: #20232b;" data-color="widget-dark"></li>
								<li style="background-color: #4c5f70;"
									data-color="widget-dark-blue"></li>
								<li style="background-color: #23b7e5;" data-color="widget-blue"></li>
								<li style="background-color: #2baab1;" data-color="widget-green"></li>
								<li style="background-color: #edbc6c;"
									data-color="widget-yellow"></li>
								<li style="background-color: #fbc852;"
									data-color="widget-orange"></li>
								<li style="background-color: #e36159;" data-color="widget-red"></li>
								<li style="background-color: #7266ba;"
									data-color="widget-purple"></li>
								<li style="background-color: #f5f5f5;"
									data-color="widget-light-grey"></li>
								<li style="background-color: #fff;" data-color="reset"></li>
							</ul>
						</div>
						<div class="smart-widget-body">
							<form action="orderCar_showInfo" method="post">
								<!--  
								<div class="form-group">
									<label for="exampleInputEmail1">学生id</label> <input
										type="text" class="form-control" id="exampleInputEmail1"
										placeholder="id" name="query_id">
								</div>
								-->
								<div class="form-group">
									<label for="exampleInputEmail1">日期</label> <input type="date"
										class="form-control" id="exampleInputEmail1"
										placeholder="YYYY/MM/DD" name="date">
								</div>
								<!-- /form-group -->
								<button type="submit" class="btn btn-success btn-sm">查询</button>
							</form>
						</div>
					</div>
					<!-- ./smart-widget-inner -->
				</div>
				<!-- ./smart-widget -->
			</div>
			<!-- ./padding-md -->
		</div>
		<!-- /main-container -->

		<div class="main-container">
			<div class="padding-md">
				<div class="smart-widget m-top-lg widget-dark-blue">
					<div class="smart-widget-header">
						结果 <span class="smart-widget-option"> <span
							class="refresh-icon-animated"> <i
								class="fa fa-circle-o-notch fa-spin"></i>
						</span> <a href="#" class="widget-toggle-hidden-option"> <i
								class="fa fa-cog"></i>
						</a> <a href="#" class="widget-collapse-option" data-toggle="collapse">
								<i class="fa fa-chevron-up"></i>
						</a> <a href="#" class="widget-refresh-option"> <i
								class="fa fa-refresh"></i>
						</a> <a href="#" class="widget-remove-option"> <i
								class="fa fa-times"></i>
						</a>
						</span>
					</div>
					<div class="smart-widget-inner">
						<div class="smart-widget-hidden-section">
							<ul class="widget-color-list clearfix">
								<li style="background-color: #20232b;" data-color="widget-dark"></li>
								<li style="background-color: #4c5f70;"
									data-color="widget-dark-blue"></li>
								<li style="background-color: #23b7e5;" data-color="widget-blue"></li>
								<li style="background-color: #2baab1;" data-color="widget-green"></li>
								<li style="background-color: #edbc6c;"
									data-color="widget-yellow"></li>
								<li style="background-color: #fbc852;"
									data-color="widget-orange"></li>
								<li style="background-color: #e36159;" data-color="widget-red"></li>
								<li style="background-color: #7266ba;"
									data-color="widget-purple"></li>
								<li style="background-color: #f5f5f5;"
									data-color="widget-light-grey"></li>
								<li style="background-color: #fff;" data-color="reset"></li>
							</ul>
						</div>
						<div class="smart-widget-body">
							<div class="form-group">
								<label for="exampleInputEmail1">练车信息</label>
								<table border="0" style="text-align: center; height: 30px; margin-bottom: 30px; width: 100%;">									
									<tr style="background-color: #2baab1; color: white;">
										<td>姓名</td>
										<td>车牌</td>
										<td>车型</td>
										<td>教练</td>
										<td>时间</td>
									</tr>
									<s:iterator value="orders" status="status">
										<tr
											<s:if test="#status.odd">style="background-color: #f5f5f5;"</s:if>>
											<td><s:property value="orders[#status.index].student_name"/></td>
											<td><s:property value="orders[#status.index].car_number"/></td>
											<td><s:property value="orders[#status.index].car_type"/></td>
											<td><s:property value="orders[#status.index].coach_name"/></td>
											<td><s:property value="orders[#status.index].start_time"/></td>											
										</tr>
									</s:iterator>
								</table>
								<button type="submit" class="btn btn-success btn-sm">上一页</button>
								<button type="submit" class="btn btn-success btn-sm">下一页</button>	
							</div>
						</div>
					</div>
					<!-- ./smart-widget-inner -->
				</div>
				<!-- ./smart-widget -->
			</div>
			<!-- ./padding-md -->
		</div>
		<!-- /main-container -->

		<footer class="footer"> <span class="footer-brand"> <strong
			class="text-danger">驾校</strong> 管理系统
		</span>
		<p class="no-margin">
			&copy; 2016 <strong>Group Zerry</strong>. ALL Rights Reserved.
		</p>
		</footer>
	</div>
	<!-- /wrapper -->

	<a href="#" class="scroll-to-top hidden-print"><i
		class="fa fa-chevron-up fa-lg"></i></a>

	<!-- Le javascript
	    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->

	<!-- Jquery -->
	<script src="js/jquery-1.11.1.min.js"></script>

	<!-- Bootstrap -->
	<script src="bootstrap/js/bootstrap.min.js"></script>

	<!-- Flot -->
	<script src='js/jquery.flot.min.js'></script>

	<!-- Slimscroll -->
	<script src='js/jquery.slimscroll.min.js'></script>

	<!-- Morris -->
	<script src='js/rapheal.min.js'></script>
	<script src='js/morris.min.js'></script>

	<!-- Datepicker -->
	<script src='js/uncompressed/datepicker.js'></script>

	<!-- Sparkline -->
	<script src='js/sparkline.min.js'></script>

	<!-- Skycons -->
	<script src='js/uncompressed/skycons.js'></script>

	<!-- Popup Overlay -->
	<script src='js/jquery.popupoverlay.min.js'></script>

	<!-- Easy Pie Chart -->
	<script src='js/jquery.easypiechart.min.js'></script>

	<!-- Sortable -->
	<script src='js/uncompressed/jquery.sortable.js'></script>

	<!-- Owl Carousel -->
	<script src='js/owl.carousel.min.js'></script>

	<!-- Modernizr -->
	<script src='js/modernizr.min.js'></script>

	<!-- Simplify -->
	<script src="js/simplify/simplify.js"></script>
	<script src="js/simplify/simplify_dashboard.js"></script>


	<script>
		$(function() {
			$('.chart').easyPieChart({
				easing : 'easeOutBounce',
				size : '140',
				lineWidth : '7',
				barColor : '#7266ba',
				onStep : function(from, to, percent) {
					$(this.el).find('.percent').text(Math.round(percent));
				}
			});

			$('.sortable-list').sortable();

			$('.todo-checkbox').click(function() {

				var _activeCheckbox = $(this).find('input[type="checkbox"]');

				if (_activeCheckbox.is(':checked')) {
					$(this).parent().addClass('selected');
				} else {
					$(this).parent().removeClass('selected');
				}

			});

			//Delete Widget Confirmation
			$('#deleteWidgetConfirm').popup({
				vertical : 'top',
				pagecontainer : '.container',
				transition : 'all 0.3s'
			});
		});
	</script>

</body>
</html>