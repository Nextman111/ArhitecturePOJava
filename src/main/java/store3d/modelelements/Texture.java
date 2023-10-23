package store3d.modelelements;

public class Texture {
    //    region public fields
    private int id;
    private String name;
    //    endregion

    //    region public properties

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //    endregion

    //    region constructors

    public Texture(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //    endregion
}
