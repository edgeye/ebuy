<%@ page contentType="text/html;charset=gb2312" %>
<!-- ����struts2��ǩ�� -->
<%@taglib  uri="/struts-tags"  prefix="s"%>
<style type="text/css">
<!--
.STYLE1 {font-size: 12px}
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
    <td width="66" height="30" align="center" bgcolor="#99CCFF" class="STYLE2">�û���</td>
    <td width="94" align="center" bgcolor="#99CCFF" class="STYLE2"><span class="STYLE2">������</span></td>
    <td width="95" align="center" bgcolor="#99CCFF" class="STYLE2"><span class="STYLE2">����ʱ��</span></td>
    <td width="77" align="center" bgcolor="#99CCFF" class="STYLE2"><span class="STYLE2">�ܽ��</span></td>
    <td colspan="2" align="center" bgcolor="#99CCFF" class="STYLE2"><span class="STYLE2">����</span></td>
    </tr>
    <!-- �������ϵ���Start -->
    <s:iterator value="orders" status="st">
  <tr>
    <td height="35" align="center" class="STYLE2">${user}</td>
    <td height="32" align="center" class="STYLE2">${itemid }</td>
    <td height="32" align="center" class="STYLE2">${time }</td>
    <td align="center" class="STYLE2">${sum }</td>
    <td width="107" height="32" align="center" class="STYLE1"><span class="STYLE1">[ <a href="/ebuy/checkOrder?id=${id }">�鿴��ϸ����</a> ]</span></td>
    <td width="67" align="center" class="STYLE1"><span class="STYLE1">[ <a href="/ebuy/deleteOrder?id=${id }">ɾ��</a> ]</span></td>
  </tr>
  </s:iterator>
    <!-- �������ϵ���End -->
   <tr>
		<td height="30" colspan="6" align="center">
			<p align="center" class="STYLE1">
				<!-- �����ǰҳ�����0������ҳ����һҳ������Ч -->
				<s:if test="#request.currentPage>0">
					<span><a href="/ebuy/queryOrders?currentPage=0"><u><b>��ҳ</b></u></a></span>
					<span><a href="/ebuy/queryOrders?currentPage=${currentPage-1 }"><u><b>��һҳ</b></u></a></span>&nbsp;&nbsp;&nbsp;
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
					<span><a href="/ebuy/queryOrders?currentPage=${currentPage+1 }"><u><b>��һҳ</b></u></a></span>
					<span><a href="/ebuy/queryOrders?currentPage=${maxPage-1 }"><u><b>βҳ</b></u></a></span>
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