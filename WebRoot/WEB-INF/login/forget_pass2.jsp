<%@ page contentType="text/html;charset=gbk" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gbk" />
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
.STYLE3 {color: #FF0000; font-size: 12px; }
-->
</style>
<script language="javascript">
<!--
		function check_answer(form)
		{
			if(form.c_answer.value=="")
			{
				alert("请输入问题的答案");
				form.c_answer.focus();
				return false;
			}
		}
-->
</script>
</head>
<body>
<jsp:include page="../common/title.jsp" flush="true"/>
<jsp:include page="../common/menu.jsp" flush="true"/>
<jsp:include page="explain.html" flush="true"/>
<center>
<form action="/ebuy/searchPass" method="post" onSubmit="return check_answer(this);">
<table width="415" border="0" cellpadding="0" cellspacing="0">
  <!--DWLayoutTable-->
  <tr>
    <td height="36" colspan="2" align="center" valign="top"><span class="STYLE10">eBuy电子商务系统－－密码查询</span> </td>
  </tr>
  <tr>
  	<input type="hidden" name="name" id="name" value="<s:property value="name"/>" />
    <td width="140" align="right"><span class="STYLE1">提示问题</span>：</td>
	<td width="275" height="34" align="left"><input type="text" name="question" value="<s:property value="customer.question"/>" size="25"  /></td>
  </tr>
  <tr>
    <td height="34" align="right"><span class="STYLE1">提示答案</span>：</td>
	<td height="34" align="left"><input type="text" name="answer" value="" size="25" /></td>
  </tr>
  <tr>
    <td height="13" colspan="2" align="center">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input name="Submit" type="submit" class="STYLE1" value=" 确定 "  />&nbsp;<input type="button" class="STYLE1" value=" 返回 " onClick="history.go(-1);" /></td>
  </tr>
  <tr>
    <td height="13" colspan="2">&nbsp;</td>
  </tr>
</table>
</form>
<jsp:include page="../common/copyright.jsp" flush="true"/>
</center>
</body>
</html>
