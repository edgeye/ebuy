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
	font-family: "创艺简行楷";
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
				alert("请填写意见或者建议");
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
        <td height="30" colspan="3" align="center" bgcolor="#eeeeee"><span class="STYLE3">发表意见与建议</span></td>
      </tr>
      <tr>
        <td height="20" colspan="3" align="center" ><!--DWLayoutEmptyCell-->&nbsp;</td>
      </tr>
      <tr>
        <td height="20" colspan="3" align="left" >&nbsp;<span class="STYLE2">联系方式</span>：<p>&nbsp;<span class="STYLE2">地址</span>：<span class="STYLE2">株洲在线购物eBuy电子商务公司</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="STYLE2">邮编</span>：<span class="STYLE2">412007</span>&nbsp;</p>
          <p>&nbsp;<span class="STYLE2">电话</span>：<span class="STYLE2">0733-2548359</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="STYLE2">E_mail</span>：<span class="STYLE2"><a href="mailto:tangzy111@163.com">hnrptc@163.com</a></span></p></td>
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
        <td height="40" colspan="3" align="center"><input type="submit" class="STYLE1" value="发表意见" />
&nbsp;          <input type="reset" class="STYLE1" value=" 返回 " onclick="window.location.href='index.jsp'" /></td>
      </tr>
    </table>
  </form>
</center>