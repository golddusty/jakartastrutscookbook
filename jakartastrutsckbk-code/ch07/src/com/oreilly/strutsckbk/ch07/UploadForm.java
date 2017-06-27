package com.oreilly.strutsckbk.ch07;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class UploadForm extends ActionForm {
	private FormFile content;

	public FormFile getContent() {
		return content;
	}
	public void setContent(FormFile content) {
		this.content = content;
	}
}
