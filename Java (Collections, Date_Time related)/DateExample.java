import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println("Current Date: " + date);
        System.out.println("Milliseconds since Jan 1, 1970: " + date.getTime());
        // System.out.println("Day: " + date.getDay()); // Deprecated
        // System.out.println("Month: " + date.getMonth()); // Deprecated
        // System.out.println("Year: " + date.getYear()); // Deprecated
        // System.out.println("Hours: " + date.getHours()); // Deprecated
        // System.out.println("Minutes: " + date.getMinutes()); // Deprecated
        // System.out.println("Seconds: " + date.getSeconds()); // Deprecated
        // System.out.println("toGMTString: " + date.toGMTString());
        // System.out.println("toLocaleString: " + date.toLocaleString());
        System.out.println("After 2 seconds? " + date.after(new Date(date.getTime() + 2000)));
    }
}
