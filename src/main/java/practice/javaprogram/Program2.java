package practice.javaprogram;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {

        String str = "My name is ram";

        String[] words = str.split(" ");

        System.out.println("Before reverse string is : "+str);
        System.out.println("After split string is : "+ Arrays.toString(words));
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + " ");
        }
    }
}
