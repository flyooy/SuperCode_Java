public class Geraet {

    String marke;
    String model;

    public Geraet(String marke, String model) {
        this.marke = marke;
        this.model = model;
    }

    public void einschalten() {
        System.out.println(marke + " " + model + " wird eingeschaltet.");
    }

    public void ausschalten() {
        System.out.println(marke + " " + model + " wird ausgeschaltet.");
    }

    public void anzeigen() {
        System.out.println("Marke: " + marke + ", Modell: " + model);
    }
}
