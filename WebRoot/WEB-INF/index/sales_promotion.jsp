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
				alert('����Ʒ�ѹ��������鿴���ﳵ');
			}
		},
		'error':function(xhr) {
			alert('ϵͳ�쳣���Ժ�����');
		}
	});
	}
</script>
<table width="183" border="0" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
          <!--DWLayoutTable-->
		 <tr>
            <td height="30" colspan="2" align="center" background="images/logo/back_sales.gif"><span class="STYLE2">������Ʒ</span></td>
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
		<font size="1">ԭ�ۣ�${price*1.3 } </font> </td>
	      </tr>
	    <tr>
	     <td height="7" align="center" valign="top"><span class="STYLE1">�ּ�</span>��<font size="2">��${price }</font></td>
	     </tr>
	   <tr>
	     <td height="7" align="center" valign="top"><a href="#" onClick="window.location.href='/ebuy/productDetail?id=${id}'">
	     <input name="see" type="button" class="STYLE1" value="����"></a>
	     <input name="buy" onClick="addPro(${id})" type="button" class="STYLE1" id="buy${id}" value="����"></td>
	   </tr>
	   <tr>
	     <td height="7" colspan="2" align="center" valign="top"><!--DWLayoutEmptyCell-->&nbsp;</td>
	     </tr>
	     </s:iterator>
        </table>