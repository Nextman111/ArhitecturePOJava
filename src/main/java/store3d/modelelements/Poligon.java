package store3d.modelelements;

import java.util.Collection;

public class Poligon {
    //    region public fields

    private Collection<Point3D> points;

    //    endregion

    //    region public properties

    public Collection<Point3D> getPoints() {
        return points;
    }

    //    endregion

    //    region constructors

    public Poligon() {
    }

    public Poligon(Collection<Point3D> points) {
        this.points = points;
    }

    //    endregion


}
