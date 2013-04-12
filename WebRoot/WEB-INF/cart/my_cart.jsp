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
	font-family: "���ռ��п�";
	color: #000099;
}
-->
</style>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script type="text/javascript">
	function updateQty(id) {
		var qty = $('#qty' + id).val();
		var pid = $('#pid' + id).val();
		if(checkQty(id)) {
			$.ajax({
				'url':'updateQty',
				'type':'post',
				'data': {'qty':qty, 'id':pid},
				'dataType':'text',
				'success':function(data) {
					window.location.reload();
				},
				'error':function(xhr) {
					alert('ϵͳ�쳣���Ժ�����');
				}
			});
		}
	}
	function checkQty(id) {
		var qty = $.trim($('#qty'+id).val());
		var reg = /^[1-9]+\d*$/;
		if(!reg.test(qty)) {
			alert('������Ϸ�����');
			return false;
		}
		return true;
	}
</script>
</head>
<body>
<jsp:include page="../common/title.jsp" flush="true"/>
<jsp:include page="../common/menu.jsp" flush="true"/>
<center>
<table width="782"  border="1" bordercolor="#99CCFF" cellspacing="0" cellpadding="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
       <tr align="center" valign="middle">
        <td height="21" colspan="2"></td>
        </tr>
	    <tr>
          <td width="183" align="center" valign="top"><jsp:include page="../login/login.jsp" flush="true"/></td>
          <td width="602" valign="top"><table width="100%"  border="0" bordercolor="#99CCFF" style="border-collapse:collapse" cellspacing="0" cellpadding="0">
                      <tr>
                        <td height="14" colspan="2" align="center">&nbsp;</td>
                      </tr>
                      <tr>
                        <td height="37" align="center" bgcolor="#eeeeee"><span class="STYLE10">�ҵĹ��ﳵ</span></td>
                      </tr>
                      <tr>
                        <td colspan="2">&nbsp;</td>
                      </tr>
                      <tr>
                        <td colspan="2">
<form action="my_cart.jsp" method="post">
<table width="96%" height="83" border="1" bordercolor="#99CCFF" align="center" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <tr align="center" valign="middle">
        <td height="27" class="STYLE1">��Ʒ���</td>
        <td class="STYLE1">��Ʒ����</td>
        <td height="27" class="STYLE1">����</td>
        <td height="27" class="STYLE1">����</td>
        <td height="27" class="STYLE1">���</td>
        <td class="tableBorder_B1">&nbsp;</td>
      </tr> 
      <s:iterator value="list1">
      <tr align="center" valign="middle"> 
        <td width="108" height="27"><font size="2">${product.id}</font></td>
        <td width="201" height="27"><font size="2">${product.name}</font></td>
        <td width="66" height="27"><font size="2">��${product.price}</font></td> 
        <td width="80" height="27">
        <input name="num" size="3" type="text" class="txt_grey" id="qty${product.id}" value="${qty}" />
        <a href="javascript:updateQty(${product.id})" id="update" class="STYLE1">�޸�</a>
        <input type="hidden" name="pid" id="pid${product.id}" value="${product.id}"/> 
        </td> 
        <td width="65" height="27"><font size="2">��${product.price*qty}</font></td> 
        <td width="41"><a href="/ebuy/delProduct?id=${product.id}" class="STYLE1">ɾ��</a></td>
	</tr>
	</s:iterator>
      <tr align="center" valign="middle">
        <td height="27" colspan="7" align="left"><span class="STYLE1">�ϼ��ܽ��</span><font size="2"><font size="2">��</font></font><span id="total" class="STYLE9">��${totalPrice}</span></td>
        </tr>
      </table>
<table width="100%" height="83" border="0" bordercolor="#99CCFF" align="center" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <tr align="center" valign="middle">
        <td height="21" colspan="2">
        <input type="button" class="STYLE1" value="��������" onClick="window.location.href='/ebuy/main'"/><font size="2"> &nbsp; 
        <input type="button" class="STYLE1" value="ȥ����̨����" onClick="window.location.href='/ebuy/checkout'"/> &nbsp; 
        <input type="button" class="STYLE1" value="��չ��ﳵ" onClick="window.location.href='/ebuy/emptyCart'"/></font>
        </td>
        </tr>
	  <tr align="center" valign="middle">
        <td height="10">&nbsp;</td>
        <td height="10" colspan="-3" align="left">&nbsp;</td>
      </tr>
      
</table></form>						</td>
                      </tr>
                      <tr>
                        <td colspan="2">&nbsp;</td>
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
<jsp:include page="../common/copyright.jsp" flush="true"/>
</body>
</html>
