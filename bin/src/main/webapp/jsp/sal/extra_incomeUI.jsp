<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/commons/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>外工资详细</title>
<link href="../../../css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript">
$(function(){
	$("select option[value='"+${ecome.month}+"']").prop("selected","selected")
});
function sub(){
	if($("#year").val()==""){
		alert("年份不能为空！");
		return false;
	}
	
}
</script>
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
	<table width="100%" border="0" cellspacing="0" cellpadding="0">
		<tr>
			<td height="25" align="center" valign="bottom" class="td06"><table
					width="98%" border="0" cellspacing="3" cellpadding="0">
					<tr>
						<td width="15"><img src="../../../images/index_32.gif"
							width="9" height="9"></td>
						<td valign="bottom" class="title">工资外信息查询</td>
					</tr>
				</table></td>
		</tr>
	</table>
	<br>
	<form action="/extraIncome/findUI" method="post">
		<table width="95%" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<tr>
				<td align="left" class="td_page"><input type="hidden"
					name="eid" value="${emp.empId}"> <input type="number"
					name="year" value="${ecome.year}" size="5" id="year"> 年 <select
					name="month">
						<option value="1" selected>1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
						<option value="6">6</option>
						<option value="7">7</option>
						<option value="8">8</option>
						<option value="9">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
				</select> 月&nbsp;&nbsp;&nbsp;&nbsp; <input name="Submit" type="submit"
					class="buttonface02" value="  查询  " onclick="return sub()"> <a href="#"
					onClick="javascript:openwindow('../../org/QUERY/index.html','',500,500)"><input
						name="Submit2" type="submit" class="buttonface02" value="高级查询"></a>
				</td>
			</tr>
		</table>
	</form>
	<br>
	<c:choose>
	<c:when test="${ecome==null}">
		<table width="95%" border="0" align="center" cellpadding="0"
		cellspacing="0">
		
		<tr>
			<td class="td_title">无工资外收入信息</td>
		</tr>
	</table>
	</c:when>
	<c:when test="${ecome!=null}">
	<table width="95%" border="0" align="center" cellpadding="0"
		cellspacing="0">
		
		<tr>
			<td class="td_title">${emp.ename}&nbsp;&nbsp;&nbsp;&nbsp;${ecome.year}年${ecome.month}月&nbsp;&nbsp;&nbsp;&nbsp;工资外收入<c:if test="${ecome.map==null}">(未查询到当月信息)</c:if></td>
		</tr>
	</table>


	<table width="95%" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td width="150" height="24" class="td_form01">合计</td>
			<td width="80" align="center" class="td_form02" colspan="7">${ecome.total}</td>
		</tr>
		<tr>
			<c:forEach items="${ecome.map}" var="c" varStatus="s">
				<td height="24" class="td_form01">${c.key}</td>
				<td height="24" class="td_form02" align="center">${c.value}</td>
				<c:choose>
					<c:when test="${s['last']}">

						<c:if test="${(s['index']+1)%3!=0}">
							<c:if test="${s['index']>2}">
								<c:forEach begin="0" end="${2-(s['index']+1)%3}">
									<td height="24" class="td_form01"></td>
									<td height="24" class="td_form02" align="center"></td>
								</c:forEach>
							</c:if>
						</c:if>
		</tr>
		</c:when>
		<c:when test="${(s['index']+1)%3==0}">
			</tr>
			<tr>
		</c:when>
		</c:choose>
		</c:forEach>
	</table>
	</c:when>
	</c:choose>
	<br>
	<table width="95%" border="0" align="center" cellpadding="2"
		cellspacing="0">
		<tr>
			<td width="90" height="24" align="left" class="td_form01">备注</td>
			<td class="td_form02">&nbsp;</td>
		</tr>
	</table>
</body>
</html>