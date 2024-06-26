public class MaxMinArray{
	
	public static void main(String args[]){
	
        int arr[] = { 3, 44, 87, 2, 4, 99, 112, -1, 9, 14, 89, 21 };
        
      int  a = arr[0];
      int  b = arr[0];
      for (int i = 0; i < arr.length - 1; i++) {

          if (a < arr[i]) {
              a = arr[i];
          }

          else if (b > arr[i]) {
              b = arr[i];

          }
      }
        System.out.println("das Größte ist " + a);
        System.out.println("das Kleinste ist " + b);


	}
}