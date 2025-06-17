public class Prints_Sequence {
    public static void main(String[] args) {
        int a = 10, b = 20;
        double pi = 3.14159;
        String name = "John";

        // Using print (prints without newline)
        System.out.print("It does not add a new line.\n");

        // Using println (prints with newline)
        System.out.println("It automatically adds a new line.");

        // Using printf (for formatted output)
        System.out.printf("Hello, %s! You have %d apples.\n", name, a);
        System.out.printf("Value of pi up to 2 decimal places: %.2f\n", pi);

        // Using format (alternative to printf)
        System.out.format("a = %d, b = %d, Sum = %d\n", a, b, (a + b));
        System.out.format("Pi in 4 decimal places: %.4f\n", pi);

        // Demonstrating escape sequences
        System.out.println("New Line\nTab\tBackslash \\ Double Quote \" Single Quote \'");

        // Multiple values using printf/format
        System.out.printf("Hexadecimal of %d: %x\n", 255, 255);
        System.out.format("Scientific notation: %.3e\n", pi);
    }
}
