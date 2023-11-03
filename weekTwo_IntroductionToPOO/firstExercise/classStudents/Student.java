package weekTwo_IntroductionToPOO.firstExercise.classStudents;

public class Student {

    public String name;
    public int registration;
    public int fouls;

    public void numberOfAbsences (){
        fouls++;

    }

    public Student(String name, int registration, int fouls) {
        this.name = name;
        this.registration = registration;
        this.fouls = fouls;
    }

    public Student() {
    }

}
