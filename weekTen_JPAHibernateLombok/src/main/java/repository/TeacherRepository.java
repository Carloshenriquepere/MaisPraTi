package repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.Teacher;


import java.util.List;

public class TeacherRepository implements Crud<Teacher>{

    EntityManagerFactory factory = Persistence.createEntityManagerFactory("school");
    @Override
    public void create(Teacher teacher) {

        EntityManager manager = factory.createEntityManager();

        try{
            manager.getTransaction().begin();
            manager.persist(teacher);
            manager.getTransaction().commit();
        }finally {
            manager.close();

        }
    }

    @Override
    public void update(Teacher teacherCurrent) {

        EntityManager manager = factory.createEntityManager();

        try{
            Teacher teacherOld = manager.find(Teacher.class, teacherCurrent.getId());
            manager.getTransaction().begin();
            teacherOld.setNameTeacher(teacherCurrent.getNameTeacher());
            teacherOld.setDiscipline(teacherCurrent.getDiscipline());
            manager.getTransaction().commit();
        }finally {
            manager.close();
        }
    }

    @Override
    public void delete(int id) {

        EntityManager manager = factory.createEntityManager();

        try{
            Teacher teacher = manager.find(Teacher.class, id);
            manager.getTransaction().begin();
            manager.remove(teacher);
            manager.getTransaction().commit();

        }finally {
            manager.close();
        }
    }

    @Override
    public List<Teacher> readAll() {

        EntityManager manager = factory.createEntityManager();

        List<Teacher> result = null;

        try{
            String jpql = "SELECT t FROM Teacher t";
            TypedQuery<Teacher> query = manager.createQuery(jpql, Teacher.class);

            result = query.getResultList();
        }finally {
            manager.close();
        }
        return result;
    }

    @Override
    public Teacher readById(int id) {

        EntityManager manager = factory.createEntityManager();

        try {
            return manager.find(Teacher.class,id);
        }finally {
            manager.close();
        }

    }
}
