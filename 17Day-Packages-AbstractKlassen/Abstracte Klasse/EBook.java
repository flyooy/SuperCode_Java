public class EBook extends Book implements Readable {
    private int fileSize;

    public EBook(String title, String author, String isbn, int year, int fileSize) {
        super(title, author, isbn, year);
        this.fileSize = fileSize;
    }

    public void dowload() {

    }
    
    public void read() {
        System.out.println("Die Pdf-Reader lief");
    }
}
