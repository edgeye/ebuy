<%@ page contentType="text/html;charset=gb2312" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
 <style type="text/css">
<!--
.STYLE1 {font-size: 12px;}
.STYLE2 {font-size: 14px;}
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
 </style>

<center>
<table width="520" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <!--DWLayoutTable-->
      <tr>
        <td height="30" colspan="2" align="center" bgcolor="#99CCFF"><span class="STYLE2">�ͻ���ϸ����</span></td>
      </tr>
      <s:if test="#request.customer!=null">
      <tr>
        <td height="30" colspan="2" align="right"><a href="/ebuy/selectOrders?name=${customer.name}" class="STYLE1">�鿴������Ϣ</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
      </tr>
	  <tr>
    <td height="30" align="right"><span class="STYLE1">ͷ��ѡ��</span>:&nbsp;</td>
    <td height="30" align="left">&nbsp;&nbsp;&nbsp;<img src="${customer.header}"></td>
  </tr>
      <tr>
    <td height="30" align="right"><span class="STYLE1">�û���</span>:&nbsp;</td>
    <td height="30" align="left" class="STYLE2">&nbsp;&nbsp;&nbsp;${customer.name}</td>
  </tr>
      <tr>
    <td width="28%" height="30" align="right"><span class="STYLE1">����</span>:&nbsp;</td>
    <td width="72%" height="30" align="left" class="STYLE2">&nbsp;&nbsp;&nbsp;${customer.pass}</tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">��ϵ�绰</span>:&nbsp;</td>
    <td height="30" align="left" class="STYLE2">&nbsp;&nbsp;&nbsp;${customer.phone}</td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">������ʾ</span>:&nbsp;</td>
    <td height="30" align="left" class="STYLE2">&nbsp;&nbsp;&nbsp;${customer.question}</td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">�����</span>:&nbsp;</td>
    <td height="30" align="left" class="STYLE2">&nbsp;&nbsp;&nbsp;${customer.answer}</td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">���ڵ�ַ</span>:&nbsp;</td>
    <td height="30" align="left" class="STYLE2">&nbsp;&nbsp;&nbsp;${customer.address}</td>
  </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">E_mail</span>:&nbsp;</td>
    <td height="30" align="left" class="STYLE2">&nbsp;&nbsp;&nbsp;${customer.email}</td>
  </tr>
  </s:if>
  <s:else>
  <tr>
    <td colspan="2" align="center">-----------------------------------</td>
  </tr>
  <tr>
    <td colspan="2" align="center"><span class="STYLE1">���޴���</span></td>
  </tr>
  <tr>
    <td colspan="2" align="center">-----------------------------------</td>
  </tr>
  </s:else>
  <tr>
    <td height="35" colspan="2" align="center"><input type="button" class="STYLE1" onclick="window.location.href='/ebuy/loadRight'" value=" ȷ�� " />
    &nbsp;<input type="button" class="STYLE1" onclick="history.go(-1);" value=" ���� " /></td>
  </tr>
 
</table>
</center>
