package com.oreilly.strutsckbk.ch11.ams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;
import org.apache.struts.upload.FormFile;

public class ProcessUploadAction extends Action {

	public ActionForward execute(ActionMapping mapping,
                                 ActionForm form,
                                 HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {

		// Get the form file property from the form
		UploadForm uploadForm = (UploadForm) form;		
		FormFile content = uploadForm.getContent();

        if (content == null) {
            ActionMessage msg = new ActionMessage("error.maxFileSize.exceeded");
            ActionMessages errors = new ActionMessages();
            errors.add(ActionMessages.GLOBAL_MESSAGE, msg);
            saveErrors(request, errors);
            return mapping.getInputForward();
        }

        // continue processing upload ...
		InputStream in = null;
		OutputStream out = null;
		
    try {
  		// Get an input stream on the form file        
			in = content.getInputStream();
	
			// Create an output stream to a file
			out = new BufferedOutputStream (new FileOutputStream("temp.txt"));
	
			byte[] buffer = new byte[512];
			while (in.read(buffer) != -1) {
				out.write(buffer);
			}
    }
	  finally {
			if (out != null) out.close();
			if (in != null) in.close();	  	
	  }

		return mapping.findForward("success");
	}
}
