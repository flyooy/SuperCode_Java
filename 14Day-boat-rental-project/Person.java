import java.util.ArrayList;

public class Person {
    private String name;
    private boolean hasLicence;
    private ArrayList<Reservation> bookingHistory;

    public Person(String name, boolean hasLicence) {
        this.name = name;
        this.hasLicence = hasLicence;
        this.bookingHistory = new ArrayList<>();
    }

    public boolean hasLicence() {
        return hasLicence;
    }

    public String getName() {
        return name;
    }

    public void addReservationInBookingHistory(Reservation reservation) {
        bookingHistory.add(reservation);
    }

    public ArrayList<Reservation> getBookingHistory() {
        return bookingHistory;
    }
}