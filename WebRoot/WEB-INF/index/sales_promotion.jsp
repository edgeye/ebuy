<%@ page contentType="text/html;charset=gbk" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script type="text/javascript">
	$(function() {
		$('#view').click(function() {
			$.load('/ebuy/checkCart');
		});
	});
	function addPro(id) {
		var idd = $('#buy'+id)
		$.ajax({
		'url':'buyProduct',
		'type':'post',
		'data': {'id':id},
		'dataType':'text',
		'success':function(data) {
			if(data=='yes') {
				
			}else {
				alert('此商品已购买过，请查看购物车');
			}
		},
		'error':function(xhr) {
			alert('系统异常，稍后重试');
		}
	});
	}
</script>
<table width="183" border="0" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
          <!--DWLayoutTable-->
		 <tr>
            <td height="30" colspan="2" align="center" background="images/logo/back_sales.gif"><span class="STYLE2">促销商品</span></td>
      </tr>
	   <tr>
            <td height="7" colspan="2" align="center" valign="top"><!--DWLayoutEmptyCell-->&nbsp;</td>
          </tr>
        <s:iterator value="products3" status="count">
        <tr>
	     <td width="88" rowspan="4" align="center" valign="middle"><img src="../" width="70"/></td>
	     <td width="96" height="24" align="center" class="STYLE1"></td>
	   </tr>
	    <tr>
	      <td align="center" style="text-decoration:line-through;color:#FF0000">
		<font size="1">原价：${price*1.3 } </font> </td>
	      </tr>
	    <tr>
	     <td height="7" align="center" valign="top"><span class="STYLE1">现价</span>：<font size="2">￥${price }</font></td>
	     </tr>
	   <tr>
	     <td height="7" align="center" valign="top"><a href="#" onClick="window.location.href='/ebuy/productDetail?id=${id}'">
	     <input name="see" type="button" class="STYLE1" value="详情"></a>
	     <input name="buy" onClick="addPro(${id})" type="button" class="STYLE1" id="buy${id}" value="购买"></td>
	   </tr>
	   <tr>
	     <td height="7" colspan="2" align="center" valign="top"><!--DWLayoutEmptyCell-->&nbsp;</td>
	     </tr>
	     </s:iterator>
        </table>