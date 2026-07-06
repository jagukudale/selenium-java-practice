package practice;

public class TestInstanceVariable {
    //instance variable can not access into static method directly
    int a=10;
    static int b=20;
public void instanceVariable(){
    System.out.println("Instance variable = "+a);
    //instance variable can access into non static method directly

    System.out.println("Instance variable = "+b);
    //We can acces static varibale in non static method directly
}

    public static void main(String[] args) {
    //object creation

        /*
        * TestInstanceVariable is the class name.
          new TestInstanceVariable() creates an object in memory.
          obj is a reference variable that stores the address of the created object.
          Using obj, we can access the instance variables and methods of the class
        * */
        TestInstanceVariable obj=new TestInstanceVariable();
        obj.instanceVariable();

        /*Class = Blueprint
          Object = Real instance created from the blueprint
          Reference Variable = Variable that points to the object
          new = Creates the object in memory*/

        System.out.println("Instance variable can access using object creation = "+obj.a);
// we can not use non static variable in static method directly
        System.out.println("Static Instance variable can access directly in static method = "+b);

        Employee emp=new Employee();
        System.out.println("Access non static varibale in static method using object ceation of class");
        System.out.println(emp.name);
        System.out.println(emp.id);
        //
}
}
