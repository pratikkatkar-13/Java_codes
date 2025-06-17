import java.util.Scanner;

public class InputDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking integer input using nextInt()
        System.out.print("Enter an integer: ");
        int intValue = sc.nextInt();
        System.out.println("You entered: " + intValue);

        // Taking two integers at the same time
        System.out.print("Enter two integers separated by space: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("First number: " + num1 + ", Second number: " + num2);

        // Taking float input using nextFloat()
        System.out.print("Enter a floating-point number: ");
        float floatValue = sc.nextFloat();
        System.out.println("You entered: " + floatValue);

        // Taking double input using nextDouble()
        System.out.print("Enter a double value: ");
        double doubleValue = sc.nextDouble();
        System.out.println("You entered: " + doubleValue);

        // Taking a single word string input using next()
        System.out.print("Enter a single word: ");
        String singleWord = sc.next();
        System.out.println("You entered: " + singleWord);

        // Taking a full line string input using nextLine()
        sc.nextLine(); // Consume the leftover newline
        System.out.print("Enter a full sentence: ");
        String fullSentence = sc.nextLine();
        System.out.println("You entered: " + fullSentence);

        // Taking a character input (trick using next().charAt(0))
        System.out.print("Enter a single character: ");
        char charValue = sc.next().charAt(0);
        System.out.println("You entered: " + charValue);

        sc.close();
    }
}
