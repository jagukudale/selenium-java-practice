package practice;

public class TestMethodConcept {
    //Non static methods
    public void method1(){
        System.out.println("Non static methods");
        //method implementation
    }
    ////static methods
    public static void method2(){
        System.out.println("static methods");
    }

    public static void method3(int a,int b){
        int c=a*b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        TestMethodConcept obj = new TestMethodConcept();
       obj.method1();
       method2(); // we can access static variable in static method directly
       TestMethodConcept.method2();
       method3(10,20);
    }
}
