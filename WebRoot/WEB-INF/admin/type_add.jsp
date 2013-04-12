<%@ page contentType="text/html;charset=gb2312" %>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
.STYLE2 {font-size: 14px}
-->
</style>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script>
	$(function() {
		$('#add').click(function() {
			add();
		});
	});
	
	function checkType() {
		var type = $('#type').val();
		if(type=='') {
			alert('');
			return false;
		}
		return true;
	}
	
	function add() {
		if(checkType()) {
			$('#addForm').attr('action', '/ebuy/confirmAddType');
			$('#addForm').attr('method', 'post');
			$('#addForm').submit();
		}
	}
</script>
<center>
<form name="addForm" id="addForm">
<table width="520" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td height="35" colspan="3" align="center" bgcolor="#99CCFF"><span class="STYLE2">添加主面板</span></td>
  </tr>
  <tr>
    <td width="130" height="40" align="center"><span class="STYLE1">主面板名称</span>：</td>
    <td width="228" align="center"><input type="text" name="type" id="type" /></td>
    <td width="154" align="center"><input type="button" name="add" id="add" class="STYLE1" value=" 添加 " />&nbsp;<input type="button" class="STYLE1" value=" 返回 " onclick="history.go(-1);" /></td>
    </tr>
  <tr>
    <td colspan="3" align="right">&nbsp;</td>
  </tr>
</table>
</form>
</center>