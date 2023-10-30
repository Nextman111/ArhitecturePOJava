package seminars.seminar3.cars;

import seminars.seminar3.Car;
import seminars.seminar3.enums.Color;

public class Harvester extends Car {
    public Harvester(String mark, String model, Color color) {
        super(mark, model, color);
        setWheelCount(6);
    }

    public void sweeping(){
        System.out.println("Автомобиль метет улицу.");
    }

    @Override
    public void move() {

    }

    @Override
    public void service() {

    }

    @Override
    public void gearShifting() {

    }

    @Override
    public void switchheadlights() {

    }

    @Override
    public void switchWipers() {

    }
}
