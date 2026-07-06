package practice;

public class LocalVariables {

    public void test(int b)
    {
        System.out.println("Local variable test method");
        System.out.println("Value of b is "+b);
    }
    public static void main(String[] args) {
        LocalVariables obj=new LocalVariables();
        obj.test(30);
        int a=20;
        System.out.println("Local variables "+a);
    }
}
