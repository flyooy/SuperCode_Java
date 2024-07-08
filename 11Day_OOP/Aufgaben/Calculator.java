public class Calculator {
    public static void main(String[] args) {

       
        Ubungsblatt[] blatt = new Ubungsblatt[13];
        for (int i = 0; i < blatt.length; i++) {
            int punkt = (int) (Math.random() * 61);
            blatt[i] = new Ubungsblatt(i+1, 60, punkt);
            blatt[i].printDetails();
            System.out.println();
            
        }
        Ubungsblatt.prozentAnteil(blatt);
        Ubungsblatt.maxMin(blatt);

    }
}
