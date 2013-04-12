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
	//����û�����ʽ
	function checkName() {
		var name = $('#name').val();
		if(name=='') {
			$('#nameTips').replaceWith('<span id="nameTips" class="STYLE3">����д�û���</span>');
			return false;
		}
		if(name.length>20 || name.length<4) {
			$('#nameTips').replaceWith('<span id="nameTips" class="STYLE3">�û������Ȳ����Ϲ淶����������д</span>');
			return false;
		}
		$('#nameTips').replaceWith('<span id="nameTips" class="STYLE3">�����û����Ƿ��Ѿ���ʹ��</span>');
		return true;
	}
	//��������ʽ
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
	//�ظ������Ƿ���ȷ
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
	//��֤�ֻ��Ÿ�ʽ
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
	//��֤��ʾ�����Ƿ���ѡ��
	function checkQuestion() {
		var question = $('#question').val();
		if(question=='') {
			$('#quesTips').show();
			return false;
		}
		$('#quesTips').hide();
		return true;
	}
	//��֤������Ƿ�����д
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
	//��֤�����ʽ
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
	//�첽��ѯ�û����Ƿ��ѱ�ע��
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
						$('#nameTips').replaceWith('<span id="nameTips" class="STYLE3">���û����ѱ�ע�ᣬ�����һ��</span>');
						validFlg = false;
					}else {
						$('#nameTips').replaceWith('<span id="nameTips" class="STYLE3">��ϲ�㣬���û�����δ����ע��</span>');
						validFlg = true;
					}
				},
				'error':function(xhr) {
					alert('ϵͳ�쳣���Ժ�����');
					validFlg = false;
				}
			});
		}
	}
	//ע���ύ����
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
					<span class="style66">�û�ע��</span>
				</td>
			</tr>
			<tr>
				<td width="233" height="30" align="right" bgcolor="#99CCFF">
					<span class="STYLE1">�û���</span>:&nbsp;
				</td>
				<td width="543" align="left" valign="middle" bgcolor="#99CCFF">
					&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="text" name="name" id="name"/>
					<span class="STYLE3">*</span>
					<input type="button" id="valid" class="STYLE1" value="����û���" />
					<span class="STYLE1">����������ֻ������ַ������ȣ�</span><span class="STYLE3">6-20</span><span
						class="STYLE1">��</span>
				</td>
			</tr>
			<tr>
				<td height="30" colspan="2" align="center">
					<span id="nameTips" class="STYLE3">�����û����Ƿ��Ѿ���ʹ��</span>
				</td>
			</tr>
		</table>
		<br/>
		<table width="782" border="1" bordercolor="#99CCFF" cellpadding="0"
			cellspacing="0" style="border-collapse: collapse">
			<!--DWLayoutTable-->
			<tr>
				<td width="31%" height="30" align="right">
					<span class="STYLE1">����</span>��&nbsp;
				</td>
				<td width="100%" height="30" align="left">
					&nbsp;&nbsp;&nbsp;
					<input type="password" name="pass" id="pass"/>
					<span class="STYLE3">*</span>
					<span id="pwdTips01" class="pwdTips">
						<span class="STYLE1">����������ֻ�����</span><span class="STYLE3">3-30</span><span class="STYLE1">�ַ���</span>
					</span>
					<span id="pwdTips02" style="display:none" class="STYLE3 pwdTips">����д����</span>
					<span id="pwdTips03" style="display:none" class="STYLE3 pwdTips">���볤�Ȳ����Ϲ淶����������д</span>
			</tr>
			<tr>
				<td height="30" align="right">
					<span class="STYLE1">ȷ������</span>��&nbsp;
				</td>
				<td height="30" align="left">
					&nbsp;&nbsp;&nbsp;
					<input type="password" name="pass2" id="pass2"/>
					<span class="STYLE3">*</span>
					<span id="rePwdTips02" style="display:none" class="STYLE3 rePwdTips">��ȷ������</span>
					<span id="rePwdTips03" style="display:none" class="STYLE3 rePwdTips">�����������벻һ�£�����������</span>
				</td>
			</tr>
			<tr>
				<td height="30" align="right">
					<span class="STYLE1">ͷ��ѡ��</span>��&nbsp;
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
					<img src="images\face\Image1.gif" alt=����������� name="avatar"
						width="32" height="32" id=avatar>
					<span class="STYLE3">*</span>
				</td>
			</tr>
			<tr>
				<td height="30" align="right">
					<span class="STYLE1">��ϵ�绰</span>��&nbsp;
				</td>
				<td height="30" align="left">
					&nbsp;&nbsp;&nbsp;
					<input type="text" name="phone" id="phone" />
					<span class="STYLE3">*</span>
					<span id="phoneTips01" class="phoneTips">
						<span class="STYLE1">����������д�������պ���ϵ��</span>
					</span>
					<span id="phoneTips02" style="display:none" class="STYLE3 phoneTips">����д�ֻ�����</span>
					<span id="phoneTips03" style="display:none" class="STYLE3 phoneTips">����һ����ȷ���ֻ�����</span>
				</td>
			</tr>
			<tr>
				<td height="30" align="right">
					<span class="STYLE1">������ʾ</span>��&nbsp;
				</td>
				<td height="30" align="left">
					&nbsp;&nbsp;&nbsp;
					<select name="question" id="question" >
						<option value="">
							-��ѡ������������ʾ-
						</option>
						<option value="����������˭��">
							����������˭��
						</option>
					</select>
					<span class="STYLE3">*</span>
					<span id="quesTips" style="display:none" class="STYLE3">��ѡ����ʾ����</span>
				</td>
			</tr>
			<tr>
				<td height="30" align="right">
					<span class="STYLE1">�����</span>��&nbsp;
				</td>
				<td height="30" align="left">
					&nbsp;&nbsp;&nbsp;
					<input type="text" name="answer" id="answer" />
					<span class="STYLE3">*</span>
					<span id="ansTips" style="display:none" class="STYLE3">����д�����</span>
				</td>
			</tr>
			<tr>
				<td height="30" align="right">
					<span class="STYLE1">���ڵ�ַ</span>��&nbsp;
				</td>
				<td height="30" align="left">
					&nbsp;&nbsp;&nbsp;
					<input type="text" name="address" size="30" id="address" />
				</td>
			</tr>
			<tr>
				<td height="30" align="right">
					<span class="STYLE1">E_mail</span>��&nbsp;
				</td>
				<td height="30" align="left">
					&nbsp;&nbsp;&nbsp;
					<input type="text" name="email" size="30" id="email" />
					<span class="STYLE3">*</span>
					<span id="emailTips01" class="emailTips">
						<span class="STYLE1">����  hnrptc@163.com��</span>
					</span>
					<span id="emailTips02" style="display:none" class="STYLE3 emailTips">����д����</span>
					<span id="emailTips03" style="display:none" class="STYLE3 emailTips">����һ����ȷ�����䣬��������д</span>
				</td>
			</tr>
			<tr>
				<td height="35" colspan="2" align="center">
					<input type="button" id="submitReg" value=" �ύ " />
					&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="button" value=" ���� " onclick="history.go(-1);" />
				</td>
			</tr>
		</table>
	</form>
</center>


