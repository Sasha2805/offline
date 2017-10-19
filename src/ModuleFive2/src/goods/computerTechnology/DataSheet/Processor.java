package goods.computerTechnology.DataSheet;

public class Processor {
    private int numberOfCores;
    private int coreFrequency;

    public Processor(){
        this(0,0);
    }

    public Processor(int numberOfCores, int coreFrequency) {
        this.numberOfCores = numberOfCores;
        this.coreFrequency = coreFrequency;
    }

    public void show(){
        System.out.println("Количество ядер процессора: " + numberOfCores);
        System.out.println("Тактовая частота ядра процессора: " + coreFrequency);
    }

    // Getters and setters
    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public int getCoreFrequency() {
        return coreFrequency;
    }

    public void setCoreFrequency(int coreFrequency) {
        this.coreFrequency = coreFrequency;
    }
}
