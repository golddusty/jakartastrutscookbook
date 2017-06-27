package com.oreilly.strutsckbk.ch14;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.oroad.stxx.action.Action;
import com.oroad.stxx.xform.JDOMForm;

public class SaveUserAction extends Action { 
    public ActionForward execute(ActionMapping mapping, 
                                 ActionForm form, 
                                 HttpServletRequest request, 
                                 HttpServletResponse response) 
            throws Exception { 

        List usersList = (List) getServlet().getServletContext().getAttribute("users");
        JDOMForm jdomForm = (JDOMForm) form;
        String firstName = jdomForm.getValue("/user/name/firstname");
        String lastName  = jdomForm.getValue("/user/name/lastname");
        String email     = jdomForm.getValue("/user/email");
        usersList.add(new User(firstName, lastName, email));
        return mapping.findForward("success"); 
    } 
}
