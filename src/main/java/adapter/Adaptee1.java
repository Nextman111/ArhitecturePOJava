package adapter;

public class Adaptee1 {
    private int getDamage = 0;

    public Adaptee1() {
    }

    public Adaptee1(int getDamage) {
        this.getDamage = getDamage;
    }

    public int getGetDamage() {
        return getDamage;
    }

    public void setGetDamage(int getDamage) {
        this.getDamage = getDamage;
    }
}
