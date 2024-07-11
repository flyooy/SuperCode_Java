import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Bootsverleih {
    private ArrayList<Boot> boote;
    private ArrayList<Person> kunden;
   
   

    public Bootsverleih() {
        this.boote = new ArrayList<>();
        this.kunden = new ArrayList<>();
    }


    public void addBoot(Boot boot) {
        boote.add(boot);
    }

    public void addKunde(Person kunde) {
        kunden.add(kunde);
    }

    public Person topCustomer() {
        if (kunden.isEmpty()) {
            throw new IllegalStateException("Client list is still empty");
        }

        int maxNumReservations = 0;
        Person bestKunde = null;

        for (Person kunde : kunden) {
            if (kunde.getBookingHistory().size() > maxNumReservations) {
                maxNumReservations = kunde.getBookingHistory().size();
                bestKunde = kunde;
            }
        }

        return bestKunde;
    }

    public Boot mostPopularBootForPerson(Person kunde) {
        if (boote.isEmpty()) {
            throw new IllegalStateException("No boots available for reservation");
        }

        int maxReservations = 0;
        Boot popularBootforPerson = null;

        for (Boot boot : boote) {
            int reservationsForPerson = 0;
            for (Reservation reservation : boot.getReservations()) {
                if (reservation.getPerson().equals(kunde)) {
                    reservationsForPerson++;
                }
            }
            if (reservationsForPerson > maxReservations){
                    maxReservations = boot.getReservations().size();
                    popularBootforPerson = boot;
                }
            }
        

        return popularBootforPerson;
    }
    

    public Boot mostPopularBoot() {
        if (boote.isEmpty()) {
            throw new IllegalStateException("No boots available for reservation");
        }

        int maxReservations = 0;
        Boot popularBoot = null;

        for (Boot boot : boote) {
            if (boot.getReservations().size() > maxReservations) {
                maxReservations = boot.getReservations().size();
                popularBoot = boot;
            }
        }

        return popularBoot;
    }


    public Boot leastReservedBoot() {
        if (boote.isEmpty()) {
            throw new IllegalStateException("No boots available for reservation");
        }

        int minReservations = Integer.MAX_VALUE;
        Boot leastReservedBoot = null;

        for (Boot boot : boote) {
            int numReservations = boot.getReservations().size();
            
            if (numReservations < minReservations ) {
                minReservations = numReservations;
                leastReservedBoot = boot;
            }
        }

        return leastReservedBoot;
    }
    

    public double calcRevenue(LocalDateTime from, LocalDateTime to) {
       Duration duration = java.time.Duration.between(from, to);
        long minutes = duration.toMinutes();
        double hours = (double) minutes / 60.0;
        double totalRevenue = 0.0;

        for (Boot boot : boote) {
            double revenue = hours * boot.getPricePerHour();
            totalRevenue += revenue;
        }
        return totalRevenue;
    }

    public void printReservations() {
        for (Boot boot : boote) {
            boot.printReservations();
        }
    }
}