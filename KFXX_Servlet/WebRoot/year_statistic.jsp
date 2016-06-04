<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body marginleft="0px" marginright="0px" margintop="0px" marginwidth="0px" marginheight="0px" background="img/bg3.jpg"  style="height:600px;width: 100%;" >
	<form action="productYearStatisticServlet" method="post">
		<table style="margin-left: 300px;margin-top: 100px;line-height: 70px">
			
			<tr>
					
					<td align="center"><select name="year">
						<option value="2011">2011年</option>
						<option value="2012">2012年</option>
						<option value="2013">2013年</option>
						<option value="2014">2014年</option>
						<option value="2015">2015年</option>
						<option value="2016">2016年</option>
						<option value="2017">2017年</option>
						<option value="2018">2018年</option>
						<option value="2019">2019年</option>
						<option value="2020">2020月</option>
						
					</select>
				  	</td>
				  	<td>
				  	
				  <input type="submit" value="统计">
				  </td>
				  <td>
				  </td>
			</tr>
			<tr>
				<td>年度销售量最大的商品：</td>
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
				<td>年度销售额最多的商品：</td>
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
				<td>年度销售额汇总：</td>
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