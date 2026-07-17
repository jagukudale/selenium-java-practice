package practice.polymorphism.overloading;

public class Addition {
    public void addition(int a,int b)
    {
        int c=a+b;
        System.out.println("Value of Addition a  is "+c);
    }
    public void  addition(int a,int b,int c)
    {
        int d=a+b+c;
        System.out.println("Value of Addition a  is "+d);
    }
    public static void m3(String str)
    {
        System.out.println("Value of M3 is "+str);
    }
    public static void m3(Boolean bool)
    {
        System.out.println("Value of M3 is "+bool);
    }
    public static void main(String[] args) {
        Addition obj=new Addition();
         obj.addition(4,5);
         obj.addition(3,4,5);
         m3("Jai Jagannath");
         m3(true);
    }
}
