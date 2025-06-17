import java.util.GregorianCalendar;
import java.util.Calendar; 


public class GregorianExample {
    public static void main(String[] args) {
        GregorianCalendar gc = new GregorianCalendar();

        System.out.println("Year: " + gc.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + gc.get(GregorianCalendar.MONTH));
        System.out.println("Day: " + gc.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println("Is Leap Year: " + gc.isLeapYear(gc.get(GregorianCalendar.YEAR)));
        gc.set(2025, Calendar.MARCH, 15);
        System.out.println("Updated Date: " + gc.getTime());
        gc.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("After 10 Days: " + gc.getTime());
        gc.roll(Calendar.MONTH, 1);
        System.out.println("Rolled Month: " + gc.getTime());
        System.out.println("First Day of Week: " + gc.getFirstDayOfWeek());
        System.out.println("Minimum Year: " + gc.getMinimum(Calendar.YEAR));
        System.out.println("Maximum Day of Week: " + gc.getMaximum(Calendar.DAY_OF_WEEK));
    }
}
