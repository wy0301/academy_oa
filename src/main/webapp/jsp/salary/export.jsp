<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/commons/head.jsp" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>薪资项导入</title>
<link href="../../../css/style.css" rel="stylesheet" type="text/css">
<script type="text/javascript" language="JavaScript1.2" src="../../../js/select.js"></script>
<script type="text/javascript" language="JavaScript1.2" src="../../../js/value.js"></script>
<SCRIPT language=JavaScript type=text/JavaScript>
function windowOpen(theURL,winName,features,width,hight,scrollbars,top,left) 
{
  var parameter="top="+top+",left="+left+",width="+width+",height="+hight;
  if(scrollbars=="no")
 {parameter+=",scrollbars=no";}
  else
 {parameter+=",scrollbars=yes";}
  window.open(theURL,winName,parameter);
}
</SCRIPT>
<SCRIPT  LANGUAGE="JavaScript">  
<!--  
function  exchange(v){  
           elm1=document.getElementsByName("s1")[v];  
           elm2=document.getElementsByName("s1")[1-v];  
           for  (var  i=elm1.length-1;i>-1;i--){  
                       op=elm1.options[i];  
                       if  (op.selected){  
                                   elm2.options[elm2.length]=new  Option(op.text,op.value);  
                                   elm1.options[i]=null;  
                       }  
           }  
}  
//-->  
</SCRIPT>  
</head>

<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<center>
  <table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td height="25" align="center" valign="bottom" class="td06"><table width="98%" border="0" cellspacing="3" cellpadding="0">
          <tr>
            <td width="15"><img src="../../../images/index_32.gif" width="9" height="9"></td>
            <td valign="bottom" class="title" >导入工资</td>
          </tr>
      </table></td>
    </tr>
  </table>
  <form name="form1" method="post" action="/salary/save" id="salForm" enctype="multipart/form-data">
  <table width="95%"  border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td width="90" class="td_form01">上传导入文件</td>
      <td class="td_form02">
        <input name="file" type="file" class="input2" size="60">
        </td>
    </tr>
    <tr>
      <td class="td_form01">选择导入时间</td>
      <td class="td_form02">
        <select name="select">
          <option>2000</option>
          <option>2001</option>
          <option>2002</option>
          <option>2003</option>
          <option>2004</option>
          <option>2005</option>
          <option>2006</option>
          <option>2007</option>
          <option>2008</option>
          <option>2009</option>
          <option>2010</option>
        </select>
年
<select name="select">
  <option>1</option>
  <option>2</option>
  <option>3</option>
  <option>4</option>
  <option>5</option>
  <option>6</option>
  <option>7</option>
  <option>8</option>
  <option>9</option>
  <option>10</option>
  <option>11</option>
  <option>12</option>
</select>
月</td>
    </tr>
  </table>
    <table width="95%"  border="0" cellpadding="0" cellspacing="0">
    <tr align="left">
      <td height="24" colspan="3" class="td_form01">&nbsp;&nbsp;选择导入项</td>
      </tr>
    <tr>
      <td align="center" valign="top" class="td04"><select size="14" multiple style="WIDTH: 15em" name=s1>
        <option>火补</option>
        <option>加班工资</option>
        <option>补工资</option>
        <option>扣班车费</option>
        <option>扣电话费</option>
        <option>其他扣款</option>
      </select></td>
      <td width="130" align="center" class="td04">
      <input  type=button  class="buttonface02" value="  添加  "  onclick="exchange(0)">  
      <br> 
     <input  type=button class="buttonface02"  value="  删除  "  onclick="exchange(1)">   
     <br>
      <br>
      <br>
	  <INPUT type=button class="buttonface02"  value="  上移  ">
	  <br>
	  <INPUT type=button class="buttonface02"  value="  下移  ">      
      <br>
      <br>
      </td>
      <td align="center" class="td04"><select  size=14  name=s1  style="WIDTH: 15em"  multiple></select>
        </td>
      </tr>
  </table>

</form>
    <table width="95%"  border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="center"><input name="Submit" type="submit" class="buttonface02" value="  确定  " id="salBut">
      </td>
    </tr>
  </table>
</center>
<script type="text/javascript">
	$(function() {
		$("#salBut").click(function() {
			$("#salForm").submit();
		})
	})
</script>
</body>
</html>