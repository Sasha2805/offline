package goods.computerTechnology.DataSheet;

public class RAM {
    private int amountOfRAM;
    private String[] typesOfRAM = new String[]{"DDR1", "DDR2", "DDR3", "DDR4", "DDR5"};
    private String typeOfRAM;

    public RAM(){
        this(0, "");
    }

    public RAM(int amountOfRAM, String typeOfRAM) {
        this.amountOfRAM = amountOfRAM;
        this.typeOfRAM = typeOfRAM;
    }

    public void show(){
        System.out.println("Обьем оперативной памяти: " + amountOfRAM);
        System.out.println("Тип оперативной памяти: " + typeOfRAM);
    }

    // Getters and setters
    public int getAmountOfRAM() {
        return amountOfRAM;
    }

    public void setAmountOfRAM(int amountOfRAM) {
        this.amountOfRAM = amountOfRAM;
    }

    public String[] getTypesOfRAM() {
        return typesOfRAM;
    }

    public void setTypesOfRAM(String[] typesOfRAM) {
        this.typesOfRAM = typesOfRAM;
    }

    public String getTypeOfRAM() {
        return typeOfRAM;
    }

    public void setTypeOfRAM(String typeOfRAM) {
        this.typeOfRAM = typeOfRAM;
    }
}
