package com.oreilly.strutsckbk.ch10;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ViewMyUsersAction extends Action {

	public ActionForward execute(ActionMapping mapping, 
					             ActionForm form,
								 HttpServletRequest request, 
								 HttpServletResponse response) throws Exception {
		MyUserDao dao = new MyUserDao();
		List users = dao.getAllUsers();
		request.setAttribute("users", users);
		return mapping.findForward("success");
	}
}
