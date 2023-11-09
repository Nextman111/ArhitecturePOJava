package seminars.seminar5.buisneslogic;

import seminars.seminar5.entity.Model3D;
import seminars.seminar5.entity.Texture;

import java.util.Collection;

public interface BusinessLogicalLayer {

    Collection<Model3D> getAllModels();
    Collection<Texture> getAllTextures();

    void renderModel(Model3D model);
    void renderAllModels();
    void addModel();
    void delModel(int id);

}
