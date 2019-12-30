b<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色管理</title>
<link href="../../css/style.css" rel="stylesheet" type="text/css">
</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<center>
  <table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td height="25" align="center" valign="bottom" class="td06"><table width="98%" border="0" cellspacing="3" cellpadding="0">
          <tr>
            <td width="15"><img src="../../images/index_32.gif" width="9" height="9"></td>
            <td valign="bottom" class="title">修改角色</td>
          </tr>
      </table></td>
    </tr>
  </table>
  <form name="form1" method="post" action="/roles/save">
<table width="95%"  border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="90" align="center" class="td_form01">角色名称</td>
    
    <td colspan="3" class="td_form02"><input name="rname" type="text" class="input" value="${roles.rname}">
    <input name="role_id" type="hidden" value="${role.roleId}"/>
    </td>
  </tr>
</table>
  <br>
  <table width="100%"  border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="center"><input name="Submit" type="submit" class="buttonface" value="  修改 ">
        <input type="button" class="buttonface" onClick="history.back()" value="  关闭  "></td>
    </tr>
  </table>
  </form>
</center>
</body>
</html>