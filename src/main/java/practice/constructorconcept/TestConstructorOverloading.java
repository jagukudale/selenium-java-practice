package practice.constructorconcept;

public class TestConstructorOverloading {
   TestConstructorOverloading() {
       System.out.println("I am in no argument constructor");
   }
   TestConstructorOverloading(int a) {
       System.out.println("I am in single int argument constructor "+a);
   }
   TestConstructorOverloading(String a) {
       System.out.println("I am in single string argument constructor "+a);
   }


    public static void main(String[] args) {
        new TestConstructorOverloading();
        new TestConstructorOverloading(10);
        new TestConstructorOverloading("Jai Shri Ram");
    }
}
