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
				alert("����д�����û���!");
				form.name.focus();
				return false;
			}
		if(form.name.value.length<6 || form.name.value.length>30)
		{
			alert("�û����ĳ��ȱ�����6-20֮�䣡");
			form.name.focus();
			return false;
		}
		if(form.pass.value=="")
		{
			alert("����д��������!");
			form.pass.focus();
			return false;
		}
		if(form.pass.value.length<3 || form.pass.value.length>30)
		{
			alert("����ĳ��ȱ�����3-20֮�䣡");
			form.pass.focus();
			return false;
		}
		if(form.pass2.value=="")
		{
			alert("��ȷ����������");
			form.pass2.focus();
			return false;
		}
		if(form.pass2.value != form.pass.value)
		{
			alert("�������벻һ�£���������д");
			form.pass2.focus();
			return false;
		}
		if(form.phone.value=="")
		{
			alert("������������ϵ�绰");
			form.phone.focus();
			return false;
		}
		if(form.phone.value.length>15)
		{
			alert("����ĵ绰���룬��������д���ĵ绰��");
			form.phone.focus();
			return false;
		}
		if(isNaN(form.phone.value) || form.phone.value.indexOf('.',0)!=-1)
		{
			alert("�벻Ҫ����Ƿ��ַ�");
			form.phone.focus();
			return false;
		}	
		
		if(form.email.value.indexOf("@")==-1 ||(form.email.value.indexOf(".")==-1))
		{
			alert("�����Email��ʽ������д��ȷ�ĵ�������");
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
        <td height="30" colspan="2" align="center" bgcolor="#99CCFF"><span class="STYLE2">��ӹ���Ա</span></td>
      </tr>
      <tr>
    <td width="24%" height="30" align="right"><span class="STYLE1">����Ա�˺�</span>��&nbsp;</td>
    <td width="76%" height="30" align="left">&nbsp;&nbsp;&nbsp;<input type="text" name="name" id="name"  />
      <span class="STYLE5">*</span> <span class="STYLE1">�����ֻ������ַ�[<span class="STYLE5">6-30</span>]��</span>      </tr><tr>
    <td width="24%" height="30" align="right"><span class="STYLE1">����</span>��&nbsp;</td>
    <td width="76%" height="30" align="left">&nbsp;&nbsp;&nbsp;<input type="password" name="pass" id="pass" />
      <span class="STYLE5">*</span> <span class="STYLE1">�����ֻ������ַ�[<span class="STYLE5">3-30</span>]��</span>      </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">ȷ������</span>��&nbsp;</td>
    <td height="30" align="left">&nbsp;&nbsp;&nbsp;<input type="password" name="pass2" id="pass2"  /> 
      <span class="STYLE5">*</span> </td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">ͷ��ѡ��</span>��&nbsp;</td>
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
		 &nbsp;&nbsp;<img id=avatar src="images\face\Image1.gif" alt=����������� width="32" height="32"> <span class="STYLE5">*</span> </td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">��ϵ�绰</span>��&nbsp;</td>
    <td height="30" align="left">&nbsp;&nbsp;&nbsp;<input type="text" name="phone" id="phone"  /> 
      <span class="STYLE5">*</span> <span class="STYLE1">����������д�������պ���ϵ��</span></td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">E_mail</span>��&nbsp;</td>
    <td height="30" align="left">&nbsp;&nbsp;&nbsp;<input type="text" name="email" id="email" size="25"  /> 
      <span class="STYLE5">*</span> <span class="STYLE1">��tangzy111@163.com��</span></td>
  </tr>
  <tr>
    <td height="35" colspan="2" align="center"><input type="submit" class="STYLE1" value=" �ύ " />
    &nbsp;<input type="button" class="STYLE1" onclick="history.go(-1);" value=" ���� " /></td>
  </tr>
</table>
</center>
</form>

