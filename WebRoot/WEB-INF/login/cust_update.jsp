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
	//注册提交函数
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
    <td height="30" colspan="2" align="center" bgcolor="#99CCFF"><span class="STYLE2">用户资料修改</span></td>
  </tr>
  <tr>
    <td width="224" height="30" align="right"><span class="STYLE1">用户名</span>：</td>
    <td width="526" align="left" valign="middle">&nbsp;&nbsp;${sessionScope.customer.name }&nbsp;&nbsp;<span class="STYLE3">*</span> <span class="STYLE1">（任意的数字或者是字符，长度（</span><span class="STYLE3">6-20</span><span class="STYLE1">）</span> </td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">密码</span>：&nbsp;</td>
    <td height="30" align="left"><input type="password" name="pass" id="pass" value="" />
      <span class="STYLE3">*</span> 
      <span id="pwdTips01" class="pwdTips">
		<span class="STYLE1">（任意的数字或者是</span><span class="STYLE3">3-30</span><span class="STYLE1">字符）</span>
	</span>
      <span id="pwdTips02" style="display:none" class="STYLE3 pwdTips">请填写密码</span>
      <span id="pwdTips03" style="display:none" class="STYLE3 pwdTips">密码长度不符合规范，请重新填写</span>
   </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">确认密码</span>：&nbsp;</td>
    <td height="30" align="left"><input type="password" name="pass2" id="pass2" value=""  /> 
      <span class="STYLE3">*</span> 
      <span id="rePwdTips02" style="display:none" class="STYLE3 rePwdTips">请确认密码</span>
					<span id="rePwdTips03" style="display:none" class="STYLE3 rePwdTips">密码两次输入不一致，请重新输入</span></td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">头像选择</span>：&nbsp;</td>
    <td height="30" align="left"><select name="header" id="header" size=1 onChange="document.images['avatar'].src=options[selectedIndex].value;">
            <option value="images\face\Image1.gif">Image1
            <option value="images\face\Image2.gif">Image2
            <option value="images\face\Image3.gif">Image3
			<option value="images\face\Image4.gif">Image4
            <option value="images\face\Image5.gif">Image5
         </select>
		 &nbsp;&nbsp;<img id=avatar src="" alt=个人形象代表 width="32" height="32"> <span class="STYLE3">*</span> </td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">联系电话</span>：&nbsp;</td>
    <td height="30" align="left"><input type="text" name="phone" id="phone" value=""  /> 
      <span class="STYLE3">*</span> 
      <span id="phoneTips01" class="phoneTips">
		<span class="STYLE1">（请认真填写，方便日后联系）</span>
		</span>
		<span id="phoneTips02" style="display:none" class="STYLE3 phoneTips">请填写手机号码</span>
		<span id="phoneTips03" style="display:none" class="STYLE3 phoneTips">不是一个正确的手机号码</span>
    </td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">问题提示</span>：&nbsp;</td>
    <td height="30" align="left"><select name="question" id="question">
    <option value="">-请选择您的问题提示-</option>
	<option value="你最喜欢的人是?">你最喜欢的人是？</option>
	<option value="你最喜欢的一部电影是?">你最喜欢的一部电影是？</option>
	<option value="你最喜欢的歌曲是?">你最喜欢的歌曲是？</option>
	<option value="你最喜欢的偶像是?">你最喜欢的偶像是？</option>
	<option value="地球是圆的还是方的呢?">地球是圆的还是方的呢?</option>
	</select> 
      <span class="STYLE3">*</span>	
    	<span id="quesTips" style="display:none" class="STYLE3">请选择提示问题</span>  
    </td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">问题答案</span>：&nbsp;</td>
    <td height="30" align="left"><input type="text" name="answer" id="answer" value=""  /> 
      <span class="STYLE3">*</span> 
      <span id="ansTips" style="display:none" class="STYLE3">请填写问题答案</span></td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">所在地址</span>：&nbsp;</td>
    <td height="30" align="left"><input type="text" name="address" id="address" size="30" value="" /></td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">E_mail</span>：&nbsp;</td>
    <td height="30" align="left"><input type="text" name="email" id="email" size="30" value=""  /> 
      <span class="STYLE3">*</span> 
      <span id="emailTips01" class="emailTips">
						<span class="STYLE1">（如  hnrptc@163.com）</span>
					</span>
					<span id="emailTips02" style="display:none" class="STYLE3 emailTips">请填写邮箱</span>
					<span id="emailTips03" style="display:none" class="STYLE3 emailTips">不是一个正确的邮箱，请重新填写</span>
   	</td>
  </tr>
  <tr>
    <td height="35" colspan="2" align="center"><input type="button" id="submitReg" class="STYLE1" value=" 提交 " />&nbsp;&nbsp;<input type="button" class="STYLE1" value=" 返回 " onClick="history.go(-1);" /></td>
  </tr>
</table>
</form>
</center>
<jsp:include page="../common/copyright.jsp"/>
</body>
</html>
