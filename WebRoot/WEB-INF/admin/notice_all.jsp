<%@ page contentType="text/html;charset=gb2312" %>
<!-- ����struts2��ǩ�� -->
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
-->
</style>

<center>
<table width="520" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr bgcolor="#99CCFF">
    <td width="60" height="30" align="center"><span class="STYLE2">������</span></td>
    <td width="293" align="center"><span class="STYLE2">��������</span></td>
    <td colspan="2" align="center"><span class="STYLE2">����</span></td>
  </tr>
  <!-- ���漯�ϵ���Start -->
  <s:iterator value="notices" status="count">
  <tr>
    <td height="46" rowspan="2" align="center"><img src="${header }" /></td>
    <td height="15" colspan="3" align="left" valign="middle"> <span class="STYLE1">[������] ${admin }</span> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="STYLE1">[����ʱ��] ${time }</span></td>
    </tr>
  <tr>
    <td height="45" align="left" valign="middle">&nbsp;<span class="STYLE1">${message }</span></td>
    <td width="81" align="center"><span class="STYLE1">[ <a href="/ebuy/updateNotice?id=${id }">�鿴/�޸�</a> ]</span></td>
    <td width="56" align="center"><span class="STYLE1">[ <a href="/ebuy/deleteNotice?id=${id }">ɾ��</a> ]</span></td>
  </tr>
  </s:iterator>
  <!-- ���漯�ϵ���End -->
   	<tr>
		<td height="30" colspan="5" align="center">
			<p align="center" class="STYLE1">
				<!-- �����ǰҳ�����0������ҳ����һҳ������Ч -->
				<s:if test="#request.currentPage>0">
					<span><a href="/ebuy/viewNotice?currentPage=0"><u><b>��ҳ</b></u></a></span>
					<span><a href="/ebuy/viewNotice?currentPage=${currentPage-1 }"><u><b>��һҳ</b></u></a></span>&nbsp;&nbsp;&nbsp;
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
					<span><a href="/ebuy/viewNotice?currentPage=${currentPage+1 }"><u><b>��һҳ</b></u></a></span>
					<span><a href="/ebuy/viewNotice?currentPage=${maxPage-1 }"><u><b>βҳ</b></u></a></span>
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

