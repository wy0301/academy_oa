<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户管理</title>
<link href="../../css/style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" type="text/javascript" src="../../js/win_center.js"></script>
</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<center>
  <table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td height="25" align="center" valign="bottom" class="td06"><table width="98%" border="0" cellspacing="3" cellpadding="0">
          <tr>
            <td width="15"><img src="../../images/index_32.gif" width="9" height="9"></td>
            <td valign="bottom" class="title">用户管理</td>
          </tr>
      </table></td>
    </tr>
  </table>
  <br>
  <table width="95%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right" class="td_page"><a href="/jsp/role/addrole.jsp"><input name="Submit" type="button" class="buttonface02" value="  新增用户 "></a>
        <input name="Submit" type="submit" class="buttonface02" onClick="confirm('确认删除？')" value="  删除  "></td>
    </tr>
  </table>
  <form name="form1" method="post" action="">
    <table width="95%"  border="0" cellspacing="2" cellpadding="0">
      <tr>
        <td class="td_title"> 用户列表 </td>
      </tr>
    </table>
    <table width="95%" border="0" align="center" cellpadding="0" cellspacing="0" class="table01">
    <tr>
      <td  align="center" class="td_top"><input type="checkbox" name="checkbox" value="checkbox"></td>
      <td  class="td_top">员工姓名</td>
      <td  class="td_top">性别</td>
        <td  class="td_top">手机号</td>
         <td  class="td_top">入职日期</td>
          <td  class="td_top">部门</td>
           <td  class="td_top">状态</td>
           <td  class="td_top">操作</td>
    </tr>
    <c:forEach items="${list}" var="emp">
    <tr>
      <td height="19" align="center" class="td_01"><input type="checkbox" name="checkbox" value="checkbox"></td>
      <td class="td_01"><a href="/emps/updateUI/${emp.empId}">${emp.ename}</a></td>
      <td class="td_01">
      ${emp.sex}
      </td>
       <td  class="td_01"> ${emp.phone}</td>
        <td  class="td_01"> ${emp.hiredate}</td>
         <td  class="td_01"> ${emp.deptId}</td>
          <td  class="td_01"> ${emp.status}</td>
           <td  class="td_01"><a href="/emps/delete/${emp.empId}">删除</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
           <a href="/emps/grantRolesUI/${emp.empId}">分配角色</a>
           </td>
    </tr>
    </c:forEach>
  </table>
  </form>
</center>
</body>
</html>