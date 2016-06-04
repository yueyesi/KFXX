<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<c:set var="UserBean"></c:set>
</head>
<body marginleft="0px" marginright="0px" margintop="0px" marginwidth="0px" marginheight="0px" background="img/bg3.jpg"  style="height:600px;width: 100%" >
	<form action="userSearchServlet" method="post">
	<table style="margin-left:100px;padding-top: 50dp" >
		<tr>
			<td>员工编号:</td>
			<td><input type="text" size="14" name="userNumber" /></td>
			<td>用户名：</td>
			<td><input type="text" size="14" name="userName" /></td>
			<td><input type="submit" value="查询"></td>
			<td><input type="reset" value="重置"></td>
		</tr>
	</table>
	<table style="margin-left:100px;margin-top: 50px;" border="1">
			<tr>
				<th>用户编号</th>
				<th>用户名</th>
				<th>用户密码</th>
				<th>真实姓名</th>
				<th>性别</th>
				<th>手机号码</th>
			
			</tr>
			<c:forEach var="user" items="${users}">
				<tr>
					<td>${user.getUserID() }</td>
					<td>${user.getUserLoginName()}</td>
					<td>${user.getUserPassword() }</td>
					<td>${user.getUserName() }</td>
					<td>${user.getSex() }</td>
					<td>${user.getPhone()}</td>
					
				</tr>
		</c:forEach>
		</table>
		</form>
	</body>
</html>
		
	