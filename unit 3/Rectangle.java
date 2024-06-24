public class Rectangle {
    float length, width;

    public float area() {
        return length * width;
    }

    public static void main(String[] args) {
        float firstRectangleArea;
        Rectangle firstRectangle = new Rectangle();
        firstRectangle.length = 10;
        firstRectangle.width = 5;

        firstRectangleArea = firstRectangle.area();
        System.out.println("The area of Rectangle is : " + firstRectangleArea);

    } 
}
