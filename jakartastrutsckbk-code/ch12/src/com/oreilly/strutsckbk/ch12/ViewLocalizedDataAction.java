package com.oreilly.strutsckbk.ch12;

import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.jstl.core.Config;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts.Globals;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;


public final class ViewLocalizedDataAction extends Action {

    public ActionForward execute(ActionMapping mapping,
                 ActionForm form,
                 HttpServletRequest request,
                 HttpServletResponse response)
    throws Exception {
        Order order = new Order();
        order.setPartNumber("848489-4949");
        order.setQuantity(new Integer(1));
        order.setDatePlaced(new Date());
        order.setAmount(new Double("13995.78"));
        request.setAttribute("order", order);

        return mapping.findForward("success");
    }
}
