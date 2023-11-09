package seminars.seminar5.database;

import seminars.seminar5.entity.Entity;
import seminars.seminar5.entity.Model3D;

import java.util.Collection;

/**
 * Интерфейс БД
 */
public interface Database {

    void load();
    void save();
    Model3D generateModelAndTextures();

    Collection<Entity> getAll();

}
