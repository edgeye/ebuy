<%@ page contentType="text/html;charset=gb2312" %>
<!-- ����Struts2��ǩ�� -->
<%@taglib  uri="/struts-tags"  prefix="s"%>
<style type="text/css">
<!--
.STYLE1 {font-size: 12px}
.STYLE2 {font-size: 14px; }
.STYLE3 {color: #FF0000}
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
    <td width="62" height="30" align="center"><span class="STYLE2">������</span></td>
    <td width="324" align="center"><span class="STYLE2">����뽨��</span></td>
    <td colspan="2" align="center"><span class="STYLE2">����</span></td>
  </tr>
  <!-- ������ϵ���Start -->
  <s:iterator value="ideas" status="st">
     <tr>
       <td rowspan="2" align="center"><p><img src=""></p></td>
       <td height="15" colspan="3" align="left" valign="middle"><span class="STYLE1">[������]&nbsp;&nbsp;${name}</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="STYLE1">[����ʱ��]&nbsp;&nbsp;</span> <span class="STYLE1">${newTime}</span></td>
     </tr>
    <tr>
      <td height="45" colspan="3" align="left" valign="middle"><span class="STYLE1">[����]</span><span class="STYLE1">&nbsp;&nbsp;${newMess}</span></td>
    </tr>
  <tr>
    <td height="45" align="center"><!--DWLayoutEmptyCell-->&nbsp;</td>
    <td height="45" align="left" valign="middle"><span class="STYLE1">[<span class="STYLE3">�ظ�</span>]&nbsp;&nbsp;${reMess }&nbsp;&nbsp;[${reTime }]</span></td>
    <td width="52" align="center"><span class="STYLE1">[ <a href="/ebuy/replyMessage?id=${id }">�ظ�</a> ]</span></td>
    <td width="52" align="center"><span class="STYLE1">[ <a href="/ebuy/deleteMessage?id=${id }">ɾ��</a> ]</span></td>
  </tr>
  </s:iterator>
   <!-- ������ϵ���End -->
   <tr>
		<td height="30" colspan="5" align="center">
			<p align="center" class="STYLE1">
				<!-- �����ǰҳ�����0������ҳ����һҳ������Ч -->
				<s:if test="#request.currentPage>0">
					<span><a href="/ebuy/viewMessage?currentPage=0"><u><b>��ҳ</b></u></a></span>
					<span><a href="/ebuy/viewMessage?currentPage=${currentPage-1 }"><u><b>��һҳ</b></u></a></span>&nbsp;&nbsp;&nbsp;
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
					<span><a href="/ebuy/viewMessage?currentPage=${currentPage+1 }"><u><b>��һҳ</b></u></a></span>
					<span><a href="/ebuy/viewMessage?currentPage=${maxPage-1 }"><u><b>βҳ</b></u></a></span>
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

