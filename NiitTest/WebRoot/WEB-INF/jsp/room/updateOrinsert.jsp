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
		<form role="form" action="${pageContext.request.contextPath}/room/updateOrinsert">
			<div class="form-group">
				<label for="rno">宿舍号</label> <input type="text" class="form-control" name="rno" value="${Room.rno}" }">
			</div>
			<div class="form-group">
				<label for="rname">宿舍名称</label> <input type="text" class="form-control" name="rname" value="${Room.rname}">
			</div>
			<div class="form-group">
				<label for="raddress">宿舍地址</label> <input type="text" class="form-control" name="raddress" value="${Room.raddress}">
			</div>
			<div class="form-group">
				<label for="rphone">宿舍电话</label> <input type="text" class="form-control" name="rphone" value="${Room.rphone}">
			</div>
			
			<div class="form-group">
				<label for="rphone">宿舍长学号</label> <input type="text" class="form-control" name="leaderid" value="${Room.leaderid}">
			</div>
			<div class="form-group">
				<label for="rphone">床位数</label> <input type="text" class="form-control" name="bednum" value="${Room.bednum}">
			</div>

			<button type="submit" class="btn btn-default">提交</button>
		</form>
	</div>

</body>
</html>


