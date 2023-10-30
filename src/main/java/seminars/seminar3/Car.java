package seminars.seminar3;

import seminars.seminar3.enums.CarType;
import seminars.seminar3.enums.Color;
import seminars.seminar3.enums.FuelTiype;
import seminars.seminar3.enums.GearboxType;
import seminars.seminar3.interfaces.CarWash;
import seminars.seminar3.interfaces.Refueling;

public abstract class Car {
    //region fields
    private String mark;
    private String model;
    private Color color;
    protected CarType carType;
    private int wheelCount;
    protected FuelTiype fuelType = FuelTiype.Diesel;
    private GearboxType gearboxType;
    private double engineCapacity;
    private boolean headLights = false;
    private Refueling refueling;

    private CarWash carWash;


    //endregion
    //region constructors
    public Car(String mark, String model, Color color) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        System.out.println("Создаю автомобиль " + mark + " " + model);
    }


    //endregion
    //region methods
    public CarWash getCarWash() {
        return carWash;
    }

    public void washing() {
        if (carWash != null) {
            this.carWash.wipWashing(this);
        } else {
            System.out.println(this + " не на мойке");
        }
    }

    public void setCarWash(CarWash carWash) {
        this.carWash = carWash;
        System.out.println(this + " заехал на мойку.");
    }

    public void setRefueling(Refueling refueling) {
        this.refueling = refueling;
        System.out.println(this + " заехал на заправку.");
    }

    public void fuel() {
        if (refueling != null) {
            refueling.fuel(fuelType);
            System.out.println(this + " заправлен до полного.");
        } else {
            System.out.println(this + " не на заправке");
        }
    }

    @Override
    public String toString() {
        return this.mark + " " + this.model;
    }

    protected void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }

    public int getWheelCount() {
        return wheelCount;
    }


    public abstract void move();

    public abstract void service();

    public abstract void gearShifting();

    public abstract void switchheadlights();

    public abstract void switchWipers();

    //endregion
}
