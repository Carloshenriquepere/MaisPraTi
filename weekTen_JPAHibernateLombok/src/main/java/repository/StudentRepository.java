package repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements Crud<Student>{

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("school");

    @Override
    public void create(Student student) {
        EntityManager manager = factory.createEntityManager();

        try{
            manager.getTransaction().begin();
            manager.persist(student);
            manager.getTransaction().commit();
        }finally {
            manager.close();

        }
    }

    @Override
    public void update(Student studentAtual) {
        EntityManager manager = factory.createEntityManager();

        try{
            Student student = manager.find(Student.class, studentAtual.getId());
            manager.getTransaction().begin();
            student.setAge(studentAtual.getAge());
            student.setName(studentAtual.getName());
            manager.getTransaction().commit();
        }finally {
            manager.close();
        }

    }

    @Override
    public void delete(int id) {
        EntityManager manager = factory.createEntityManager();

        try{
            Student student = manager.find(Student.class, id);
            manager.getTransaction().begin();
            manager.remove(student);
            manager.getTransaction().commit();

        }finally {
            manager.close();
        }


    }

    @Override
    public List<Student> readAll() {
        EntityManager manager = factory.createEntityManager();

        List<Student> result = new ArrayList<>();

        try{
            String jpql = "SELECT s FROM Student s";
            TypedQuery<Student> query = manager.createQuery(jpql, Student.class);

            result = query.getResultList();
        }finally {
            manager.close();
        }
        return result;
    }

    @Override
    public Student readById(int id) {
        EntityManager manager = factory.createEntityManager();

        try {
            return manager.find(Student.class,id);
        }finally {
            manager.close();
        }

    }
}
