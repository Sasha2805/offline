package goods.Beverages;

import goods.Goods;
import goods.food.ExpirationDate;

public class SweetDrinks extends Goods {
    private ExpirationDate expirationDate;

    public SweetDrinks(int id, String name, int count, String description, double price) {
        super(id, name, count, description, price);
    }

    public SweetDrinks(int id, String name, int count,
                       String description, double price, ExpirationDate expirationDate) {
        super(id, name, count, description, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public void show() {
        super.show();
        expirationDate.show();
    }
}
