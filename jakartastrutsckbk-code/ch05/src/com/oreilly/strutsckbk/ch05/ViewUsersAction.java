package com.oreilly.strutsckbk.ch05;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.RowSetDynaClass;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ViewUsersAction extends Action {

	public ActionForward execute(ActionMapping mapping, 
															 ActionForm form,
															 HttpServletRequest request, 
															 HttpServletResponse response) throws Exception {
		UserDao dao = new UserDao();
		RowSetDynaClass rowSet = dao.getUsersRowSet();
		request.setAttribute("rowSet", rowSet);
		return mapping.findForward("success");
	}
}
