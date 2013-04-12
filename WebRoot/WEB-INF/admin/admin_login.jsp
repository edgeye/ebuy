<%@ page contentType="text/html;charset=gb2312" %>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
.STYLE2 {
	font-size: 14px;
	color: #333333;
}
.STYLE4 {
	font-size: 24px;
	color: #FF0000;
	font-family: "创艺简行楷";
}
-->
</style>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script>
	$(function() {
		$('#login').click(function() {
			login();
		});
	});
	
	function checkName() {
		var name = $('#name').val();
		if(name=='') {
			alert('请填写用户名');
			return false;
		}
		return true;
	}
	function checkPass() {
		var pass = $('#pass').val();
		if(pass=='') {
			alert('请输入密码');
			return false;
		}
		return true;
	}
	
	function validProps() {
		if(!checkName()) return false;
		if(!checkPass()) return false;
		return true;
	}
	
	function login() {
		if(validProps()) {
			$('#loginForm').attr('action', '/ebuy/checkAdminLogin');
			$('#loginForm').attr('method', 'post');
			$('#loginForm').submit();
		}
	}
</script>

<center>
<table width="233" border="1" bordercolor="#99CCFF" style="border-collapse:collapse" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td width="233" height="30" bgcolor="#99CCFF">&nbsp;</td>
  </tr>
  <tr>
    <td height="51"><form name="loginForm" id="loginForm">
<table width="409" border="0" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td height="40" colspan="2" align="center" bgcolor="#eeeeee"><span class="STYLE4">eBuy电子商城 —— 后台登录</span></td>
    </tr>
  <tr>
    <td width="146" height="30" align="right"><span class="STYLE2">帐号</span>：</td>
    <td width="263" align="left" valign="middle">&nbsp;<input type="text" name="name" id="name" size="20" /></td>
  </tr>
  <tr>
    <td width="146" height="30" align="right"><span class="STYLE2">密码</span>：</td>
    <td height="30" align="left" valign="middle">&nbsp;<input type="password" name="pass" id="pass" size="21" /></td>
  </tr>
  <tr>
    <td height="30" align="right">&nbsp;</td>
    <td height="30" align="center">&nbsp;<input name="login" id="login" type="button" class="STYLE1" value=" 确定 " /></td>
  </tr>
</table>
</form></td>
  </tr>
</table>
</center>

