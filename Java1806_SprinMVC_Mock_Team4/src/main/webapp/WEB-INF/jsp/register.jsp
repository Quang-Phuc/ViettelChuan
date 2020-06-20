<!DOCTYPE html>
<html>
<head>
<title>Trang đăng ký</title>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<title></title>
<meta
	content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no'
	name='viewport'>
<!-- Bootstrap 3.3.2 -->
<link href="css2/bootstrap.min.css" rel="stylesheet" type="text/css" />
<!-- Font Awesome Icons -->
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css" />
<!-- Theme style -->
<link href="css2/AdminLTE.min.css" rel="stylesheet" type="text/css" />
<!-- iCheck -->
<link href="css2/blue.css" rel="stylesheet" type="text/css" />
<script src="js2/jquery-3.3.1.min.js" type="text/javascript"></script>
<script src="js2/jquery.validate.min.js" type="text/javascript"></script>

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
    <![endif]-->
</head>
<script>

function validateForm() {
	var regex=new RegExp("^[a-zA-Z]{1,30}[0-9]{1,5}$");
  var password = document.forms["registerForm"]["password"].value;
  var name = document.forms["registerForm"]["userName"].value;
  var repassword = document.forms["registerForm"]["repassword"].value;
  var nameOK=regex.test(name);
  var passwordOk=regex.test(password);
  if(nameOK == false|| passwordOk == false)
	  {
	  	alert("Sai định dạng tên hoặc mật khẩu [bao gồm chữ và số]");
	  }
  if (password != repassword) {
    alert("Hai passwork phai giong nhau");
  
  }
}
</script>

<body class="login-page">
	<div class="login-box">
		<div class="login-logo">
			<a href="register"><b>Thêm tài khoản</b></a>
		</div>
		<!-- /.login-logo -->
		<div class="login-box-body">
			<p class="login-box-msg">Nhập các thông tin</p>
			<form accept-charset="UTF-8" role="form" action="register" 
				method="Post" name="registerForm">
				<div class="form-group has-feedback">
					<input class="form-control" placeholder="username" name="userName"
						type="text" /> <span
						class="glyphicon glyphicon-envelope form-control-feedback"></span>
				</div>
				<div class="form-group has-feedback">
					<input type="password" name="password" class="form-control"
						placeholder="Password" /> <input type="password" name="repassword"
						class="form-control" placeholder="Password" /> <span
						class="glyphicon glyphicon-lock form-control-feedback"></span>
				</div>
				<div class="row">
					<div class="col-xs-8">
						<div class="checkbox icheck"></div>
					</div>
					<!-- /.col -->
					<div class="col-xs-4">
						<button type="submit"  onclick="validateForm()" class="btn btn-primary btn-block btn-flat">Register</button>
					</div>
					<!-- /.col -->
				</div>
			</form>


		</div>
		<!-- /.login-box-body -->
	</div>
	<!-- /.login-box -->

	<!-- jQuery 2.1.3 -->
	<script src="js2/jQuery-2.1.3.min.js"></script>
	<!-- Bootstrap 3.3.2 JS -->
	<script src="/js2/bootstrap.min.js" type="text/javascript"></script>
	<!-- iCheck -->
	<script src="js2/icheck.min.js" type="text/javascript"></script>
	<script>
		$(function() {
			$('input').iCheck({
				checkboxClass : 'icheckbox_square-blue',
				radioClass : 'iradio_square-blue',
				increaseArea : '20%' // optional
			});
		});
	</script>
</body>
</html>