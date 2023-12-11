package controller;


import model.Teacher;
import repository.TeacherRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

@WebServlet(urlPatterns = {"/teacher", "/teachers", "/registerTeacher", "/editTeacher", "deleteTeacher"})
public class TeacherController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    TeacherRepository repository = new TeacherRepository();

    public TeacherController(){super();}


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();

        if (uri.contains("register")){
            this.registerTeacher(request,response);
        }else if(uri.contains("edit")){
            this.setTeacherEdit(request, response);
        }else if(uri.contains("delete")) {
            this.deleteTeacher(request, response);
        }else {
            this.listTeacher(request,response);
        }
    }

    private void deleteTeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String idString = request.getParameter("id");
        if(Objects.nonNull(idString) && !idString.isEmpty()){
            int id = Integer.parseInt(idString);
            repository.delete(id);
        }

        response.sendRedirect("teacher");
    }

    private void setTeacherEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String idString = request.getParameter("id");
        if(Objects.nonNull(idString) && !idString.isEmpty()){
            int id = Integer.parseInt(idString);

            Teacher teacher = repository.readById(id);

            request.setAttribute("teacher", teacher);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/formTeacher.jsp");
            dispatcher.forward(request, response);
        }
    }

    private void registerTeacher(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/formTeacher.jsp");
        dispatcher.forward(request, response);
    }

    private void listTeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Teacher> teachers = repository.readAll();

        request.setAttribute("teachers", teachers);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/teachers.jsp");
        dispatcher.forward(request, response);
    }

    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        String idString = request.getParameter("id");

        Integer id = Objects.nonNull(idString) && !idString.isEmpty() ? Integer.parseInt(idString) : null;
        String nameTeacher = request.getParameter("nameTeacher");
        String discipline = request.getParameter("discipline");

        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setNameTeacher(nameTeacher);
        teacher.setDiscipline(discipline);

        if(Objects.nonNull(teacher.getId())){
            repository.update(teacher);
        }else{
            repository.create(teacher);
        }

        response.sendRedirect("teachers");

    }

}
