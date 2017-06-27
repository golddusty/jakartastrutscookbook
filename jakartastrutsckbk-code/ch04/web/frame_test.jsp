<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html" %>
<frameset cols="50%,*">
  <html:frame frameName="_frame1" 
                   page="/frame1.jsp" 
            marginwidth="10" 
           marginheight="10"
              scrolling="auto" 
            frameborder="1"/>
  <html:frame frameName="_frame2" 
                   page="/frame2.jsp" 
            marginwidth="10" 
           marginheight="10"
              scrolling="auto" 
            frameborder="1"/>
</frameset>