package practice;

public class Employee {
    int id=160643;
    String name="jagannath";
   static int pin=411028;
   String companyName="Coforge";

   public void getData()
   {
       System.out.println("Employee id is "+id);
       System.out.println("Employee name is "+name);
       System.out.println("Employee city pin is "+pin);
       System.out.println("Company name is "+companyName);
   }

   public void m1()
   {
       System.out.println("I am in Employee :: m1 method");
   }
}
