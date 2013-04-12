<%@ page contentType="text/html;charset=gb2312" %>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
.STYLE2 {font-size:14px;}
.STYLE5 {font-size: 12px; color: #FF0000; }
-->
</style>

<jsp:include page="explain.html" flush="true"/>
<br />
<script>
<!--
	function check_info(form)
	{
		if(form.name.value=="")
			{
				alert("请填写您的用户名!");
				form.name.focus();
				return false;
			}
		if(form.name.value.length<6 || form.name.value.length>30)
		{
			alert("用户名的长度必须在6-20之间！");
			form.name.focus();
			return false;
		}
		if(form.pass.value=="")
		{
			alert("请填写您的密码!");
			form.pass.focus();
			return false;
		}
		if(form.pass.value.length<3 || form.pass.value.length>30)
		{
			alert("密码的长度必须在3-20之间！");
			form.pass.focus();
			return false;
		}
		if(form.pass2.value=="")
		{
			alert("请确认您的密码");
			form.pass2.focus();
			return false;
		}
		if(form.pass2.value != form.pass.value)
		{
			alert("两次密码不一致，请重新填写");
			form.pass2.focus();
			return false;
		}
		if(form.phone.value=="")
		{
			alert("请输入您的联系电话");
			form.phone.focus();
			return false;
		}
		if(form.phone.value.length>15)
		{
			alert("错误的电话号码，请重新填写您的电话！");
			form.phone.focus();
			return false;
		}
		if(isNaN(form.phone.value) || form.phone.value.indexOf('.',0)!=-1)
		{
			alert("请不要输入非法字符");
			form.phone.focus();
			return false;
		}	
		
		if(form.email.value.indexOf("@")==-1 ||(form.email.value.indexOf(".")==-1))
		{
			alert("错误的Email格式，请填写正确的电子邮箱");
			form.email.focus();
			return false;
		}
	}
-->
</script>
<form action="/ebuy/submitAdminRegist" method="post" onsubmit="return check_info(this);">
<center>
	<table width="520" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <!--DWLayoutTable-->
      <tr>
        <td height="30" colspan="2" align="center" bgcolor="#99CCFF"><span class="STYLE2">添加管理员</span></td>
      </tr>
      <tr>
    <td width="24%" height="30" align="right"><span class="STYLE1">管理员账号</span>：&nbsp;</td>
    <td width="76%" height="30" align="left">&nbsp;&nbsp;&nbsp;<input type="text" name="name" id="name"  />
      <span class="STYLE5">*</span> <span class="STYLE1">（数字或者是字符[<span class="STYLE5">6-30</span>]）</span>      </tr><tr>
    <td width="24%" height="30" align="right"><span class="STYLE1">密码</span>：&nbsp;</td>
    <td width="76%" height="30" align="left">&nbsp;&nbsp;&nbsp;<input type="password" name="pass" id="pass" />
      <span class="STYLE5">*</span> <span class="STYLE1">（数字或者是字符[<span class="STYLE5">3-30</span>]）</span>      </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">确认密码</span>：&nbsp;</td>
    <td height="30" align="left">&nbsp;&nbsp;&nbsp;<input type="password" name="pass2" id="pass2"  /> 
      <span class="STYLE5">*</span> </td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">头像选择</span>：&nbsp;</td>
    <td height="30" align="left">&nbsp;&nbsp;&nbsp;<select name=header size=1 onChange="document.images['avatar'].src=options[selectedIndex].value;">
            <option value="images\face\Image1.gif">Image1
            <option value="images\face\Image2.gif">Image2
            <option value="images\face\Image3.gif">Image3
			<option value="images\face\Image4.gif">Image4
            <option value="images\face\Image5.gif">Image5
            <option value="images\face\Image6.gif">Image6
			<option value="images\face\Image7.gif">Image7
            <option value="images\face\Image8.gif">Image8
            <option value="images\face\Image9.gif">Image9
         </select>
		 &nbsp;&nbsp;<img id=avatar src="images\face\Image1.gif" alt=个人形象代表 width="32" height="32"> <span class="STYLE5">*</span> </td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">联系电话</span>：&nbsp;</td>
    <td height="30" align="left">&nbsp;&nbsp;&nbsp;<input type="text" name="phone" id="phone"  /> 
      <span class="STYLE5">*</span> <span class="STYLE1">（请认真填写，方便日后联系）</span></td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">E_mail</span>：&nbsp;</td>
    <td height="30" align="left">&nbsp;&nbsp;&nbsp;<input type="text" name="email" id="email" size="25"  /> 
      <span class="STYLE5">*</span> <span class="STYLE1">（tangzy111@163.com）</span></td>
  </tr>
  <tr>
    <td height="35" colspan="2" align="center"><input type="submit" class="STYLE1" value=" 提交 " />
    &nbsp;<input type="button" class="STYLE1" onclick="history.go(-1);" value=" 返回 " /></td>
  </tr>
</table>
</center>
</form>

