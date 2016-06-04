<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎来到超市管理系统</title>
<link href="CSS/login.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div>
		<form action="loginServlet" method="post">
		<img alt="" src="img/png.jpg">
		<table align="center">
			<tr>
				<td>用户名：</td>
				<td>
					<input type="text" name="name" size="15"/>
				</td>
			</tr>
			<tr>
				<td>密	码：</td>
				<td>
					<input type="password" name="password" size="15"/>
				</td>
			</tr>
			<tr>
				<td>用户类型：</td>
				<td><select name="select1">
						<option value="1">管理员</option>
						<option value="2">普通用户</option>
				  </select>
				 </td>
			</tr>
			<tr>
				<td align="right"><input type="submit" value="" class="button_login"></td>
				<td align="right"><input type="reset" value="" class="button_reset"></td>
			</tr>
			
		</table>
		</form>
	</div>
</body>

</html>
