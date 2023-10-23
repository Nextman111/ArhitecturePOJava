package store3d.modelelements;

public class Camera {
    //    region public fields
    private Point3D location;
    private Angle3D angle;
    //    endregion

    //    region public properties

    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    public void rotate(Angle3D angle){
        //TODO: no realization
    }


    public void move(Point3D angle){
        //TODO: no realization
    }

    //    endregion

    //    region constructors

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public Camera() {
    }
//    endregion
}
