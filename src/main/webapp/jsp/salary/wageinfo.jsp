<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/commons/head.jsp" %>     
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>维护薪资</title>
<script language="javascript">
function windowOpen(theURL,winName,features,width,hight,scrollbars,top,left) 
{
  var parameter="top="+top+",left="+left+",width="+width+",height="+hight;
  if(scrollbars=="no")
 {parameter+=",scrollbars=no";}
  else
 {parameter+=",scrollbars=yes";}
  window.open(theURL,winName,parameter);
}

</script>
<link href="../../../css/style.css" rel="stylesheet" type="text/css">
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="25" align="center" valign="bottom" class="td06"><table width="98%" border="0" cellspacing="3" cellpadding="0">
      <tr>
        <td width="15"><img src="../../../images/index_32.gif" width="9" height="9"></td>
        <td valign="bottom" class="title">维护薪资</td>
      </tr>
    </table></td>
  </tr>
</table>
<br>
<table width="95%"  border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>   
<td align="left" class="td_page">
<form action="/salary/findSalToEmp" method="post">
	<select name="year" id="yearVal">
          <option selected value="2019">2019</option>
          <option value="2020">2020</option>
            </select>
        年
	<select name="month" id="monthVal">
	 <c:forEach var="i" begin="1" end="12">
	 	<option value="${i }" 
	 	 
	 		<c:if test='${salList[0].month==i }'> selected="selected"</c:if>
	 	>${i }</option>
	 </c:forEach>
      </select>
        月
        <input name="Submit" type="submit"  class="buttonface02" value="  查询  ">
</form>         
        



			</td>
    </tr>
</table>
<br>
<table width="95%"  border="0" align="center" cellpadding="2" cellspacing="0" class="table01">
  <tr align="center">
  
    <td class="td_top">姓名</td>
    <td class="td_top">部门</td>
    <td class="td_top">应发合计</td>
    <td class="td_top">扣款合计</td>
    <td class="td_top">实发合计</td>

    <td class="td_top">工资外收入合计</td>
    <td class="td_top">工资明细</td>
    <td class="td_top">零补费及工资外收入明细</td>
  </tr>
  <c:forEach items="${salList}" var="list">
  	<tr align="center">
  		<td id="test1" hidden="hidden">${list.empId }</td>
  		
	    <td class="td_01">${list.emps.ename }</td>
	    <td class="td_01"> ${list.emps.dept.dname }</td>
	    <td class="td_01">${list.payableSal }</td>
	    <td class="td_01">${list.withholdingTotle }</td>
	    <td class="td_01">${list.actualSal }</td>
	   
	    <td class="td_01">${list.extraIncomeId }</td>
	    <td class="td_01"><a href="/salary/findSal" class="findOne">>>></a></td>
	    <td class="td_01"><a href="/extralncome/findUI" class="findEx">>>></a></td>   
	  </tr>
  </c:forEach>
 
</table>
<script type="text/javascript">
	$(function(){
		$(".findOne").click(function(){
			var a=$(this).parent();
			var b=$(a).parent();
			var c=$(b).children()[0];
			var empId=$(c).html();;
			var yearVal=$("#yearVal").val();
			var monthVal=$("#monthVal").val();
			window.location="/salary/findSal?empId="+empId+"&year="+yearVal+"&month="+monthVal;
			return false;
		})
		$(".findEx").click(function(){
			var a=$(this).parent();
			var b=$(a).parent();
			var c=$(b).children()[0];
			var empId=$(c).html();;
			var yearVal=$("#yearVal").val();
			var monthVal=$("#monthVal").val();
			window.location="/extraIncome/findUI?eid="+empId+"&year="+yearVal+"&month="+monthVal;
			return false;
		})
			
	})
	
</script>
</body>
</html>