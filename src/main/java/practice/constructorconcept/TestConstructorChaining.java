package practice.constructorconcept;

public class TestConstructorChaining {
    public TestConstructorChaining() {
        this(10);
        System.out.println("I am in no argument Constructor");
    }
    public TestConstructorChaining(int a){
        this(35,"Jagannath");
        System.out.println("Integer a value is "+a);
    }
    public TestConstructorChaining(int age, String name){
        System.out.println("My name is "+name);
        System.out.println("My age is "+age);
    }

    public static void main(String[] args) {
        TestConstructorChaining obj = new TestConstructorChaining();
    }
}
