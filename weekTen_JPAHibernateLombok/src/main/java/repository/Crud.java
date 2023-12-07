package repository;

import java.util.List;

public interface Crud<T> {

    public void create(T t);

    public void update(T t);

    public void delete (int id);

    public List<T> readAll();

    public T readById(int id);
}
