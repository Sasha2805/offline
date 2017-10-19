package goods.Clothes;

public class Brand {
    private int yearOfFoundation;
    private String name;
    private int numberOfEmployees;
    private int countCountries;

    public Brand(int yearOfFoundation, String name, int numberOfEmployees, int countCountries) {
        this.yearOfFoundation = yearOfFoundation;
        this.name = name;
        this.numberOfEmployees = numberOfEmployees;
        this.countCountries = countCountries;
    }

    public void show(){
        System.out.println("Год основания: " + yearOfFoundation);
        System.out.println("Название: " + name);
        System.out.println("Кол-во работников: " + numberOfEmployees);
        System.out.println("Кол-во стран в котором продаются товары: " + countCountries);
    }

    // Getters and setters
    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getCountCountries() {
        return countCountries;
    }

    public void setCountCountries(int countCountries) {
        this.countCountries = countCountries;
    }
}
