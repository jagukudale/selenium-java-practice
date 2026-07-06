package practice.constructorconcept;

public class TestConstructor {
    // No-argument constructor
    public TestConstructor() {
        System.out.println("I am in no argument Constructor");
    }
    // Parameterized constructor
    public TestConstructor(int a) {
        System.out.println("I am in single parameter Constructor");
        System.out.println("Value of a: " + a);
    }
    public static void main(String[] args) {
        TestConstructor obj = new TestConstructor();
        new TestConstructor(45);
      //  TestConstructor obj2 = new TestConstructor(10);


    }
}

