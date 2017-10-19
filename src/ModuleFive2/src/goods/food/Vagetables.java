package goods.food;

import goods.Goods;

public class Vagetables extends Goods {
    private String sort;
    private ExpirationDate expirationDate;

    public Vagetables(int id, String name, int count, String description, double price) {
        super(id, name, count, description, price);
    }

    public Vagetables(int id, String name, int count, String description,
                      double price, String sort, ExpirationDate expirationDate) {
        super(id, name, count, description, price);
        this.sort = sort;
        this.expirationDate = expirationDate;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Сорт: " + sort);
        expirationDate.show();
    }
}
