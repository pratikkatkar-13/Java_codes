import java.util.Scanner;

class Subject {
    int max = 100;
    int obtD;
}
public class CalculatePercentage {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Subject s1 = new Subject();
        System.out.print("Enter Maths Marks: ");
        s1.obtD = scn.nextInt();

        Subject s2 = new Subject();
        System.out.print("Enter Science Marks: ");
        s2.obtD = scn.nextInt();

        Subject s3 = new Subject();
        System.out.print("Enter English Marks: ");
        s3.obtD = scn.nextInt();

        Subject s4 = new Subject();
        System.out.print("Enter Social Science Marks: ");
        s4.obtD = scn.nextInt();

        Subject s5 = new Subject();
        System.out.print("Enter Hindi Marks: ");
        s5.obtD = scn.nextInt();

        int totBD = s1.obtD + s2.obtD + s3.obtD + s4.obtD + s5.obtD;
        int per = (totBD * 100) / 500;

        System.out.println("Percentage obtained: " + per + "%");

        scn.close(); // Close the scanner to avoid resource leak
    }
    
}
