<%@ page contentType="text/html;charset=gbk" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<style type="text/css">
<!--
.STYLE1 {font-size: 12px}
.STYLE2 {
	font-size: 14px;
}
.STYLE6 {font-size: 12px; color: #FF0000; }
-->
</style>
<script language="javascript">
	$(function() {
		$('#confirm').click(function() {
			submitLog();
		});
		$('#logout').click(function() {
			logout();
		});
	});
	function checkName() {
		var name = $.trim($('#name').val());
		if(name=='') {
			alert('�������û���');
			return false;
		}
		return true;
	}
	function checkPass() {
		var pass = $.trim($('#pass').val());
		if(pass=='') {
			alert('����������');
			return false;
		}
		return true;
	}
	function submitLog() {
		var name = $.trim($('#name').val());
		var pass = $.trim($('#pass').val());	
		if(checkName()) {
			if(checkPass()) {
				$('#loginForm').attr('action', '/ebuy/login');
				$('#loginForm').attr('method', 'post');
				$('#loginForm').submit();
			/**
				$.ajax({
				'url':'login',
				'type':'post',
				'data': {'name':name, 'pass':pass},
				'dataType':'text',
				'success':function(data) {
					if(data=='yes') {
						$('#log1').hide();
						$('#log2').show();
					}else {
						$('#log1').show();
						$('#log2').hide();
					}
				},
				'error':function(xhr) {
					alert('ϵͳ�쳣���Ժ�����');
				}
			});
			*/
			}
		}
	}
	/**
	function logout() {
		$.ajax({
			'url':'logout',
			'type':'post',
			'dataType':'text',
			'success':function(data) {
				if(data=='out') {
					alert(44);
					$('#log1').show();
					$('#pass').val('');
					$('#log2').hide();
				}
			},
			'error':function(xhr) {
				alert('ϵͳ�쳣���Ժ�����');
			}
		});
	}
	*/
</script>
<s:if test="#session.customer==null">
<div id="log1">
<form name="loginForm" id="loginForm">
    <table width="180" border="0" cellpadding="0" cellspacing="0" bordercolor="#99CCFF" bgcolor="#eeeeee" style="border-collapse:collapse">
      <!--DWLayoutTable-->
      <tr>
        <td height="30" colspan="2" align="center" valign="middle" background="images/logo/back.gif"><span class="STYLE2">�û���¼</span></td>
      </tr>
      <tr>
        <td height="14" colspan="2" align="right" valign="middle"><!--DWLayoutEmptyCell-->&nbsp;</td>
      </tr>
      <tr>
        <td width="52" height="14" align="right" valign="middle"><span class="STYLE1">�û���&nbsp;</span></td>
        <td width="125" valign="top"><input type="text" id="name" name="name" size="14" /></td>
      </tr>
      <tr>
        <td height="14" align="right" valign="middle"><span class="STYLE1">��  &nbsp;��&nbsp;</span></td>
        <td height="14" valign="top"><input type="password" id="pass" name="pass" size="14" /></td>
      </tr>
      <tr>
        <td height="30" colspan="2" align="center" valign="middle"><font size="2"><a href="/ebuy/forgetPass">��������?</a>  </font><input type="button" id="confirm" class="STYLE1" value="ȷ��" />&nbsp;<input type="button" id="regist" class="STYLE1" value="ע��" onClick="window.location.href='/ebuy/initReg'"/></td>
      </tr>
  </table>
</form>
</div>
</s:if>
<s:else>
<div id="log2" style="">
		<table width="180" border="0" cellpadding="0" cellspacing="0" bordercolor="#99CCFF" bgcolor="#eeeeee" style="border-collapse:collapse">
      <tr>
        <td height="30" colspan="2" align="center" valign="middle" background="images/logo/back.gif"><span class="STYLE2">�û���Ϣ</span></td>
      </tr>
      <tr>
        <td height="25" colspan="2" align="center" valign="middle"><marquee scrolldelay="5" scrollamount="2" bgcolor="#FFFFFF" >
      <span class="STYLE1 STYLE6">��ӭ��¼eBuy�����̳�</span>
        </marquee></td>
        </tr>
      <tr>
        <td width="68" rowspan="5" align="right" valign="middle"><img src="<s:property value='#session.customer.header'/>" width="40" height="40" /><p><span class="STYLE1"></span></p></td>
        <td height="17" align="left" valign="top">&nbsp;&nbsp;<span class="STYLE1"><a href="/ebuy/checkCart">�ҵĹ��ﳵ</a></span></td>
      </tr>
      <tr>
        <td width="109" height="17" align="left" valign="top">&nbsp;&nbsp;<span class="STYLE1"><a href="/ebuy/viewOrder">�ҵĶ���</a></span></td>
      </tr>
      <tr>
        <td height="17" align="left">&nbsp;&nbsp;<span class="STYLE1"><a href="/ebuy/initMessage">�������</a></span></td>
      </tr>
      <tr>
        <td height="17" align="left">&nbsp;&nbsp;<span class="STYLE1"><a href="/ebuy/updateInfo">�޸��ҵ�����</a></span></td>
      </tr>
      <tr>
        <td rowspan="2" align="left">&nbsp;&nbsp;<span class="STYLE1"><a id="logout" href="/ebuy/logout">�� ��</a></span></td>
      </tr>
      <tr>
        <td height="14" align="center"></td>
        </tr>
      <tr>
        <td height="14" colspan="2" align="left">&nbsp;</td>
      </tr>
    </table>
</div>
</s:else>
