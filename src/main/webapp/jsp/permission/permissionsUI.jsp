<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/commons/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>权限管理</title>
<script type="text/javascript" language="JavaScript1.2" src="../../js/stm31.js"></script>
<SCRIPT language=javascript src="../../js/tree2.js"></SCRIPT>
<link href="../../css/style.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="/zTree_v3/css/zTreeStyle/zTreeStyle.css" />
<script src="/zTree_v3/js/jquery.ztree.all.min.js"></script>
</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
	<center>
		<br> <br> <br>
		<table width="95%" border="0" cellspacing="2" cellpadding="0">
			<tr>
				<td class="td_title" align="center"><h2>权限信息维护</h2></td>
			</tr>
		</table>
		<br> <br>
		<table border="0" cellspacing="0" cellpadding="0" width="480"
			height="350" id=mainTable class="main_tab">
			<tbody style="display: block;">
				<tr>
					<td align="center" valign=top><table width="480" border="0"
							cellspacing="0" cellpadding="0">
							<tr>
								<td height="30" align="right" valign="bottom">
									<a href="/permissions/saveUI"><input id="btn_submit" type="submit" class="buttonface" value="  新增权限 "></a>
									</td>
							</tr>
							<tr>
							<td>
							<ul id="ztree" class="ztree"></ul>
							</td>
							</tr>
						</table>
		</table>
		<br>
	</center>
	<script>
		$(function() {

			var setting = {
					data: {
						simpleData: {
							enable:true,
							pIdKey:"parentId",
							idKey:"permissionId"
						},
						key: {
							name:"permissionContent"
						}
					},
					edit: {
						enable:true
					},
					callback: {
						beforeRemove: function(treeId, treeNode) {
							if(treeNode.isParent) {
								alert("不能删除父节点");
								return false;
							}
							var result = confirm("确认要删除吗？");
							if(!result){
								return false;
							}
							return true;
						},
						onRemove: function(event, treeId, node) {
							window.location = "/permissions/delete/" +node.permissionId;
						},
						onRename: function(event, treeid, node) {
							window.location = "/permissions/update?permissionId="+node.permissionId+"&permissionContent="+node.permissionContent;
						}
					}
			};

			var nodes = ${treejson};
			
			var ztree = $.fn.zTree.init($("#ztree"), setting, nodes);

			ztree.expandAll(true);
		});
	</script>
</body>
</html>