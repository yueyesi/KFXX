<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body marginleft="0px" marginright="0px" margintop="0px" marginwidth="0px" marginheight="0px" background="img/bg3.jpg"  style="height:600px;width: 100%;" >
	<form action="productStatisticServlet" method="post">
		<table style="margin-left: 300px;margin-top: 100px;line-height: 70px">
			
			<tr>
					
					<td align="center"><select name="month">
						<option value="1">1月</option>
						<option value="2">2月</option>
						<option value="3">3月</option>
						<option value="4">4月</option>
						<option value="5">5月</option>
						<option value="6">6月</option>
						<option value="7">7月</option>
						<option value="8">8月</option>
						<option value="9">9月</option>
						<option value="10">10月</option>
						<option value="11">11月</option>
						<option value="12">12月</option>
					</select>
				  	</td>
				  	<td>
				  	
				  <input type="submit" value="统计">
				  </td>
				  <td>
				  </td>
			</tr>
			<tr>
				<td>月度销售量最大的商品：</td>
				<td>
					<label id="label1" name="label1" style="color: red">${MaxCountName }</label>
				</td>
				<td>
					最大销售量为：
				</td>
				<td>
					<label id="label4" name="label4" style="color: red">${MaxCount }</label>
				</td>
			</tr>
			<tr>
				<td>月度销售额最多的商品：</td>
				<td>
					<label id="label2" name="label2" style="color: red">${MaxPriceName }</label>
				</td>
				<td>
					最大销售额为：
				</td>
				<td>
					<label id="label4" name="label5" style="color: red">${MaxPrice }</label>
				</td>
			</tr>
			<tr>
				<td>月度销售额汇总：</td>
				<td>
					<label id="label3" name="label3" style="color: red">${Sum }</label>
				</td>
			</tr>
			<tr>
				
				
			</tr>
		</table>
	</form>
</body>
</html>