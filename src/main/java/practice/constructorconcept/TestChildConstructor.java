package practice.constructorconcept;

public class TestChildConstructor extends TestParentConstructor {
    public TestChildConstructor() {
        //Here compiler or JVM automatically call to the parent default constructor
        //Compiler will add super(); statement by default
        System.out.println("I am in child Constructor");
    }

    public static void main(String[] args) {
        TestChildConstructor obj = new TestChildConstructor();
    }
}
