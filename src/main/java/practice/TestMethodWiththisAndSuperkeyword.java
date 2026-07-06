package practice;

public class TestMethodWiththisAndSuperkeyword extends Employee{
    public void m1()
    {
        System.out.println("I am in child m1  method");
    }
    public void m2()
    {
        this.m1();//this-> we call (child)current class method
        super.m1();//super-> We call parent class m1 method
        System.out.println("I am in child m2 method");
    }
    public static void main(String[] args) {
        TestMethodWiththisAndSuperkeyword obj=new TestMethodWiththisAndSuperkeyword();
        obj.m2();
    }
}
