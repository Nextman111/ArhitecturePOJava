package seminars.seminar3;

import seminars.seminar3.enums.CarType;
import seminars.seminar3.enums.Color;
import seminars.seminar3.enums.FuelTiype;
import seminars.seminar3.enums.GearboxType;

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
    private RefuelingStation refueling;

    //endregion
    //region constructors

    public Car(String mark, String model, Color color) {
        this.mark = mark;
        this.model = model;
        this.color = color;
    }

    //endregion
    //region metgods


    public void setRefueling(RefuelingStation refueling) {
        this.refueling = refueling;
    }

    public void fuel(){
        if (refueling != null){
            refueling.fuel(fuelType);
        }
    }

    protected void setWheelCount(int wheelCount){
        this.wheelCount = wheelCount;
    }

    public int getWheelCount(){
        return wheelCount;
    }


    public abstract void move();

    public abstract void service();

    public abstract void gearShifting();

    public abstract void switchheadlights();

    public abstract void switchWipers();

    //endregion
}
