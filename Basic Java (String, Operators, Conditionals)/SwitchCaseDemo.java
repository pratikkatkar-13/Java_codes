import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for day number
        System.out.print("Enter a number (1 for Monday, 2 for Tuesday, ..., 7 for Sunday): ");
        int day = sc.nextInt();

        // Using switch-case to find the corresponding day
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input! Please enter a number between 1 and 7.");
        }

        sc.close();
    }
}
