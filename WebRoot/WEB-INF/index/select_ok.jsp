<%@ page contentType="text/html;charset=gb2312" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<jsp:include page="../common/title.jsp" flush="true"/>
<jsp:include page="../common/menu.jsp" flush="true"/>

<style type="text/css">
<!--
.STYLE1 {font-size: 12px}
.STYLE2 {
	font-size: 14px;
}
.STYLE5 {color: #FFFFFF}
.STYLE6 {font-size: 12px; color: #FF0000; }
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
				'url':'addProduct',
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


<center>
<table width="782" border="1" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
  <!--DWLayoutTable-->
  <tr>
    <td width="186" height="245" valign="top">
    <table width="184" border="0" bordercolor="#99CCFF" cellpadding="0" cellspacing="0" style="border-collapse:collapse">
      <!--DWLayoutTable-->
      <tr>
        <td width="184" align="left" valign="baseline"><jsp:include page="../login/login.jsp" flush="true"/></td>
      </tr>
    </table>
	</td>
    <td width="590" rowspan="5" align="center" valign="top">
    <table width="100%" border="0" cellpadding="0" cellspacing="0">
      <!--DWLayoutTable-->
    <tr>
        <td width="200" height="30" align="center" background="images/logo/back_new.gif"><span class="STYLE2">&nbsp;搜索结果:</span></td>
        <td width="359" align="right"><!--DWLayoutEmptyCell-->&nbsp;</td>
    </tr>
    <tr>
    <center>
	<table width="200" border="0" bordercolor="#99CCFF" style="border-collapse:collapse">
  	<s:iterator value="results" status="count">
    <s:if test="#count.index%3==0">
  	<tr>
  	</s:if>
    	<td width="110" height="135" align="center" valign="middle"><img src="${image}" width="90"/></td>
    	<td width="100" align="center"><p class="STYLE5">============</p><p class="STYLE1">${name}</p><p><font size="2" color="#FF0000">￥${price}</font></p>
    	<p><a href="#"><input name="see" type="button" class="STYLE1" value="详情"></a>
    	<input name="see" type="button" class="STYLE1" onClick="addPro(${id})" value="购买">
		</p></td>
  	<s:if test="#count.index%3==2||#count.last">
  	</tr>
  	 </s:if>
    </s:iterator>
	</table><p><hr size="1" color="#99CCFF" /><input type="button" class="STYLE1" value=" 返回 " onclick="window.location.href='/ebuy/main'"/></p>
    </center>
    </tr>
    </table>
    </td>
  </tr>
</table>
<br />
<jsp:include page="../common/copyright.jsp" flush="true"/>
</center>





