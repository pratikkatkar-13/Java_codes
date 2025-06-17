import java.util.Scanner;
public class KilometerToMiles {
    public static void main(String[] args) {
        System.out.println("Enter Kilometers");
        Scanner sc = new Scanner(System.in);
        double d = sc.nextDouble();
        double miles = d * 0.621371;
        System.out.println("In miles " + miles);
        sc.close();


    }
    
}
