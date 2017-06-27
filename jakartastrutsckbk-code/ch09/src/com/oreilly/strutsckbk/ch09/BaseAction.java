package com.oreilly.strutsckbk.ch09;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionMessages;

public class BaseAction extends Action {

    public static final String APP_WARNING_KEY = "APP_WARNING_KEY";
    public static final String APP_ERROR_KEY = "APP_ERROR_KEY";
    
    protected void saveAppWarnings(HttpServletRequest request, ActionMessages messages) {
        saveAppMessages(request, messages, APP_WARNING_KEY);
    }

    protected void saveAppErrors(HttpServletRequest request, ActionMessages messages) {
        saveAppMessages(request, messages, APP_ERROR_KEY);
    }

    private void saveAppMessages(HttpServletRequest request, ActionMessages messages, String key) {
        // Remove any messages attribute if none are required
        if ((messages == null) || messages.isEmpty()) {
          request.removeAttribute(key);
          return;
        }

        // Save the messages we need
        request.setAttribute(key, messages);
    }
}
