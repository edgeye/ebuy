<%@ page contentType="text/html;charset=gb2312" %>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
-->
</style>

<script>
	$(function() {
		$('#name').blur(function() {
			checkName();
		});
		$('#search').click(function() {
			search();
		});
	});
	
	function checkName() {
		var name = $('#name').val();
		if(name=='') {
			alert('�������û���');
			return false;
		}
		return true;
	}
	
	
	function search() {
		if(checkName()) {
			$('#searchForm').attr('action', '/ebuy/queryCust');
			$('#searchForm').attr('method', 'post');
			$('#searchForm').submit();
		}
	}
	
</script>
</head>

<body>
<center>
<form name="searchForm" id="searchForm">
<table width="520" border="1" bordercolor="#99CCFF"  cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td height="14" bgcolor="#99CCFF">&nbsp;</td>
  </tr>
  <tr>
    <td height="30"><span class="STYLE1">&nbsp;������Ҫ��ѯ�ͻ����û���</span>��</td>
  </tr>
  <tr>
    <td height="30" align="center" valign="middle"><span class="STYLE1">�û���</span>��&nbsp;<input type="text" id="name" name="name"/>&nbsp;&nbsp;<input type="button" id="search" class="STYLE1" value=" ��ѯ " /></td>
    </tr>
  <tr>
    <td height="20" align="right"></td>
    </tr>
  <tr>
    <td height="14" bgcolor="#99CCFF">&nbsp;</td>
  </tr>
</table>
</form>
</center>
