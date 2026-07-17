package practice.polymorphism;
//Method overloading is defining multiple methods with the same name but different parameter lists
// (number, type, or order of parameters). It is also known as compile-time polymorphism.

public class TestMethodOverloading {
    // Method with no parameters
    void add() {
        System.out.println("No parameters");
    }

    // Method with one int parameter
    void add(int a) {
        System.out.println("One parameter: " + a);
    }

    // Method with two int parameters
    void add(int a, int b) {
        System.out.println("Addition = " + (a + b));
    }

    // Method with three int parameters
    void add(int a, int b, int c) {
        System.out.println("Addition = " + (a + b + c));
    }


    public static void main(String[] args) {
        // Creating an object of the class
        TestMethodOverloading obj = new TestMethodOverloading();
        // Calls add()
        obj.add();
        // Calls add(int)
        obj.add(10);
        // Calls add(int, int)
        obj.add(10, 20);
        // Calls add(int, int, int)
        obj.add(10, 20, 30);
    int[] arr={10,20,30};
    main(arr);
    }
    public static void main(int [] a)
    {

        System.out.println("I AM IN MAIN METHOD OVERLOADING");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
