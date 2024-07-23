public class Fernseher extends Geraet implements Bluetoothfaehig {
    int bildschirmgroesse;

    public Fernseher(String marke, String model, int bildschirmgroesse) {
        super(marke, model);
        this.bildschirmgroesse = bildschirmgroesse;
    }

    public void anzeigen() {
        super.anzeigen();
        System.out.println("Bildschirmgröße: " + bildschirmgroesse + " Zoll");
    }
    public void verbindenMitBluetooth() {
        System.out.println(marke + " " + model + " wird mit Bluetooth verbunden.");
    }
}
