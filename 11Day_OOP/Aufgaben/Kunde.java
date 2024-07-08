public class Kunde {
    private int kundenId;
    private String name;
    private String email;
    private String telefonnummer;

    public Kunde(int kundenId, String name, String email, String telefonnummer) {
        this.kundenId = kundenId;
        this.name = name;
        this.email = email;
        this.telefonnummer = telefonnummer;
    }

 
    public Kunde(int kundenId, String name) {
        this(kundenId, name, "", "");
    }

   
    public Kunde(int kundenId, String name, String email) {
        this(kundenId, name, email, "");
    }

 
    public int getKundenId() {
        return kundenId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    
    public void setKundenId(int kundenId) {
        this.kundenId = kundenId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

   
    public void printDetails() {
        System.out.println("Kunden ID: " + kundenId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Telefonnummer: " + telefonnummer);
    }
}