package net.gupt.ebuy.interceptor;

import java.util.Map;

import net.gupt.ebuy.pojo.Admin;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class AdminLoginInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation arg0) throws Exception {
		ActionContext ac = ActionContext.getContext();
		Map<String, Object> session = ac.getSession();
		Admin admin = (Admin) session.get("admin");
		if(admin==null) {
			return "validAdminLogin";
		}
		arg0.invoke();
		return null;
	}

}
