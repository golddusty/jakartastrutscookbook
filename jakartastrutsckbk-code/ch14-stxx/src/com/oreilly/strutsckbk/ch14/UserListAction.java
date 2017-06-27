package com.oreilly.strutsckbk.ch14;

import java.util.Iterator;
import java.util.List;

import com.oroad.stxx.action.Action;

import javax.servlet.http.*;

import org.jdom.*;
import org.apache.struts.action.*;

public class UserListAction extends Action { 
    public ActionForward execute(ActionMapping mapping, 
                                 ActionForm form, 
                                 HttpServletRequest request, 
                                 HttpServletResponse response) 
            throws Exception { 
 
        List usersList = (List) getServlet().getServletContext().getAttribute("users");
        
        //create a new XML document for this Action with the root 
        //element of "userList" 
        Document document = 
        new Document(new Element("userList")); 
 
        //add some data to the XML document so that the Action 
        //will produce XML in the form 
        Element users = new Element("users"); 
        
        for (Iterator k=usersList.iterator(); k.hasNext(); ) {
            Element user = new Element("user"); 
            Element name = new Element("name");
            User u = (User) k.next();
            name.addContent(new Element("firstname").setText(u.getFirstName())); 
            name.addContent(new Element("lastname").setText(u.getLastName())); 
            user.addContent(name);
            user.addContent(new Element("email").setText(u.getEmail())); 

            // add the user
            users.addContent(user);             
        }
  
        // add to the root element and save the document
        document.getRootElement().addContent(users); 
        saveDocument(request, document); 
 
        return mapping.findForward("success"); 
    } 
}
