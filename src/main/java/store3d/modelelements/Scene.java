package store3d.modelelements;

import java.util.Collection;

public class Scene {
    //    region public fields
    protected int id;
    protected Collection<PoligonalModel> models;
    protected Collection<Flash> flashes;

    //    endregion

    //    region public properties

    public int getId() {
        return id;
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public void setModels(Collection<PoligonalModel> models) {
        this.models = models;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public void setFlashes(Collection<Flash> flashes) {
        this.flashes = flashes;
    }

    //    endregion

    //    region constructors

    public Scene(int id, Collection<PoligonalModel> models, Collection<Flash> flashes) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
    }

    public Scene() {
    }
    //    endregion
}
