public class Arrays {

    public static void main(String[] args) {
int[][] display = {
    {1, 1, 1, 1},
    {1, 0, 0,1 }
};
System.out.println("Display 1");
int i = 0;
int j = 0;
for ( i = 0; i < display.length; i++) {
    for ( j = 0; j < display[0].length; j++) {
        System.out.print(display[i][j] + " ");
    }
    System.out.println();
}
 System.out.println("Display 2");
printDisplay(display);
}
    
    public static void printDisplay(int[][] display) {
        for (int i = 0; i < display.length; i++) {
            for (int j = 0; j < display[0].length; j++) {
                if (display[i][j] == 1) {
                    System.out.print("# ");
                } else if (display[i][j] == 0) {
                    System.out.print("  ");
                }
            }
            System.out.println(); 
        }
    }
}