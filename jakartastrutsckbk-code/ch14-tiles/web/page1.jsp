<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insert page="/layouts/mainLayout.jsp">
    <tiles:put name="title" type="string" value="Page One"/>
    <tiles:put name="header" value="/common/header.jsp"/>
    <tiles:put name="navbar" value="/common/navbar.jsp"/>
    <tiles:put name="body" value="/pages/pageOne.jsp"/>
    <tiles:put name="news" value="/common/news.html"/>
    <tiles:put name="footer" value="/common/footer.html"/>
</tiles:insert>
