<%@ page contentType="text/html;charset=gb2312" %>
<!-- ����struts2��ǩ�� -->
<%@taglib  uri="/struts-tags"  prefix="s"%>

<style type="text/css">
<!--
.STYLE1 {font-size: 12px}
.STYLE2 {font-size:14px}
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
<table width="520" border="1" align="center" cellpadding="0" cellspacing="0" bordercolor="#99CCFF" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td width="56" height="30" align="center" bgcolor="#99CCFF"><span class="STYLE2">ͷ��</span></td>
    <td width="91" align="center" bgcolor="#99CCFF"><span class="STYLE2">�û���</span></td>
    <td width="103" align="center" bgcolor="#99CCFF"><span class="STYLE2">��ϵ�绰</span></td>
    <td colspan="3" align="center" bgcolor="#99CCFF"><span class="STYLE2">����</span></td>
   </tr>
   <!-- �ͻ���Ϣ�������Start -->
   <s:iterator value="customers" status="count">
  <tr>
    <td height="46" align="center"><img src="${header }"></td>
    <td height="46" align="center">${name }</td>
    <td height="46" align="center"><span class="STYLE2">${phone }</span></td>
    <td width="109" height="46" align="center"><span class="STYLE1">[ <a href="/ebuy/viewDetail?id=${id }">�鿴��ϸ����</a> ]</span></td>
    <td width="84" align="center"><span class="STYLE1">[ <a href="/ebuy/selectOrders?name=${name }">���׼�¼</a> ]</span></td>
    <td width="63" align="center"><span class="STYLE1">[ <a href="cust_delete.jsp?c_name=">ɾ��</a> ]</span></td>
  </tr>
  </s:iterator>
  <!-- �ͻ���Ϣ�������End -->
   <tr>
		<td height="30" colspan="6" align="center">
			<p align="center" class="STYLE1">
				<!-- �����ǰҳ�����0������ҳ����һҳ������Ч -->
				<s:if test="#request.currentPage>0">
					<span><a href="/ebuy/loadRight?currentPage=0"><u><b>��ҳ</b></u></a></span>
					<span><a href="/ebuy/loadRight?currentPage=${currentPage-1 }"><u><b>��һҳ</b></u></a></span>&nbsp;&nbsp;&nbsp;
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
					<span><a href="/ebuy/loadRight?currentPage=${currentPage+1 }"><u><b>��һҳ</b></u></a></span>
					<span><a href="/ebuy/loadRight?currentPage=${maxPage-1 }"><u><b>βҳ</b></u></a></span>
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