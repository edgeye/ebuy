<%@ page contentType="text/html;charset=gb2312" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<jsp:include page="top.jsp" flush="true"/>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
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

-->
</style>
</head>

<body>
<center>
<table width="782" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td width="146" height="30" align="center"><span class="STYLE2">当前管理员</span>：${sessionScope.admin.name}<span class="STYLE2"></span></td>
    <td width="102" align="center"><span class="STYLE2">公告栏</span>：</td>
    <td width="504" align="center">
    <table width="90%" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
        <td width="454" height="28">
        <marquee scrolldelay="5" scrollamount="2" bgcolor="#FFFFFF" onMouseOver="this.stop();" onMouseOut="this.start();">
        <span class="STYLE2">
      	<s:iterator value="notices" status="st">
        	&nbsp;&nbsp;公告<s:property value="#st.index+1" />: ${message }
        </s:iterator>
      </span></marquee></td>
      </tr>
    </table>
    </td>
  </tr>
  <tr>
    <td height="476" colspan="3" valign="top"><table width="100%" height="383" border="0" align="right" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
      <tr>
        <td width="782" height="383"><iframe src="/ebuy/loadCenter" width="782" height="550"> </iframe></td>
        </tr>
    </table></td>
    </tr>
</table>
</center>
<br>
<jsp:include page="copyright.jsp" flush="true"/>
</body>
</html>
