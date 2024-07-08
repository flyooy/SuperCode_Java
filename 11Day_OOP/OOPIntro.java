public class OOPIntro {

    public static void main(String[] args) {
        // Person personAufgabe = new Person("Thomas Bauer (36)");
        // System.out.println(
        //     personAufgabe.vorname
        //     + " " 
        //     + personAufgabe.nachname
        //     + " (" + personAufgabe.alter + ")"
        // );

        Laptop laptop = new Laptop("Apple", 3.2f, (byte) 8, 512, 15.6f, 1.78f);
        laptop.printInfo();
    }
}