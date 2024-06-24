public class Vehicle {
    String color, model;
    int year;

    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.color = "Red";
        car.model = "BMW";
        car.year = 2024;

        System.out.println("Color: " + car.color + "\nModel: " + car.model + "\nYear : " + car.year);
    }
}

