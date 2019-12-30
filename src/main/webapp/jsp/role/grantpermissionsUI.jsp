<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/commons/head.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>角色管理</title>
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
				<td class="td_title" align="center"><h2>角色权限信息</h2></td>
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
								<input name="Submit" type="submit" class="buttonface" value="  全选  ">
									<input id="btn_submit" type="submit" class="buttonface"
									value="  保存  "> <input name="Submit" type="button"
									class="buttonface"
									onClick="parent.location.href='rolelist.htm'" value="  返回  ">
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
	<script type="text/javascript">
	$(function() {
		
		$("#btn_submit").click(function() {
			var checkedNodes = ztree.getCheckedNodes();
			var pids = [];
			var rid = ${roles.roleId};
			for(var i = 0; i < checkedNodes.length; i++) {
				pids.push(checkedNodes[i].permissionId);
			}

			window.location = "/roles/grantPermissions?rid="+rid+"&pids="+pids;
			alert("修改成功！");
		});
		
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
			check: {
				enable:true
			}
	};
	var nodes = ${treejson};
	var ztree = $.fn.zTree.init($("#ztree"), setting, nodes);
	ztree.expandAll(true);
	var hasPermissionList = ${hasPermissionsJson };
	var rootnodes = ztree.getNodes();
	var allnodes = ztree.transformToArray(rootnodes);
	for(var i = 0; i < allnodes.length; i++) {
		if(exists(hasPermissionList, allnodes[i].permissionId)) {
			ztree.checkNode(allnodes[i], true, false);
		}
	}


	function exists(arr, pid) {
		for(var i = 0; i < arr.length; i++) {
			if(arr[i].permissionId == pid) {
				return true;
			}
		}
		return false;
	}
	});
	</script>
</body>
</html>