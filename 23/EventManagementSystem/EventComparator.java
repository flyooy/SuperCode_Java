import java.util.Comparator;

public class EventComparator {
    public static Comparator<Event> dateEventComperator = (
            event1, event2) -> event1.getDateEvent().compareTo(event2.getDateEvent());


}
