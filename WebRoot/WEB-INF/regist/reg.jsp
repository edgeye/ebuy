<%@ page contentType="text/html;charset=gbk"%>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script language="javascript">
	$(function() {
		$('#name').blur(function () {
			checkName();
		});
		$('#pass').blur(function() {
			checkPwd();
		});
		$('#pass2').blur(function() {
			checkRePwd();
		});
		$('#phone').blur(function() {
			checkPhone();
		});
		$('#question').blur(function() {
			checkQuestion();
		});
		$('#answer').blur(function() {
			checkAnswer();
		});
		$('#email').blur(function() {
			checkEmail();
		});
		$('#submitReg').click(function() {
			submitReg();
		});
		$('#valid').click(function() {
			validName();
		});
	});
	//检测用户名格式
	function checkName() {
		var name = $('#name').val();
		if(name=='') {
			$('#nameTips').replaceWith('<span id="nameTips" class="STYLE3">请填写用户名</span>');
			return false;
		}
		if(name.length>20 || name.length<4) {
			$('#nameTips').replaceWith('<span id="nameTips" class="STYLE3">用户名长度不符合规范，请重新填写</span>');
			return false;
		}
		$('#nameTips').replaceWith('<span id="nameTips" class="STYLE3">请检测用户名是否已经被使用</span>');
		return true;
	}
	//检测密码格式
	function checkPwd() {
		var pwd = $('#pass').val();
		if(pwd=='') {
			$('.pwdTips').hide();
			$('#pwdTips02').show();
			return false;
		}else if(pwd.length<3 || pwd.length>30) {
			$('.pwdTips').hide();
			$('#pwdTips03').show();
			return false;
		}else {
			$('.pwdTips').hide();
			$('#pwdTips01').show();
		}
		return true;
	}
	//重复密码是否正确
	function checkRePwd() {
		var repwd = $('#pass2').val();
		var pwd = $('#pass').val();
		if(repwd=='') {
			$('.rePwdTips').hide();
			$('#rePwdTips02').show();
			return false;
		}else if(repwd!=pwd) {
			$('.rePwdTips').hide();
			$('#rePwdTips03').show();
			return false;
		}else {
			$('.rePwdTips').hide();
		}
		return true;
	}
	//验证手机号格式
	function checkPhone() {
		var phone = $('#phone').val();
		var reg = /^(130|131|132|133|134|135|136|137|138|139|150|153|156|158|159|188|189)\d{8}$/;
		if(phone=='') {
			$('.phoneTips').hide();
			$('#phoneTips02').show();
			return false;
		}else if(!reg.test(phone)) {
			$('.phoneTips').hide();
			$('#phoneTips03').show();
			return false;
		}else {
			$('.phoneTips').hide();
			$('#phoneTips01').show();
		}
		return true;
	}
	//验证提示问题是否已选择
	function checkQuestion() {
		var question = $('#question').val();
		if(question=='') {
			$('#quesTips').show();
			return false;
		}
		$('#quesTips').hide();
		return true;
	}
	//验证问题答案是否已填写
	function checkAnswer() {
		var answer = $('#answer').val();
		if(answer=='') {
			$('#ansTips').show();
			return false;
		}else {
			$('#ansTips').hide();
		}
		return true;
	}
	//验证邮箱格式
	function checkEmail() {
		var email = $('#email').val();
		var reg = /^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\.[a-zA-Z0-9_-]{2,3}){1,2})$/;
		if(email=='') {
			$('.emailTips').hide();
			$('#emailTips02').show();
			return false;
		}else if(!reg.test(email)) {
			$('.emailTips').hide();
			$('#emailTips03').show();
			return false;
		}else {
			$('.emailTips').hide();
			$('#emailTips01').show();
		}
		return true;
	}
	//异步查询用户名是否已被注册
	var validFlg = false;
	function validName() {
		var name = $('#name').val();
		if(checkName()) {
			$.ajax({
				'url':'validName',
				'type':'post',
				'data': {'name':name},
				'dataType':'text',
				'success':function(data) {
					if(data=='yes') {
						$('#nameTips').replaceWith('<span id="nameTips" class="STYLE3">该用户名已被注册，请更换一个</span>');
						validFlg = false;
					}else {
						$('#nameTips').replaceWith('<span id="nameTips" class="STYLE3">恭喜你，此用户名还未有人注册</span>');
						validFlg = true;
					}
				},
				'error':function(xhr) {
					alert('系统异常，稍后重试');
					validFlg = false;
				}
			});
		}
	}
	//注册提交函数
	function submitReg() {
		var flg = checkEmail()&checkAnswer()&checkQuestion()&checkPhone()&checkName()&checkPwd()&checkRePwd();
		if(validFlg) {
			if(flg==1) {
				$('#registForm').attr('action', '/ebuy/submitReg');
				$('#registForm').attr('method', 'post');
				$('#registForm').submit();
			}
		}
	}
</script>
<link rel="stylesheet" href="css/regist.css" type="text/css" />

