<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/commons/head.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>薪资项导入</title>
<link href="../../../css/style.css" rel="stylesheet" type="text/css">
</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<center>
  <table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td height="25" align="center" valign="bottom" class="td06"><table width="98%" border="0" cellspacing="3" cellpadding="0">
          <tr>
            <td width="15"><img src="../../../images/index_32.gif" width="9" height="9"></td>
            <td valign="bottom" class="title">导入零补费及工资外收入</td>
          </tr>
      </table></td>
    </tr>
  </table>
  <form name="form_" method="post" action="/extraIncome/upload" enctype="multipart/form-data">
  <table width="95%"  border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td width="90" class="td_form01">上传导入文件</td>
      <td class="td_form02">
        <input name="file" type="file" class="input2" size="60" id="file">
      </td>
    </tr>
    <tr>
      <td class="td_form01">输入导入时间</td>
      <td class="td_form02">
      <input type="number" name="year" id="year"/>
        
年
	<select name="month" id="month">
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
				</select>

月</td>
    </tr>
    <tr>
    	<td class="td_form01">备注</td>
    	<td class="td_form02"><textarea cols="80" rows="4" name="remark"></textarea>
  </table>
    <br>

</form>
    <table width="95%"  border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right">        <input name="Submit" type="submit" class="buttonface02" value="  确定  " onclick="sub()">
      </td>
    </tr>
  </table>
</center>
<script type="text/javascript">
function sub(){
	var fileName = $("#file").val();
	if(fileName==""|$("#year").val()==""){
		alert("xls文件或年份不能为空！");
		return;
	}
	var sep = fileName.lastIndexOf(".");
	var suffix = fileName.substring(sep,fileName.length);
	if(suffix!=".xls"){
		alert("只能上传xls文件，您上传的文件类型为"+suffix+"，请重新上传");
		return;
	}
	form_.submit();
	alert("导入成功！");
}
</script>
</body>
</html>