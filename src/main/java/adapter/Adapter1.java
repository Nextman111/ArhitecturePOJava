package adapter;

public class Adapter1 extends Adaptee1 implements IActions {
    public Adapter1() {
    }

    public Adapter1(int getDamage) {
        super(getDamage);
    }

    /**
     * Интерфейс IActions требует от объекта метод
     * getAction() с типом ответа String, но объект Adaptee1
     * может содержит метод getDamage() с ответом типа int.
     *
     * Класс Adapter1 унаследован от Adaptee1 и содержит в
     * себе методы интерфейса IAction, он не вносит никаких
     * изменений исходный объект.
     * При этом нужный нам ответ String достигается путем
     * вызова переопределенного метода getAction()
     * */
    @Override
    public String getAction() {
        return  Integer.toString(getGetDamage());
    }
}
