package weekEight_JavaAndMySQL.fisrtExercise.src.model;

public class Course {

    private int id;
    private String teacher;
    private String matter;

    @Override
    public String toString() {
        return "Course:" +
                "\n Matter: " + matter +
                ", Teacher: " + teacher +
                ", Id: " + id;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }
}
