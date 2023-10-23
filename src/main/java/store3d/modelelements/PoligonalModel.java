package store3d.modelelements;

import java.util.Collection;

public class PoligonalModel {
    //    region public fields
    private Collection<Poligon> poligons;
    private Collection<Texture> textures;
    //    endregion

    //    region public properties

    public Collection<Poligon> getPoligons() {
        return poligons;
    }

    public Collection<Texture> getTextures() {
        return textures;
    }

    public void setTextures(Collection<Texture> textures) {
        this.textures = textures;
    }
    //    endregion

    //    region constructors

    public PoligonalModel(Collection<Poligon> poligons) {
        this.poligons = poligons;
    }

    public PoligonalModel(Collection<Poligon> poligons, Collection<Texture> textures) {
        this.poligons = poligons;
        this.textures = textures;
    }


    //    endregion
}