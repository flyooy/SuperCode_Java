import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String namePerson;
    private LocalDate birsdayDate;

    public Person(String namePerson, LocalDate birsdayDate) {
        this.namePerson = namePerson;
        this.birsdayDate = birsdayDate;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public LocalDate getBirsdayDate() {
        return birsdayDate;
    }

    public void setBirsdayDate(LocalDate birsdayDate) {
        this.birsdayDate = birsdayDate;
    }

    public int getAge(LocalDate asOfDate) {
        return Period.between(birsdayDate, asOfDate).getYears();
    }

    @Override
    public String toString() {
        return namePerson; 
    }
    
}
