package goods.Clothes;

import goods.Goods;

public class Clothes extends Goods {
    private Brand brand;

    public Clothes(int id, String name, int count, String description, double price) {
        super(id, name, count, description, price);
    }

    public Clothes(int id, String name, int count, String description, double price, Brand brand) {
        super(id, name, count, description, price);
        this.brand = brand;
    }

    @Override
    public void show() {
        super.show();
        brand.show();
    }
}
