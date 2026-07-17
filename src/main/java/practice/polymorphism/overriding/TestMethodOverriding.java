package practice.polymorphism.overriding;

public class TestMethodOverriding {
    public static void main(String[] args) {

        // ==================================================
        // 1. Parent Reference -> Parent Object
        // ==================================================
        TestParent p1 = new TestParent();

        System.out.println("1. Parent Reference -> Parent Object");
        p1.show();    // Calls Parent's show()

        System.out.println("---------------------------");

        // ==================================================
        // 2. Child Reference -> Child Object
        // ==================================================
        TestChild c1 = new TestChild();

        System.out.println("2. Child Reference -> Child Object");
        c1.show();       // Calls Child's overridden show()
        c1.display();    // Calls Child's own method

        System.out.println("---------------------------");

        // ==================================================
        // 3. Parent Reference -> Child Object
        // (Runtime Polymorphism)
        // ==================================================
        TestParent p2 = new TestChild();

        System.out.println("3. Parent Reference -> Child Object");
        p2.show();      // Calls Child's show()

        // Not Allowed
        // p2.display(); // Compile-time Error
        // Parent reference cannot access Child-specific methods.

        System.out.println("---------------------------");

        // ==================================================
        // 4. Child Reference -> Parent Object
        // ==================================================

        // Child c2 = new Parent();   // Compile-time Error

        System.out.println("4. Child Reference -> Parent Object");
        System.out.println("Not Allowed in Java");
    }
}
