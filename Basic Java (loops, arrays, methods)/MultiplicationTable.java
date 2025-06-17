import java.util.*;;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter the number to print table of ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Printing table for " + a );
        for(int i = 1; i<=10; i++)
        {
            System.out.printf("%d X %d = %d \n", a, i, a*i);

        }
        sc.close();
    }
}
