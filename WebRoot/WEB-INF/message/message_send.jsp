<%@ page contentType="text/html;charset=gb2312" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<style type="text/css">
<!--
.STYLE1 {font-size: 12px}
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
.STYLE3 {
	font-size: 36px;
	font-family: "���ռ��п�";
	color: #000099;
}
-->
</style>
<script>
	<!--
		function check_message(form)
		{
			if(form.message.value=="")
			{
				alert("����д������߽���");
				form.message.focus();
				return false;
			}
		}
	-->
</script>


<center>
<form action="/ebuy/submitMessage" method="post" onsubmit="return check_message(this);">
<table id="messTab" width="782" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <!--DWLayoutTable-->
      <tr bgcolor="#99CCFF">
        <td height="30" colspan="3" align="center" bgcolor="#eeeeee"><span class="STYLE3">��������뽨��</span></td>
      </tr>
      <tr>
        <td height="20" colspan="3" align="center" ><!--DWLayoutEmptyCell-->&nbsp;</td>
      </tr>
      <tr>
        <td height="20" colspan="3" align="left" >&nbsp;<span class="STYLE2">��ϵ��ʽ</span>��<p>&nbsp;<span class="STYLE2">��ַ</span>��<span class="STYLE2">�������߹���eBuy��������˾</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="STYLE2">�ʱ�</span>��<span class="STYLE2">412007</span>&nbsp;</p>
          <p>&nbsp;<span class="STYLE2">�绰</span>��<span class="STYLE2">0733-2548359</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="STYLE2">E_mail</span>��<span class="STYLE2"><a href="mailto:tangzy111@163.com">hnrptc@163.com</a></span></p></td>
      </tr>
      <tr>
        <td colspan="3" align="left" >&nbsp;</td>
      </tr>
      

      <tr>
        <td width="135" height="101" align="center">
		<p><img src="<s:property value='#session.customer.header'/>" width="50" height="50" /></p><p><span class="STYLE5"></span></p></td>
        
        <td align="left"><textarea name="message" rows="8" cols="80"></textarea></td>
      </tr>
      <tr bgcolor="#99CCFF">
        <td height="17" colspan="2" align="center"><!--DWLayoutEmptyCell-->&nbsp;</td>
      </tr>
      
      <tr>
        <td height="40" colspan="3" align="center"><input type="submit" class="STYLE1" value="�������" />
&nbsp;          <input type="reset" class="STYLE1" value=" ���� " onclick="window.location.href='index.jsp'" /></td>
      </tr>
    </table>
  </form>
</center>