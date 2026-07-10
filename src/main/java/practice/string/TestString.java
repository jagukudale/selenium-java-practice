package practice.string;

public class TestString {
    public static void main(String[] args) {
        String str1 = new String("Jagannath");//String object way
        String str2 = new String("Jagannath");
        String str3 = "Jagannath"; //string literal way
        String str4 = "Jagannath";
        System.out.println("It will compare refernce of variable/objects == ");
        System.out.println("String comparision using ==  :-> "+ (str1 == str2));
        System.out.println("String comparision using .equal :-> "+str1.equals(str3));
        System.out.println("String str3 = Jagannath and str4 = Jagannath");
        System.out.println("String str3 & str4 comparision using == "+(str3==str4));
        System.out.println("String str3 & str4 comparision using .equal :-> "+str3.equals(str4));
        System.out.println("Address of str1 = "+System.identityHashCode(str1));
        System.out.println("Address of str2 = "+System.identityHashCode(str2));
        System.out.println("Address of str3 = "+System.identityHashCode(str3));
        System.out.println("Address of str4 = "+System.identityHashCode(str4));

        String s1 = "banana";
        String s2 = "apple";
        System.out.println("The compareTo() method in Java compares two objects sequentially and returns 0 if they are equal");
        System.out.println("a negative integer if the current object is smaller, or a positive integer if it is larger");
        System.out.println("String s1 = banana and s2 = apple");
        System.out.println("s1.compareTo(s2) result :->  "+s1.compareTo(s2)); // Negative value ('apple' comes before 'banana')
    }
}
