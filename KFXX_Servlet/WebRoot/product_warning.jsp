<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<c:set var="ProductBean"></c:set>
</head>
<body marginleft="0px" marginright="0px" margintop="0px" marginwidth="0px" marginheight="0px" background="img/bg3.jpg"  style="height:600px;width: 100%" >
	<form action="productWarningServlet" method="post">
	<table style="margin-left:400px;padding-top: 50dp;margin-top: 100px;" >
		<tr>
			<td><input type="submit" value="库存不足显示" style="font-size: 20"></td>
		</tr>
	</table>
		<table style="margin-left:100px;margin-top: 50px;" border="1">
			<tr>
				<th>商品编号</th>
				<th>商品名称</th>
				<th>商品分类</th>
				<th>进货价格</th>
				<th>售出价格</th>
				<th>商品库存</th>
				<th>进货时间</th>
			</tr>
			<c:forEach var="product" items="${products}">
				<tr>
					<td>${product.getProductID() }</td>
					<td>${product.getProductName() }</td>
					<td>${product.getProductCategory() }</td>
					<td>${product.getStockPrice() }</td>
					<td>${product.getSellPrice() }</td>
					<td>${product.getInventory() }</td>
					<td>${product.getDate() }</td>
				</tr>
		</c:forEach>
		</table>
	</form>

</body>
</html>