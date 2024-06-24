public class Carr {
    private String make, model;
    private int year;

    public void access(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        Carr car = new Carr();
        car.make = "Toyota";
        car.model = "Corolla";
        car.year = 2023;

        System.out.println("Make: " + car.make + "\nModel: " + car.model + "\nYear: " + car.year);
    }

}
