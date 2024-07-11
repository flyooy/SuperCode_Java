/**
 * CurrentDateTime
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTime {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ss");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE, dd. MMMM yyyy hh:mm p");
        System.out.println("Aktuelles Datum und Uhrzeit:");
        System.out.println("1. Format: " + now.format(formatter1)); 
        System.out.println("2. Format: " + now.format(formatter2));  
        System.out.println("3. Format: " + now.format(formatter3));  
    
    }
}