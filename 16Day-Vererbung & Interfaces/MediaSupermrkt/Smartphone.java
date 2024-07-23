public class Smartphone extends Geraet implements Internetfaehig, Bluetoothfaehig{
    String betriebsystem;

    public Smartphone(String marke, String model, String betriebsystem) {
        super(marke, model);
        this.betriebsystem = betriebsystem;
    }
    public void anzeigen() {
        super.anzeigen();
        System.out.println("Betriebssystem: " + betriebsystem);
    }

    public void verbindenMitInternet() {
        System.out.println(marke + " " + model + " wird mit dem Internet verbunden.");
    }

    public void verbindenMitBluetooth() {
        System.out.println(marke + " " + model + " wird mit Bluetooth verbunden.");
    }
}
