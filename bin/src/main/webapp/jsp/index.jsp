<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>社科院电子所系统登录</title>
<style type="text/css">
body {
	MARGIN: 0px;
	background-image: url();
}
.STYLE1 {font-size: 14px}
.STYLE2 {font-size: 15px}
</style>
<style type="text/css">
.div1{
	padding-left:30px;
	background:url(/images/1.png) 4px  no-repeat;
	background-color:#FFFFFF;
	width:140px;
	height:25px;
	line-height:25px;
	border:1px solid #ccc;
	}
	.div2{
	padding-left:30px;
	background:url(/images/2.png) 4px  no-repeat;
	background-color:#FFFFFF;
	width:140px;
	height:25px;
	line-height:25px;
	border:1px solid #ccc;
	}
input{
		border:0;
	font-size:18px;	
	}

</style>
</head>
<body>
<img src="/images/bg.jpg" width="100%" height="100%" style="z-index:-100;position:absolute;left:0;top:0">
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="200" align="center"><h1 style="color: #145A9E">社科院电子所务系统</h1>&nbsp;</td>
  </tr>
</table>
<form action="/emps/login" method="post" name="form_">
<table width="543" height="255" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td background="/images/kuang.png"><table width="320" border="0" align="center" cellpadding="0" cellspacing="15">
      <tr>
        <td width="25%"><span class="STYLE2">用户名：</span></td>
        <td width="75%"><div class="div1">
          <input name="oa_account" type="text" id="textfield"  style="height:22px;width:137px;outline:none; vertical-align:middle;" />
        </div></td>
      </tr>
      <tr>
        <td width="25%"><span class="STYLE2">密　码：</span></td>
        <td width="75%"><div class="div2">
          <input name="oa_password" type="password" id="textfield2" style="height:22px;width:137px;outline:none;vertical-align:middle;"/>
        </div></td>
      </tr>
      <tr>
        <td colspan="2"><div align="center"><a href="javascript:;" onclick="form_.submit()"><img src="/images/login.jpg" width="81" height="26" /></a></div></td>
        </tr>
    </table></td>
  </tr>
</table>
</form>
<table width="100%" height="140" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td height="26"><div align="center" class="STYLE1">版权信息　备案信息</div></td>
  </tr>
</table>
</body>
</html>