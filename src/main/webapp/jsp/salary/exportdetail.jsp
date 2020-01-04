<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/commons/head.jsp" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
        <td valign="bottom" class="title">工资明细</td>
      </tr>
    </table></td>
  </tr>
</table>
<br>
<table width="95%"  border="0" align="center" cellpadding="0" cellspacing="0">
    <tr>
<td align="left" class="td_page">
<form action="/salary/findSal" method="post">
<input type="hidden" name="empId" value="${emp.empId }">
<select name="year">
          <option selected value="2019">2019</option>
          	<option  value="2020">2020</option>
            </select>
        年
<select name="month" id="monthVal">
	 <c:forEach var="i" begin="1" end="12">
	 	<option value="${i }" 
	 	 
	 		<c:if test='${sal.month==i }'> selected="selected"</c:if>
	 	>${i }</option>
	 </c:forEach>
      </select>
        月
        <input name="Submit" type="submit" class="buttonface02" value="  查询  ">
        </form>
	  </td>
    </tr>
</table>
<br>
<table width="95%" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td class="td_title">${emp.ename }&nbsp;&nbsp;&nbsp;&nbsp;${sal.year}年${sal.month}月&nbsp;&nbsp;&nbsp;&nbsp;工资基本发放情况</td>
  </tr>
</table>
<table width="95%"  border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td width="150" height="24" class="td_form01">应发合计</td>
    <td width="80" align="right" class="td_form02">${sal.payableSal }</td>
    <td width="150" class="td_form01">扣款合计</td>
    <td width="80" align="right" class="td_form02">${sal.withholdingTotle }</td>
    <td width="150" class="td_form01">实发合计</td>
    <td class="td_form02" align="right">${sal.actualSal }</td>
  </tr>
  <tr>
    <td height="24" class="td_form01">代扣税</td>
    <td class="td_form02" align="right">${sal.withholdingTax }</td>
    <td class="td_form01">&nbsp;</td>
    <td class="td_form02">&nbsp;</td>
    <td class="td_form01">&nbsp;</td>
    <td class="td_form02">&nbsp;</td>
  </tr>  <tr>
    <td height="24" class="td_form01">基本工资</td>
    <td class="td_form02" align="right">${sal.basepay }</td>
    <td class="td_form01">津贴</td>
    <td class="td_form02" align="right">0.00</td>
    <td class="td_form01">未冲销津补贴</td>
    <td class="td_form02" align="right">0.00</td>
  </tr>  <tr>
    <td height="24" class="td_form01">政府津贴</td>
    <td class="td_form02" align="right">0.00</td>
    <td class="td_form01">药费补贴</td>
    <td class="td_form02" align="right">0.00</td>
    <td class="td_form01">生活补助款</td>
    <td class="td_form02" align="right">0.00</td>
  </tr>  <tr>
    <td height="24" class="td_form01">岗位津贴</td>
    <td class="td_form02" align="right">${sal.jobAllowance }</td>
    <td class="td_form01">独生子女费</td>
    <td class="td_form02" align="right">0.00</td>
    <td class="td_form01">电话补贴</td>
    <td class="td_form02" align="right">0.00</td>
  </tr>  <tr>
    <td height="24" class="td_form01">移动通信补贴</td>
    <td class="td_form02" align="right">${sal.commAllowance }</td>
    <td class="td_form01">房租补贴</td>
    <td class="td_form02" align="right">0.00</td>
    <td class="td_form01">科研津贴</td>
    <td class="td_form02" align="right">0.00</td>
  </tr>  <tr>
    <td height="24" class="td_form01">职务津贴</td>
    <td class="td_form02" align="right">${sal.dutyAllowance }</td>
    <td class="td_form01">坐班补贴</td>
    <td class="td_form02" align="right">0.00</td>
    <td class="td_form01">其他补贴</td>
    <td class="td_form02" align="right">0.00</td>
  </tr>  <tr>
    <td height="24" class="td_form01">保健津贴</td>
    <td class="td_form02" align="right">${sal.healthAllowance }</td>
    <td class="td_form01">工资外其他收入</td>
    <td class="td_form02" align="right">${sal.extraIncomeId }</td>
    <td class="td_form01">零补费</td>
    <td class="td_form02" align="right">0.00</td>
  </tr>  <tr>
    <td height="24" class="td_form01">代扣住房公积金</td>
    <td class="td_form02" align="right">${sal.publicHousingFund }</td>
    <td class="td_form01">代扣工会会费</td>
    <td class="td_form02" align="right">0.00</td>
    <td class="td_form01">扣儿童统筹医疗费</td>
    <td class="td_form02" align="right">0.00</td>
  </tr>  <tr>
    <td height="24" class="td_form01">代扣失业保险</td>
    <td class="td_form02" align="right">0.00</td>
    <td class="td_form01">零扣款</td>
    <td class="td_form02" align="right">0.00</td>
    <td class="td_form01">&nbsp;</td>
    <td class="td_form02">&nbsp;</td>
  </tr>
</table>
<br>
<table width="95%"  border="0" align="center" cellpadding="2" cellspacing="0">
  <tr>
    <td width="90" height="24" align="left" class="td_form01">备注</td>
    <td class="td_form02">孩子小于14周岁的职工的零补费中含有50元“六一”儿童节补贴</td>
  </tr>
</table>

</body>
</html>
