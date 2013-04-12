<%@ page contentType="text/html;charset=gb2312" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px;
}
.STYLE2 {
	font-size: 14px;
}

-->
</style>
<script language="javascript" src="js/jquery-1.8.2.js"></script>
<script>
	$(function() {
		$('#add').click(function() {
			add();
		});
	});
	
	function checkName() {
		var name = $('#name').val();
		if(name=='') {
			alert('��Ʒ���Ʋ���Ϊ��');
			return false;
		}
		return true;
	}
	function checkPrice() {
		var price = $('#price').val();
		//var reg = /^(\d*\.)?\d+$/;
		if(price=='') {
			alert('��Ʒ�۸���Ϊ��');
			return false;
		}
		//if(reg.test(price)) {
		//	alert('��������д��Ʒ�۸�');
		//	return false;
		//}
		return true;
	}
	function checkQuantity() {
		var quantity = $('#quantity').val();
		//var reg = /^[0-9]*[1-9][0-9]*$/;
		if(quantity=='') {
			alert('��Ʒ��������Ϊ��');
			return false;
		}
		//if(reg.test(quantity)) {
		//	alert('��������д��Ʒ����');
		//	return false;
		//}
		return true;
	}
	function checkImage() {
		var image = $('#image').val();
		if(image=='') {
			alert('��ƷͼƬ����Ϊ��');
			return false;
		}
		return true;
	}
	function checkDescription() {
		var description = $('#description').val();
		if(description=='') {
			alert('��Ʒ��������Ϊ��');
			return false;
		}
		return true;
	}
	
	function validProps() {
		if(!checkName()) return false;
		if(!checkPrice()) return false;
		if(!checkQuantity()) return false;
		if(!checkImage()) return false;
		if(!checkDescription()) return false;
		return true;
	}
	
	function add() {
		if(validProps()) {
			$('#addForm').attr('action', '/ebuy/confirmAdd');
			$('#addForm').attr('method', 'post');
			$('#addForm').submit();
		}
	}
</script>
<center>
<form name="addForm" id="addForm">
<table width="520" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td height="30" colspan="2" align="center" bgcolor="#99CCFF"><span class="STYLE2">�����Ʒ</span></td>
    </tr>
  <tr>
    <td width="146" height=40 align="center"><span class="STYLE1">��Ʒ����</span>��</td>
    <td width="348" align="left">&nbsp;&nbsp;
      	<select name="type" id="type">
			 <s:iterator value="mainTypes">
	    		<option value="${type}">${type}</option>
    		</s:iterator>
    	</select></td>
  </tr>
  <tr>
    <td height="30" align="center"><span class="STYLE1">��Ʒ����</span>��</td>
    <td height="30" align="left">&nbsp;&nbsp;
      <input type="text" name="name" id="name" size="30" /></td>
  </tr>
  <tr>
    <td height="30" align="center"><span class="STYLE1">��Ʒ�۸�( RMB )</span>��</td>
    <td height="30" align="left">&nbsp;&nbsp;
      <input type="text" name="price" id="price" size="10" /></td>
  </tr>
  <tr>
    <td height="30" align="center"><span class="STYLE1">��Ʒ����</span>��</td>
    <td height="30" align="left">&nbsp;&nbsp;
      <input type="text" name="quantity" id="quantity" size="10"  /></td>
  </tr>
  <tr>
    <td height="30" align="center"><span class="STYLE1">��ƷͼƬ</span>��</td>
    <td height="30" align="left">&nbsp;&nbsp;
      <input type="file" name="image" id="image" size="30" /></td>
  </tr>
  
  <tr>
    <td height="94" align="center"><span class="STYLE1">��Ʒ����</span>��</td>
    <td height="94" align="left">&nbsp;&nbsp;
      <textarea name="description" id="description" cols="42" rows="5"></textarea></td>
  </tr>
  <tr>
    <td height="40" colspan="2" align="center"><input name="add" id="add" type="button" class="STYLE1" value=" ��� " />      &nbsp;&nbsp;
      <input type="reset" class="STYLE1" value=" ���� " /></td>
  </tr>
</table>
</form>
</center>