<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.Teacher" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Register of Teacher</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

    <%
        Teacher teacher = (Teacher) request.getAttribute("teacher");
        String nameTeacher = teacher != null ? teacher.getNameTeacher() : "";
        String discipline = teacher != null ? teacher.getDiscipline() : "";
        String id = teacher != null ? teacher.getId().toString() : "";
    %>
    <div class="container">
        <h1><%= teacher != null ? "Edit Teacher" : "Register Teacher" %></h1>
        <form action="/weekTen_JPAHibernateLombok/teacher" method="post">
        <input type="hidden" name="id" value="<%= id %>">
            <div class="mb-3">
                <label for="nameTeacher" class="form-label">Teacher Name:</label>
                <input type="text" class="form-control" id="nameTeacher" name="nameTeacher" value="<%= nameTeacher %>" required>
            </div>
            <div class="mb-3">
                <label for="discipline" class="form-label">Discipline:</label>
                <input type="text" class="form-control" id="discipline" name="discipline" value="<%= discipline %>" required>
            </div>
            <button type="submit" class="btn btn-primary">Enviable</button>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>