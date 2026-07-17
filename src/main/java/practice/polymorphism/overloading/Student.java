package practice.polymorphism.overloading;
//Constructor overloading

public class Student {
    Student() {
        System.out.println("Default Constructor");
    }

    Student(int id) {
        System.out.println("ID: " + id);
    }

    Student(int id, String name) {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    public static void main(String[] args) {
        System.out.println("Constructor Overloading Example");
        new Student();
        new Student(101);
        new Student(101, "Jagannath");
    }
}
