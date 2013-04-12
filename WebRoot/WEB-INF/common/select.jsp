
<%@ page contentType="text/html; charset=gbk" language="java" import="java.sql.*" errorPage="" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<style type="text/css">
<!--
.STYLE1 {font-size: 12px}
body {
	margin-top: 0px;
}
-->
</style>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script language="javascript">
	$(function() {
		$('#search').click(function() {
			submitSearch();
		});
	});
	function checkType() {
		var type = $('#type').val();
		if(type=='') {
			alert('请选择商品类型');
			return false;
		}
		return true;
	}
	function submitSearch() {
		if(checkType()) {
			$('#searchForm').attr('action', '/ebuy/search');
			$('#searchForm').attr('method', 'post');
			$('#searchForm').submit();
		}
	}
</script>

<center>
<form id="searchForm" name="searchForm">
<table width="782" border="0" cellpadding="0" cellspacing="0"  bordercolor="#99CCFF" bgcolor="#99CCFF" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td width="122" height="44" align="right"><span class="STYLE1">类型</span>：</td>
    <td width="108"><select name="type">
	<option value="">-商品类型-</option>
	
	<s:iterator value="mainTypes">
    <option value="${type}">${type}</option>
    </s:iterator>
    
    </select></td>
    <td width="58" align="right"><span class="STYLE1">商品名</span>：</td>
    <td width="230"><input type="text" name="name" value="" size="30" /></td>
    <td width="156" bgcolor="#99CCFF"><input type="submit" id="search" name="Submit" value=" 搜索 " /></td>
  </tr>
</table>
</form>
</center>