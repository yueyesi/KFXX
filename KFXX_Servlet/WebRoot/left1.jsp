<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="CSS/left1.css" rel="stylesheet" type="text/css">
</head>
<body>
	<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="CSS/left1.css" rel="stylesheet" type="text/css">
</head>
<body>

		<div class="div1">
		<table>
			<tbody>
				<tr>
					<td class="bj1" onclick="changeTR(1,9)"><a class="bj2">销售管理</a></td>
				</tr>
				<tr>
					<td  id="tr_1_0"  style="display: none;"><a class="bj3" href="product_market.jsp" target="right">收银管理</a></td>
				</tr>
		
				<tr>
					<td class="bj1" onclick="changeTR(2,9)"><a class="bj2">进货管理</a></td>
				</tr>
				<tr>
					<td  id="tr_2_0"  style="display: none;"><a class="bj3" href="product_add.jsp" target="right">商品进货</a></td>
				</tr>
				<tr>
					<td id="tr_2_1" style="display: none;"><a class="bj3" href="product_delete.jsp" target="right">商品损耗</a></td>
				</tr>
				<tr>
					<td class="bj1" onclick="changeTR(3,9)"><a class="bj2">库存管理</a></td>
				</tr>
				<tr>
					<td  id="tr_3_0"  style="display: none;"><a class="bj3" href="product_warning.jsp" target="right">库存预警</a></td>
				</tr>
				<tr>
					<td id="tr_3_1" style="display: none;"><a class="bj3" href="product_search.jsp" target="right">库存查询</a></td>
				</tr>
				<tr>
					<td class="bj1" onclick="changeTR(4,9)"><a class="bj2">统计</a></td>
				</tr>
				<tr>
					<td  id="tr_4_0"  style="display: none;"><a class="bj3" href="month_statistic.jsp" target="right">月度销售情况统计</a></td>
				</tr>
				<tr>
					<td id="tr_4_1" style="display: none;"><a class="bj3" href="year_statistic.jsp" target="right">年度销售情况统计</a></td>
				</tr>
				<tr>
					<td class="bj1" onclick="changeTR(5,9)"><a class="bj2" href="login.jsp" target="_parent">退出</a></td>
				</tr>
			</tbody>
			
		</table>
	</div>
</body>
		<script type="text/javascript" language="javascript">
	      var intOldParentID = 2, intOldChild = 9;
	       function changeTR(parentID, childID) { if (intOldParentID != parentID) { for (var i = 0; i < intOldChild; i++) { var sss = document.getElementById("tr_" + intOldParentID + "_" + i); if (sss) sss.style.display = "none" } intOldParentID = parentID; intOldChild = childID; } for (var i = 0; i < childID; i++) { var sss = document.getElementById("tr_" + parentID + "_" + i); if (sss) sss.style.display = ""; } }
	    
       </script>

</body>
</html>