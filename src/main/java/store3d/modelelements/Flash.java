package store3d.modelelements;

public class Flash extends Camera {
    //    region public fields
    private Color color;
    private float power;
    //    endregion

    //    region public properties

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    public void rotate(Angle3D angle) {
        //TODO: no realization
    }


    public void move(Point3D angle) {
        //TODO: no realization
    }

    //    endregion


    //    region constructors
    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        super(location, angle);
        this.color = color;
        this.power = power;
    }

    public Flash(Color color, float power) {
        this.color = color;
        this.power = power;
    }

    public Flash() {
    }
    //    endregion
}
