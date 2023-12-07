<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="model.Student" %>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Listagem de alunos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css" integrity="sha512-z3gLpd7yknf1YoNbCzqRKc4qyor8gaKU1qmn+CShxbuBusANI9QpRohGBreCFkKxLhei6S9CQXFEbbKuqLg0DA==" crossorigin="anonymous" referrerpolicy="no-referrer" />

</head>

<body>
    <h1 style="text-align: center">Lista de Alunos</h1>
    <div class="container">
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Idade</th>
                </tr>
            </thead>
            <tbody>
                <%
                    List<Student> students = (List<Student>) request.getAttribute("students");
                    for (Student student : students) {
                        out.println("<tr>");
                        out.println("<th scope='row'>" + student.getId() + "</th>");
                        out.println("<td>" + student.getName() + "</td>");
                        out.println("<td>" + student.getAge() + "</td>");
                        out.println("<td> <a href='/weekTen_JPAHibernateLombok/editarStudent?id=" + student.getId() + "'><i class='fa-solid fa-pen'></i></a> </td>");
                        out.println("<td> <a href='/weekTen_JPAHibernateLombok/excluirStudent?id=" + student.getId() + "'><i class='fa-solid fa-trash'></i></a> </td>");
                        out.println("</tr>");
                    }
                %>
            </tbody>
        </table>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>