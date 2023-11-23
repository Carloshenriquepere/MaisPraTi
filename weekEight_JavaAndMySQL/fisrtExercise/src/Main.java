package weekEight_JavaAndMySQL.fisrtExercise.src;

import weekEight_JavaAndMySQL.fisrtExercise.src.model.Student;
import weekEight_JavaAndMySQL.fisrtExercise.src.repository.CourseRepository;
import weekEight_JavaAndMySQL.fisrtExercise.src.repository.StudentRepository;


public class Main {
    public static void main(String[] args) {

        CourseRepository courseRepo = new CourseRepository();
        StudentRepository studentRepo = new StudentRepository();

        //Method to Create of Student and Course
//
//        Student newStudent = new Student();
//        newStudent.setName("Eduardo Soares");
//        newStudent.setAge(8);
//        studentRepo.create(newStudent);

//        Course newCourse = new Course();
//        newCourse.setTeacher("Caroline");
//        newCourse.setMatter("Fisica");
//        courseRepo.create(newCourse);
        //--------------------------------------------------

        //Method to Update of Student and Course

//        Student updateStudent = new Student();
//        updateStudent.setId(2);
//        updateStudent.setName("Alice Soares");
//        updateStudent.setAge(2);
//        studentRepo.update(updateStudent);

//        Course updateCourse = new Course();
//        updateCourse.setId(5);
//        updateCourse.setTeacher("Rodrigo");
//        updateCourse.setMatter("EducaçãoFisica");
//        courseRepo.update(updateCourse);
        //--------------------------------------------------

        //Method to Removal of Student and Course

//        studentRepo.delete(1);

//        courseRepo.delete(3);

        //Method to Search for Students and Courses

//        List<Student> allStudents = studentRepo.readAll();
//        allStudents.forEach(System.out::println);

//        List<Course> allCourse = courseRepo.readAll();
//        allCourse.forEach(System.out::println);

        //Method to Search one Students and one Courses

//        Student oneStudent = studentRepo.readById(2);
//        System.out.println("Specific " + oneStudent);

//        Course oneCourse = courseRepo.readById(4);
//        System.out.println("Specific " + oneCourse);


    }
}
