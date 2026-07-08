package practice.string;

public class TestStringMethod {

    public static void main(String[] args) {

        String str = "Hello Java World";

        // 1. length() - Returns the number of characters
        System.out.println("Length: " + str.length());

        // 2. charAt() - Returns character at specified index
        System.out.println("Character at index 1: " + str.charAt(1));

        // 3. toUpperCase() - Converts string to uppercase
        System.out.println(str.toUpperCase());

        // 4. toLowerCase() - Converts string to lowercase
        System.out.println(str.toLowerCase());

        // 5. equals() - Compares content of two strings
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1.equals(s2));

        // 6. equalsIgnoreCase() - Compares strings ignoring case
        System.out.println("JAVA".equalsIgnoreCase("java"));

        // 7. contains() - Checks if string contains given text
        System.out.println(str.contains("Java"));

        // 8. startsWith() - Checks if string starts with given text
        System.out.println(str.startsWith("Hello"));

        // 9. endsWith() - Checks if string ends with given text
        System.out.println(str.endsWith("World"));

        // 10. indexOf() - Returns first occurrence index
        System.out.println(str.indexOf("Java"));

        // 11. lastIndexOf() - Returns last occurrence index
        System.out.println("Java Java".lastIndexOf("Java"));

        // 12. substring(beginIndex) - Extracts substring from index
        System.out.println(str.substring(6));

        // 13. substring(beginIndex, endIndex)
        System.out.println(str.substring(6, 10));

        // 14. replace() - Replaces characters or words
        System.out.println(str.replace("Java", "Python"));

        // 15. replaceAll() - Replaces using regex
        System.out.println("abc123".replaceAll("[0-9]", "*"));

        // 16. trim() - Removes leading and trailing spaces
        String space = "   Hello   ";
        System.out.println(space.trim());

        // 17. isEmpty() - Checks if string is empty
        String empty = "";
        System.out.println(empty.isEmpty());

        // 18. concat() - Concatenates strings
        System.out.println("Hello".concat(" World"));

        // 19. split() - Splits string into array
        String skills = "Java,Selenium,API";
        String[] arr = skills.split(",");

        for (String skill : arr) {
            System.out.println(skill);
        }

        // 20. compareTo() - Lexicographical comparison
        System.out.println("Apple".compareTo("Banana"));

        // 21. valueOf() - Converts data type to String
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println(numStr);

        // 22. join() - Joins strings with delimiter
        String date = String.join("-", "2026", "07", "08");
        System.out.println(date);

        // 23. matches() - Checks regex match
        System.out.println("12345".matches("\\d+"));

        // 24. repeat() - Repeats string (Java 11+)
        System.out.println("Hi ".repeat(3));

        // 25. intern() - Returns pooled string reference
        String str1 = new String("Java");
        String str2 = str1.intern();
        System.out.println(str2);

        // 26. toCharArray() - Converts string to char array
        char[] chars = str.toCharArray();

        for (char c : chars) {
            System.out.print(c + " ");
        }
    }
}
