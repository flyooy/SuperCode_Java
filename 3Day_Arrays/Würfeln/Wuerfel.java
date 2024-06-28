public class Wuerfel {

    public static void main(String[] args) {
        
       int i = 0;
       while(true) {
           int a = (int) (Math.random() * 10);
           System.out.print(a + " ");
           i++;
            if (a == 6 && i==1) {
                System.out.print( "WOW ! Beim ersten Treffer eine 6 ! ");
                break;
            }
            
            else if (a == 6){
                System.out.print( "Glückwunsch ");
                break;
            }
                
        }
    }
}