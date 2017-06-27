package com.oreilly.strutsckbk.ch04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanComparator;
import org.apache.commons.collections.comparators.ReverseComparator;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class ViewForecastAction extends Action {

	public ActionForward execute(ActionMapping mapping,
      ActionForm form,
      HttpServletRequest request,
      HttpServletResponse response) throws Exception {
		// create the weather bean
		WeeklyWeather weather = new WeeklyWeather();		

		// create a list to hold the forecast
		List list = new ArrayList();
    list.addAll( weather.getWeekForecast() );

    // get the sort by request param
    String sortBy = request.getParameter("sortBy");

    // get the reverse request param
    boolean reverse = false;
    String reverseParam = request.getParameter("reverse");
    if (reverseParam != null) 
    	reverse = Boolean.valueOf(reverseParam).booleanValue();

    // sort the list
    if (sortBy != null) {
      Comparator comparator = new BeanComparator(sortBy);
      if(reverse) comparator = new ReverseComparator(comparator);
      Collections.sort( list, comparator );
    }
    
    // add the list as a request attribute and forward to the JSP
    request.setAttribute( "weekForecast", list );
    return mapping.findForward("success");
	}

}
