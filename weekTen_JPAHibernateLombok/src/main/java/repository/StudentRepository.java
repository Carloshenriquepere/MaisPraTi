package repository;

import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements Crud<Student>{
    private Connection connection;

    @Override
    public void create(Student student) {

        String sql = "INSERT INTO student(name, age) VALUES(?, ?)";
        connection = Connects.getConnects();
        try(
                PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1, student.getName());
            pstmt.setInt(2, student.getAge());

            int result = pstmt.executeUpdate();
            if (result > 0){
                System.out.println("Successful student registration!");
            }else {
                System.out.println("Error when inserting student!");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

        Connects.closeConnects(this.connection);
    }

    @Override
    public void update(Student student) {

        String sql = "UPDATE student SET name = ?, age = ? WHERE id = ?";
        connection = Connects.getConnects();
        try(
                PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1, student.getName());
            pstmt.setInt(2, student.getAge());
            pstmt.setInt(3, student.getId());

            int result = pstmt.executeUpdate();
            if (result > 0){
                System.out.println("Successful update student!");
            }else {
                System.out.println("Error when updating student!");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }


        Connects.closeConnects(this.connection);
    }

    @Override
    public void delete(int id) {

        String sql = "DELETE FROM student WHERE id = " + id;
        connection = Connects.getConnects();

        try(PreparedStatement pstmt = connection.prepareStatement(sql)){

            int result = pstmt.executeUpdate();
            if (result > 0){
                System.out.println("Successful removal student!");
            }else{
                System.out.println("Error when removing student!");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        Connects.closeConnects(this.connection);
    }

    @Override
    public List<Student> readAll() {

        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM student";
        connection = Connects.getConnects();

        try(PreparedStatement pstmt = connection.prepareStatement(sql)){
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()){
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));

                students.add(student);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        Connects.closeConnects(this.connection);

        return students;
    }

    @Override
    public Student readById(int id) {

        String sql = "SELECT * FROM student WHERE id = " + id;
        connection = Connects.getConnects();

        try(PreparedStatement pstmt = connection.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()){
                Student student = new Student();
                student.setId(rs.getInt("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                return student;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            Connects.closeConnects(this.connection);
        }

        return null;
    }
}
