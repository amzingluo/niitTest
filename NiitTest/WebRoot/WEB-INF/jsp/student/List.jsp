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

	<div class="row" style="padding:40px;">
		<a href="${pageContext.request.contextPath }/room/list">点击查看宿舍表</a>
		</td>
	</div>

	<div class="row">
		<div class="col-lg-12">
			<table class="table table-hover">
				<caption>学生表</caption>
				<thead>
					<tr>
						<th>学生号</th>
						<th>学生名</th>
						<th>学生性别</th>
						<th>学生年龄</th>
						<th>学生手机</th>
						<th>班级</th>
						<th>房间</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="var">
						<tr>
							<td>${var.sno}</td>
							<td>${var.sname}</td>
							<td>${var.ssex}</td>
							<td>${var.sage}</td>
							<td>${var.sphone}</td>
							<td>${var.classno}</td>
							<td>${var.dormno}</td>
							<td><a href="${pageContext.request.contextPath }/student/delete?sno=${var.sno}">删除</a> <a href="${pageContext.request.contextPath }/student/toupdate?sno=${var.sno}">修改</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<div class="row" style="padding-left:30px; ">
		<a href="${pageContext.request.contextPath }/student/toupdate?sno=${var.sno}">添加学生</a>
		</td>
	</div>


</body>
</html>


