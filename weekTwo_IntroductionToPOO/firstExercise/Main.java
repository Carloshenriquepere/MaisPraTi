package weekTwo_IntroductionToPOO.firstExercise;

import weekTwo_IntroductionToPOO.firstExercise.classStudents.Student;

public class Main {
    public static void main(String[] args) {


        Student student = new Student();


        student.name = "Carlos";
        student.registration = 123456789;

        student.numberOfAbsences();
        student.numberOfAbsences();
        student.numberOfAbsences();

        System.out.println(student.name);
        System.out.println(student.registration);
        System.out.println(student.fouls);

        Student student2 = new Student("Eduardo", 987654321, 0 );

        student2.numberOfAbsences();
        student2.numberOfAbsences();
        student2.numberOfAbsences();
        student2.numberOfAbsences();
        student2.numberOfAbsences();
        student2.numberOfAbsences();

        System.out.println(student2.name);
        System.out.println(student2.registration);
        System.out.println(student2.fouls);


    }
}
