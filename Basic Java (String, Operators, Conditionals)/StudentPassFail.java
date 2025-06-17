import java.util.Scanner;

public class StudentPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for 3 subjects
        System.out.print("Enter marks for Subject 1: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int sub2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int sub3 = sc.nextInt();

        // Calculating total percentage
        int totalMarks = sub1 + sub2 + sub3;
        double percentage = (totalMarks / 3.0);

        // Checking pass conditions
        if (percentage >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {
            System.out.println("Student has PASSED with " + percentage + "%.");
        } else {
            System.out.println("Student has FAILED with " + percentage + "%.");
        }

        sc.close();
    }
}