<center>
	<form name="registForm" id="registForm">
		<table width="782" border="1" bordercolor="#99CCFF"
			style="border-collapse: collapse" cellpadding="0" cellspacing="0">
			<tr>
				<td height="30" colspan="2" align="center">
					<span class="style66">用户注册</span>
				</td>
			</tr>
			<tr>
				<td width="233" height="30" align="right" bgcolor="#99CCFF">
					<span class="STYLE1">用户名</span>:&nbsp;
				</td>
				<td width="543" align="left" valign="middle" bgcolor="#99CCFF">
					&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="text" name="name" id="name"/>
					<span class="STYLE3">*</span>
					<input type="button" id="valid" class="STYLE1" value="检测用户名" />
					<span class="STYLE1">（任意的数字或者是字符，长度（</span><span class="STYLE3">6-20</span><span
						class="STYLE1">）</span>
				</td>
			</tr>
			<tr>
				<td height="30" colspan="2" align="center">
					<span id="nameTips" class="STYLE3">请检测用户名是否已经被使用</span>
				</td>
			</tr>
		</table>
		<br/>
		<table width="782" border="1" bordercolor="#99CCFF" cellpadding="0"
			cellspacing="0" style="border-collapse: collapse">
			<!--DWLayoutTable-->
			<tr>
				<td width="31%" height="30" align="right">
					<span class="STYLE1">密码</span>：&nbsp;
				</td>
				<td width="100%" height="30" align="left">
					&nbsp;&nbsp;&nbsp;
					<input type="password" name="pass" id="pass"/>
					<span class="STYLE3">*</span>
					<span id="pwdTips01" class="pwdTips">
						<span class="STYLE1">（任意的数字或者是</span><span class="STYLE3">3-30</span><span class="STYLE1">字符）</span>
					</span>
					<span id="pwdTips02" style="display:none" class="STYLE3 pwdTips">请填写密码</span>
					<span id="pwdTips03" style="display:none" class="STYLE3 pwdTips">密码长度不符合规范，请重新填写</span>
			</tr>
			<tr>
				<td height="30" align="right">
					<span class="STYLE1">确认密码</span>：&nbsp;
				</td>
				<td height="30" align="left">
					&nbsp;&nbsp;&nbsp;
					<input type="password" name="pass2" id="pass2"/>
					<span class="STYLE3">*</span>
					<span id="rePwdTips02" style="display:none" class="STYLE3 rePwdTips">请确认密码</span>
					<span id="rePwdTips03" style="display:none" class="STYLE3 rePwdTips">密码两次输入不一致，请重新输入</span>
				</td>
			</tr>
			<tr>
				<td height="30" align="right">
					<span class="STYLE1">头像选择</span>：&nbsp;
				</td>
				<td height="30" align="left">
					&nbsp;&nbsp;&nbsp;
					<select name="header" size=1
						onChange="document.images['avatar'].src=options[selectedIndex].value;">
						<option value="images\face\Image1.gif">
							Image1
						</option>
						<option value="images\face\Image2.gif">
							Image2
						</option>
					</select>
					&nbsp;&nbsp;
					<img src="images\face\Image1.gif" alt=个人形象代表 name="avatar"
						width="32" height="32" id=avatar>
					<span class="STYLE3">*</span>
				</td>
			</tr>
			<tr>
				<td height="30" align="right">
					<span class="STYLE1">联系电话</span>：&nbsp;
				</td>
				<td height="30" align="left">
					&nbsp;&nbsp;&nbsp;
					<input type="text" name="phone" id="phone" />
					<span class="STYLE3">*</span>
					<span id="phoneTips01" class="phoneTips">
						<span class="STYLE1">（请认真填写，方便日后联系）</span>
					</span>
					<span id="phoneTips02" style="display:none" class="STYLE3 phoneTips">请填写手机号码</span>
					<span id="phoneTips03" style="display:none" class="STYLE3 phoneTips">不是一个正确的手机号码</span>
				</td>
			</tr>
			<tr>
				<td height="30" align="right">
					<span class="STYLE1">问题提示</span>：&nbsp;
				</td>
				<td height="30" align="left">
					&nbsp;&nbsp;&nbsp;
					<select name="question" id="question" >
						<option value="">
							-请选择您的问题提示-
						</option>
						<option value="你男朋友是谁？">
							你男朋友是谁？
						</option>
					</select>
					<span class="STYLE3">*</span>
					<span id="quesTips" style="display:none" class="STYLE3">请选择提示问题</span>
				</td>
			</tr>
			<tr>
				<td height="30" align="right">
					<span class="STYLE1">问题答案</span>：&nbsp;
				</td>
				<td height="30" align="left">
					&nbsp;&nbsp;&nbsp;
					<input type="text" name="answer" id="answer" />
					<span class="STYLE3">*</span>
					<span id="ansTips" style="display:none" class="STYLE3">请填写问题答案</span>
				</td>
			</tr>
			<tr>
				<td height="30" align="right">
					<span class="STYLE1">所在地址</span>：&nbsp;
				</td>
				<td height="30" align="left">
					&nbsp;&nbsp;&nbsp;
					<input type="text" name="address" size="30" id="address" />
				</td>
			</tr>
			<tr>
				<td height="30" align="right">
					<span class="STYLE1">E_mail</span>：&nbsp;
				</td>
				<td height="30" align="left">
					&nbsp;&nbsp;&nbsp;
					<input type="text" name="email" size="30" id="email" />
					<span class="STYLE3">*</span>
					<span id="emailTips01" class="emailTips">
						<span class="STYLE1">（如  hnrptc@163.com）</span>
					</span>
					<span id="emailTips02" style="display:none" class="STYLE3 emailTips">请填写邮箱</span>
					<span id="emailTips03" style="display:none" class="STYLE3 emailTips">不是一个正确的邮箱，请重新填写</span>
				</td>
			</tr>
			<tr>
				<td height="35" colspan="2" align="center">
					<input type="button" id="submitReg" value=" 提交 " />
					&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="button" value=" 返回 " onclick="history.go(-1);" />
				</td>
			</tr>
		</table>
	</form>
</center>


