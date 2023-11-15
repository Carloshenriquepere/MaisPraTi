package weekEightJavaAndMySQL.fisrtExercise.src.repository;

import weekEightJavaAndMySQL.fisrtExercise.src.model.Course;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourseRepository implements CRUD<Course> {
    private Connection connection;
    @Override
    public void create(Course course) {

        String sql = "INSERT INTO course(teacher, matter) VALUES(?, ?)";
        connection = Connects.getConnects();

        try(
                PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1, course.getTeacher());
            pstmt.setString(2, course.getMatter());

            int result = pstmt.executeUpdate();
            if (result > 0){
                System.out.println("Course added successfully!");
            }else {
                System.out.println("Error when inserting course!");
            }
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

        Connects.closeConnects(this.connection);
    }

    @Override
    public void update(Course course) {

        String sql = "UPDATE course SET teacher = ?, matter = ? WHERE id = ?";
        connection = Connects.getConnects();
        try(
                PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1, course.getTeacher());
            pstmt.setString(2, course.getMatter());
            pstmt.setInt(3, course.getId());

            int result = pstmt.executeUpdate();
            if (result > 0){
                System.out.println("Successful update course!");
            }else {
                System.out.println("Error when updating course!");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }


        Connects.closeConnects(this.connection);
    }

    @Override
    public void delete(int id) {

        String sql = "DELETE FROM course WHERE id = " + id;
        connection = Connects.getConnects();

        try(PreparedStatement pstmt = connection.prepareStatement(sql)){

            int result = pstmt.executeUpdate();
            if (result > 0){
                System.out.println("Successful removal course!");
            }else{
                System.out.println("Error when removing course!");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

        Connects.closeConnects(this.connection);
    }

    @Override
    public List<Course> readAll() {

        List<Course> courses = new ArrayList<>();
        String sql = "SELECT * FROM course";
        connection = Connects.getConnects();

        try(PreparedStatement pstmt = connection.prepareStatement(sql)){
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()){
                Course course = new Course();
                course.setId(rs.getInt("id"));
                course.setTeacher(rs.getString("teacher"));
                course.setMatter(rs.getString("matter"));

                courses.add(course);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        Connects.closeConnects(this.connection);

        return courses;
    }

    @Override
    public Course readById(int id) {

        String sql = "SELECT * FROM course WHERE id = " + id;
        connection = Connects.getConnects();

        try(PreparedStatement pstmt = connection.prepareStatement(sql)) {
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()){
                Course course = new Course();
                course.setId(rs.getInt("id"));
                course.setTeacher(rs.getString("teacher"));
                course.setMatter(rs.getString("matter"));
                return course;
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            Connects.closeConnects(this.connection);
        }

        return null;
    }
}
