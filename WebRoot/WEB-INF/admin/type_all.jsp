<%@ page contentType="text/html;charset=gb2312" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
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
    <td height="35" colspan="4" align="center" bgcolor="#99CCFF"><span class="STYLE2">�����</span></td>
  </tr>
  <s:iterator value="mainTypes" status="st">
  <tr>
    <td width="40" height="40" align="center" class="STYLE1"><s:property value="#st.index+1"/></td>
    <td width="290" align="center"><span class="STYLE2">${type }</span></td>
    <td width="70" align="center"><span class="STYLE1">[ <a href="/ebuy/updateType?id=${id }">�޸�</a> ]</span></td>
    <td width="70" align="center"><span class="STYLE1">[ <a href="/ebuy/deleteType?id=${id }">ɾ��</a> ]</span></td>
  </tr>
  </s:iterator>
  <tr>
    <td height="21" colspan="4" align="right"><span class="STYLE1"><a href="/ebuy/addType">��������</a></span>&nbsp;</td>
  </tr>
  	<tr>
		<td height="30" colspan="5" align="center">
			<p align="center" class="STYLE1">
				<!-- �����ǰҳ�����0������ҳ����һҳ������Ч -->
				<s:if test="#request.currentPage>0">
					<span><a href="/ebuy/viewType?currentPage=0"><u><b>��ҳ</b></u></a></span>
					<span><a href="/ebuy/viewType?currentPage=${currentPage-1 }"><u><b>��һҳ</b></u></a></span>&nbsp;&nbsp;&nbsp;
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
					<span><a href="/ebuy/viewType?currentPage=${currentPage+1 }"><u><b>��һҳ</b></u></a></span>
					<span><a href="/ebuy/viewType?currentPage=${maxPage-1 }"><u><b>βҳ</b></u></a></span>
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
