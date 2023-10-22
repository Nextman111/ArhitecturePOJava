package seminars.seminar1.strore.inmemoryelements;

import java.util.Date;

public class Product {
    //region Поля
    private static int counter = 0;
    private int id;
    private String name;
    private String category;
    private double price;

    //    endregion

    //    region Свойства

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


//    endregion

    //region Инициализатор и конструкоры

    {

        id = ++counter;
    }

    public Product() {
    }

    //endregion
}
