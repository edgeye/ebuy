<%@ page contentType="text/html;charset=gb2312" %>
<!-- ����struts2��ǩ�� -->
<%@taglib  uri="/struts-tags"  prefix="s"%>
<style type="text/css">
<!--
.STYLE1 {font-size: 12px}
.STYLE2 {font-size: 14px}
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
<body>
<center>
<table width="520" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td height="40" colspan="2" align="center" bgcolor="#99CCFF" class="STYLE2">������Ϣ</td>
    </tr>
  <tr>
    <td width="183" align="right"><span class="STYLE1">����������</span>��</td>
    <td width="331" height="35">&nbsp;<font size="2">${order.user}</font></td>
  </tr>
  <tr>
    <td width="183" align="right"><span class="STYLE1">��������</span>��</td>
    <td height="35">&nbsp;<font size="2">${order.itemid}</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font size="2">
    <a href="/ebuy/verifyOrder?id=${order.id}">�鿴����������Ʒ</a></font>
    </td>
    </tr>
  <tr>
    <td width="183" align="right"><span class="STYLE1">�����˵�ַ</span>��</td>
    <td height="35">&nbsp;<font size="2">${order.address}</font></td>
    </tr>
  <tr>
    <td width="183" align="right"><span class="STYLE1">������E_mail</span>��</td>
    <td height="35">&nbsp;<font size="2">${order.email}</font></td>
    </tr>
  <tr>
    <td width="183" align="right"><span class="STYLE1">�����ܶ�</span>��</td>
    <td height="35">&nbsp;<font size="2">${order.sum}</font></td>
    </tr>
  <tr>
    <td height="30" align="right"><span class="STYLE1">����ʱ��</span>��</td>
    <td height="30">&nbsp;<font size="2">${order.time}</font></td>
    </tr>
  <tr>
    <td width="183" align="right"><span class="STYLE1">��ȡ���ʽ</span>��</td>
    <td height="30">&nbsp;<font size="2">${order.payment}</font></td>
  </tr>
  <tr>
    <td align="right">&nbsp;<span class="STYLE1">�Ƿ���ɽ���</span>��</td>
    <td height="30"><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
  <tr>
    <td height="40" colspan="2" align="center"><input type="button" class="STYLE1" onClick="history.go(-1);" value=" ���� " /></td></tr>
</table>
</center>
