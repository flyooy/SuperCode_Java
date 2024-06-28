public class DrawCharsRevisited {

    public static void main(String[] args) {
        int height = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        drawRect(height, width);
    
    }
    
    
    public static void drawRect(int width, int height) {
        for (int i = 0; i < height; i++) {
            drawLine(width, '#');
        }
    }
    
    
    public static void drawLine(int length, char lineChar) {
        
        for (int j = 0; j < length; j++) {
            System.out.print(lineChar);
        }
        System.out.println();
    }
    
}
