package seminars.seminar1.strore.inmemorymodel;

import seminars.seminar1.strore.inmemoryelements.Order;

import java.util.Collection;
import java.util.HashSet;


public class Store {
    //region Поля
    private Collection<Order> orders = new HashSet<>();
//    endregion

    //region Методы
    public boolean addOrder(Order order) {
        orders.add(order);
        return true;
    }

    public boolean cancelOrder(int id) {
        //TODO: Отмена заказа
        return true;
    }

    public boolean paymentOrder(int id) {
        //TODO: Оплата заказа
        return true;
    }
//    endregion

}
