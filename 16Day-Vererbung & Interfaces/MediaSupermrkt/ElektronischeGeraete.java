public class ElektronischeGeraete {
    public static void main(String[] args) {
        Geraet[] geraete = new Geraet[] {
                new Fernseher("Samsung", "Q90T", 55),
                new Smartphone("Apple", "iPhone 13", "iOS"),
                new Laptop("Dell", "XPS 13", "Intel i7")
        };
        for (Geraet g : geraete) {
            testGeraet(g);
            System.out.println();
        }
        
        if (geraete[1] instanceof Internetfaehig) {
            ((Internetfaehig) geraete[1]).verbindenMitInternet();
        }
    }

    public static void testGeraet(Geraet g) {
        g.einschalten();
        g.anzeigen();
        g.ausschalten();
    }
}
