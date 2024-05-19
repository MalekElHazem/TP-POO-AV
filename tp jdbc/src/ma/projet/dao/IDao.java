package ma.projet.dao;

import java.util.List;

public interface IDao<T> {
    boolean create(T object);
    boolean delete(T object);
    boolean update(T object);
    T findById(int id);
    List<T> findAll();
}
