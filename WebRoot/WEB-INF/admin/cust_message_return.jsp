<%@ page contentType="text/html;charset=gb2312" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<style type="text/css">
<!--
.STYLE1 {font-size: 12px}
.STYLE2 {font-size: 14px}
-->
</style>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script>
	$(function() {
		$('#reply').click(function() {
			reply();
		});
	});
	
	function checkMessage() {
		var message = $('#message').val();
		if(message=='') {
			alert('');
			return false;
		}
		return true;
	}
	
	function reply() {
		if(checkMessage()) {
			$('#replyForm').attr('action', '/ebuy/confirmReplyMessage?id=${idea.id}');
			$('#replyForm').attr('method', 'post');
			$('#replyForm').submit();
		}
	}
</script>


<center>
<form name="replyForm" id="replyForm">
<table width="520" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <!--DWLayoutTable-->
      <tr>
        <td height="30" colspan="3" align="center" bgcolor="#99CCFF"><span class="STYLE2">回复意见和建议</span></td>
      </tr>
      <tr>
        <td height="14" colspan="3">&nbsp;</td>
      </tr>
      
      <tr>
        <td width="127" height="150" align="center"><p><img src="<s:property value='#session.admin.header'/>" width="50" height="50" /></p><p><span class="STYLE1"></span></p></td>
        
        <td width="367" rowspan="2" align="left"><textarea name="message" id="message" rows="13" cols="50"></textarea></td>
      </tr>
      <tr>
        <td align="center"><span class="STYLE1">管理员</span></td>
      </tr>
      
      
      <tr>
        <td height="30" colspan="3" align="center"><input type="button" id="reply" name="reply" class="STYLE1" value="发表意见" />
&nbsp;          <input type="button" class="STYLE1" onclick="history.go(-1);" value=" 返回 " /></td>
      </tr>
    </table>
  </form>
</center>
