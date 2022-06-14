<%@ page import="java.util.HashMap" %>
<%@ page import="com.example.Thi_WCD.entity.Phone" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%
    HashMap<String, String> errors = (HashMap<String, String>) request.getAttribute("errors");
    if(errors == null) {
        errors = new HashMap<>();
    }
    Phone phone = (Phone) request.getAttribute("phone");
    if(phone == null) {
        phone = new Phone();
    }
%>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<form action="/addphone" method="post">
    <fieldset class="form-group">
        <label>Name </label> <input type="text"  class="form-control" name="name" value="<%= phone.getName() %>" >
    </fieldset>
    <fieldset class="form-group">
        <label>Brand</label> <input type="text"  class="form-control" name="brand" value="<%= phone.getBrand() %>" >
    </fieldset>
    <fieldset class="form-group">
        <label>Price</label> <input type="number"  class="form-control" name="price" value="<%= phone.getPrice() %>" >
    </fieldset>
    <fieldset class="form-group">
        <label>Description</label> <textarea  class="form-control" name="description" ><%= phone.getDescription() %></textarea>
    </fieldset>
    <button type="submit" class="btn btn-success">Save</button>
</form>
</body>
</html>