package controller;

import model.Student;
import repository.StudentRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

@WebServlet(urlPatterns = {"/student","/students", "/cadastrar", "/editarStudent", "/excluirStudent"})
public class StudentController extends HttpServlet {

    StudentRepository repository = new StudentRepository();
    private static final long serialVersionUID = 1L;

    public StudentController(){
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();

        if (uri.contains("cadastrar")){
            this.cadastrarAluno(request,response);
        }else if(uri.contains("editar")){
            this.setarAlunoParaEditar(request, response);
        }else if(uri.contains("excluir")) {
            this.excluirAluno(request, response);
        }else {
            this.listarAlunos(request,response);
        }
    }

    private void excluirAluno(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String idString = request.getParameter("id");
        if(Objects.nonNull(idString) && !idString.isEmpty()){
            int id = Integer.parseInt(idString);
            repository.delete(id);
        }

        response.sendRedirect("student");
    }


    private void setarAlunoParaEditar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String idString = request.getParameter("id");
        if(Objects.nonNull(idString) && !idString.isEmpty()){
            int id = Integer.parseInt(idString);

            Student student = repository.readById(id);

            request.setAttribute("student", student);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/formStudent.jsp");
            dispatcher.forward(request, response);
        }
    }

    private void cadastrarAluno(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/formStudent.jsp");
        dispatcher.forward(request, response);
    }

    private void listarAlunos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        List<Student> students = repository.readAll();

        request.setAttribute("students", students);

        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/students.jsp");
        dispatcher.forward(request, response);
    }

    protected  void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        String idString = request.getParameter("id");

        Integer id = Objects.nonNull(idString) && !idString.isEmpty() ? Integer.parseInt(idString) : null;
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));

        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);

        if(Objects.nonNull(student.getId())){
            repository.update(student);
        }else{
            repository.create(student);
        }

        response.sendRedirect("students");

    }
}
