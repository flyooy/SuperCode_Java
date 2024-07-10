public class Main {
    public static void main(String[] args) {
        Fahrer fahrer = new Fahrer("Max", "Korotov", 19); 
        Auto auto = new Auto("BMW", 2012, 10000); 

          auto.fahren(fahrer, auto, 200);
       
    }
}