<%@ page contentType="text/html;charset=gbk" isELIgnored="true"%>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>Easy Buy Online</title>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
.STYLE10 {
	font-size: 14px;
	color: #FF0000;
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
.STYLE3 {font-size: 14px}
.STYLE11 {color: #FF0000; font-size: 12px; }
-->
</style>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script language="javascript">
	$(function() {
		var flg = $('#flg').val();
		if(flg==1) {
			$('#tab1').show();
			$('#tab2').hide();
		}else {
			$('#tab1').hide();
			$('#tab2').show();
		}
	});
</script>
</head>
<body>
<jsp:include page="../common/title.jsp" flush="true"/>
<jsp:include page="../common/menu.jsp" flush="true"/>
<jsp:include page="explain.html" flush="true"/>
<center>
<table id="tab1" width="439" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
  	<input type="hidden" id="flg" name="flg" value="<s:property value='flag'/>" />
    <td height="25" colspan="3" align="left"><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
  <tr>
    <td height="31" align="center"><img src="images/logo/ok.gif" width="100" height="90" /></td>
    <td height="31" colspan="2" align="left"><span class="STYLE10">&nbsp;&nbsp;恭喜! 密码查询成功 !</span></td>
    </tr>
  <tr>
    <td width="152" rowspan="2" align="right"><img src=""/></td>
	<td width="76" align="right"><span class="STYLE1">用户名</span>：</td>
	<td width="211" height="34" align="left" class="STYLE2"><s:property value="customer.name" /></td>
  </tr>
  <tr>
    <td height="34" align="right"><span class="STYLE1">密&nbsp;&nbsp;码</span>：</td>
	<td height="34" align="left" class="STYLE2"><s:property value="customer.pass" /></td>
  </tr>
  <tr>
    <td height="13" colspan="3" align="right"><input type="button" class="STYLE1" value=" 返回登录>>> " onClick="window.location.href='/ebuy/main'" /></td></tr>
  <tr>
    <td height="25" colspan="3" align="right"><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
</table>
<table id="tab2" width="300" border="1" bordercolor="#99CCFF" style="border-collapse:collapse" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr bgcolor="#99CCFF">
	<td height="13">&nbsp;</td>
  </tr>
  <tr>
	<td height="60" align="center" ><span class="STYLE10">答案错误<span class="STYLE11">！</span>返回请重新输入<span class="STYLE11">！</span></span></td>
    </tr>
 </table>
</center>
<jsp:include page="../common/copyright.jsp" flush="true"/>
</body>
</html>
