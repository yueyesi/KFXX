<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="CSS/left2.css" rel="stylesheet" type="text/css">
</head>
<body>

		<div class="div1">
		<table>
			<tbody>
				<tr>
					<td class="bj1" onclick="changeTR(1,9)"><a class="bj2">基本档案</a></td>
				</tr>
				<tr>
					<td  id="tr_1_0"  style="display: none;"><a class="bj3" href="user_base_information.jsp" target="right">员工基本信息</a></td>
				</tr>
				<tr>
					<td id="tr_1_1" style="display: none;"><a class="bj3" href="user_add.jsp" target="right">添加员工信息</a></td>
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

</html>