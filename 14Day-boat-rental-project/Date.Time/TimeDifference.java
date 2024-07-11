import java.time.LocalTime;
import java.time.Duration;

public class TimeDifference {
    public static void main(String[] args) {
       
        LocalTime startTime = LocalTime.of(9, 30);
        LocalTime endTime = LocalTime.of(13, 45);

      
        Duration duration = Duration.between(startTime, endTime);

       
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;

        System.out.printf("Die Zeitdifferenz beträgt %d Stunden und %d Minuten.%n", hours, minutes);
    }
}