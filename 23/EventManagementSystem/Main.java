import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EventManager em = new EventManager();
        Event conference = new Event("Conference", LocalDate.parse("2024-07-01"), 20);
        Event workshop = new Event("Workshop", LocalDate.parse("2024-05-10"), 18);
        Person alice = new Person("Alice", LocalDate.parse("1993-03-28"));
        Person bob = new Person("Bob", LocalDate.parse("1991-04-21"));

        em.addEvent(LocalDate.parse("2024-07-01"), conference);
        em.addEvent(LocalDate.parse("2024-05-10"), workshop);

        em.addParticipant(conference, alice, Rolle.SPEAKER);
        em.addParticipant(conference, bob, Rolle.ZUSCHAUER);

        List<Event> sortedEvents = em.getSortedEvents();

        for (Event event : sortedEvents) {
            System.out.println(event);
            System.out.println("Participants: " + em.getParticipantsByEvent(event));
        }
        
        System.out.println("-----------------------------------------");
        em.removeParticipant(conference, alice);
        System.out.println("Participants in Conference: " +
                em.getParticipantsByEvent(conference));
    }

}
