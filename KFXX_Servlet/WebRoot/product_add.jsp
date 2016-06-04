<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body marginleft="0px" marginright="0px" margintop="0px" marginwidth="0px" marginheight="0px" background="img/bg3.jpg"  style="height:600px;width: 100%;" >
	<form action="productADDServlet" method="post">
		<script type="text/javascript">
			function mclick(){
				var productName=document.getElementById("ProductName");
				
				var StockPrice=document.getElementById("StockPrice");
				var Inventory=document.getElementById("Inventory");
				if(productName.value==""||StockPrice.value==""||Inventory.value=="")
				{
					alert("进货信息没有填写完整，请填写完整");
					
				}
				else{
					alert("进货成功");
				}
				
			}
		</script>
		<table style="margin-left: 400px;margin-top: 100px;line-height: 70px">
			<tr>
				<td>商品名称</td>
				<td><input type="input" size="15" name="ProductName" id="ProductName"/></td>
			</tr>
			<tr>
				<td>商品分类</td>
				<td>
					
					<select name="select1">
						<option value="1">食品</option>
						<option value="2">水果</option>
						<option value="3">日用品</option>
						<option value="4">饮料</option>
						<option value="5">香烟</option>
						<option value="6">其它</option>
					</select>
					
				</td>
			</tr>
			<tr>
				<td>进货价格</td>
				<td><input type="input" size="15" name="StockPrice" id="StockPrice"></td>
			</tr>
			<tr>
				<td>数量</td>
				<td><input type="text" size="15" name="Inventory" id="Inventory"></td>
			</tr>
			<tr>
				<td><input type="submit" value="进货" onclick="mclick()"></td>
				<td><input type="reset" value="重置"></td>
			</tr>
		</table>
	</form>

</body>
</html>