<%@ page contentType="text/html;charset=gb2312" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<style type="text/css">
<!--
.STYLE1 {font-size: 12px;}
.STYLE2{font-size: 14px}
.STYLE3 {
	font-size: 36px;
	font-family: "���ռ��п�";
	color: #000099;
}
-->
</style>
<center>
<table width="782" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <!--DWLayoutTable-->
	 <tr>
			<td height="48" colspan="2" align="center" bgcolor="#eeeeee"><span class="STYLE3">eBuy�����̳� ����뽨�� </span></td>
	</tr>
	<s:iterator value="ideas">
      <tr>
        <td width="127" rowspan="4" align="center"><p><img src="${header }" width="50" height="50"></p></td>
        <td width="619" height="20" align="right" bgcolor="#99CCFF"> <span class="STYLE1">[������]&nbsp;${name }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[����ʱ��]&nbsp;${newTime }&nbsp;</span>&nbsp;&nbsp;</td>
      </tr>
      <tr>
        <td width="619" height="45"><span class="STYLE1">&nbsp;[����]&nbsp;${newMess }&nbsp;<span class="STYLE2"></span></span></td>
      </tr>
      <tr>
        <td width="619" height="20" align="right"><span class="STYLE1">[�ظ���]&nbsp;����Ա&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[����ʱ��]&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
      </tr>
      <tr>
       <td height="45"><span class="STYLE1">&nbsp;<span class="STYLE1">[�ظ�]</span>&nbsp;&nbsp;<span class="STYLE2"></span></span></td>
      </tr>
      </s:iterator>
      <tr>
        <td height="30" colspan="2"><p align="center" class="STYLE1">�� <span class="STYLE1"></span> ����¼,��<span class="STYLE1">  </span>��ʾ,��ǰҳ<strong>:</strong> �� <span class="STYLE1"> </span>ҳ
</p></td>
    </tr>
</table>
</center>