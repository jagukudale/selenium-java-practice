package practice.polymorphism.overriding;

public class TestChild extends TestParent {
    @Override
    void show() {
        System.out.println("Child class show() method");
    }
    // Child-specific method
    void display() {
        System.out.println("Child class display() method");
    }
}
