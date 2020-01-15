<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/head.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="../../../css/style.css" rel="stylesheet" type="text/css">
<script language="javascript" src="../../../js/check.js"></script>
<script language="javascript" src="../../../js/checkAll.js"></script>
<script language="javascript" src="../../../js/clientSideApp.js"></script>
<link rel="stylesheet" href="/My97DatePicker/skin/default/datepicker.css"/>
<script type="text/javascript" src="/My97DatePicker/WdatePicker.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>社科院OA办公系统</title>
</head>
 <body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
  <table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td height="25" align="center" valign="bottom" class="td06"><table width="98%" border="0" cellspacing="3" cellpadding="0">
          <tr>
            <td width="15"><img src="../../../images/index_32.gif" width="9" height="9"></td>
            <td valign="bottom" class="title">操作日志管理</td>
          </tr>
      </table></td>
    </tr>
  </table>
  <table width="100%"  border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td>
<form name="operationLogForm" method="post" action="/syslogs/findSelective">
<br>
<table width="95%"  border="0" align="center" cellpadding="0" cellspacing="0">
          <tr> 
            <td class="td_page">操作时间:
					 <input type="text" id="d241" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" class="Wdate" name="beginTime"/>		
					到&nbsp;
					 <input type="text" id="d241" onclick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" class="Wdate" name="endTime"/>
              　操作人: 
              <input name="operName" type="text" class="input" id="40" size="10" >
              　操作类型: 
              <select name="operType">
                <option selected>所有类型</option>
                <option value="add">add</option>
                <option value="modify">update</option>
                <option value="delete">delete</option>
              </select>
              　 
              <input name="query" type="submit" class="buttonface02" value="  查询  ">
              <input type="button" name="check"  class="buttonface" value="查看导出日志">
            </td>
          </tr>
        </table>
        <br>
        <table width="100%" border=0 cellpadding="0" cellspacing="0">
          <tr>
            <td><table width="95%"  border="0" align="center" cellpadding="0" cellspacing="2">
   <tr>
     <td class="td_title">共2条记录</td>
     <td align="right">请选择导出的文件格式：
         <input name="fileType" type="radio" value="1">
      excel文件
      <input name="fileType" type="radio" value="2">
      mdb文件
      <input name="fileType" type="radio" value="3" >
      xml文件</td>
     <td align="right"><input type="button" name="export" class="buttonface" value="导出操作日志" onClick="forExport(document.forms(0),'2')"></td>
   </tr>
 </table>
 <table width="95%" align=center border="0" cellpadding="0" cellspacing="0" class="table01">
   <tr>
     <td class="td_top"><input name="all" type="checkbox" onClick="selectAll(document.forms(0).all,document.forms(0).chk)">
     </td>
     <td class="td_top" nowrap>操作时间</td>
     <td class="td_top" nowrap>操作人ID</td>
     <td class="td_top" nowrap>IP地址</td>
     <td class="td_top" nowrap>操作模块</td>
     <td class="td_top" nowrap>操作类型</td>
     <td class="td_top" nowrap>操作内容</td>
     <td class="td_top" nowrap>操作耗时(ms)</td>
   </tr>
   <c:forEach items="${list}" var="opt">
   <tr>
     <td align="center" class="td_02"><input type="checkbox" name="chk" value="45055">
     </td>
     <td class="td_02">${opt.opTime}</td>
     <td class="td_02" >${opt.opEmp}</td>
     <td class="td_02" >${opt.ip}</td>
     <td class="td_02" >${opt.opModule}</td>
     <td class="td_02" >${opt.opType}</td>
     <td class="td_02" >${opt.opContent}</td>
     <td class="td_02" >${opt.opDuration}</td>
   </tr>
   </c:forEach>
 </table></td>
          </tr>
        </table>
</form></td>
    </tr>
  </table>
 </body>
</html>