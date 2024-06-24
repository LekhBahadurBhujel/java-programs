class Shape {
    // Assume Shape class has other methods and attributes
}

class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    public double calculateArea() {
        return sideLength * sideLength;
    }

    // Other methods specific to Square can be added here
}

// Example usage
public class Main {
    public static void main(String[] args) {
        Square mySquare = new Square(5.0);
        double area = mySquare.calculateArea();
        System.out.println("Area of the square: " + area);
    }
}
