package practice.polymorphism.overriding;

public class TestCoVariantReturnTypeChild extends TestCoVariantReturnTypeParent {
    public String m1()
    {
        System.out.println("I am in Test Co-Variant Return Type Child - m1 method ");
        return "Ram";
    }

    public static void main(String[] args) {
        TestCoVariantReturnTypeParent test = new TestCoVariantReturnTypeChild();
        test.m1();
        System.out.println("--------------------------------------");
        System.out.println(test.m1());
    }
}
