<%@ page contentType="text/html;charset=gb2312" %>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
-->
</style>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script>
	$(function() {
		$('#query').click(function() {
			query();
		});
	});
	
	function checkName() {
		var name = $('#name').val();
		if(name=='') {
			alert();
			return false;
		}
		return true;
	}
	
	function query() {
		if(checkName()) {
			$('#queryForm').attr('action', '/ebuy/confirmQueryAdmin');
			$('#queryForm').attr('method', 'post');
			$('#queryForm').submit();
		}
	}
</script>

<body>
<center>
<form name="queryForm" id="queryForm">
<table width="520" border="1" bordercolor="#99CCFF"  cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr bgcolor="#99CCFF">
    <td height="14">&nbsp;</td>
  </tr>
  <tr>
    <td height="30"><span class="STYLE1">&nbsp;������Ҫ��ѯ�ͻ����û���</span>��</td>
  </tr>
  <tr>
    <td height="30" align="center" valign="middle"><span class="STYLE1">�û���</span>��&nbsp;
      <input type="text" name="name" id="name" />&nbsp;&nbsp;<input type="button" id="query" name="query" class="STYLE1" value=" ��ѯ " /></td>
    </tr>
  <tr>
    <td height="20" align="right"></td>
    </tr>
  <tr bgcolor="#99CCFF">
    <td height="14">&nbsp;</td>
  </tr>
</table>
</form>
</center>