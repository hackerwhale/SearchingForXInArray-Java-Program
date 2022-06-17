import java.util.*;
 
public class SearchingForXInArray {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of rows:  ");
       int rows = sc.nextInt();
       System.out.println("--------------------------------------------------------  ");
       System.out.println("Enter the number of columns:  ");
       int cols = sc.nextInt();
       System.out.println("--------------------------------------------------------  ");
 
       int[][] numbers = new int[rows][cols];
       System.out.println("Input the number as per defined rows: ");
 
       //input
       //rows
       for(int i=0; i<rows; i++) {
           //columns
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }
        System.out.println("--------------------------------------------------------  ");
         System.out.println("Enter the number you want to find:  ");
        int x = sc.nextInt();
        System.out.println("--------------------------------------------------------  ");
 
       System.out.println("Here's your  output in Two D Array index [rows] and [column]:  ");
       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
               //compare with x
               if(numbers[i][j] == x) {
                   System.out.println();
                   System.out.println("x found at location (" + i + ", " + j + ")");
               }
           }
       }
 
     
 
   }
}
