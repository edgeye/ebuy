<%@page contentType="text/html;charset=GBK"%>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
.STYLE2 {
	font-size: 14px;
}
.STYLE11 {font-size: 18px; color: #FF0000; }
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
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script type="text/javascript">
	//ע��ɹ�ҳ��ű�
	$(function() {
		checkStatus();
	});
	//�����û��Ƿ�ע��ɹ�
	function checkStatus() {
		var flg = '${flag}';
		if(flg) {
			$('#failDiv').hide();
		}else {
			$('#successDiv').hide();
		}
	}
</script>
<jsp:include page="../common/title.jsp" flush="true"/>
<br />
<center>
<div id="failDiv">
<table width="782" border="0" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td height="14" colspan="3">&nbsp;</td>
  </tr>
  <tr>
    <td width="295" height="181" align="right"><img src="images/logo/false.jpg" width="96" height="96" /></td>
    <td width="267" align="center"><span class="STYLE11">ע��ʧ��.</span>
      <p><span class="STYLE1"><a href="registry.jsp">�������ע��</a></span></p></td>
    <td width="220" align="center"><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
  <tr>
    <td height="14" colspan="3">&nbsp;</td>
  </tr>
</table>
</div>
</center>	
<br />
<center>
<div id="sucessDiv">
<table width="782" border="0" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td height="14" colspan="3">&nbsp;</td>
  </tr>
  <tr>
    <td width="291" height="181" align="right"><img src="images/logo/ok.gif" width="100" height="90" /></td>
    <td width="266" align="center"><p><span class="STYLE11">��ϲ${name }������ע��ɹ���</span></p>
      <p><span class="STYLE1"><a href="/ebuy/initReg">������ص�½</a></span></p></td>
    <td width="217" align="center"><!--DWLayoutEmptyCell-->&nbsp;</td>
  </tr>
  <tr>
    <td height="14" colspan="3">&nbsp;</td>
  </tr>
</table>
</div>
</center>
<br />
<jsp:include page="../common/copyright.jsp" flush="true"/>