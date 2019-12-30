<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/commons/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>分配角色</title>
<link href="../../../css/style.css" rel="stylesheet" type="text/css">
</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<center>
  <form name="form1" method="post" action="">
    <table width="95%"  border="0" cellpadding="0" cellspacing="0">
    <tr align="left">
      <td height="24" colspan="3" class="td_form01">&nbsp;&nbsp;选择角色</td>
      </tr>
      <tr>
       <td align="center" valign="top" class="td04"><font color="blue">角色列表</font></td>
       <td width="130" align="center" class="td04"></td>
       <td align="center" class="td04"><font color="blue">已拥有角色</font></td>
      </tr>
    <tr>
      <td align="center" valign="top" class="td04"><select size="14" multiple style="WIDTH: 15em" name="rolesNotOwned" multiple="multiple">
      <c:forEach items="${rolesNotOwned}" var="role">
      <option value="${role.roleId}">${role.rname}</option>
      </c:forEach>
      </select></td>
      <td width="130" align="center" class="td04">
      <input  type=button  class="buttonface02" value="  添加角色  " id="add">  
      <br> 
     <input  type=button class="buttonface02"  value="  移除角色  " id="remove" >   
     <br>
      <br>
      <br>
	  <INPUT type=button class="buttonface02"  value="  上移  " id="up">
	  <br>
	  <INPUT type=button class="buttonface02"  value="  下移  " id="down">      
      <br>
      <br>
      </td>
      <td align="center" class="td04"><select  size=14  name="rolesOwned"  style="WIDTH: 15em"  multiple="multiple">
      <c:forEach items="${rolesOwned}" var="role">
      <option value="${role.roleId}">${role.rname}</option>
      </c:forEach>
      </select>
       </td>
      </tr>
  </table>

</form>
    <table width="95%"  border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><input id="submit" type="button" class="buttonface02" value="  保存  ">
      <input name="Submit" type="button" class="buttonface02" value="  返回 " onclick="history.back()">
      </td>
    </tr>
  </table>
</center>

<script type="text/javascript">
	$("#add").click(function(){
		$("select:eq(0) option:selected").appendTo($("select:eq(1)"));
	});
	$("#remove").click(function(){
		$("select:eq(1) option:selected").appendTo($("select:eq(0)"));
	});
	$("#submit").click(function(){
		var roles=[];
		var opts=$("select:eq(1) option");
		for(var i=0;i<opts.length;i++){
			roles.push($(opts[i]).val());
		}
		alert("保存成功！");
		window.location="/emps/grantRoles?eid="+${eid}+"&roles="+roles;
	})
</script>
</body>
</html>