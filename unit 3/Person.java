public class Person {
    String name, address;
    int age;

    public void displayPerson() {
        System.out.println("Name: "+ name + "\nAge: "+ age + "\nAddress: "+ address);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Rajesh";
        p1.age = 16;
        p1.address = "Nepal";

        p1.displayPerson();
    }
}