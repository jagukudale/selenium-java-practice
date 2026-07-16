package practice.javapractice;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Ram";

        StringBuilder sb = new StringBuilder(str);

        System.out.println("Original String : " + str);
        System.out.println("Reversed String : " + sb.reverse());
    }
}
