package practice;

public class TestMethodWithThisKeyword {
    public void m1()
    {
        System.out.println("I am in m1 method");
    }
    public void m2()
    {
        this.m1();
        System.out.println("I am in m2 method");
    }
    public String m3()
    {
        this.m1();
        m2(); //Here we are calling m1, and m2 ->method
        // String str="Ram";
        //return str;
        //Replace above two line with below one
        return "Ram";
    }
    public static void main(String[] args) {
        TestMethodWithThisKeyword test=new TestMethodWithThisKeyword();
        test.m2();
        System.out.println("---------------------------");
        String name= test.m3();
        System.out.println(name);
    }
}
