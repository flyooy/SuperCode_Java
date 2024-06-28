// Schreibe ein Java-Programm, das ein Schachbrettmuster in der Konsole ausgibt.
// Die Größe vom Schachbrett soll der Benutzer beim Programmaufruf mitgeben.
// Ein Schachbrett besteht aus abwechselnden Zeichen "#" und " ", wobei die oberen linken Ecke immer eine "#" ist.
// java DrawChessBoard 8 
// # # # # 
//  # # # #
// # # # # 
//  # # # #
// # # # # 
//  # # # #
// # # # # 
//  # # # #


public class DrawChessBoard {
    public static void main(String[] args) {
        int height = Integer.parseInt(args[0]);
       
       for(int i = 0; i < height; i++)
       {
           for (int j = 0; j < height; j++) {

               if ((i + j) % 2 == 0) {
                   System.out.print("#");
               }
               else{System.out.print(" ");}
               
           }
           System.out.println();
       }

        
    }
}
