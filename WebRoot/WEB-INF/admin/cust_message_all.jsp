<%@ page contentType="text/html;charset=gb2312" %>
<!-- 引入Struts2标签库 -->
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
    <td width="62" height="30" align="center"><span class="STYLE2">留言者</span></td>
    <td width="324" align="center"><span class="STYLE2">意见与建议</span></td>
    <td colspan="2" align="center"><span class="STYLE2">操作</span></td>
  </tr>
  <!-- 意见集合迭代Start -->
  <s:iterator value="ideas" status="st">
     <tr>
       <td rowspan="2" align="center"><p><img src=""></p></td>
       <td height="15" colspan="3" align="left" valign="middle"><span class="STYLE1">[留言者]&nbsp;&nbsp;${name}</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<span class="STYLE1">[发表时间]&nbsp;&nbsp;</span> <span class="STYLE1">${newTime}</span></td>
     </tr>
    <tr>
      <td height="45" colspan="3" align="left" valign="middle"><span class="STYLE1">[留言]</span><span class="STYLE1">&nbsp;&nbsp;${newMess}</span></td>
    </tr>
  <tr>
    <td height="45" align="center"><!--DWLayoutEmptyCell-->&nbsp;</td>
    <td height="45" align="left" valign="middle"><span class="STYLE1">[<span class="STYLE3">回复</span>]&nbsp;&nbsp;${reMess }&nbsp;&nbsp;[${reTime }]</span></td>
    <td width="52" align="center"><span class="STYLE1">[ <a href="/ebuy/replyMessage?id=${id }">回复</a> ]</span></td>
    <td width="52" align="center"><span class="STYLE1">[ <a href="/ebuy/deleteMessage?id=${id }">删除</a> ]</span></td>
  </tr>
  </s:iterator>
   <!-- 意见集合迭代End -->
   <tr>
		<td height="30" colspan="5" align="center">
			<p align="center" class="STYLE1">
				<!-- 如果当前页码大于0，则首页、上一页链接有效 -->
				<s:if test="#request.currentPage>0">
					<span><a href="/ebuy/viewMessage?currentPage=0"><u><b>首页</b></u></a></span>
					<span><a href="/ebuy/viewMessage?currentPage=${currentPage-1 }"><u><b>上一页</b></u></a></span>&nbsp;&nbsp;&nbsp;
				</s:if>
				<!-- 如果当前页码为0，即为第一页时，则首页、上一页链接无效 -->
				<s:else>
					<span><b>首页</b></span>
					<span><b>上一页</b></span>&nbsp;&nbsp;&nbsp;
				</s:else>
				
				共 <span class="STYLE1"><b>${totalRecord}</b></span> 个记录,
				分 <span class="STYLE1"><b>${maxPage}</b></span> 页显示,
				<!-- currentPage默认从0开始，页面显示则加1 -->
				当前页<strong>:</strong> 第 <span class="STYLE1"><b>${currentPage+1 } </b></span>页&nbsp;&nbsp;&nbsp;
				
				<!-- 如果当前页码小于尾页，则下一页、尾页链接有效 -->
				<s:if test="#request.currentPage<#request.maxPage-1">
					<span><a href="/ebuy/viewMessage?currentPage=${currentPage+1 }"><u><b>下一页</b></u></a></span>
					<span><a href="/ebuy/viewMessage?currentPage=${maxPage-1 }"><u><b>尾页</b></u></a></span>
				</s:if>
				<!-- 如果当前页码不小于尾页，即已经是最后一页时，则下一页、尾页链接无效 -->
				<s:else>
					<span><b>下一页</b></span>
					<span><b>尾页</b></span>
				</s:else>
			</p>
		</td>
	</tr>
  </table>
</center>

