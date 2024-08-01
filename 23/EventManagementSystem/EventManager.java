import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EventManager {

    private HashMap<LocalDate, HashSet<Event>> eventsByDate;
    private HashMap<Event, HashMap<Person, Set<Rolle>>> participantsByEvent;

    public EventManager() {
        this.eventsByDate = new HashMap<>();
        this.participantsByEvent = new HashMap<>();
    }

    public HashSet<Event> getEventsByDate(LocalDate dateEvent) {
        return eventsByDate.getOrDefault(dateEvent, new HashSet<>());
    }

    public HashMap<Person, Set<Rolle>> getParticipantsByEvent(Event nameEvent) {
        return participantsByEvent.getOrDefault(nameEvent, new HashMap<>());
    }

    public List<Event> getSortedEvents() {
        return eventsByDate.values().stream()
                .flatMap(Set::stream)
                .sorted(EventComparator.dateEventComperator)
                .collect(Collectors.toList());
    }

    public Set<Rolle> getParticipantRoles(Event nameEvent, Person namePerson) {
        if (participantsByEvent.containsKey(nameEvent)) {
            return participantsByEvent.get(nameEvent).getOrDefault(namePerson, new HashSet<>());
        }
        return new HashSet<>();
    }

    public void addEvent(LocalDate dateEvent, Event nameEvent) {

        eventsByDate.putIfAbsent(dateEvent, new HashSet<>());
        eventsByDate.get(dateEvent).add(nameEvent);
        participantsByEvent.putIfAbsent(nameEvent, new HashMap<>());
    }

    public void addParticipant(Event nameEvent, Person namePerson, Rolle rolle) {

        if (!participantsByEvent.containsKey(nameEvent)) {
            throw new IllegalArgumentException("Event does not exist: " + nameEvent.getNameEvent());
        }
        LocalDate today = LocalDate.now();
        int personAge = namePerson.getAge(today);
        int eventAge = nameEvent.getAlt();
        if (personAge >= eventAge) {
            participantsByEvent.get(nameEvent).putIfAbsent(namePerson, new HashSet<>());
            participantsByEvent.get(nameEvent).get(namePerson).add(rolle);
            nameEvent.addPerson(namePerson);
        } else
            System.out.println("The person's " + namePerson
                    + " age is less than the event's age. The Person won't be able to attend the conference");
    }

    public void removeParticipant(Event nameEvent, Person namePerson) {
        if (!participantsByEvent.containsKey(nameEvent)) {
            throw new IllegalArgumentException("Event does not exist: " + nameEvent.getNameEvent());
        }
        if (!participantsByEvent.get(nameEvent).containsKey(namePerson)) {
            throw new IllegalArgumentException("Person does not exist: " + namePerson.getNamePerson());
        }

        participantsByEvent.get(nameEvent).remove(namePerson);
        System.out.println(
                "Participant " + namePerson.getNamePerson() + " removed from the event: " + nameEvent.getNameEvent());
    }
}
