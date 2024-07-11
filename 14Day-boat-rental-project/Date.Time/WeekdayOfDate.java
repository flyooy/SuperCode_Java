import java.time.DayOfWeek;
import java.time.LocalDate;


public class WeekdayOfDate {
    public static void main(String[] args) {
        
        LocalDate dateToCheck = LocalDate.of(2024, 7, 11);

        DayOfWeek dayOfWeek = dateToCheck.getDayOfWeek();

        System.out.println("Der Wochentag von " + dateToCheck + " ist " + dayOfWeek);
    }
}