import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateManipulation {
    public static void main(String[] args) {
     
        LocalDate startDate = LocalDate.of(2024, 7, 11);

        int daysToAdd = 30;

        LocalDate newDate = startDate.plusDays(daysToAdd);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Das Datum " + startDate.format(formatter) + " um " + daysToAdd + " Tage versetzt ist: " + newDate.format(formatter));
    }
}
