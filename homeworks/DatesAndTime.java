package homeworks;

import java.time.*;
import java.util.Scanner;
import java.util.Set;

public class DatesAndTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Print today’s date
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        // 2. Parse "2025-12-31" into a LocalDate
        LocalDate parsedDate = LocalDate.parse("2025-12-31");
        System.out.println("Parsed date: " + parsedDate);

        // 3. Calculate age in years from birthdate string
        String birthStr = "2000-06-15";
        LocalDate birthDate = LocalDate.parse(birthStr);
        Period age = Period.between(birthDate, today);
        System.out.println("Age in years: " + age.getYears());

        // 4. Input a date and add 100 days
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDateStr = scanner.nextLine();
        LocalDate inputDate = LocalDate.parse(inputDateStr);
        LocalDate newDate = inputDate.plusDays(100);
        System.out.println("New date after 100 days: " + newDate);

        // 5. Display current system time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current system time: " + currentTime);

        // 6. Print current time in Tokyo, New York, and Yerevan
        ZonedDateTime tokyoTime = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime nyTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime yerevanTime = ZonedDateTime.now(ZoneId.of("Asia/Yerevan"));
        System.out.println("Current time in Tokyo: " + tokyoTime.toLocalTime());
        System.out.println("Current time in New York: " + nyTime.toLocalTime());
        System.out.println("Current time in Yerevan: " + yerevanTime.toLocalTime());

        // 7. Meeting in Yerevan at 2025-07-26T14:00, convert to London and LA
        LocalDateTime meetingTime = LocalDateTime.parse("2025-07-26T14:00");
        ZonedDateTime yerevanMeeting = meetingTime.atZone(ZoneId.of("Asia/Yerevan"));
        ZonedDateTime londonTime = yerevanMeeting.withZoneSameInstant(ZoneId.of("Europe/London"));
        ZonedDateTime laTime = yerevanMeeting.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
        System.out.println("Meeting time in London: " + londonTime);
        System.out.println("Meeting time in Los Angeles: " + laTime);

        // 8. Duration between two times
        LocalTime t1 = LocalTime.of(8, 0);
        LocalTime t2 = LocalTime.of(15, 45);
        Duration diff = Duration.between(t1, t2);
        System.out.println("Duration between 08:00 and 15:45: " + diff.toHours() + " hours and " + (diff.toMinutes() % 60) + " minutes");

        // 9. Check if a date is Saturday or Sunday
        System.out.print("Enter a date to check day of week (yyyy-MM-dd): ");
        String dayCheckStr = scanner.nextLine();
        LocalDate checkDate = LocalDate.parse(dayCheckStr);
        DayOfWeek dayOfWeek = checkDate.getDayOfWeek();
        System.out.println("Day of the week: " + dayOfWeek);
        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
            System.out.println("It’s a weekend.");
        } else {
            System.out.println("It’s a weekday.");
        }

        // 10. Print all available zone IDs
        Set<String> zones = ZoneId.getAvailableZoneIds();
        System.out.println("Available time zones:");
        for (String zone : zones) {
            System.out.println(zone);
        }

        scanner.close();
    }
}
