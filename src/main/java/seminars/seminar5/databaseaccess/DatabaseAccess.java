package seminars.seminar5.databaseaccess;

import seminars.seminar5.entity.Entity;
import seminars.seminar5.entity.Model3D;
import seminars.seminar5.entity.Texture;

import java.util.Collection;

/**
 * Интерфейс Data Access Layer
 */
public interface DatabaseAccess {

    void addEntity(Entity entity);
    void removeEntity(Entity entity);
    Collection<Texture> getAllTextures();
    Collection<Model3D> getAllModels();

}
