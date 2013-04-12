<%@ page contentType="text/html;charset=gb2312" %>
<%@taglib  uri="/struts-tags"  prefix="s"%> 
<html>
<head><title>eBuy电子商务</title>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
.STYLE2 {
	font-size: 14px;}
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
.STYLE4 {
	font-size: 36px;
	font-family: "创艺简行楷";
	color: #000099;
}

-->
</style>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312"></head>

<body>
<center>
<table width="520" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td height="40" colspan="3" align="center" bgcolor="#eeeeee"><span class="STYLE4">商品详细信息</span></td>
    </tr>
  <tr>
    <td width="127" height="30" align="center"><span class="STYLE1">商品类型</span>：</td>
    <td height="30" colspan="2" class="STYLE2">&nbsp;${product.type}</td>
    </tr>
  <tr>
    <td width="127" height="30" align="center"><span class="STYLE1">商品ID</span>：</td>
    <td width="238" height="30" class="STYLE2">&nbsp;${product.id}</td>
    <td width="127" height="30" rowspan="4" align="center" valign="middle"><img src="${product.image}" width="110"/></td>
  </tr>
  <tr>
    <td width="127" height="30" align="center"><span class="STYLE1">商品名称</span>：</td>
    <td height="30" class="STYLE2">&nbsp;${product.name}</td><a href="menu_index_down.jsp"></a>
    </tr>
  <tr>
    <td width="127" height="30" align="center"><span class="STYLE1">商品原价</span>：</td>
     <td height="30" align="left" style="text-decoration:line-through;color:#FF0000">
	<font size="2">&nbsp;￥${product.price*1.3} &nbsp;</font> </td>
    </tr>
  <tr>
    <td width="127" height="30" align="center"><span class="STYLE1">商品现价</span>：</td>
    <td height="30" class="STYLE2">&nbsp;<font size="2" color="red">￥${product.price}</font></td>
    </tr>
  
  <tr>
    <td width="127" align="center"><span class="STYLE1">商品描述</span>：</td>
    <td height="30" colspan="2"><textarea name="p_description" cols="45" rows="12">${product.description}</textarea></td>
  </tr>
  <tr class="STYLE2">
    <td height="40" colspan="3" align="center"><a href="/ebuy/main" class="styleac">[返回首页]</a></td>
  </tr>
</table>
</center>
</body>
</html>