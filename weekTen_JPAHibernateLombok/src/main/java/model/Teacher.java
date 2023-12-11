package model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_teacher")
    private String nameTeacher;

    private String discipline;

}
