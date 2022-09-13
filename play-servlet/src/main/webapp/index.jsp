<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%--以下代码将置于Servlet的service()方法中--%>
<%
    System.out.println("hello jsp");
    int i = 1;
    System.out.println(i);
%>

<%--以下代码将置于Servlet类的定义成员的位置--%>
<%!
    private int i = 2;
%>

<%--以下代码将直接输出到页面上--%>
<%= "i = " + i %>

</body>
</html>