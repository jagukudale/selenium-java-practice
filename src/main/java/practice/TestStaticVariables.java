package practice;
//we can not create static variable inside method
//static variable bounded with class not object
//Memory allocated at the time of class loading
//Static variable are use to memory management
//static variable are called using class name

public class TestStaticVariables {
     int id = 5;
     String name = "Jagannath";
    static String companyName="Coforge";

    int id1 = 7;
    String name1 = "Jagannath1";
    //String companyName1="Coforge";

    public void getData()
    {
       // static int a=10;

        System.out.println(" Emp Id "+id);
        System.out.println(" Emp Name "+name);
        System.out.println(" Emp Company Name "+companyName);
    }


    public void getData1()
    {
        System.out.println("I am in getData1 method");
        System.out.println(" Emp Id "+id1);
        System.out.println(" Emp Name "+name1);
        System.out.println(" Emp Company Name "+TestStaticVariables.companyName);
        //Access static variable using .class name anywhere in the project
        System.out.println("Access static variable using class name "+Employee.pin);
    }

    public void showData()
    {

    }

    public static void main(String[] args) {
        // Static variable are bounded with class not object
        TestStaticVariables obj=new TestStaticVariables();
        obj.getData();
        System.out.println("-------------------------------------");
        TestStaticVariables obj1=new TestStaticVariables();
        obj1.getData1();
    }
}
