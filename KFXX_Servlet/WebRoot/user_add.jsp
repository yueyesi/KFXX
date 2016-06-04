<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body  marginleft="0px" marginright="0px" margintop="0px" marginwidth="0px" marginheight="0px" background="img/bg3.jpg"  style="height:600px;width: 100%;">

	<form action="userADDServlet" method="post">
			<script type="text/javascript">
	function sf(){
		var usrLoginName=document.getElementById("UserLoginName");
		var userPassword=document.getElementById("UserPassword");
		var userName=document.getElementById("UserName");
		var sex=document.getElementById("Sex");
		var phone=document.getElementById("Phone");
		if(usrLoginName.value==""||userPassword.value==""||userName.value==""||sex.value==""||phone.value=="")
				{
					alert("注册信息没有填写完整，请填写完整");
					
				}
				else{
					alert("注册成功");
				}
				
	}
</script>
		<table style="margin-left: 400px;margin-top: 100px;line-height: 50px">
				<tr>
					<td>用户名；</td>
					<td><input type="text" size="15" name="UserLoginName" id="UserLoginName"></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="text" size="15" name="UserPassword" id="UserPassword"></td>
				</tr>
				<tr>
					<td>真实姓名：</td>
					<td><input type="text" size="15" name="UserName" id="UserName"></td>
				</tr>
				<tr>
					<td>性别：</td>
					<td><input type="text" size="15" name="Sex" id="Sex"></td>
					
				</tr>
				<tr>
					<td>手机号码：</td>
					<td><input type="text" size="15" name="Phone" id="Phone"></td>
				</tr>
				<tr>
					<td><input type="submit" value="注册" onclick="sf()"></td>
					<td><input type="reset" value="重置"></td>
				</tr>
		</table>
	</form>
</body>
</html>