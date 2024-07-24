public class PrintedBook extends Book implements Readable{
    private int weight;

    public PrintedBook(String title, String author, String isbn, int year, int weight) {
        super(title, author, isbn, year);
        this.weight = weight;
    }
    
    public void ship() {

    }
    public void read() {
        System.out.println("Erste Seite wird gezeigt");
    }
}
