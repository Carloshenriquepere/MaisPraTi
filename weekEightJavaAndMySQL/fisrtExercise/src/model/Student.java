package weekEightJavaAndMySQL.fisrtExercise.src.model;

public class Student {

    private int id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student:" +
                "\n Name: " + name +
                ", Age: " + age +
                ", Id: " + id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
