package weekTwo.challengeWeekTwo;

import weekTwo.challengeWeekTwo.classes.Class;
import weekTwo.challengeWeekTwo.students.Student;

public class Main {
    public static void main(String[] args) {

        Student student0 = new Student("Carlos",20,"00001", 8);
        Student student1 = new Student("Caroline",22,"00002", 10);
        Student student2 = new Student("Eduardo",18,"00003", 9.3);
        Student student3 = new Student("Alice",18,"00004", 9);
        Student student4 = new Student("Patricia",22,"00005", 7);
        Student student5 = new Student("Graça",24,"00006", 10);
        Student student6 = new Student("Tita",21,"00007", 7.8);
        Student student7 = new Student("Váva",25,"00008", 6);


        Class class1 = new Class(2023);
        Class class2 = new Class(2024);

        class1.addStudent(student0);
        class1.addStudent(student1);
        class1.addStudent(student2);
        class1.addStudent(student3);
        class1.addStudent(student4);
        class1.addStudent(student5);
        class2.addStudent(student5);
        class2.addStudent(student6);
        class2.addStudent(student7);




        System.out.println("===================First Class==================");
        System.out.println(class1);
        System.out.println("Class Average- " +class1.classAverage());
        System.out.println("Number of students- "+class1.numberOfStudents());
        System.out.println("====================Second Class================");
        System.out.println(class2);
        System.out.println("Class Average- " +class2.classAverage());
        System.out.println("Number of students- "+class2.numberOfStudents());




    }
}
