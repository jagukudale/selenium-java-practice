package practice.inheritance;

public class Child extends Parent {
    int a=10;
    public void m2() {
        System.out.println("I am in Child m2()");
        System.out.println("Value of Child variable a  is "+this.a);
        System.out.println("Value of Parent variable a  is "+super.a);
        System.out.println("Value of GrandParent variable b is "+super.b);
        System.out.println(b);
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
