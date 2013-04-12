<%@ page contentType="text/html;charset=gb2312" %>
<%@taglib  uri="/struts-tags"  prefix="s"%>
<table width="180" border="0" cellpadding="0" cellspacing="0" bgcolor="#eeeeee">
          <!--DWLayoutTable-->
          <tr>
            <td width="184" height="30" align="center" background="images/logo/back.gif"><span class="STYLE2">公告栏</span></td>
          </tr>
          <tr>
            <td height="70" align="center">
            <span class="STYLE1" style="color: #000000">
              <marquee direction=up height=100  id=m onmouseout=m.start() onMouseOver=m.stop() scrollamount=2 align="center">
            	<s:iterator value="notices" status="st">
          			<br/><br/>&nbsp;&nbsp;公告<s:property value="#st.index+1" />: ${message }
          		</s:iterator>
            </marquee>
            </span>
            </td>
          </tr>
</table>
        