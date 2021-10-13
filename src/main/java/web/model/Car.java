package web.model;

import java.util.List;

public class Car {
    private String manufacturer;
    private String model;
    private String vinNumber;

    public Car(String manufacturer, String model, String vinNumber) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.vinNumber = vinNumber;
    }

    public static Car[] createAndGetFiveCars() {
        Car[] arrayCars = {
                new Car("BMW", "3", "123456789"),
                new Car("Tesla", "S", "987654321"),
                new Car("Audi", "Q5", "481712461"),
                new Car("Mersedes-Benz", "GLA", "827389127"),
                new Car("Kia", "K5", "213213712")
        };

        return arrayCars;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", vinNumber=" + vinNumber +
                '}';
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }
}
