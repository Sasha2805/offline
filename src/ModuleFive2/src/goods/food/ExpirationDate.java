package goods.food;

public class ExpirationDate {
    private String dateOfManufacture;
    private double storageTemperature;
    private int shelfLife;

    public ExpirationDate() {
        this("", 0, 0);
    }

    public ExpirationDate(String dateOfManufacture, double storageTemperature, int shelfLife) {
        this.dateOfManufacture = dateOfManufacture;
        this.storageTemperature = storageTemperature;
        this.shelfLife = shelfLife;
    }

    public void show(){
        System.out.println("Дата производства: " + dateOfManufacture);
        System.out.println("Температура хранения: " + storageTemperature);
        System.out.println("Продолжительность срока годности: " + shelfLife);
    }

    // Getters and setters
    public String getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(String dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public double getStorageTemperature() {
        return storageTemperature;
    }

    public void setStorageTemperature(double storageTemperature) {
        this.storageTemperature = storageTemperature;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }
}
