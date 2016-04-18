<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  	<head>
	    <meta charset="utf-8">
	    <title>Simplify Admin</title>
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <meta name="description" content="">
	    <meta name="author" content="">

	    <!-- Bootstrap core CSS -->
	    <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
		
		<!-- Font Awesome -->
		<link href="css/font-awesome.min.css" rel="stylesheet">

		<!-- ionicons -->
		<link href="css/ionicons.min.css" rel="stylesheet">
		
		<!-- Simplify -->
		<link href="css/simplify.min.css" rel="stylesheet">
	
  	</head>

  	<body class="overflow-hidden light-background">
		<div class="wrapper no-navigation preload">
			<div class="error-wrapper">
				<div class="error-inner">
					<div class="error-type">Sorry</div>
					<h1>you have no authority to do that.</h1>
					<p>
						please login first.</p>
					<div class="m-top-md">
						<a href="signin.jsp" class="btn btn-default btn-lg text-upper">Back to Home</a>
					</div>
				</div><!-- ./error-inner -->
			</div><!-- ./error-wrapper -->
		</div><!-- /wrapper -->

		<a href="" id="scroll-to-top" class="hidden-print"><i class="icon-chevron-up"></i></a>

	    <!-- Le javascript
	    ================================================== -->
	    <!-- Placed at the end of the document so the pages load faster -->
		
		<!-- Jquery -->
		<script src="js/jquery-1.11.1.min.js"></script>
		
		<!-- Bootstrap -->
	    <script src="bootstrap/js/bootstrap.min.js"></script>
		
		<!-- Slimscroll -->
		<script src='js/jquery.slimscroll.min.js'></script>
		
		<!-- Popup Overlay -->
		<script src='js/jquery.popupoverlay.min.js'></script>

		<!-- Modernizr -->
		<script src='js/modernizr.min.js'></script>
		
		<!-- Simplify -->
		<script src="js/simplify/simplify.js"></script>

		<script>
			$(function()	{
				setTimeout(function() {
					$('.error-type').addClass('animated');
				},100);
			});
		</script>
		
  	</body>
</html>
