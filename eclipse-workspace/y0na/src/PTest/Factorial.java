package PTest;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
	public class Factorial {
    static int factorial(int n) {
    	int factorial=1;
    	for(int i=n;i>0;i--) {
    		factorial=i*factorial;
      	}
    	return factorial;
    }

    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int result = factorial(n);
    	System.out.println(result);
    }
}