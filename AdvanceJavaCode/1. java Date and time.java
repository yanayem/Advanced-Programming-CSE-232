// write java for date time use java.time 
import java.time.*;
import java.time.format.DateTimeFormatter;

class Main {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println("Present time: " + time);

        LocalDate date = LocalDate.now();
        System.out.println("Today: " + date);

        LocalDateTime datetime = LocalDateTime.now();
        System.out.println("Today date and time : " + datetime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        String formattedDateTime = datetime.format(formatter);
        System.out.println("Formatted date and time : " + formattedDateTime);
    }
}
