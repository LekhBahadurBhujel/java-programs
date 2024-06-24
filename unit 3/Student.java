import java.util.Scanner;

public class Student {
    private String name;
    private int age;
    private int rollNo;

    // Constructor to initialize data members
    public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    // Display the student's record
    public void displayRecord() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter student age: ");
        int studentAge = sc.nextInt();

        System.out.print("Enter student roll number: ");
        int studentRollNo = sc.nextInt();

        // Create a Student object
        Student student = new Student(studentName, studentAge, studentRollNo);

        // Display the student's record
        System.out.println("\nStudent Record:");
        student.displayRecord();
    }
}
