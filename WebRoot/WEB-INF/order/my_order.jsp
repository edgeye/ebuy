<%@ page contentType="text/html;charset=gb2312" %>
<!-- ����struts2��ǩ�� -->
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
.STYLE10 {
	font-size: 36px;
	font-family: "���ռ��п�";
	color: #000099;
}
-->
</style>

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
                      <tr>
                        <td height="14" align="center">&nbsp;</td>
                      </tr>
                      <tr>
                        <td height="37" align="center" bgcolor="#eeeeee"><span class="STYLE10">�ҵĶ���</span></td>
                      </tr>
                      <tr>
                        <td>&nbsp;</td>
                      </tr>
                      <tr>
                        <td>
<center>
<table width="96%" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td width="80" height="30" align="center" bgcolor="#FFFFFF" class="STYLE2">�û���</td>
    <td width="127" align="center" bgcolor="#FFFFFF" class="STYLE2">������</td>
    <td width="141" align="center" bgcolor="#FFFFFF" class="STYLE2">����ʱ��</td>
    <td width="83" align="center" bgcolor="#FFFFFF" class="STYLE2">�ܽ��</td>
    <td width="126" align="center" bgcolor="#FFFFFF" class="STYLE2">����</td>
    </tr>
    <!-- �������ϵ���Start -->
    <s:iterator value="orders" status="st">
  <tr>
    <td height="35" align="center" class="STYLE2">${user}</td>
    <td height="32" align="center" class="STYLE2">${itemid}</td>
    <td height="32" align="center" class="STYLE2"><span class="STYLE2">${time}</span></td>
    <td align="center" class="STYLE2">��${sum}</td>
    <td height="32" align="center" class="STYLE1"><span class="STYLE1">[ <a href="/ebuy/orderDetail?id=${id}" title="Ԥ��">�鿴��ϸ����</a> ]</span></td>
    </tr>
    </s:iterator>
    <!-- �������ϵ���End -->
   	<tr>
		<td height="30" colspan="5" align="center">
			<p align="center" class="STYLE1">
				<!-- �����ǰҳ�����0������ҳ����һҳ������Ч -->
				<s:if test="#request.currentPage>0">
					<span><a href="/ebuy/viewOrder?currentPage=0"><u><b>��ҳ</b></u></a></span>
					<span><a href="/ebuy/viewOrder?currentPage=${currentPage-1 }"><u><b>��һҳ</b></u></a></span>&nbsp;&nbsp;&nbsp;
				</s:if>
				<!-- �����ǰҳ��Ϊ0����Ϊ��һҳʱ������ҳ����һҳ������Ч -->
				<s:else>
					<span><b>��ҳ</b></span>
					<span><b>��һҳ</b></span>&nbsp;&nbsp;&nbsp;
				</s:else>
				
				�� <span class="STYLE1"><b>${totalRecord}</b></span> ����¼,
				�� <span class="STYLE1"><b>${maxPage}</b></span> ҳ��ʾ,
				<!-- currentPageĬ�ϴ�0��ʼ��ҳ����ʾ���1 -->
				��ǰҳ<strong>:</strong> �� <span class="STYLE1"><b>${currentPage+1 } </b></span>ҳ&nbsp;&nbsp;&nbsp;
				
				<!-- �����ǰҳ��С��βҳ������һҳ��βҳ������Ч -->
				<s:if test="#request.currentPage<#request.maxPage-1">
					<span><a href="/ebuy/viewOrder?currentPage=${currentPage+1 }"><u><b>��һҳ</b></u></a></span>
					<span><a href="/ebuy/viewOrder?currentPage=${maxPage-1 }"><u><b>βҳ</b></u></a></span>
				</s:if>
				<!-- �����ǰҳ�벻С��βҳ�����Ѿ������һҳʱ������һҳ��βҳ������Ч -->
				<s:else>
					<span><b>��һҳ</b></span>
					<span><b>βҳ</b></span>
				</s:else>
			</p>
		</td>
	</tr>
</table>
</center>
<table width="100%" height="42" border="0" bordercolor="#99CCFF" align="center" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <tr align="center" valign="middle">
        <td width="74%" height="21" class="tableBorder_B1">&nbsp;</td>
        <td width="26%" height="21" colspan="-3" align="left" class="tableBorder_B1"></td>
      </tr>
      <tr align="center" valign="middle">
        <td height="21" colspan="2"><input type="button" class="STYLE1" value=" ���ع��� " onClick="window.location.href='/ebuy/main'"/></td>
        </tr>
</table>						</td>
                      </tr>
                      <tr>
                        <td>&nbsp;</td>
                      </tr>
          </table>          </td>
        </tr>
      </table>
</center>
<br>
<jsp:include page="../common/copyright.jsp" flush="true"/>
</body>
</html>
