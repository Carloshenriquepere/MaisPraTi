<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="model.Student" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cadastro de Aluno</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

    <%
        Student student = (Student) request.getAttribute("student");
        String name = student != null ? student.getName() : "";
        String age = student != null ? student.getAge().toString() : "";
        String id = student != null ? student.getId().toString() : "";
    %>
    <div class="container">
        <h1><%= student != null ? "Editar Aluno" : "Cadastrar Aluno" %></h1>
        <form action="/weekNine_JavaWeb-ServletJSP/student" method="post">
        <input type="hidden" name="id" value="<%= id %>">
            <div class="mb-3">
                <label for="name" class="form-label">Nome:</label>
                <input type="text" class="form-control" id="name" name="name" value="<%= name %>" required>
            </div>
            <div class="mb-3">
                <label for="age" class="form-label">Idade:</label>
                <input type="number" class="form-control" id="age" name="age" value="<%= age %>" required>
            </div>
            <button type="submit" class="btn btn-primary">Enviar</button>
        </form>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>