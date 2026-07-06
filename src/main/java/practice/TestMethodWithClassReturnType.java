package practice;

public class TestMethodWithClassReturnType {
    public static Employee getEmployeeData()
    {
        //Employee emp=new Employee();
        return new Employee();
    }

    public Employee getEmployee(Employee emp)
    {
      return emp;
    }
    public String getName(String str)
    {
        return str;
    }
    public String   getMethodData()
    {
        return getName("kudale");
    }

    public static void main(String[] args) {
     Employee emp=getEmployeeData();
        System.out.println("Employee id is "+emp.id);
        System.out.println("Employee name is "+emp.name);
        System.out.println("Employee company name is "+emp.companyName);
        System.out.println("Employee company pin is "+Employee.pin);
        //Pin is declared as static hence we can access using class name


        TestMethodWithClassReturnType obj=new TestMethodWithClassReturnType();
        Employee emp2=new  Employee();
      Employee data=obj.getEmployee(emp2);
        System.out.println("--------------------------------");
        System.out.println("Employee id is "+data.id);
        System.out.println("Employee id is "+data.name);
        System.out.println("Employee id is "+data.companyName);
        System.out.println("Employee id is "+Employee.pin);
        System.out.println("--------------------------------");
//        obj.getName("Jagannath");
        String str=obj.getMethodData();
        System.out.println("Employee name is "+str);
    }
}
