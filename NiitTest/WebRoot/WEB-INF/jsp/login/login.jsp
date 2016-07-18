<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<head>

<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>

<body style="padding:50px;">
	<div class="col-lg-12">
		<form role="form" action="${pageContext.request.contextPath}/login/check">
			<div class="form-group">
				<label for="rno">帐号</label> <input type="text" class="form-control" name="countid" value="">
			</div>
			<div class="form-group">
				<label for="rname">密码</label> <input type="password" class="form-control" name="password" value="">
			</div>
			<button type="submit" class="btn btn-default">登陆</button>
		</form>
	</div>
	<h1><font color="red">${error}</font></h1>

</body>
</html>


