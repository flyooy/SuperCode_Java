import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

/**
 * Event
 */
public class Event {

    private String nameEvent;
    private LocalDate dateEvent;
    private int alt;
    private ArrayList<Person> persons;

    public Event(String nameEvent, LocalDate dateEvent, int alt) {
        this.nameEvent = nameEvent;
        this.dateEvent = dateEvent;
        this.alt = alt;
        this.persons = new ArrayList<>();
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public LocalDate getDateEvent() {
        return dateEvent;
    }

    public void setDateEvent(LocalDate dateEvent) {
        this.dateEvent = dateEvent;
    }

    public int getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    public ArrayList<Person> getPersons() {
        return new ArrayList<>(persons);
    }

    public void addPerson(Person person) {
        if (!persons.contains(person)) {
            persons.add(person);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Event event = (Event) o;
        return Objects.equals(nameEvent, event.nameEvent) &&
                Objects.equals(dateEvent, event.dateEvent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameEvent, dateEvent);
    }

    @Override
    public String toString() {
        return "Event [nameEvent=" + nameEvent + ", dateEvent=" + dateEvent + ", alt=" + alt + ", persons=" + persons
                + "]";
    }

}