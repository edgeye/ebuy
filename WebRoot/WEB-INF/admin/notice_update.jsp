<%@ page contentType="text/html;charset=gb2312" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<style type="text/css">
<!--
.STYLE1 {font-size: 12px}
.STYLE2 {
	font-size: 14px;
}
-->
</style>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script>
	$(function() {
		$('#update').click(function() {
			update();
		});
	});
	
	function checkMessage() {
		var message = $('#message').val();
		if(message=='') {
			alert('公告内容不能为空');
			return false;
		}
		return true;
	}
	function update() {
		if(checkMessage()) {
			$('#updateForm').attr('action', '/ebuy/confirmUpdateNotice?id=${notice.id}');
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
        <td height="30" colspan="3" align="center" bgcolor="#99CCFF"><span class="STYLE2">公告发布</span></td>
      </tr>
      <tr>
        <td height="14" colspan="3">&nbsp;</td>
      </tr>
      
      <tr>
        <td width="127" height="109" align="center"><p><img src="${notice.header}" width="50" height="50" /></p>
        <p><span class="STYLE1"></span></p></td>
        
        <td width="367" align="left"><textarea name="message" id="message" rows="8" cols="45">${notice.message}</textarea></td>
      </tr>
      <tr>
        <td height="14" colspan="2" align="center"><!--DWLayoutEmptyCell-->&nbsp;</td>
      </tr>
      
      <tr>
        <td height="35" colspan="3" align="center"><input name="update" id="update" type="button" class="STYLE1" value=" 修改 " />
&nbsp;          <input type="reset" class="STYLE1" onclick="history.go(-1);" value=" 返回 " /></td>
      </tr>
    </table>
  </form>
</center>
