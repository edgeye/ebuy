<%@ page contentType="text/html;charset=gb2312" %>
<!-- ����struts2��ǩ�� -->
<%@taglib  uri="/struts-tags"  prefix="s"%>
<html><head>
<title>Easy Buy Online</title>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
.STYLE2 {
	font-size: 14px;
}
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
.STYLE3 {
	font-size: 36px;
	font-family: "���ռ��п�";
	color: #000099;
}
-->
</style>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312"></head>

<body>
<center>
<table width="520" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td height="40" colspan="6" align="center" bgcolor="#eeeeee" class="STYLE3">������Ϣ</td>
    </tr>
  <tr>
    <td height="35" colspan="6" align="left">&nbsp;&nbsp;<font size="2">��������</font>��&nbsp;<font size="2" color="#FF0000">${order.itemid }</font></td>
    </tr>
  <tr>
    <td width="49" align="center" class="STYLE1">���</td>
    <td width="83" height="30" align="center" class="STYLE1">��Ʒ��</td>
    <td width="145" align="center" class="STYLE1">��Ʒ����</td>
    <td width="77" align="center" class="STYLE1">��Ʒ�۸�</td>
    <td width="62" align="center" class="STYLE1">��Ʒ����</td>
    <td width="90" align="center" class="STYLE1">���</td>
  </tr>
  <s:iterator value="details" status="st">
  <tr>
    <td height="30" align="center" class="STYLE2"><s:property value="#st.index+1" /></td>
    <td height="30" align="center" class="STYLE2">${proId }</td>
    <td height="30" align="center" class="STYLE2">${proName }</td>
    <td height="30" align="center" class="STYLE2">${proPrice }</td>
    <td height="30" align="center" class="STYLE2">${proNumber }</td>
    <td height="30" align="center" class="STYLE2">${proCost }</td>
  </tr>
  </s:iterator>
  <tr>
    <td height="33" colspan="6" align="right"><font size="2">�ϼƽ��</font>��<font size="3" color="red">��${order.sum }</font>&nbsp;&nbsp;&nbsp;&nbsp;</td>
  </tr>
  <tr>
    <td height="30" colspan="6" align="center"><a href="javascript:window.close()" class="styleac">[�رմ���]</a></td>
    </tr>
</table>
</center>
</body>
</html>