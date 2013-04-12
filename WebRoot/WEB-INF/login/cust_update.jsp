<%@page contentType="text/html;charset=gbk"%>
<html>
<head><title>Easy Buy Online</title><meta http-equiv="Content-Type" content="text/html; charset=gbk"><style type="text/css">
<!--
a:link {
	text-decoration: none;
}
a:visited {
	text-decoration: none;
}
a:hover {
	text-decoration: underline;
}
a:active {
	text-decoration: none;
}
-->
</style></head>
<body>
<jsp:include page="../common/title.jsp"/>
<jsp:include page="../common/menu.jsp" flush="true"/>
<style type="text/css">
<!--
.STYLE1 {font-size: 12px;}
.STYLE2 {font-size:14px;}
.STYLE3 {color: #FF0000; font-size: 12px; }
-->
</style>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script>
	$(function() {
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
	});
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
	//ע���ύ����
	function submitReg() {
		var flg = checkEmail()&checkAnswer()&checkQuestion()&checkPhone()&checkPwd()&checkRePwd();
		if(flg==1) {
			$('#updateForm').attr('action', '/ebuy/updateConfirm');
			$('#updateForm').attr('method', 'post');
			$('#updateForm').submit();
		}
	}
</script>
<center> 
<form name="updateForm" id="updateForm">
<table width="782" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td height="30" colspan="2" align="center" bgcolor="#99CCFF"><span class="STYLE2">�û������޸�</span></td>
  </tr>
  <tr>
    <td width="224" height="30" align="right"><span class="STYLE1">�û���</span>��</td>
    <td width="526" align="left" valign="middle">&nbsp;&nbsp;${sessionScope.customer.name }&nbsp;&nbsp;<span class="STYLE3">*</span> <span class="STYLE1">����������ֻ������ַ������ȣ�</span><span class="STYLE3">6-20</span><span class="STYLE1">��</span> </td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">����</span>��&nbsp;</td>
    <td height="30" align="left"><input type="password" name="pass" id="pass" value="" />
      <span class="STYLE3">*</span> 
      <span id="pwdTips01" class="pwdTips">
		<span class="STYLE1">����������ֻ�����</span><span class="STYLE3">3-30</span><span class="STYLE1">�ַ���</span>
	</span>
      <span id="pwdTips02" style="display:none" class="STYLE3 pwdTips">����д����</span>
      <span id="pwdTips03" style="display:none" class="STYLE3 pwdTips">���볤�Ȳ����Ϲ淶����������д</span>
   </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">ȷ������</span>��&nbsp;</td>
    <td height="30" align="left"><input type="password" name="pass2" id="pass2" value=""  /> 
      <span class="STYLE3">*</span> 
      <span id="rePwdTips02" style="display:none" class="STYLE3 rePwdTips">��ȷ������</span>
					<span id="rePwdTips03" style="display:none" class="STYLE3 rePwdTips">�����������벻һ�£�����������</span></td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">ͷ��ѡ��</span>��&nbsp;</td>
    <td height="30" align="left"><select name="header" id="header" size=1 onChange="document.images['avatar'].src=options[selectedIndex].value;">
            <option value="images\face\Image1.gif">Image1
            <option value="images\face\Image2.gif">Image2
            <option value="images\face\Image3.gif">Image3
			<option value="images\face\Image4.gif">Image4
            <option value="images\face\Image5.gif">Image5
         </select>
		 &nbsp;&nbsp;<img id=avatar src="" alt=����������� width="32" height="32"> <span class="STYLE3">*</span> </td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">��ϵ�绰</span>��&nbsp;</td>
    <td height="30" align="left"><input type="text" name="phone" id="phone" value=""  /> 
      <span class="STYLE3">*</span> 
      <span id="phoneTips01" class="phoneTips">
		<span class="STYLE1">����������д�������պ���ϵ��</span>
		</span>
		<span id="phoneTips02" style="display:none" class="STYLE3 phoneTips">����д�ֻ�����</span>
		<span id="phoneTips03" style="display:none" class="STYLE3 phoneTips">����һ����ȷ���ֻ�����</span>
    </td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">������ʾ</span>��&nbsp;</td>
    <td height="30" align="left"><select name="question" id="question">
    <option value="">-��ѡ������������ʾ-</option>
	<option value="����ϲ��������?">����ϲ�������ǣ�</option>
	<option value="����ϲ����һ����Ӱ��?">����ϲ����һ����Ӱ�ǣ�</option>
	<option value="����ϲ���ĸ�����?">����ϲ���ĸ����ǣ�</option>
	<option value="����ϲ����ż����?">����ϲ����ż���ǣ�</option>
	<option value="������Բ�Ļ��Ƿ�����?">������Բ�Ļ��Ƿ�����?</option>
	</select> 
      <span class="STYLE3">*</span>	
    	<span id="quesTips" style="display:none" class="STYLE3">��ѡ����ʾ����</span>  
    </td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">�����</span>��&nbsp;</td>
    <td height="30" align="left"><input type="text" name="answer" id="answer" value=""  /> 
      <span class="STYLE3">*</span> 
      <span id="ansTips" style="display:none" class="STYLE3">����д�����</span></td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">���ڵ�ַ</span>��&nbsp;</td>
    <td height="30" align="left"><input type="text" name="address" id="address" size="30" value="" /></td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">E_mail</span>��&nbsp;</td>
    <td height="30" align="left"><input type="text" name="email" id="email" size="30" value=""  /> 
      <span class="STYLE3">*</span> 
      <span id="emailTips01" class="emailTips">
						<span class="STYLE1">����  hnrptc@163.com��</span>
					</span>
					<span id="emailTips02" style="display:none" class="STYLE3 emailTips">����д����</span>
					<span id="emailTips03" style="display:none" class="STYLE3 emailTips">����һ����ȷ�����䣬��������д</span>
   	</td>
  </tr>
  <tr>
    <td height="35" colspan="2" align="center"><input type="button" id="submitReg" class="STYLE1" value=" �ύ " />&nbsp;&nbsp;<input type="button" class="STYLE1" value=" ���� " onClick="history.go(-1);" /></td>
  </tr>
</table>
</form>
</center>
<jsp:include page="../common/copyright.jsp"/>
</body>
</html>
