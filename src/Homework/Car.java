package Homework;

public class Car {
    String brand;
    String model;
    int year;
    double weight;
    int price;

    public Car(String brand, String model, int year, double weight, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.weight = weight;
        this.price = price;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    @Override

    public String toString() {
        return "Car("+"brands - "+ brand +
                "\n model -"+ model + "" +
                "\n year - "+ year +
                "\n weight - "+ weight +
                "\n preice - "+ price+ ')';

    }

}

