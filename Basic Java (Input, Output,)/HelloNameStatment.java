import java.util.Scanner;
public class HelloNameStatment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //comment any one and then see the difference running one by one or 

        // //for next method
        System.out.println("Enter your first name");
        String a = sc.next();
        System.out.println("hello " + a);

        sc.nextLine(); // Consume the leftover newline
        
        //for nextline method
        System.out.println("Enter your full name");
        String b = sc.nextLine();
        System.out.println("hello " + b);

        sc.close();
    }
}
