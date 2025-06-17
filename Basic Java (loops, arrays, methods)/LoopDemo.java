public class LoopDemo {
    public static void main(String[] args) {
        
        // Demonstrating 'while' loop
        System.out.println("While Loop:");
        int i = 1;
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        // Demonstrating 'do-while' loop
        System.out.println("\nDo-While Loop:");
        int j = 1;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j <= 5);

        // Demonstrating 'for' loop
        System.out.println("\nFor Loop:");
        for (int k = 1; k <= 5; k++) {
            System.out.println("k = " + k);
        }

        // Demonstrating 'break' statement
        System.out.println("\nBreak Statement:");
        for (int m = 1; m <= 10; m++) {
            if (m == 6) {
                System.out.println("Breaking at m = " + m);
                break;  // Exit the loop when m reaches 6
            }
            System.out.println("m = " + m);
        }

        // Demonstrating 'continue' statement
        System.out.println("\nContinue Statement:");
        for (int n = 1; n <= 5; n++) {
            if (n == 3) {
                System.out.println("Skipping n = " + n);
                continue;  // Skip the current iteration when n equals 3
            }
            System.out.println("n = " + n);
        }
    }
}
