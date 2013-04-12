<%@ page contentType="text/html;charset=gb2312" %>
<!-- 引入struts2标签库 -->
<%@taglib  uri="/struts-tags"  prefix="s"%>
<html>
<head>
<title>Easy Buy Online</title>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<link href="CSS/style.css" rel="stylesheet">
<style type="text/css">
<!--
.STYLE1 {font-size: 12px}
.STYLE2{
	font-size: 14px;
}
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
.STYLE10 {
	font-size: 36px;
	font-family: "创艺简行楷";
	color: #000099;
}
-->
</style>

</head>
<body>
<jsp:include page="../common/title.jsp" flush="true"/>
<jsp:include page="../common/menu.jsp" flush="true"/>
<center>
<table width="782"  border="1" bordercolor="#99CCFF" cellspacing="0" cellpadding="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
        <tr>
          <td width="183" align="center" valign="top"><jsp:include page="../login/login.jsp" flush="true"/></td>
          <td width="602" valign="top"><table width="100%"  border="0" bordercolor="#99CCFF" style="border-collapse:collapse" cellspacing="0" cellpadding="0">
                      <tr>
                        <td height="14" align="center">&nbsp;</td>
                      </tr>
                      <tr>
                        <td height="37" align="center" bgcolor="#eeeeee"><span class="STYLE10">我的订单</span></td>
                      </tr>
                      <tr>
                        <td>&nbsp;</td>
                      </tr>
                      <tr>
                        <td>
<center>
<table width="96%" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td width="80" height="30" align="center" bgcolor="#FFFFFF" class="STYLE2">用户名</td>
    <td width="127" align="center" bgcolor="#FFFFFF" class="STYLE2">订单号</td>
    <td width="141" align="center" bgcolor="#FFFFFF" class="STYLE2">订单时间</td>
    <td width="83" align="center" bgcolor="#FFFFFF" class="STYLE2">总金额</td>
    <td width="126" align="center" bgcolor="#FFFFFF" class="STYLE2">操作</td>
    </tr>
    <!-- 订单集合迭代Start -->
    <s:iterator value="orders" status="st">
  <tr>
    <td height="35" align="center" class="STYLE2">${user}</td>
    <td height="32" align="center" class="STYLE2">${itemid}</td>
    <td height="32" align="center" class="STYLE2"><span class="STYLE2">${time}</span></td>
    <td align="center" class="STYLE2">￥${sum}</td>
    <td height="32" align="center" class="STYLE1"><span class="STYLE1">[ <a href="/ebuy/orderDetail?id=${id}" title="预览">查看详细资料</a> ]</span></td>
    </tr>
    </s:iterator>
    <!-- 订单集合迭代End -->
   	<tr>
		<td height="30" colspan="5" align="center">
			<p align="center" class="STYLE1">
				<!-- 如果当前页码大于0，则首页、上一页链接有效 -->
				<s:if test="#request.currentPage>0">
					<span><a href="/ebuy/viewOrder?currentPage=0"><u><b>首页</b></u></a></span>
					<span><a href="/ebuy/viewOrder?currentPage=${currentPage-1 }"><u><b>上一页</b></u></a></span>&nbsp;&nbsp;&nbsp;
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
					<span><a href="/ebuy/viewOrder?currentPage=${currentPage+1 }"><u><b>下一页</b></u></a></span>
					<span><a href="/ebuy/viewOrder?currentPage=${maxPage-1 }"><u><b>尾页</b></u></a></span>
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
<table width="100%" height="42" border="0" bordercolor="#99CCFF" align="center" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <tr align="center" valign="middle">
        <td width="74%" height="21" class="tableBorder_B1">&nbsp;</td>
        <td width="26%" height="21" colspan="-3" align="left" class="tableBorder_B1"></td>
      </tr>
      <tr align="center" valign="middle">
        <td height="21" colspan="2"><input type="button" class="STYLE1" value=" 返回购物 " onClick="window.location.href='/ebuy/main'"/></td>
        </tr>
</table>						</td>
                      </tr>
                      <tr>
                        <td>&nbsp;</td>
                      </tr>
          </table>          </td>
        </tr>
      </table>
</center>
<br>
<jsp:include page="../common/copyright.jsp" flush="true"/>
</body>
</html>
