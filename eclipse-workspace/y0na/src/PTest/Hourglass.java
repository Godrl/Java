package PTest;
/*
 *     *****
 *      ***
 *       *
 *      ***
 *     ***** 
*/
public class Hourglass{
    public static void main(String[] args){
    	   char arr[][] = new char[5][5];
           int a = arr[0].length - 1;         
           int b = a / 2;
           for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr[i].length; j++) {
                   arr[i][j] = '*';
                   if (i == 2) {
                       arr[i][j] = ' ';
                       arr[i][b] = '*';
                   }
               }
           }
           
           for (int i = 1; i < arr.length - 1; i++) {
               arr[i][0] = ' ';
               arr[i][a] = ' ';
           }
           
           for (int i = 0; i < arr.length; i++) {
               for (int j = 0; j < arr[i].length; j++) {
                   System.out.print(arr[i][j] + " ");
               }
               System.out.println();
           }
           
    }
}