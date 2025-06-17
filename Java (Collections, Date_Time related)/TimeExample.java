import java.time.*;
import java.time.format.DateTimeFormatter;

public class TimeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zdt = ZonedDateTime.now();
        ZoneId zone = ZoneId.of("Asia/Kolkata");

        System.out.println("LocalDateTime: " + now);
        System.out.println("Year: " + now.getYear());
        System.out.println("Month: " + now.getMonth());
        System.out.println("Day: " + now.getDayOfMonth());
        System.out.println("Hour: " + now.getHour());
        System.out.println("Minute: " + now.getMinute());
        System.out.println("Second: " + now.getSecond());
        System.out.println("Day of Week: " + now.getDayOfWeek());
        System.out.println("ZonedDateTime: " + zdt);
        System.out.println("Current time in Asia/Kolkata: " + ZonedDateTime.now(zone));
        System.out.println("Formatted: " + now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")));
    }
}
