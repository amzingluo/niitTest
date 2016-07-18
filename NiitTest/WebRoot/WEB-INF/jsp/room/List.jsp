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
		<a href="${pageContext.request.contextPath }/student/list">点击查看学生表</a>
		</td>
	</div>
	<div class="row">
		<div class="col-lg-12">
			<table class="table table-hover">
				<caption>宿舍表</caption>
				<thead>
					<tr>
						<th>宿舍号</th>
						<th>宿舍名称</th>
						<th>宿舍地址</th>
						<th>宿舍电话</th>
						<th>宿舍长学号</th>
						<th>床数量</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${list}" var="var">
						<tr>
							<td>${var.rno}</td>
							<td>${var.rname}</td>
							<td>${var.raddress}</td>
							<td>${var.rphone}</td>
							<td>${var.leaderid}</td>
							<td>${var.bednum}</td>
							<td><a href="${pageContext.request.contextPath }/room/delete?rno=${var.rno}">删除</a> 
							<a href="${pageContext.request.contextPath }/room/toupdate?rno=${var.rno}">修改</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

	<div class="row" style="padding-left:30px; ">
		<a href="${pageContext.request.contextPath }/room/toupdate?rno=${var.rno}">添加宿舍</a>
		</td>
	</div>


</body>
</html>


