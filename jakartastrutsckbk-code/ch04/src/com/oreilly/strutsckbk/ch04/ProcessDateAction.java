package com.oreilly.strutsckbk.ch04;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ProcessDateAction extends Action {

	public ActionForward execute(ActionMapping mapping,
      ActionForm form,
      HttpServletRequest request,
      HttpServletResponse response) throws Exception {
		
		ActionErrors errors = new ActionErrors();

		// Process date1
		String month = 
			(String) PropertyUtils.getSimpleProperty(form, "month");		
		String day = 
			(String) PropertyUtils.getSimpleProperty(form, "day");		
		String year = 
			(String) PropertyUtils.getSimpleProperty(form, "year");
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.MONTH, Integer.parseInt(month)-1);
		cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
		cal.set(Calendar.YEAR, Integer.parseInt(year));
		request.setAttribute("date1", cal.getTime());

		// Process birth date
		String birthDateString = 
			(String) PropertyUtils.getSimpleProperty(form, "birthDateString");		
		SimpleDateFormat parser = new SimpleDateFormat("MM/dd/yy");		
		Date birthDate = parser.parse(birthDateString);		
		request.setAttribute("birthDate", birthDate);

		// Process date3
		String monthOpt = 
			(String) PropertyUtils.getSimpleProperty(form, "monthOpt");		
		String dayOpt = 
			(String) PropertyUtils.getSimpleProperty(form, "dayOpt");		
		String yearOpt = 
			(String) PropertyUtils.getSimpleProperty(form, "yearOpt");
		Calendar cal3 = Calendar.getInstance();
		cal3.set(Calendar.MONTH, Integer.parseInt(monthOpt)-1);
		cal3.set(Calendar.DAY_OF_MONTH, Integer.parseInt(dayOpt));
		cal3.set(Calendar.YEAR, Integer.parseInt(yearOpt));
		request.setAttribute("date3", cal3.getTime());
		
		return mapping.findForward("success");
	}
}
