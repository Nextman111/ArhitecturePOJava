package seminars.seminar3;

import seminars.seminar3.cars.Harvester;
import seminars.seminar3.enums.Color;

public class Program {
    /** 1. Спроектировать abstract class Car
     * fielsd:
     *  mark, model, color, carType, wheelCount;, gasType,
     *  gearboxType, engineCapacity
     * methods:
     *  drive(), gearShifting(), service(), switchheadlights(), switchWipers()
     *
     *  2. Создать конкретный автомобиль путем наследования класса Car
     *
     * 3. Расширить abstract class Car, добавить:
     *  methods:
     *      sweeping()
     *  Создать конкретный автомобиль путем наследования класса Car
     *   Провести проверку принципа SRP (SingleResponsibilityPrinciple(ПринципЕдинойОтветственности))
     *
     * 4. Расширить абстрактный класс Car
     *  methods:
     *      включениеПротивотуманныхФар(),
     *      перевозкаГруза(),
     * Провести проверку OCP (Open/Close Principle)
     *
     * 5. Создать конкретный автомобиль путем наследования от Car, определить число колес = 3.
     * Провести проверку принципа ISP (InterfaceSegregationPrinciple) (ПринципРазделенияИнтерфейсов)
     * 7. Создать интерфейс Заправочная старция, создать метод - заправка топливом
     *
     * 8. Имплементировать метод интерфейса Заправочная станция в конкретный класс Car
     *
     * 9. Добавить в интерфейс Заправочная станция методы:
     *  протирка лобового стекла, протирка фар, протирка зеркал.
     *
     *  12. Имплементировать все методы интерфейса
     *  Заправочная станция в конкретный класс Car.
     *  Провести проверку принциа ISP. Создать
     *  дополнительный/е интерфейсы и имполементировать
     *  их в конкретный класс Car. Провести проверку
     *  принципа ISP.
     * */
    public static void main(String[] args) {
        RefuelingStation refuelingStation = new RefuelingStation();
        Harvester harvester = new Harvester("A","B", Color.red);

        harvester.setRefueling(refuelingStation);
        harvester.fuel();

    }

    public static double calculateMaintenance(Car car){
        if (car.getWheelCount() == 6){
            return 1500*6;
        } else {
            return 1000*4;
        }
    }
}
