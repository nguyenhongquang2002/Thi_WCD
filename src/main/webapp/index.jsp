<%@ page import="com.example.Thi_WCD.entity.Phone" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
<table class="table table-hover my-0">
    <thead>
    <tr>
        <th>ID</th>
        <th class="d-none d-xl-table-cell">Name</th>
        <th class="d-none d-xl-table-cell">Brand</th>
        <th class="d-none d-md-table-cell">price</th>
        <th class="d-none d-md-table-cell">Description</th>
    </tr>
    </thead>
    <tbody>
    <%
        List<Phone> foods = (ArrayList<Phone>) request.getAttribute("lisPhone");
        for(Phone food : foods) {%>
    <tr>
        <td><%= food.getId() %></td>
        <td><%= food.getName() %></td>
        <td><%= food.getBrand() %></td>
        <td><%= food.getPrice() %></td>
        <td><%= food.getDescription() %></td>
        <td>
            <div class="modal fade" id="exampleModal<%= food.getId() %>" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">Delete foods</h5>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <div class="modal-body">
                            Are you sure delete <%= food.getName() %>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
        </td>
            <%}%>
    </tbody>
</table>
</body>
</html>