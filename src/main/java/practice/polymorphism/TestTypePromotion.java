package practice.polymorphism;
//Type promotion method overloading works
/*"Java first looks for an exact method match. If it doesn't find one, it automatically promotes the argument
to the next compatible wider primitive type in the order: byte → short → int → long → float → double.
It then calls the first matching overloaded method."
 */
public class TestTypePromotion {
    // Method with int parameter
    void show(int a) {
        System.out.println("int method called " +a);
    }

    // Method with double parameter
    void show(double a) {
        System.out.println("double method called "+a);
    }


    // Method 2
    void show(long a) {
        System.out.println("long method called "+a);
    }

    // Method 3
    void show(float a) {
        System.out.println("float method called "+a);
    }



    public static void main(String[] args) {

        TestTypePromotion obj = new TestTypePromotion();

        byte b = 10;
        // There is no show(byte) method.
        // Java promotes byte to int and calls show(int).
        obj.show(b);
        obj.show(10.00);



        short s = 20;
        int i = 30;
        long l = 40;
        float f = 50.5f;
        double d = 60.5;
        // byte is promoted to int
        obj.show(b);

        // short is promoted to int
        obj.show(s);

        // Exact match
        obj.show(i);

        // Exact match
        obj.show(l);

        // Exact match
        obj.show(f);

        // Exact match
        obj.show(d);
    }
}
