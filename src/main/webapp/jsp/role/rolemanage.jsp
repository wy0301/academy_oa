<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色管理</title>
<script type="text/javascript" language="JavaScript1.2" src="../../js/stm31.js"></script>
<SCRIPT language=javascript src="../../js/tree2.js"></SCRIPT>
<script language=javascript>
function secBoard(n)
{
  for(i=0;i<secTable.cells.length;i++)
    secTable.cells[i].className="sec1";
  secTable.cells[n].className="sec2";
  for(i=0;i<mainTable.tBodies.length;i++)
    mainTable.tBodies[i].style.display="none";
  mainTable.tBodies[n].style.display="block";
}
</script>
<link href="../../css/style.css" rel="stylesheet" type="text/css">
</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<center>
  
  <table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td height="25" align="center" valign="bottom" class="td06"><table width="98%" border="0" cellspacing="3" cellpadding="0">
          <tr>
            <td width="15"><img src="../../images/index_32.gif" width="9" height="9"></td>
            <td valign="bottom" class="title">角色管理</td>
          </tr>
      </table></td>
    </tr>
  </table>
  <table width="100%" border=0 cellpadding="0" cellspacing="0">
  <tr>
    <td><iframe name="label" frameborder="0" framespacing="0" width="100%" height="476" scrolling="yes" src="grantpermissions.jsp"></iframe></td>
  </tr>
</table>
</center>
</body>
</html>