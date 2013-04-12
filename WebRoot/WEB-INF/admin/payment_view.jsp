<%@ page contentType="text/html;charset=gb2312" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
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
		$('#update').click(function() {
			update();
		});
	});
	
	function checkWay() {
		var way = $('#way').val();
		if(way=='') {
			alert('');
			return false;
		}
		return true;
	}
	function checkMsg() {
		var msg = $('#msg').val();
		if(msg=='') {
			alert('');
			return false;
		}
		return true;
	}
	
	function validProps() {
		if(!checkWay()) return false;
		if(!checkMsg()) return false;
		return true;
	}
	
	function update() {
		if(validProps()) {
			$('#updateForm').attr('action', '/ebuy/confirmUpdatePayment?id=${payment.id}');
			$('#updateForm').attr('method', 'post');
			$('#updateForm').submit();
		}
	}
</script>
<center>
<form name="updateForm" id="updateForm">
<table width="520" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td height="35" colspan="2" align="center" valign="middle" bgcolor="#99CCFF" class="STYLE2">查看/修改支付方式</td>
  </tr>
  <tr>
    <td width="163" height="40" align="right"><span class="STYLE1">支付方式</span>：</td>
    <td width="351" align="left"><input type="text" name="way" id="way" value="${payment.way}" /></td>
    </tr>
  <tr>
    <td height="76" align="right"><span class="STYLE1">备注</span>：</td>
    <td align="left"><label>
      <textarea name="msg" id="msg" cols="30" rows="6" wrap="hard">${payment.msg}</textarea>
    </label></td>
    </tr>
  <tr>
    <td height="35" colspan="2" align="center"><input type="button" name="update" id="update" class="STYLE1" value=" 修改 " />&nbsp;<input type="button" class="STYLE1" value=" 返回 " onclick="history.go(-1);" /></td>
  </tr>
</table>
</form>
</center>
