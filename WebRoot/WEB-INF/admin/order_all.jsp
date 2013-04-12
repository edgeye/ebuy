<%@ page contentType="text/html;charset=gb2312" %>
<!-- 引入struts2标签库 -->
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
    <td width="66" height="30" align="center" bgcolor="#99CCFF" class="STYLE2">用户名</td>
    <td width="94" align="center" bgcolor="#99CCFF" class="STYLE2"><span class="STYLE2">订单号</span></td>
    <td width="95" align="center" bgcolor="#99CCFF" class="STYLE2"><span class="STYLE2">订单时间</span></td>
    <td width="77" align="center" bgcolor="#99CCFF" class="STYLE2"><span class="STYLE2">总金额</span></td>
    <td colspan="2" align="center" bgcolor="#99CCFF" class="STYLE2"><span class="STYLE2">操作</span></td>
    </tr>
    <!-- 订单集合迭代Start -->
    <s:iterator value="orders" status="st">
  <tr>
    <td height="35" align="center" class="STYLE2">${user}</td>
    <td height="32" align="center" class="STYLE2">${itemid }</td>
    <td height="32" align="center" class="STYLE2">${time }</td>
    <td align="center" class="STYLE2">${sum }</td>
    <td width="107" height="32" align="center" class="STYLE1"><span class="STYLE1">[ <a href="/ebuy/checkOrder?id=${id }">查看详细资料</a> ]</span></td>
    <td width="67" align="center" class="STYLE1"><span class="STYLE1">[ <a href="/ebuy/deleteOrder?id=${id }">删除</a> ]</span></td>
  </tr>
  </s:iterator>
    <!-- 订单集合迭代End -->
   <tr>
		<td height="30" colspan="6" align="center">
			<p align="center" class="STYLE1">
				<!-- 如果当前页码大于0，则首页、上一页链接有效 -->
				<s:if test="#request.currentPage>0">
					<span><a href="/ebuy/queryOrders?currentPage=0"><u><b>首页</b></u></a></span>
					<span><a href="/ebuy/queryOrders?currentPage=${currentPage-1 }"><u><b>上一页</b></u></a></span>&nbsp;&nbsp;&nbsp;
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
					<span><a href="/ebuy/queryOrders?currentPage=${currentPage+1 }"><u><b>下一页</b></u></a></span>
					<span><a href="/ebuy/queryOrders?currentPage=${maxPage-1 }"><u><b>尾页</b></u></a></span>
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