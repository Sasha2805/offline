package goods;

public abstract class Goods {
    private int id;
    private String name;
    private int count;
    private String description;
    private double price;

    public Goods(int id, String name, int count, String description, double price) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.description = description;
        this.price = price;
    }

    public void show(){
        System.out.println("Id: " + id);
        System.out.println("Название: " + name);
        System.out.println("Количество: " + count);
        System.out.println("Описание: " + description);
        System.out.println("Цена: " + price);
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
