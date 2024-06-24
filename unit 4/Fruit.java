public class Fruit {
    protected String color;

    public Fruit(String color) {
        this.color = color;
    }
}

public class Apple extends Fruit {
    private String taste;

    public Apple(String color, String taste) {
        super(color);
        this.taste = taste;
    }

    public void displayInfo() {
        System.out.println("Color: " + this.color);
        System.out.println("Taste: " + this.taste);
    }
}

public class Main {
    public static void main(String[] args) {
        Apple myApple = new Apple("red", "sweet");
        myApple.displayInfo();
    }
}