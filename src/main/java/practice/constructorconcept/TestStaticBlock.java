package practice.constructorconcept;

public class TestStaticBlock {
    // Static Block
    static {
        System.out.println("----------------------------------------");
        System.out.println("Static block has been initialized and it will execute only once no matter how many objects are created");
        System.out.println("It would use to read file .exl OR database connectivity");
        System.out.println("Static variable are execute only once during .class file loading for all the objects");
        System.out.println("------------------------------------------");
    }
    {
        System.out.println("*********************************");
        System.out.println("This is instance block it will execute every time whenever you will create and object");
        System.out.println("*********************************");
    }
    // Constructor
    TestStaticBlock() {
        System.out.println("Constructor Executed");
    }

    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Object 1 created ");
        TestStaticBlock obj1 = new TestStaticBlock();
        System.out.println("-------------------");
        System.out.println("Object 2 created ");
        TestStaticBlock obj2 = new TestStaticBlock();

    }
}
