<%@ page contentType="text/html;charset=gb2312" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
.STYLE2 {font-size: 14px;}
.STYLE3 {
	font-size: 14px;
	color: #FF0000;
}
-->
</style>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script>
	$(function() {
		$('#search').click(function() {
			search();
		});
	});
	
	function checkName() {
		var name = $('#name').val();
		if(name=='') {
			alert('请输入商品名称');
			return false;
		}
		return true;
	}
	
	function search() {	
		if(checkName()) {
			$('#searchForm').attr('action', '/ebuy/confirmSearch');
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
  <tr bgcolor="#99CCFF">
    <td height="14">&nbsp;</td>
  </tr>
  <tr>
    <td height="30">&nbsp;<span class="STYLE1">请输写以下信息</span><span class="STYLE4">：</span></td>
  </tr>
  <tr>
    <td height="30" align="left" valign="middle"><span class="STYLE1">&nbsp;类型</span>：
      <select name="type">
	  	<s:iterator value="mainTypes">
	    	<option value="${type}">${type}</option>
    	</s:iterator>
      </select>
      &nbsp;
      <span class="STYLE1">商品名称</span>：
      <input type="text" id="name" name="name" size="10"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="button" id="search" class="STYLE1" value=" 查询 " /></td>
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
