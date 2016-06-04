<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function OnClicks(){
		var ProductID=document.getElementById("ProductID");
		var OrderNumber=document.getElementById("OrderNumber");
		var Discount=document.getElementById("Discount");
		if(ProductID.value==""||OrderNumber.value==""||Discount.value==""){
			alert("信息没有填写完整，请填写完整");
		}
	}
</script>
</head>
<body marginleft="0px" marginright="0px" margintop="0px" marginwidth="0px" marginheight="0px" background="img/bg3.jpg"  style="height:600px;width: 100%;">
<form action="productMarketServlet" method="post">
 			<table style="margin-left: 400px;margin-top: 100px;line-height: 70px">
 					<tr>
 						<td>商品编号：</td>
 						<td><input type="text" size="15" name="ProductID" id="ProductID"></td>
 					</tr>
 					<tr>
 						<td>数		量：</td>
 						
 						<td><input type="text" size="15" name="OrderNumber" id="OrderNumber"></td>
 						
 					</tr>
 					<tr>
 						<td>打		\折:</td>
 						<td><input type="text" size="15" name="Discount" id="Discount"></td>
 					</tr>
 					<tr>
 						<td><label id="label1" name="label1" style="color: red">应付金额为：${sum }</label></td>
 					</tr>
 					<tr>
 						<td><input type="submit" value="收银" onclick="OnClicks()"></td>
 						<td><input type="reset" value="重置"></td>
 					</tr>
 					
 			</table>
	
</form>
	
</body>
</html>