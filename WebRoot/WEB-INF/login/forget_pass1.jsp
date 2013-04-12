<%@ page contentType="text/html;charset=gbk" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
<title>Easy Buy Online</title>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
.STYLE10 {
	font-size: 14px;
	color: #FF0000;
}
.STYLE3 {color: #FFFFFF}
-->
</style>
<script language="javascript">
	var flg = false;
	$(function() {
		$('#name').blur(function() {
			if(checkName()) {
				var name = $.trim($('#name').val());
				$.ajax({
				'url':'validName',
				'type':'post',
				'data': {'name':name},
				'dataType':'text',
				'success':function(data) {
					if(data=='yes') {
						$('#tips').hide();
						flg = true;
					}else {
						$('#tips').show();
						$('#name').val('');
						flg = false;
					}
				},
				'error':function(xhr) {
					alert('系统异常，稍后重试');
					$('#tips').hide();
					flg = true;
				}
			});
			}
		});
	});
	function checkName() {
		var name = $.trim($('#name').val());
		if(name=='') {
			alert('请输入用户名');
			return false;
		}
		return true;
	}
	function validName() {
		if(flg) {
			return true;
		}
		return false;
	}
</script>
</head>

<body>
<center>
<form name="nameForm" id="nameForm" action="/ebuy/initPass" method="post" onSubmit="return validName();">
<table width="782" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td height="40" colspan="3" align="center"><span class="STYLE10">eBuy电子商务系统－－密码查询</span> </td>
  </tr>
  <tr>
    <td height="20" colspan="3" align="center"><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
  <tr>
    <td width="322" align="right"><span class="STYLE1">请输入您的用户名</span>：</td>
	<td width="195" height="34" align="left"><input type="text" name="name" id="name" value="" /></td>
    <td width="265" align="left"><input name="Submit" id="submit" type="submit" class="STYLE1" value=" 确定 "  /></td>
  </tr>
  <tr id="tips" style="display:none" >
  	<td height="40" colspan="3" align="center"><span id="nameTips" class="STYLE10">此用户名不存在，请重新输入</span></td>
  </tr>
  <tr>
    <td height="34" colspan="3" align="left"><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
</table>
</form>
</center>
</body>
</html>
