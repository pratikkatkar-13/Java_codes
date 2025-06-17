import java.util.Scanner;
public class IsInterger {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter an integer");
        // int a = sc.nextInt();
        // System.out.println("the number is "+ a);

        boolean b = sc.hasNextInt();
        System.out.println("Is this Integer  - " + b);
        sc.close();
    }
}
