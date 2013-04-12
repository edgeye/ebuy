package net.gupt.ebuy.interceptor;

import java.util.Map;

import net.gupt.ebuy.pojo.Customer;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
/**
 * µÇÂ¼ÑéÖ¤À¹½ØÆ÷
 * @author glf
 *
 */
public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		ActionContext ac = ActionContext.getContext();
		Map<String, Object> session = ac.getSession();
		Customer customer = (Customer) session.get("customer");
		if(customer==null) {
			return "validLogin";
		}
		arg0.invoke();
		return null;
	}

}
