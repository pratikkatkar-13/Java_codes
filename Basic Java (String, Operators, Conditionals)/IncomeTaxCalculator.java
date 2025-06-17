import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking income as input
        System.out.print("Enter your annual income (in Lacs): ");
        double income = sc.nextDouble();

        double tax = 0;

        // Tax calculation based on slabs
        if(income<=2.5f)
        {
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5.0f)
        {
            tax  = tax + 0.05 * (income - 2.5f); //5 %
        }
        else if(income>5.0f && income<=10.0f)
        {
            tax  = tax + 0.05 * (5.0f - 2.5f); //5 %
            tax  = tax + 0.2 * (income - 5.0f); //20 %
        }
        else{ //for income>10.0f
            tax  = tax + 0.05 * (5.0f - 2.5f); //5 %
            tax  = tax + 0.2 * (10.0f - 5.0f); //20 %
            tax  = tax + 0.3 * (income - 10.0f); //30 %
        }

        // Printing tax amount
        System.out.println("Total Income Tax: " + tax + " Lacs");

        sc.close();
    }
}
