<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<html>
<head>
<title>Easy Buy Online</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="CSS/style.css" rel="stylesheet">
<style type="text/css">
<!--
.STYLE1 {font-size: 12px}
.STYLE2{
	font-size: 14px;
}
.STYLE9 {color: #FF0000}
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
.STYLE11 {
	font-size: 36px;
	font-family: "���ռ��п�";
	color: #000099;
}
-->
</style>
<script language="javascript">
<!--
	function check_pay(form)
	{
		if(form.payment.value=="")
		{
			alert("��ѡ�����ĸ��ʽ");
			form.payment.focus();
			return false;
		}
		if(form.address.value=="")
		{
			alert("���������ĵ�ַ");
			form.address.focus();
			return false;
		}
		if(form.email.value=="")
		{
			alert("����������Eamil");
			form.email.focus();
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

</head>
<body>
<jsp:include page="../common/title.jsp" flush="true"/>
<jsp:include page="../common/menu.jsp" flush="true"/>
<center>
<table width="782"  border="1" bordercolor="#99CCFF" cellspacing="0" cellpadding="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
        <tr>
          <td width="183" align="center" valign="top"><jsp:include page="../login/login.jsp" flush="true"/></td>
          <td width="602" valign="top"><table width="100%"  border="0" bordercolor="#99CCFF" style="border-collapse:collapse" cellspacing="0" cellpadding="0">
            <!--DWLayoutTable-->
                      <tr>
                        <td height="14" align="center">&nbsp;</td>
                      </tr>
                      <tr>
                        <td height="37" align="center" bgcolor="#eeeeee"><span class="STYLE11">��������</span></td>
                      </tr>
                      <tr>
                        <td>&nbsp;</td>
                      </tr>
                      <tr>
                        <td>
	<table width="96%" height="83" border="1" bordercolor="#99CCFF" align="center" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <tr align="center" valign="middle">
        <td height="27" class="STYLE1">��Ʒ���</td>
        <td class="STYLE1">��Ʒ����</td>
        <td height="27" class="STYLE1">����</td>
        <td height="27" class="STYLE1">����</td>
        <td width="85" height="27" class="STYLE1">���</td>
        </tr> 
	<s:iterator value="list1">
      <tr align="center" valign="middle"> 
        <td width="114" height="27"><font size="2">${product.id}</font></td> 
        <td width="207" height="27"><font size="2">${product.name}</font></td>
        <td width="68" height="27"><font size="2">��${product.price}</font></td> 
        <td width="48" height="27" class="STYLE1">${qty}</td> 
        <td height="27"><font size="2">��${qty*product.price}</font></td> 
	</s:iterator>
	 </tr>
      <tr align="center" valign="middle">
        <td height="27" colspan="6" align="left"><span class="STYLE1">�ϼ��ܽ��</span>
        <font size="2"><font size="2">��</font></font><span class="STYLE9">��${totalPrice}</span>&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="/ebuy/main"><font size="2">���ؼ�������</font></a>
        </td>
        </tr>
      </table></td>
                      </tr>
                      <tr>
                        <td></td>
                      </tr>
                      <tr>
                        <td height="57" align="center" valign="top">
						<form action="/ebuy/confirmPay" method="post" onSubmit="return check_pay(this);">
						  <table width="96%" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
                          <!--DWLayoutTable-->
                          <tr bgcolor="#99CCFF">
                            <td height="10" colspan="3"><!--DWLayoutEmptyCell-->&nbsp;</td>
                            </tr>
                          <tr>
                            <td height="20" colspan="3" bgcolor="#eeeeee">���ʽ��</td>
                          </tr>
                          <tr>
                            <td width="25%" height="30" align="right"><span class="STYLE1 STYLE9">��ѡ�����ĸ��ʽ</span><span class="STYLE9">��</span>&nbsp;</td>
                            <td height="30" colspan="2"><select name="payment">
								<s:iterator value="payments">
									<option value="${way}">${way}</option>
								</s:iterator>
                            </select> </td>
                          </tr>
                          <tr>
                            <td height="30" align="right"><span class=" STYLE1 STYLE9">���������ĵ�ַ</span><span class="STYLE9">��</span>&nbsp;</td>
                            <td height="30" colspan="2"><input type="text" name="address" size="40" value="${sessionScope.customer.address}"/></td>
                          </tr>
                          <tr>
                            <td height="30" align="right"><span class="STYLE1 STYLE9">����������E_mail</span><span class="STYLE9">��</span>&nbsp;</td>
                            <td height="30" colspan="2"><input type="text" name="email" size="26" value="${sessionScope.customer.email}"/></td>
                          </tr>
                          <tr>
                            <td height="30" align="right"><span class="STYLE1 STYLE9">��ע���Ǳ��</span><span class="STYLE9">��</span>&nbsp;</td>
                            <td height="30" colspan="2"><input type="text" name="msg" size="26" value=""/></td>
                          </tr>
                          <tr>
                            <td height="30" colspan="3"><!--DWLayoutEmptyCell-->&nbsp;</td>
                          </tr>
                          <tr>
                            <td height="30" colspan="3" align="center"><input type="submit" class="STYLE1" value="ȷ������"/>&nbsp;&nbsp;
                            <input name="button" type="button" class="STYLE1" value="ȡ������" onClick="history.go(-1);"/></td>
                          </tr>
                        </table>
						</form>                        
						</td>
                      </tr>
                      <tr>
                        <td height="30" align="center" valign="top"><!--DWLayoutEmptyCell-->&nbsp;</td>
                      </tr>
          </table>          </td>
        </tr>
      </table>
</td>
  </tr>
</table>
</td>
</tr>
</table>
</center>
<br>
<jsp:include page="../common/copyright.jsp" flush="true"/>
</body>
</html>
