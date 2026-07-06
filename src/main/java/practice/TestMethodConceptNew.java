package practice;

public class TestMethodConceptNew {
    int a=10;
    int b=20;
    public void method1(int a,int b){
        int c=a+b;
        System.out.println("Addition of two number is "+c);
        System.out.println("--------------------------");
        System.out.println("Access instance variable using this keyword. variable sum "+(this.a+this.b));

    }
    public static void main(String[] args) {
        TestMethodConceptNew test=new TestMethodConceptNew();
        test.method1(4,3);
    }
}
