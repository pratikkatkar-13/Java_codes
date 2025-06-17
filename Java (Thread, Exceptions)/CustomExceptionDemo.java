// Custom Exception Class
class MyException extends Exception {
    public MyException(String message) {
        super(message); // calling parent class constructor
    }

    @Override
    public String toString() {
        return "Custom toString(): " + super.toString();
    }

    @Override
    public String getMessage() {
        return "Custom getMessage(): " + super.getMessage();
    }
}

// Driver Class
public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            int age = 15;
            if (age < 18) {
                throw new MyException("Age is less than 18");
            } else {
                System.out.println("You are eligible!");
            }
        } catch (MyException e) {
            System.out.println("\n--- Exception Handling Output ---");
            System.out.println(e);                // toString()
            System.out.println(e.getMessage());   // getMessage()
            e.printStackTrace();                 // printStackTrace()
        }
    }
}
