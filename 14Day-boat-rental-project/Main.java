import java.time.LocalDateTime;
import java.time.Month;

public class Main {
    
    public static void main(String[] args) {
        Bootsverleih bootsverleih = new Bootsverleih();
        Boot boot1 = new Boot("Segelboot", 4, false, 20,1);
        Boot boot2 = new Boot("Motorboot", 4, false, 36,2);
        Boot boot3 = new Boot("Motorboot", 2, true, 28,3);
        Boot boot4 = new Boot("Segelboot", 16, true, 92,4);
        Boot boot5 = new Boot("Segelboot", 2, false, 16,5);

        Person andreas = new Person("Andreas", true);
        Person anton = new Person("Anton", true);
        Person peter = new Person("Peter", false);

        LocalDateTime sonnabend12 = LocalDateTime.of(2024, Month.JULY, 13, 12, 0);
        LocalDateTime sonntag11 = LocalDateTime.of(2024, Month.JULY, 14, 11, 0);
        LocalDateTime sonntagNach11 = LocalDateTime.of(2024, Month.JULY, 14, 11, 1);
        LocalDateTime montag12 = LocalDateTime.of(2024, Month.JULY, 15, 12, 0);
        LocalDateTime montag15 = LocalDateTime.of(2024, Month.JULY, 15, 15, 1);
        LocalDateTime montag17 = LocalDateTime.of(2024, Month.JULY, 15, 17, 0);
        LocalDateTime montag22 = LocalDateTime.of(2024, Month.JULY, 15, 22, 1);
        LocalDateTime dienstag16 = LocalDateTime.of(2024, Month.JULY, 16, 12, 0);
        LocalDateTime dienstag17 = LocalDateTime.of(2024, Month.JULY, 16, 17, 1);
        LocalDateTime dienstag22 = LocalDateTime.of(2024, Month.JULY, 16, 12, 0);
        LocalDateTime mittwoch12 = LocalDateTime.of(2024, Month.JULY, 17, 12, 1);
        LocalDateTime mitwoch22 = LocalDateTime.of(2024, Month.JULY, 17, 22, 0);


        bootsverleih.addKunde(andreas);
        bootsverleih.addKunde(anton);
        bootsverleih.addKunde(peter);

        bootsverleih.addBoot(boot1);
        bootsverleih.addBoot(boot2);
        bootsverleih.addBoot(boot3);
        bootsverleih.addBoot(boot4);
        bootsverleih.addBoot(boot5);

        boot2.addReservation(sonnabend12, sonntag11, andreas);
        boot4.addReservation(sonntagNach11, montag12, anton);
        boot4.addReservation(montag15, montag17, anton);
        boot4.addReservation(mittwoch12 , mitwoch22, anton);
        boot5.addReservation(montag22, dienstag16, anton);
        boot3.addReservation(montag22, dienstag16, andreas);
        boot2.addReservation(dienstag17, dienstag22, andreas);
        bootsverleih.printReservations();

        Person topCustomer = bootsverleih.topCustomer();
        System.out.println("Top customer: " + topCustomer.getName());

        Boot popularBootForPerson = bootsverleih.mostPopularBootForPerson(andreas);
        System.out.println("Most popular boot for " + andreas.getName() + " ist " + popularBootForPerson.getId());

        Boot popularBoot = bootsverleih.mostPopularBoot();
        System.out.println("Most popular boot: " + popularBoot.getId());
        Boot leastReservedBoot = bootsverleih.leastReservedBoot();
        System.out.println("Least reserved boot: " + leastReservedBoot.getId());
        double revenue =  bootsverleih.calcRevenue(sonnabend12, sonntag11);
        System.out.println("Total revenue for the given period: " + revenue + " EUR");
    
    }
}