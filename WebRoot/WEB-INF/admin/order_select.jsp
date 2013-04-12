<%@ page contentType="text/html;charset=gb2312" %>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
.STYLE2 {font-size:14px;}
-->
</style>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script>
	$(function() {
		$('#search').click(function() {
			search();
		});
	});
	
	function checkId() {
		var id = $('#itemid').val();
		if(id=='') {
			alert('');
			return false;
		}
		return true;
	}
	
	function search() {
		if(checkId()) {
			$('#searchForm').attr('action', '/ebuy/confirmSearchOrder');
			$('#searchForm').attr('method', 'post');
			$('#searchForm').submit();
		}
	}
</script>

<body>
<center>
<form name="searchForm" id="searchForm">
<table width="520" border="1" bordercolor="#99CCFF"  cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr bgcolor="#99CCFF">
    <td height="14">&nbsp;</td>
  </tr>
  <tr>
    <td height="30"><span class="STYLE1">&nbsp;请输入要查询订单号码</span>：</td>
  </tr>
  <tr>
    <td height="30" align="center" valign="middle"><span class="STYLE1">订单号</span>：&nbsp;
      <input type="text" name="itemid" id="itemid"/>&nbsp;&nbsp;<input type="button" name="search" id="search" class="STYLE1" value=" 查询 " /></td>
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