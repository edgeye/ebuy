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
		$('#update').click(function() {
			update();
		});
	});
	
	function checkName() {
		var name = $('#name').val();
		if(name=='') {
			alert('商品名称不能为空');
			return false;
		}
		return true;
	}
	function checkPrice() {
		var price = $('#price').val();
		var reg = /^\d+(.\d+)?$/
		if(price=='') {
			alert('商品价格不能为空');
			return false;
		}
		if(!reg.test(price)) {
			alert('商品价格只能为整数或小数');
			return false;
		}
		return true;
	}
	function checkQuantity() {
		var quantity = $('#quantity').val();
		var reg = /^\d+$/;
		if(quantity=='') {
			alert('商品数量不能为空');
			return false;
		}
		if(!reg.test(quantity)) {
			alert('商品数量只能为整数');
			return false;
		}
		return true;
	}
	function checkImage() {
		var image = $('#image').val();
		if(image=='') {
			alert('商品图片不能为空');
			return false;
		}
		return true;
	}
	function checkDescription() {
		var description = $('#description').val();
		if(description=='') {
			alert('商品描述不能为空');
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
	
	function update() {
		if(validProps()) {
			$('#updateForm').attr('action', '/ebuy/confirmUpdate');
			$('#updateForm').attr('method', 'post');
			$('#updateForm').submit();
		}
	}
	
</script>
<center>
<form name="updateForm" id="updateForm">
<table width="520" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td height="30" colspan="2" align="center" bgcolor="#99CCFF"><span class="STYLE2">查看/修改商品信息</span></td>
    </tr>
  <tr>
    <td width="146" height=40 align="center"><span class="STYLE1">商品类型</span>：</td>
    <td width="348" align="left">&nbsp;&nbsp;
      <select name="type" id="type">
	    <s:iterator value="mainTypes">
	    	<option value="${type}">${type}</option>
    	</s:iterator>
    </select>
    </td>
  </tr>
  <tr>
    <td height="30" align="center"><span class="STYLE1">商品ID</span>：</td>
    <td height="30" align="left">&nbsp;&nbsp;
      <input type="text" disabled="disabled" name="id2" id="id2" size="15" value="${product.id}"/>
    	<input type="hidden" name="id" id="id" value="${product.id}"/>
    </td>
  </tr>
  <tr>
    <td height="30" align="center"><span class="STYLE1">商品名称</span>：</td>
    <td height="30" align="left">&nbsp;&nbsp;
      <input type="text" name="name" id="name" size="30" value="${product.name}"  /></td>
  </tr>
  <tr>
    <td height="30" align="center"><span class="STYLE1">商品价格( RMB )</span>：</td>
    <td height="30" align="left">&nbsp;&nbsp;
      <input type="text" name="price" id="price" size="10" value="${product.price}" /></td>
  </tr>
  <tr>
    <td height="30" align="center"><span class="STYLE1">商品数量</span>：</td>
    <td height="30" align="left">&nbsp;&nbsp;
      <input type="text" name="quantity" id="quantity" size="10" value="${product.quantity}"  /></td>
  </tr>
  <tr>
    <td height="30" align="center"><span class="STYLE1">商品图片</span>：</td>
    <td height="30" align="left">&nbsp;&nbsp;
      <input type="file" name="image" id="image" size="30" value="${product.image}"/></td>
  </tr>
  
  <tr>
    <td height="94" align="center"><span class="STYLE1">商品描述</span>：</td>
    <td height="94" align="left">&nbsp;&nbsp;
      <textarea name="description" id="description" cols="42" rows="5">${product.description}</textarea></td>
  </tr>
  <tr>
    <td height="40" colspan="2" align="center"><input name="update" id="update" type="button"  class="STYLE1" value=" 修改 " />      &nbsp;&nbsp;
      <input type="button" class="STYLE1" value=" 返回 " onclick="history.go(-1);"/></td> 
  </tr>
</table>
</form>
</center>