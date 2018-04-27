package PTest;
import java.util.Scanner;


public class Test05{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            System.out.print(arr[n-1]+" ");
        }
        in.close();
    }
}