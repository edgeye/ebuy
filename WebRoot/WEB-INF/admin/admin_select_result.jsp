<%@ page contentType="text/html;charset=gb2312" %>
 <style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
.STYLE2{font-size: 14px;}
-->
 </style>
<center>
<table width="520" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <!--DWLayoutTable-->
      <tr>
        <td height="30" colspan="2" align="center" bgcolor="#99CCFF"><span class="STYLE2">管理员详细资料</span></td>
      </tr>
      <tr>
        <td height="30" colspan="2" align="center"><!--DWLayoutEmptyCell-->&nbsp;</td>
      </tr>
      <tr>
    <td height="30" align="right"><span class="STYLE1">用户名</span>：&nbsp;</td>
    <td height="30" align="left">&nbsp;&nbsp;&nbsp;${admin.name}</td>
  </tr>
      <tr>
    <td width="28%" height="30" align="right"><span class="STYLE1">密码</span>：&nbsp;</td>
    <td width="72%" height="30" align="left">&nbsp;&nbsp;&nbsp;${admin.pass}</td> </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">头像选择</span>：&nbsp;</td>
    <td height="30" align="left">&nbsp;&nbsp;&nbsp;<img src="${admin.header}"></td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">联系电话</span>：&nbsp;</td>
    <td height="30" align="left">&nbsp;&nbsp;&nbsp;${admin.phone}</td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">E_mail</span>：&nbsp;</td>
    <td height="30" align="left">&nbsp;&nbsp;&nbsp;${admin.email}</td>
  </tr>
  <tr>
    <td height="35" colspan="2" align="center"><input type="button" class="STYLE1" onclick="window.location.href='/ebuy/updateAdmin?id=${admin.id}'" value=" 修改 "/>
    &nbsp;<input type="button" class="STYLE1" onclick="window.location.href='/ebuy/deleteAdmin?id=${admin.id}'" value=" 删除 "/>
    &nbsp;<input type="button" class="STYLE1" onclick="history.go(-1);" value=" 返回 " /></td>
  </tr>
  
</table>
</center>
