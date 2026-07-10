package practice.string;

public class StringMethods {
    public static void main(String[] args) {
          String name = "JaiShriRam";
        System.out.println("str.length() method returns length of string "+name.length());
        System.out.println("name.toLowerCase() convert String into lower case "+name.toLowerCase());
        System.out.println("name.toUpperCase() convert String into upper  case "+name.toUpperCase());
        String name1 = "     Jai  Shri   Ram       ";
        System.out.println("name1.trim() The trim() method in Java returns a new string with " );
        System.out.println("all leading and trailing whitespace removed, without altering the spaces in the middle or modifying the original string");
        System.out.println(name1.trim());
        System.out.println("Trim() won't remove middle spaces from string");
        String str1="Ram";
        String str2="ram";
        System.out.println("The method str1.equalsIgnoreCase(str2) compares two strings for equality while");
        System.out.println("ignoring whether the letters are uppercase or lowercase. : "+str1.equalsIgnoreCase(str2));
        System.out.println("The str1.charAt() method returns the individual character located at a specific index");
        System.out.println("within a text string, where the very first character starts at position zero");
        System.out.println("ChatAt(2) str1=Ram : "+str1.charAt(2));
        System.out.println("The str.replace(R, M) method searches a text string for a specific target value or");
        System.out.println("pattern R and swaps it with a new replacement value M");
        System.out.println("replace() replace R to M : "+str1.replace("R","M"));
        System.out.println("The replaceAll() method searches a text string for all occurrences of a specific");
        System.out.println("pattern and replaces every single one of them with a new value.");
        System.out.println("str1.replaceAll(\"Ram\",\"Jai\") method replaces Ram to Jai : "+str1.replaceAll("Ram","Jai"));
        String text = "Cats say meow. Cats are cute.";
        System.out.println("replace() replace Cats to Mats : "+text.replace("Cats","Mats"));
        System.out.println("The str1.indexOf('R') method returns the position number where the character 'R'");
        System.out.println("first appears in a text string, or outputs -1 if that character cannot be found anywhere in the text.");
        System.out.println("str1.indexOf('R') : "+str1.indexOf('R'));
        System.out.println("The str1.lastIndexOf('R') method returns the position number where the character");
        System.out.println("'R' appears for the very last time in a text string, searching backwards from the end,");
        System.out.println("or outputs -1 if the character is not found.");
        String str4="Ram Ram";
        System.out.println("Ram Ram The str1.lastIndexOf('R') : "+str4.lastIndexOf('R'));
        System.out.println("The str4.substring(4,7) method extracts a smaller piece of text ");
        System.out.println("from str4 starting at index position 4 and ending right before index position 7, returning a 3-character string.");
        System.out.println("str4.substring(4,7) " +str4.substring(4,7));
    }
}
