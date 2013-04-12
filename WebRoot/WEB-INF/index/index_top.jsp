<%@ page contentType="text/html;charset=gbk"%>
<%@taglib  uri="/struts-tags"  prefix="s"%>

<style type="text/css">
<!--
.STYLE1 {
	font-size: 12px
}

.STYLE2 {
	font-size: 14px;
}

.STYLE5 {
	color: #FFFFFF
}

.STYLE6 {
	font-size: 12px;
	color: #FF0000;
}
-->
</style>

<html>
	<head>
		<title>Easy Buy Online</title>
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
	</head>
	<body>
		<center>
			<table width="782" border="1" bordercolor="#99CCFF" cellpadding="0"
				cellspacing="0" style="border-collapse: collapse">
				<!--DWLayoutTable-->
				<tr>
					<td width="185" height="245" valign="top">
						<table width="183" border="0" bordercolor="#99CCFF"
							cellpadding="0" cellspacing="0" style="border-collapse: collapse">
							<!--DWLayoutTable-->
							<tr>
								<td width="183" height="7" align="left" valign="baseline"><jsp:include
										page="../login/login.jsp" flush="true" /></td>
							</tr>
							<tr>
								<td height="7" align="center" valign="baseline">
									<!--DWLayoutEmptyCell-->
									&nbsp;
								</td>
							</tr>
							
							<tr>
								<td height="14" valign="top"><jsp:include page="Notice.jsp"
										flush="true" /></td>
							</tr>
						</table>
					</td>

					<td width="591" rowspan="5" align="center" valign="top">
						<table width="100%" border="0" cellpadding="0" cellspacing="0">
							<!--DWLayoutTable-->
							<tr>
								<td width="200" height="30" align="center"
									background="images/logo/back_new.gif">
									<span class="STYLE2">&nbsp;新品上架</span>
								</td>
								<td width="359" align="right">
									<span class="STYLE6"><a href="#">更多&gt;&gt;&gt;</a>
									</span>&nbsp;
								</td>
							</tr>
							<tr>
								<center>
									<table width="200" border="0" bordercolor="#99CCFF"
										style="border-collapse: collapse">
										<s:iterator value="products1" status="count">
										<s:if test="#count.index%3==0">
										<tr>
										</s:if>
											<td width="110" height="135" align="center" valign="middle">
												<img src="${image }" width="90" />
											</td>
											<td width="100" align="center">
												<span class="STYLE5">============</span>
												<p class="STYLE1">${name }</p>
												<p>
													<font size="2" color="red">￥${price }</font>
												</p>
												<p>
													<a href="#" onClick="window.location.href='/ebuy/productDetail?id=${id}'"><input name="see" type="button" class="STYLE1" value="详情"></a>
													<input name="buy" onClick="addPro(${id})" type="button" class="STYLE1" id="buy${id}" value="购买">
												</p>
											</td>
										<s:if test="#count.index%3==2||#count.last">
										</tr>
										</s:if>
										</s:iterator>
									</table>
								</center>
							</tr>
						</table>
					</td>
				</tr>
			</table>
		</center>
	</body>
</html>




