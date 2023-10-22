package seminars.seminar1.strore.inmemoryelements;

import java.util.Date;

public class OrderItem {
    //region Поля
    private static int counter = 0;
    private int id;
    private Product product;
    private int quantity = 1;

    //    endregion

    //    region Свойства

    public int getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //    endregion

    //region Инициализатор и конструкоры

    {

        id = ++counter;
    }

    public OrderItem(Product product) {
        this.product = product;
    }

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
//endregion

}
