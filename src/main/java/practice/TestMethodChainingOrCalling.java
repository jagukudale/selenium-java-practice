package practice;

public class TestMethodChainingOrCalling {
    Employee emp;

    public void m1()
    {
      emp=new Employee();
      emp.getData();
    }
    public void m2()
    {
     emp.getData();
    }

    public static void main(String[] args) {
        TestMethodChainingOrCalling obj=new TestMethodChainingOrCalling();
        obj.m1();
        System.out.println("-----------------------------");
        obj.m2();
    }
}
