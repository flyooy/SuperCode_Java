public class Fahrer {
    private String vorname;
    private String nachname;
    private int alter;
    
    public Fahrer(String vorname, String nachame, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }
    
    public String getVorname() {
        return this.vorname;
    }

    public String getNachname() {
        return this.nachname;
    }

    public int getAlter() {
    
        return this.alter;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
   
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
   
    public void setAlter(int alter) {
        this.alter = alter;
   }

   public void getDetails() {
       System.out.println("Vorname: " + vorname);
       System.out.println("Nachname: " + nachname);
       System.out.println("Alter: " + alter);
       System.out.println();
   }
   
}
