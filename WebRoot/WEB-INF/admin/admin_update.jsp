<%@ page contentType="text/html;charset=gb2312" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
.STYLE2 {font-size:14px;}
.STYLE4 {font-size: 12px; color: #FF0000; }
-->
</style>

<jsp:include page="explain.html" flush="true"/>
<br />
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script>
	$(function() {
		$('#update').click(function() {
			update();
		});
	});
	
	function checkName() {
		var name = $('#name').val();
		if(name=='') {
			alert('')
			return false;
		}
		if(name.length<6 || name.length>30) {
			alert('');
			return false;
		}
		return true;
	}
	function checkPass() {
		var pass = $('#pass').val();
		if(pass=='') {
			alert('');
			return false;
		}
		if(pass.length<3 || pass.length>30) {
			alert('');
			return false;	
		}
		return true;
	}
	function checkPhone() {
		var phone = $('#phone').val();
		if(phone=='') {
			alert('');
			return false;
		}
		return true;
	}
	function checkEmail() {
		var email = $('#email').val();
		if(email=='') {
			alert('');
			return false;
		}
		return true;
	}
	
	function validProps() {
		if(!checkName()) return false;
		if(!checkPass()) return false;
		if(!checkPhone()) return false;
		if(!checkEmail()) return false;
		return true;
	}
	
	function update() {
		if(validProps()) {
			$('#updateForm').attr('action', '/ebuy/confirmUpdateAdmin?id=${admin.id}');
			$('#updateForm').attr('method', 'post');
			$('#updateForm').submit();
		}
	}
	
</script>
<form name="updateForm" id="updateForm">
<center>
	<table width="520" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <!--DWLayoutTable-->
      <tr>
        <td height="30" colspan="2" align="center" bgcolor="#99CCFF"><span class="STYLE2">修改管理员资料</span></td>
      </tr>
      <tr>
    <td width="24%" height="30" align="right"><span class="STYLE1">管理员账号</span>：&nbsp;</td>
    <td width="76%" height="30" align="left">&nbsp;&nbsp;&nbsp;<input type="text" name="name" id="name" value="${admin.name}" > 
      <span class="STYLE4">*</span> <span class="STYLE1">（数字或者是字符[<span class="STYLE4">6-30</span>]）</span>      </tr><tr>
    <td width="24%" height="30" align="right"><span class="STYLE1">密码</span>：&nbsp;</td>
    <td width="76%" height="30" align="left">&nbsp;&nbsp;&nbsp;<input type="password" name="pass" id="pass" value="${admin.pass}"  />
      <span class="STYLE4">*</span> <span class="STYLE1">（数字或者是字符[<span class="STYLE4">3-30</span>]）</span>      </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">头像选择</span>：&nbsp;</td>
    <td height="30" align="left">&nbsp;&nbsp;&nbsp;<select name="header" id="header" size=1 onChange="document.images['avatar'].src=options[selectedIndex].value;">
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
		 &nbsp;&nbsp;<img id=avatar src="" alt=个人形象代表 width="32" height="32"> <span class="STYLE4">*</span> </td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">联系电话</span>：&nbsp;</td>
    <td height="30" align="left">&nbsp;&nbsp;&nbsp;<input type="text" name="phone" id="phone" value="${admin.phone}" /> 
      <span class="STYLE4">*</span> <span class="STYLE1">（请认真填写，方便日后联系）</span></td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">E_mail</span>：&nbsp;</td>
    <td height="30" align="left">&nbsp;&nbsp;&nbsp;<input type="text" name="email" id="email" size="25" value="${admin.email}" /> 
      <span class="STYLE4">*</span> <span class="STYLE1">（tangzy111@163.com）</span></td>
  </tr>
  <tr>
    <td height="35" colspan="2" align="center"><input type="button" name="update" id="update"  class="STYLE1" value=" 提交 " />
    &nbsp;&nbsp;&nbsp;&nbsp;<input type="button" class="STYLE1" onclick="history.go(-1);" value=" 返回 " /></td>
  </tr>
</table>
</center>
</form>


