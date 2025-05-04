/*
Working with Dates and Time in Java:
Java provides multiple classes and APIs to work with date and time.
These classes are primarily available in two packages:
1. java.util package
   - Calendar
   - Date
2. java.time package (introduced in Java 8)
   - LocalDate
   - LocalTime
   - LocalDateTime
   - ZonedDateTime
   - Instant
   - Duration
   - Period
   - DateTimeFormatter

Key Classes & Concepts:
1. Calendar
   - Get date and time information.
   - Modify date by adding days, months, etc.
2. LocalDate
   - Represents a date (year, month, day) without time.
   - Can be used to get today's date, set a specific date, and perform date arithmetic.
3. LocalTime
   - Represents a time (hours, minutes, seconds).
   - Can be used to get current time or specify a particular time.
4. LocalDateTime
   - Combines date and time.
5. ZonedDateTime
   - Handles date and time with time zone information.
6. Instant
   - Represents a specific point in time (timestamp).
7. DateTimeFormatter
   - Formats date and time into a specified pattern.
8. Duration
   - Measures time between two time points.
9. Period
   - Measures date difference between two dates.
*/

/* ------------------------------------------------------------------------------------------------------------- */

// import java.util.Calendar;

// public class CSE310_DatesInJava {
//     public static void main(String[] args) {
//         Calendar calendar = Calendar.getInstance();
//         int year = calendar.get(Calendar.YEAR);
//         int month = calendar.get(Calendar.MONTH)+1;
//         int day = calendar.get(Calendar.DAY_OF_MONTH);
//         System.out.println("Current date is "+day+"/"+month+"/"+year);
//         calendar.add(Calendar.DAY_OF_MONTH, 5);
//         System.out.println("Day after 5 days: "+calendar.getTime());
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

// import java.time.LocalDate;

// public class CSE310_DatesInJava {
//     public static void main(String[] args) {
//         LocalDate today = LocalDate.now();
//         System.out.println("Today's date: "+today);
//         LocalDate specificDate = LocalDate.of(2025, 3, 31);
//         System.out.println("Specific date: "+specificDate);
//         LocalDate nextWeek = today.plusWeeks(1);
//         System.out.println("Date after a week would be: "+nextWeek);
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

// import java.time.LocalTime;

// public class CSE310_DatesInJava {
//     public static void main(String[] args) {
//         LocalTime currentTime = LocalTime.now();
//         System.out.println("Current time: "+currentTime);
//         LocalTime specificTime = LocalTime.of(20, 30);
//         System.out.println("Specific time: "+specificTime);
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

// import java.time.LocalDateTime;

// public class CSE310_DatesInJava {
//     public static void main(String[] args) {
//         LocalDateTime currentDateTime = LocalDateTime.now();
//         System.out.println("Current date and time: " + currentDateTime);
//         LocalDateTime specificDateTime = LocalDateTime.of(2025, 3, 31, 20, 30);
//         System.out.println("Specific date and time: " + specificDateTime);
//         LocalDateTime nextMonth = currentDateTime.plusMonths(1);
//         System.out.println("Date and time after a month: " + nextMonth);
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

// import java.time.ZonedDateTime;
// import java.time.ZoneId;

// public class CSE310_DatesInJava {
//     public static void main(String[] args) {
//         ZonedDateTime currentTime = ZonedDateTime.now();
//         System.out.println("Current Date & Time: "+currentTime);
//         ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
//         System.out.println("Time in India: "+indiaTime);
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

// import java.time.Instant;

// public class CSE310_DatesInJava {
//     public static void main(String[] args) {
//         Instant timeStamp = Instant.now();
//         System.out.println("Current Timestamp: "+timeStamp);
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

// import java.time.LocalDateTime;
// import java.time.format.DateTimeFormatter;

// public class CSE310_DatesInJava {
//     public static void main(String[] args) {
//         LocalDateTime now = LocalDateTime.now();
//         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss a");
//         String formattedDate = now.format(formatter);
//         System.out.println("Formatted Date & Time: "+formattedDate);
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

// import java.time.Duration;
// import java.time.LocalTime;

// public class CSE310_DatesInJava {
//     public static void main(String[] args) {
//         LocalTime start = LocalTime.of(10, 0);
//         LocalTime end = LocalTime.of(12, 30);
//         Duration duration = Duration.between(start, end);
//         System.out.println("Duration: "+duration.toHours()+" hours and "+duration.toMinutes()+" minutes");
//     }
// }

/* ------------------------------------------------------------------------------------------------------------- */

import java.time.LocalDate;
import java.time.Period;

public class CSE310_DatesInJava {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2020, 1, 1);
        LocalDate endDate = LocalDate.of(2025, 3, 28);
        Period period = Period.between(startDate, endDate);
        System.out.println("Difference: "+period.getYears()+" years, "+period.getMonths()+" months, and "+period.getDays()+" days");
    }
}

/* ------------------------------------------------------------------------------------------------------------- */