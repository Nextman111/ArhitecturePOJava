package store3d.modelelements;

public class Angle3D {
    //    region public fields
    private int x;
    private int y;
    private int z;
    //    endregion

    //    region public properties

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }


    //    endregion

    //    region constructors

    public Angle3D() {
    }

    public Angle3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    //    endregion
}
