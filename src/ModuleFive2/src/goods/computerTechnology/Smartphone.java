package goods.computerTechnology;

import goods.Goods;
import goods.computerTechnology.DataSheet.Processor;
import goods.computerTechnology.DataSheet.RAM;

public class Smartphone extends Goods {
    private String[] operatingSystems = new String[]{"iOS", "Android", "Windows Phone"};
    private String operatingSystem;
    private RAM ram;
    private Processor processor;
    private double screenDiagonal;
    private int batteryLifeTime;
    private int guaranteePeriod;

    public Smartphone(int id, String name, int count, String description, double price) {
        super(id, name, count, description, price);
    }

    public Smartphone(int id, String name, int count, String description,
                      double price, String operatingSystem, RAM ram, Processor processor,
                      double screenDiagonal, int batteryLifeTime, int guaranteePeriod) {
        super(id, name, count, description, price);
        this.operatingSystem = operatingSystem;
        this.ram = ram;
        this.processor = processor;
        this.screenDiagonal = screenDiagonal;
        this.batteryLifeTime = batteryLifeTime;
        this.guaranteePeriod = guaranteePeriod;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("Операционная система: " + operatingSystem);
        ram.show();
        processor.show();
        System.out.println("Диагональ екрана: " + screenDiagonal);
        System.out.println("Время работы от батареи: " + batteryLifeTime);
        System.out.println("Гарантийный срок: " + guaranteePeriod);
    }

    // Getters and setters
    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public double getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(double screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public int getBatteryLifeTime() {
        return batteryLifeTime;
    }

    public void setBatteryLifeTime(int batteryLifeTime) {
        this.batteryLifeTime = batteryLifeTime;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(int guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }
}
