<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>权限管理</title>
<link href="../../css/style.css" rel="stylesheet" type="text/css">
</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<center>
  <table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td height="25" align="center" valign="bottom" class="td06"><table width="98%" border="0" cellspacing="3" cellpadding="0">
          <tr>
            <td width="15"><img src="../../images/index_32.gif" width="9" height="9"></td>
            <td valign="bottom" class="title">新增权限</td>
          </tr>
      </table></td>
    </tr>
  </table>
  <form name="form1" method="post" action="/permissions/save">
<table width="95%"  border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="90" align="center" class="td_form01">权限名称</td>
    <td colspan="3" class="td_form02"><input name="permissionContent" type="text" class="input"></td>
  </tr>
  <tr>
    <td width="90" align="center" class="td_form01">父权限</td>
    <td colspan="3" class="td_form02">
    <select name="parentId">
    <option value="0">无</option>
    <c:forEach items="${list}" var="pm">
    <option value="${pm.permissionId}">${pm.permissionContent}</option>
    </c:forEach>
    </select>
    </td>
  </tr>
</table>
  <br>
  <table width="100%"  border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="center"><input name="Submit" type="submit" class="buttonface" value="  增加  ">
        <input type="button" class="buttonface" onClick="history.back()" value="  关闭  "></td>
    </tr>
  </table>
  </form>
</center>
</body>
</html>