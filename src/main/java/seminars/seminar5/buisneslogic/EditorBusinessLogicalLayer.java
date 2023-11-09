package seminars.seminar5.buisneslogic;

import seminars.seminar5.databaseaccess.EditorDatabaseAccess;
import seminars.seminar5.entity.Model3D;
import seminars.seminar5.entity.Texture;
import seminars.seminar5.databaseaccess.DatabaseAccess;

import java.util.Collection;
import java.util.Random;

public class EditorBusinessLogicalLayer implements BusinessLogicalLayer {

    private DatabaseAccess databaseAccess;

    public EditorBusinessLogicalLayer(DatabaseAccess databaseAccess){
        this.databaseAccess = databaseAccess;
    }



    @Override
    public Collection<Model3D> getAllModels() {
        return databaseAccess.getAllModels();
    }

    @Override
    public Collection<Texture> getAllTextures() {
        return databaseAccess.getAllTextures();
    }

    @Override
    public void renderModel(Model3D model) {
        processRender(model);
    }

    @Override
    public void renderAllModels() {
        for (Model3D model: getAllModels()) {
            processRender(model);
        }
    }

    @Override
    public void addModel() {
        Model3D model = new Model3D();
        int textureCount = random.nextInt(3);

        for (int i = 0; i < textureCount; i++){
            Texture texture = new Texture();
            model.getTextures().add(texture);
        }

        databaseAccess.addEntity(model);

        System.out.println("Модель добавлена");
    }

    @Override
    public void delModel(int id) {
        for (Model3D model: getAllModels()) {
            if (id == model.getId()){
                databaseAccess.removeEntity(model);
                System.out.println("Модель удалена");
                return;
            }
        }
        System.out.println("Такой модели нет в хранилище");
    }

    private Random random = new Random();

    private void processRender(Model3D model){
        try {
            Thread.sleep(2500 - random.nextInt(2000));
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
