<%@ page contentType="text/html;charset=gb2312" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<style type="text/css">
<!--
.STYLE1 {font-size: 12px;}
.STYLE2{font-size: 14px}
.STYLE3 {
	font-size: 36px;
	font-family: "创艺简行楷";
	color: #000099;
}
-->
</style>
<center>
<table width="782" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <!--DWLayoutTable-->
	 <tr>
			<td height="48" colspan="2" align="center" bgcolor="#eeeeee"><span class="STYLE3">eBuy电子商城 意见与建议 </span></td>
	</tr>
	<s:iterator value="ideas">
      <tr>
        <td width="127" rowspan="4" align="center"><p><img src="${header }" width="50" height="50"></p></td>
        <td width="619" height="20" align="right" bgcolor="#99CCFF"> <span class="STYLE1">[留言者]&nbsp;${name }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[留言时间]&nbsp;${newTime }&nbsp;</span>&nbsp;&nbsp;</td>
      </tr>
      <tr>
        <td width="619" height="45"><span class="STYLE1">&nbsp;[留言]&nbsp;${newMess }&nbsp;<span class="STYLE2"></span></span></td>
      </tr>
      <tr>
        <td width="619" height="20" align="right"><span class="STYLE1">[回复者]&nbsp;管理员&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[留言时间]&nbsp;&nbsp;&nbsp;&nbsp;</span></td>
      </tr>
      <tr>
       <td height="45"><span class="STYLE1">&nbsp;<span class="STYLE1">[回复]</span>&nbsp;&nbsp;<span class="STYLE2"></span></span></td>
      </tr>
      </s:iterator>
      <tr>
        <td height="30" colspan="2"><p align="center" class="STYLE1">共 <span class="STYLE1"></span> 个记录,分<span class="STYLE1">  </span>显示,当前页<strong>:</strong> 第 <span class="STYLE1"> </span>页
</p></td>
    </tr>
</table>
</center>