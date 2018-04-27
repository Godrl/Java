package PTest;
import java.io.*;
import java.util.*;

import javax.swing.plaf.synth.SynthSplitPaneUI;
	public class ArrayReverse{

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] arr = new int[n];
	        for(int i=0; i < n; i++){
	            arr[i] = in.nextInt();
//	            배열에 숫자가 담긴다.
	        }
	        for(int i=n-1;i>=0;i--){
	            System.out.print(arr[i]+" ");
//	            배열에 담긴 숫자들을 뒤에서 부터 출력	            
	        }

	        in.close();
	    }
	}
