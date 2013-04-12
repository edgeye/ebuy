<%@ page contentType="text/html;charset=gb2312" %>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script>
	$(function() {
		$('#send').click(function() {
			send();
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
	
	function send() {
		if(checkMessage()) {
			$('#sendForm').attr('action', '/ebuy/confirmSendNotice');
			$('#sendForm').attr('method', 'post');
			$('#sendForm').submit();
		}
	}
</script>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
.STYLE2 {
	font-size: 14px;
}
-->
</style>


<center>
<form name="sendForm" id="sendForm">
<table width="520" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <!--DWLayoutTable-->
      <tr>
        <td height="30" colspan="3" align="center" bgcolor="#99CCFF"><span class="STYLE2">公告发布</span></td>
      </tr>
      <tr>
        <td height="14" colspan="3">&nbsp;</td>
      </tr>
      
      <tr>
        <td width="127" height="124" align="center"><p><img src="" width="50" height="50" /></p><p></p></td>
        
        <td width="367" rowspan="2" align="left"><textarea name="message" id="message" rows="10" cols="50" wrap="off"></textarea></td>
      </tr>
      <tr>
        <td align="center"><span class="STYLE1">管理员</span></span></td>
      </tr>
      
      
      <tr>
        <td height="40" colspan="3" align="center"><input type="button" name="send" id="send" class="STYLE1" value="发表意见" />
&nbsp;          <input type="reset" class="STYLE1" onclick="history.go(-1);" value=" 返回 " /></td>
      </tr>
    </table>
  </form>
</center>
