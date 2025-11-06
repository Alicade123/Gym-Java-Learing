import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class _10Date_Time {
    public static void main(String[] args) {
//        Date date = new Date();
//        LocalDate date = LocalDate.now();
//        LocalTime date = LocalTime.now();
//        LocalDateTime date = LocalDateTime.now();
        Instant date = Instant.now();
        System.out.println("Current date: " + date);
//        System.out.println("Current time: " + date.getTime());
//        System.out.println("Current day: " + date.getDay());
//        System.out.println("Current month: " + date.getMonth());
//        System.out.println("Current year: " + date.getYear());
//        System.out.println("Current hour: " + date.getHours());
//        System.out.println("Current minutes: " + date.getMinutes());
//        System.out.println("Current seconds: " + date.getSeconds());

        //custom date format
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDateTime dateTime2 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateString = dateTime.format(formatter);
        System.out.println(dateString);
        System.out.println(dateTime.isBefore(dateTime2)); //false
        System.out.println(dateTime.isBefore(dateTime2)); //false

        LocalDateTime datex = LocalDateTime.of(2021, 1, 1 ,0,0,0);
        LocalDateTime datey = LocalDateTime.of(2025, 1, 1 ,0,0,0);
        System.out.println(datex.isBefore(datey)); //true
        System.out.println(datex.isAfter(datey)); //false




    }
}
