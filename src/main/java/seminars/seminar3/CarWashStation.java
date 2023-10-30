package seminars.seminar3;

import seminars.seminar3.interfaces.CarWash;

public class CarWashStation implements CarWash {
    @Override
    public void washCar(Car car) {
        System.out.println("Мою автомобиль." + car);
    }

    @Override
    public void wipMirrors(Car car) {
        System.out.println("Протираю зеркала." + car);
    }

    @Override
    public void wipWindshield(Car car) {
        System.out.println("Протираю стекла." + car);
    }

    @Override
    public void wipHeadLights(Car car) {
        System.out.println("Протираю фары." + car);
    }

    @Override
    public void wipWashing(Car car) {
        this.washCar(car);
        this.wipWindshield(car);
        this.wipHeadLights(car);
        this.wipMirrors(car);

        System.out.println(car + " вымыт до блеска.");
    }
}
