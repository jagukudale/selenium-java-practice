package practice;

public class TestMethodReturnType {
    public int addition(int a,int b)
    {
        int c=a+b;
        System.out.println("Addition method returns "+(a+b));
        return c;
    }
    public int multiplication(int a,int b)
    {
        int d=(a*b);
        System.out.println("Multiplication method returns "+(a*b));
        return d;
    }
    public int subtraction(int p,int q)
        {
        int r=(p-q);
            System.out.println("Subtraction method returns "+r);
        return r;

        }
        public String getName(String name)
        {
            return name;
        }

    public static void main(String[] args) {
        TestMethodReturnType obj=new TestMethodReturnType();
        obj.addition(2,2);
        obj.multiplication(3,4);
        System.out.println("-----------------------------");
        System.out.println(obj.addition(2,5));
        System.out.println(obj.multiplication(5,2));
        System.out.println("-----------------------------");
        int sub=obj.subtraction(20,5);
        System.out.println("Substraction is "+sub);
        System.out.println("-----------------------------");
        String name1= obj.getName("Jagannath");
        System.out.println("Name is "+name1);
    }
}
