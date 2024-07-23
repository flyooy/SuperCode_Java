public class Laptop extends Geraet implements Internetfaehig{
    String prozessor;
    public Laptop(String marke, String model, String prozessor) {
        super(marke, model);
        this.prozessor = prozessor;
    }
        public void anzeigen() {
            super.anzeigen();
            System.out.println("Prozessor: " + prozessor);
        }
    
        public void verbindenMitInternet() {
            System.out.println(marke + " " + model + " wird mit dem Internet verbunden.");
        }
    }

