public class Person {
    public String vorname;
    public String nachname;
    public int alter;


    public Person(String personInfo) {
        
        String[] Info = personInfo.split(" ");
        this.vorname = Info[0];
        this.nachname = Info[1];
        
        int startIndex = personInfo.indexOf('(') + 1;
        int endIndex = personInfo.indexOf(')');
        String ageString = personInfo.substring(startIndex, endIndex);
        this.alter = Integer.parseInt(ageString);
    
    }

}


