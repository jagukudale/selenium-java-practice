package practice;

public class TestDefaultValues {
     int a;
    static float b;
    static double c;
   static char d;
   static byte e;
    static short f;
    static boolean g;
    public static void main(String[] args) {
        TestDefaultValues td = new TestDefaultValues();
        String name="Jagannath";
        String name2=null;
        System.out.println("My name is "+name);
        System.out.println(name2);
        System.out.println("By default value of int is ="+ td.a);
        System.out.println("By default value of float is ="+ b);
        System.out.println("By default value of double is ="+ c);
        System.out.println("By default value of char is ="+ d);
        System.out.println("By default value of byte  is ="+ e);
        System.out.println("By default value of short is ="+ f);
        System.out.println("By default value of boolean is ="+ g);


    }
}
