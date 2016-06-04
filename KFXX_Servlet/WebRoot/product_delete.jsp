<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function OnClicks(){
		var number=document.getElementById("number");
		if(number.value==""){
			alert("请填写商品编号！！");
		}
	}
</script>
</head>
<body marginleft="0px" marginright="0px" margintop="0px" marginwidth="0px" marginheight="0px" background="img/bg3.jpg"  style="height:600px;width: 100%;">
<form action="productDeleteServlet" method="post">
		<table style="margin-left: 400px;margin-top: 100px;line-height: 70px">
			<tr>
				<td>商品编号：</td>
				<td><input type="text" size="15" name="number" id="number" ></td>
			</tr>
			<tr>
			<td colspan="2" align="center"><input type="submit" value="删除" onclick="OnClicks()"></td>
			</tr>
			
		</table>
</form>

</body>
</html>