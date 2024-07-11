import java.time.LocalDate;
import java.time.Period;

public class CalculateAge {
    public static void main(String[] args) {
        
        LocalDate birthDate = LocalDate.of(1990, 5, 15);

        LocalDate currentDate = LocalDate.now();

        Period age = Period.between(birthDate, currentDate);

        System.out.printf("Das Alter ist %d Jahre. %n", 
            age.getYears());
    }
}