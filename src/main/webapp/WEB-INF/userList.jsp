<%@ page language="java" import="java.util.*" contentType="text/html;
charset=utf-8" pageEncoding="utf-8"%> 
<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>用户列表页面</title>
</head>
<body>
	<table width="60%" algin="center" border="1">
		<tr align="center">
			<td colspan="5"><h2>用户信息</h2></td>
		</tr>
		<tr align="center">
			<td>ID</td>
			<td>姓名</td>
			<td>年龄</td>
			<td>性别</td>
		</tr>
		
		<!--要求:从域对象中取值 C标签  通过循环遍历 获取数据信息之后打印
			参数说明:
			1.items:表示从域对象中取值. jsp中的四大作用域中取值
				    ${域中的key} 获取List集合数据
			2.var: 循环遍历时遍历的名称 user
			3.varStatus: 记录当前循环的状态 获取遍历的次数
			4.${user.id} 该方法调用的是对象中的getId方法获取数据.
						  所有pojo属性必须添加get/set方法
			-->
		<c:forEach items="${userList}" var="user">
			<tr align="center">
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.age}</td>
				<td>${user.sex}</td>
			</tr>
		</c:forEach>
	</table>
	<a href="http://www.baidu.com">百度页面</a>
</body>
</html>