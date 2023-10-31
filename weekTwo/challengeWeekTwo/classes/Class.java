package weekTwo.challengeWeekTwo.classes;

import weekTwo.challengeWeekTwo.students.Student;

import java.util.Arrays;

public class Class {

    public int identifier;

    public Student[] students = new Student[5];
    public int studentCount = 0;

    public Class(int identifier) {
        this.identifier = identifier;
    }

    public void addStudent(Student student){

        if (studentCount < 5) {
            students[studentCount] = student;
            studentCount++;
        }else {
            System.out.println("Full class, " + student.getName() + " didn't get the job!");
        }
    }

    public int numberOfStudents(){
        return studentCount;
    }

    public double classAverage(){
        double totalNotes = 0.0;

        for (int i = 0; i < studentCount; i++) {
            totalNotes += students[i].getNote();
        }

        if (studentCount == 0) {
            return 0.0;
        }

        return totalNotes / studentCount;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Class{");
        builder.append("Identifier= ").append(identifier);
        builder.append(",\nStudents: \n");

        for (int i = 0; i < studentCount; i++) {
            builder.append(students[i].getName() + ", Age- ");
            builder.append(students[i].getAge()+ ", Register- ");
            builder.append(students[i].getRegister()+ ", Note- ");
            builder.append(students[i].getNote());



            if (i < studentCount - 1) {
                builder.append(",\n");
            }
        }
        builder.append('}');
        return builder.toString();
    }
}
