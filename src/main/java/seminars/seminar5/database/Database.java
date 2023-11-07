package seminars.seminar5.database;

import seminars.seminar5.entity.Entity;

import java.util.Collection;

/**
 * Интерфейс БД
 */
public interface Database {

    void load();
    void save();

    Collection<Entity> getAll();

}
