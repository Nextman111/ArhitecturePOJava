package store3d.modelelements;

public class Color {
    //    region private fields
    private int red = 0;
    private int green = 0;
    private int blue = 0;
    // endregion

    //    region public properties

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }


    //    endregion

    //    region constructors

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Color() {
    }

//    endregion
}
