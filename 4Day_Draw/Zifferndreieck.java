public class Zifferndreieck {
    public static void main(String[] args) {
        int height = Integer.parseInt(args[0]);
       
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }

        for (int i = height-1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j+1);
            }
           System.out.println();
         }
    }

    public static void mainZifferndreieck(String[] args) {
        int height = Integer.parseInt(args[0]);
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

