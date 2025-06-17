// public class CommonExceptions {
//     public static void main(String[] args) {
        
//         // 1. NullPointerException
//         try {
//             String str = null;
//             System.out.println(str.length()); // accessing null object
//         } catch (NullPointerException e) {
//             System.out.println("Caught NullPointerException: " + e);
//         }

//         // 2. ArithmeticException
//         try {
//             int a = 10 / 0; // division by zero
//         } catch (ArithmeticException e) {
//             System.out.println("Caught ArithmeticException: " + e);
//         }

//         // 3. ArrayIndexOutOfBoundsException
//         try {
//             int[] arr = {1, 2, 3};
//             System.out.println(arr[5]); // invalid index
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("Caught ArrayIndexOutOfBoundsException: " + e);
//         }

//         // 4. IllegalArgumentException
//         try {
//             Thread t = new Thread();
//             t.setPriority(100); // priority must be between 1 and 10
//         } catch (IllegalArgumentException e) {
//             System.out.println("Caught IllegalArgumentException: " + e);
//         }

//         // 5. NumberFormatException
//         try {
//             String s = "abc";
//             int num = Integer.parseInt(s); // invalid number format
//         } catch (NumberFormatException e) {
//             System.out.println("Caught NumberFormatException: " + e);
//         }
//     }
// }
