package goods.food;

import goods.Goods;

public class Sweets extends Goods {
    private ExpirationDate expirationDate;

    public Sweets(int id, String name, int count, String description, double price) {
        super(id, name, count, description, price);
    }

    public Sweets(int id, String name, int count, String description, double price, ExpirationDate expirationDate) {
        super(id, name, count, description, price);
        this.expirationDate = expirationDate;
    }

    @Override
    public void show(){
        super.show();
        expirationDate.show();
    }
}
