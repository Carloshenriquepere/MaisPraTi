package model;

public class Student {

    private Integer id;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Student:" +
                "\n Name: " + name +
                ", Age: " + age +
                ", Id: " + id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
