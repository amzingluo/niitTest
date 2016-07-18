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
		<form role="form" action="${pageContext.request.contextPath}/student/updateOrinsert">
			<div class="form-group">
				<label for="rno">学生号</label> <input type="text" class="form-control" name="sno" value="${Student.sno}" }">
			</div>
			<div class="form-group">
				<label for="rname">学生名称</label> <input type="text" class="form-control" name="sname" value="${Student.sname}">
			</div>
			<div class="form-group">
				<label for="raddress">性别</label> <input type="text" class="form-control" name="ssex" value="${Student.ssex}">
			</div>
			<div class="form-group">
				<label for="rphone">年龄</label> <input type="text" class="form-control" name="sage" value="${Student.sage}">
			</div>
			<div class="form-group">
				<label for="rphone">手机</label> <input type="text" class="form-control" name="sphone" value="${Student.sphone}">
			</div>
			<div class="form-group">
				<label for="rphone">班级号</label> <input type="text" class="form-control" name="classno" value="${Student.classno}">
			</div>
			<div class="form-group">
				<label for="rphone">宿舍号</label> <input type="text" class="form-control" name="dormno" value="${Student.dormno}">
			</div>

			<button type="submit" class="btn btn-default">提交</button>
		</form>
	</div>

</body>
</html>


