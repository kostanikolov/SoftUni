package app.interfaces;

import java.util.Collection;

public interface Repository<T> {

    void add(T t);

    T getByName(String name);

    Collection<T> findAll();
}
