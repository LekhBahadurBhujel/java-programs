class Fruit {
    private String color;

    public Fruit(String color) {
        this.color = color;
    }

    // Getters and setters for color (if needed)

    // Other methods specific to Fruit can be added here
}

class Apple extends Fruit {
    private String taste;

    public Apple(String color, String taste) {
        super(color); // Call the constructor of the parent class (Fruit)
        this.taste = taste;
    }

    public void displayInfo() {
        System.out.println("Apple color: " + getColor());
        System.out.println("Apple taste: " + taste);
    }

    // Other methods specific to Apple can be added here
}

// Example usage
public class Mainn {
    public static void main(String[] args) {
        Apple myApple = new Apple("Red", "Sweet");
        myApple.displayInfo();
    }
}
