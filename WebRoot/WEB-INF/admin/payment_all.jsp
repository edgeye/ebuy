<%@ page contentType="text/html;charset=gb2312" %>
<!-- ����struts2��ǩ�� -->
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
<center>
<table width="520" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td width="52" height="35" align="center" bgcolor="#99CCFF" class="STYLE2">���</td>
    <td width="234" align="center" bgcolor="#99CCFF" class="STYLE2">֧����ʽ</td>
    <td height="35" colspan="2" align="center" bgcolor="#99CCFF" class="STYLE2">����</td>
    </tr>
  <!-- ����֧����ʽ����Start -->
  <s:iterator value="payments" status="st">
  <tr>
    <td height="30" align="center" class="STYLE1"><s:property value="#st.index+1"/></td>
    <td height="30" align="center" class="STYLE2">${way}</td>
    <td width="123" height="30" align="center" class="STYLE1">[ <a href="/ebuy/updatePayment?id=${id}">�鿴/�޸�</a> ]</td>
    <td width="101" height="30" align="center" class="STYLE1">[ <a href="/ebuy/deletePayment?id=${id}">ɾ��</a> ]</td>
  </tr>
  </s:iterator>
  <!-- ����֧����ʽ����End -->
  	<tr>
		<td height="30" colspan="5" align="center">
			<p align="center" class="STYLE1">
				<!-- �����ǰҳ�����0������ҳ����һҳ������Ч -->
				<s:if test="#request.currentPage>0">
					<span><a href="/ebuy/viewPayment?currentPage=0"><u><b>��ҳ</b></u></a></span>
					<span><a href="/ebuy/viewPayment?currentPage=${currentPage-1 }"><u><b>��һҳ</b></u></a></span>&nbsp;&nbsp;&nbsp;
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
					<span><a href="/ebuy/viewPayment?currentPage=${currentPage+1 }"><u><b>��һҳ</b></u></a></span>
					<span><a href="/ebuy/viewPayment?currentPage=${maxPage-1 }"><u><b>βҳ</b></u></a></span>
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
