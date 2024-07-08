public class Buch {
    private int seitenzahl;
    private String titel;
    private String autor;
    private int isbn;

    public Buch(String titel, String autor, int isbn, int seitenzahl) {
        this.titel = titel;
        this.autor = autor;
        this.isbn = isbn;
        this.seitenzahl = seitenzahl;
    }

//GET

    public String getTitel() {
        return titel;
    }

    public String getAutor() {
        return autor;
    }

    public int getISBN() {
        return isbn;
    }

    public int getSeitenZahl() {
        return seitenzahl;
    }

    //SET
    

    public void setTitel(String titel) {
         this.titel =  titel;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(int isbn) {
        this.isbn = isbn;
    }

    public void setSeitenZahl(int seitenzahl) {
        this.seitenzahl = seitenzahl;
    }


    public void printDetails() {

        System.out.println("Titel: " + titel);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Seiten Zahl: " + seitenzahl);
    }

    public static Buch sucheNachISBN(Buch[] buecher, int isbn) {
        for (Buch buch : buecher) {
            if (buch.getISBN() == isbn) {
                return buch;
            }
        }
        return null; 
    }

}


