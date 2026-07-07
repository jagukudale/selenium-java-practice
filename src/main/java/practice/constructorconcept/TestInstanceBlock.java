package practice.constructorconcept;

public class TestInstanceBlock {
    {
        System.out.println("I am in instance block 2");
    }
    {
        System.out.println("I am in instance block 1");
    }
    TestInstanceBlock()
    {
        System.out.println("I am in TestInstanceBlock constructor");
    }

    public static void main(String[] args) {
        System.out.println("Note : - Instance block will execute(every time) whenever you will create and object");
        new TestInstanceBlock();
        System.out.println("-------------------------------------");
        new TestInstanceBlock();
        //OR
        System.out.println("Another way of executing constructor");
        TestChildConstructor obj = new TestChildConstructor();
        System.out.println("--------------------------------------");
        TestInstanceBlock obj2 = new TestInstanceBlock();


    }
}
