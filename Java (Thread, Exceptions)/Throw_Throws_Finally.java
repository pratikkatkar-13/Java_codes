
import java.util.Scanner;

// Custom (User-defined) Exception
class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Throw_Throws_Finally {

    // Method using throws to declare possible exception
    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above.");
        } else {
            System.out.println("Access granted - You are old enough.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // --- Default Exception ---
        try {
            System.out.print("Enter a number to divide 100: ");
            int num = sc.nextInt();
            int result = 100 / num;  // May throw ArithmeticException
            System.out.println("Result = " + result);
        } catch (ArithmeticException e) {
            System.out.println("Default Exception Caught: " + e);
        }

        // --- User-Defined Exception ---
        try {
            System.out.print("\nEnter your age: ");
            int age = sc.nextInt();
            checkAge(age);  // May throw AgeException
        } catch (AgeException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("\nThis is the finally block (always runs)");
            sc.close(); // Cleanup: Closing Scanner
        }

        System.out.println("Program continues after exception handling...");
    }
}
