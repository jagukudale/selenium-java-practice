package practice.constructorconcept;

public class TestConstructorNew {
    int empId;
    String name;
public TestConstructorNew(int empId,String name){
    this.empId=empId;
    this.name=name;
}
public void getEmployee(){
    System.out.println("Employee Employee id is "+empId);
    System.out.println("Employee Employee name is "+name);
}
    public static void main(String[] args) {
        TestConstructorNew obj=new TestConstructorNew(10,"Jagannath");
        obj.getEmployee();
    }
}
