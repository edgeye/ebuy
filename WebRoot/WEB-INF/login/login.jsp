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
			alert('请输入用户名');
			return false;
		}
		return true;
	}
	function checkPass() {
		var pass = $.trim($('#pass').val());
		if(pass=='') {
			alert('请输入密码');
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
					alert('系统异常，稍后重试');
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
				alert('系统异常，稍后重试');
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
        <td height="30" colspan="2" align="center" valign="middle" background="images/logo/back.gif"><span class="STYLE2">用户登录</span></td>
      </tr>
      <tr>
        <td height="14" colspan="2" align="right" valign="middle"><!--DWLayoutEmptyCell-->&nbsp;</td>
      </tr>
      <tr>
        <td width="52" height="14" align="right" valign="middle"><span class="STYLE1">用户名&nbsp;</span></td>
        <td width="125" valign="top"><input type="text" id="name" name="name" size="14" /></td>
      </tr>
      <tr>
        <td height="14" align="right" valign="middle"><span class="STYLE1">密  &nbsp;码&nbsp;</span></td>
        <td height="14" valign="top"><input type="password" id="pass" name="pass" size="14" /></td>
      </tr>
      <tr>
        <td height="30" colspan="2" align="center" valign="middle"><font size="2"><a href="/ebuy/forgetPass">忘记密码?</a>  </font><input type="button" id="confirm" class="STYLE1" value="确定" />&nbsp;<input type="button" id="regist" class="STYLE1" value="注册" onClick="window.location.href='/ebuy/initReg'"/></td>
      </tr>
  </table>
</form>
</div>
</s:if>
<s:else>
<div id="log2" style="">
		<table width="180" border="0" cellpadding="0" cellspacing="0" bordercolor="#99CCFF" bgcolor="#eeeeee" style="border-collapse:collapse">
      <tr>
        <td height="30" colspan="2" align="center" valign="middle" background="images/logo/back.gif"><span class="STYLE2">用户信息</span></td>
      </tr>
      <tr>
        <td height="25" colspan="2" align="center" valign="middle"><marquee scrolldelay="5" scrollamount="2" bgcolor="#FFFFFF" >
      <span class="STYLE1 STYLE6">欢迎登录eBuy电子商城</span>
        </marquee></td>
        </tr>
      <tr>
        <td width="68" rowspan="5" align="right" valign="middle"><img src="<s:property value='#session.customer.header'/>" width="40" height="40" /><p><span class="STYLE1"></span></p></td>
        <td height="17" align="left" valign="top">&nbsp;&nbsp;<span class="STYLE1"><a href="/ebuy/checkCart">我的购物车</a></span></td>
      </tr>
      <tr>
        <td width="109" height="17" align="left" valign="top">&nbsp;&nbsp;<span class="STYLE1"><a href="/ebuy/viewOrder">我的订单</a></span></td>
      </tr>
      <tr>
        <td height="17" align="left">&nbsp;&nbsp;<span class="STYLE1"><a href="/ebuy/initMessage">意见反馈</a></span></td>
      </tr>
      <tr>
        <td height="17" align="left">&nbsp;&nbsp;<span class="STYLE1"><a href="/ebuy/updateInfo">修改我的资料</a></span></td>
      </tr>
      <tr>
        <td rowspan="2" align="left">&nbsp;&nbsp;<span class="STYLE1"><a id="logout" href="/ebuy/logout">退 出</a></span></td>
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
