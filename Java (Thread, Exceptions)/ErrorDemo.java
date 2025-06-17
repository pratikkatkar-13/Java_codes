public class ErrorDemo {
    public static void main(String[] args) {

        // 1. SYNTAX ERROR (Uncomment this to see compile-time error)
        // int a = 10
        // System.out.println("Missing semicolon will give syntax error");

        // 2. LOGICAL ERROR (Program runs but gives wrong output)
        int num1 = 10;
        int num2 = 5;
        int sum = num1 - num2; // ❌ Logical error: should be num1 + num2
        System.out.println("Sum is: " + sum); // Wrong output: 5

        // 3. RUNTIME ERROR
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[5]); // ❌ Runtime error: ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught runtime error: " + e);
        }
    }
}



