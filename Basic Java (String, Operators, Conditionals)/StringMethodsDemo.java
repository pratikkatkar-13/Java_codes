public class StringMethodsDemo {
    public static void main(String[] args) {
        String name = "  Hatry  "; // Sample string

        // 1. length()
        System.out.println("Length: " + name.length());

        // 2. toLowerCase()
        System.out.println("Lowercase: " + name.toLowerCase());

        // 3. toUpperCase()
        System.out.println("Uppercase: " + name.toUpperCase());

        // 4. trim()
        System.out.println("Trimmed: '" + name.trim() + "'");

        // 5. substring(int start)
        System.out.println("Substring from index 3: " + name.substring(3));

        // 6. substring(int start, int end)
        System.out.println("Substring from index 1 to 5: " + name.substring(1, 5));

        // 7. replace(char oldChar, char newChar)
        System.out.println("Replace 'r' with 'p': " + name.replace('r', 'p'));

        // 8. startsWith()
        System.out.println("Starts with 'Ha': " + name.startsWith("Ha"));

        // 9. endsWith()
        System.out.println("Ends with 'y': " + name.endsWith("y"));

        // 10. charAt()
        System.out.println("Character at index 2: " + name.charAt(2));

        // 11. indexOf(String str)
        System.out.println("Index of 'ar': " + name.indexOf("ar"));

        // 12. indexOf(String str, int start)
        System.out.println("Index of 't' starting from index 3: " + name.indexOf("t", 3));

        // 13. lastIndexOf(String str)
        System.out.println("Last index of 'r': " + name.lastIndexOf("r"));

        // 14. lastIndexOf(String str, int start)
        System.out.println("Last index of 'r' before index 2: " + name.lastIndexOf("r", 2));

        // 15. equals(String anotherString)
        System.out.println("Equals 'HatRy': " + name.equals("HatRy"));

        // 16. equalsIgnoreCase(String anotherString)
        System.out.println("Equals Ignore Case 'harry': " + name.equalsIgnoreCase("harry"));

        // System.out.println("Hello friends !! \n\t My name is \"Pratik Katkar\" ");


        String str = "  Hello, Java Programming!  ";

        // 1. isEmpty() - Checks if the string is empty
        System.out.println("Is string empty? " + str.isEmpty());

        // 2. isBlank() - Checks if the string is blank (Java 11+)
        System.out.println("Is string blank? " + str.isBlank());

        // 3. strip() - Removes leading & trailing spaces (Java 11+)
        System.out.println("String after strip(): '" + str.strip() + "'");

        // 4. repeat() - Repeats the string (Java 11+)
        System.out.println("Repeated string: " + str.repeat(2));

        // 5. replaceAll() - Replaces all occurrences using regex
        System.out.println("Replace vowels with '*': " + str.replaceAll("[aeiouAEIOU]", "*"));

        // 6. matches() - Checks if the string matches a pattern
        System.out.println("Does the string start with 'Hello'? " + str.matches("^\\s*Hello.*"));

        // 7. split() - Splits the string into an array
        String[] words = str.split(" ");
        System.out.println("Splitting words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 8. toCharArray() - Converts string to character array
        char[] charArray = str.toCharArray();
        System.out.println("Characters in the string:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }

         // 9. join() - Joins elements into a single string
        String joined = String.join("-", "Hello", "Java", "World");
        System.out.println("\n Joined string: " + joined);
    }
}
