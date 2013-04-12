<%@ page contentType="text/html; charset=gb2312" language="java" import="java.sql.*" errorPage="" %>
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
.STYLE9 {color: #FF0000}
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
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script language="javascript">
<!--
	function check_pay(form)
	{
		if(form.pay_fangshi.value=="")
		{
			alert("请选择您的付款方式");
			form.pay_fangshi.focus();
			return false;
		}
		if(form.pay_address.value=="")
		{
			alert("请输入您的地址");
			form.pay_address.focus();
			return false;
		}
		if(form.pay_email.value=="")
		{
			alert("请输入您的Eamil");
			form.pay_email.focus();
			return false;
		}
		if(form.pay_email.value.indexOf("@")==-1 ||(form.pay_email.value.indexOf(".")==-1))
		{
			alert("错误的Email格式，请填写正确的电子邮箱");
			form.pay_email.focus();
			return false;
		}
	}
	$(function() {
		$('#confirmOrder').click(function() {
			$('#orderForm').attr('action', '/ebuy/confirmOrder');
			$('#orderForm').attr('method', 'post');
			$('#orderForm').submit();
		});
	});
-->
</script>

</head>
<body>
<jsp:include page="../common/title.jsp" flush="true"/>
<jsp:include page="../common/menu.jsp" flush="true"/>
<form name="orderForm" id="orderForm">
<center>
<table width="782"  border="1" bordercolor="#99CCFF" cellspacing="0" cellpadding="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
        <tr>
          <td width="183" align="center" valign="top"><jsp:include page="../login/login.jsp" flush="true"/></td>
          <td width="602" valign="top"><table width="100%"  border="0" bordercolor="#99CCFF" style="border-collapse:collapse" cellspacing="0" cellpadding="0">
            <!--DWLayoutTable-->
                      <tr>
                        <td height="14" colspan="5" align="center">&nbsp;</td>
                      </tr>
                      <tr>
                        <td height="37" colspan="5" align="center" bgcolor="#eeeeee"><span class="STYLE10">订单详细信息</span></td>
                      </tr>
                      <tr>
                        <td width="2%" height="37" align="center">&nbsp;</td>
                        <td height="37" colspan="2" align="center" ><!--DWLayoutEmptyCell-->&nbsp;</td>
                        <td width="43%" align="center">&nbsp;</td>
                        <td width="2%">&nbsp;</td>
                      </tr>
                      <tr>
                        <td height="24">&nbsp;</td>
                        <td colspan="2">&nbsp;<span class="STYLE1">用户名</span>：${sessionScope.customer.name}<font size="2"></font></td>
                        <td>&nbsp;<span class="STYLE1">订单号</span>：${id}<input type="hidden" name="id" value="${id}"/><font size="2" color="#FF0000"> (请记住您的订单号)</font></td>
                        <td>&nbsp;</td>
                      </tr>
                      <tr>
                        <td height="24">&nbsp;</td>
                        <td colspan="2">&nbsp;<span class="STYLE1">订购人的E_mail</span>：${email}<input type="hidden" name="email" value="${email}"/><font size="2"></font></td>
                        <td>&nbsp;<span class="STYLE1">订单时间</span>：${time}<input type="hidden" name="time" value="${time}"/><font size="2"></font></td>
                        <td>&nbsp;</td>
                      </tr>
                      <tr>
                        <td height="24">&nbsp;</td>
                        <td colspan="3">&nbsp;<span class="STYLE1">订购人的地址</span>：${address}<input type="hidden" name="address" value="${address}"/><font size="2"></font></td>
                        <td>&nbsp;</td>
                      </tr>
                      <tr>
                        <td height="24">&nbsp;</td>
                        <td colspan="3">&nbsp;<span class="STYLE1">付款方式</span>：${payment}<input type="hidden" name="payment" value="${payment}"/><font size="2"></font></td>
                        <td>&nbsp;</td>
                      </tr>
                      <tr>
                        <td height="24">&nbsp;</td>
                        <td colspan="3">&nbsp;<span class="STYLE1">付款备注</span>：${msg}<input type="hidden" name="msg" value="${msg}"/><font size="2" color="#FF0000"></font></td>
                        <td>&nbsp;</td>
                      </tr>
                      <tr>
                        <td>&nbsp;</td>
                        <td colspan="3">&nbsp;</td>
                        <td>&nbsp;</td>
                      </tr>
                      <tr>
                        <td>&nbsp;</td>
                        <td colspan="3"><hr size="1" color="#99CCFF" width="560"></td>
                        <td>&nbsp;</td>
                      </tr>
                      <tr>
                        <td colspan="5">
	<table width="95%" height="83" border="1" bordercolor="#99CCFF" align="center" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <tr align="center" valign="middle">
        <td height="27" class="STYLE1">商品编号</td>
        <td class="STYLE1">商品名称</td>
        <td height="27" class="STYLE1">单价</td>
        <td height="27" class="STYLE1">数量</td>
        <td width="86" height="27" class="STYLE1">金额</td>
        </tr> 
     <s:iterator value="list1">
      <tr align="center" valign="middle"> 
        <td width="110" height="27"><font size="2">${product.id}</font></td> 
        <td width="197" height="27"><font size="2">${product.name}</font></td>
        <td width="79" height="27"><font size="2">￥${product.price}</font></td> 
        <td width="52" height="27" class="STYLE1">${qty}</td> 
        <td height="27"><font size="2">￥${qty*product.price}</font></td> 
	</tr>
	</s:iterator>
	
      </table>
	<table width="100%" height="83" border="0" bordercolor="#99CCFF" align="center" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <tr align="center" valign="middle">
        <td height="10" colspan="3"><hr size="1" color="#99CCFF" width="560"></td>
        </tr>
      <tr align="center" valign="middle">
		<td width="40%" height="10">&nbsp;</td>
        <td width="32%">&nbsp;</td>
        <td width="28%" height="10" colspan="-3" align="left"><span class="STYLE1">合计总金额</span><font size="2"><font size="2">：</font></font><span class="STYLE9">￥${totalPrice}<input type="hidden" name="sum" id="sum" value="${totalPrice}"/></span></td>
		</tr>
      <tr align="center" valign="middle">
        <td height="26">&nbsp;</td>
        <td>&nbsp;</td>
        <td height="26" colspan="-3" align="left">&nbsp;</td>
      </tr>
      <tr align="center" valign="middle">
        <td height="29" colspan="3"><input name="button" id="confirmOrder" type="button" class="STYLE1" value=" 确定订购 "/>          &nbsp;&nbsp;
          <input type="button" class="STYLE1" value=" 取消订购 " onClick="history.go(-1);"/></td></tr>
	</table></td>
                      </tr>
                      
                      <tr>
                        <td height="30" colspan="5" align="center" valign="top"><!--DWLayoutEmptyCell-->&nbsp;</td>
                      </tr>
          </table>          </td>
        </tr>
      </table>
</td>
  </tr>
</table>
</td>
</tr>
</table>
</center>
<br>
</form>
<jsp:include page="../common/copyright.jsp" flush="true"/>
</body>
</html>
