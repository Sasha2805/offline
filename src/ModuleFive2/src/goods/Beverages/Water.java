package goods.Beverages;

import goods.Goods;

public class Water extends Goods{

    public Water(int id, String name, int count, String description, double price) {
        super(id, name, count, description, price);
    }

    @Override
    public void show() {
        super.show();
    }
}
