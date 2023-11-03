package weekTwo_IntroductionToPOO.challengeWeekTwo.students;

public class Student {

    public String name;
    public int age;
    public String register;
    public double note;

    public Student(String name, int age, String register, double note) {
        this.name = name;
        this.age = age;
        this.register = register;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }
}
