package PTest;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		String myString = "This is String example.";
		char[] myCharArray = myString.toCharArray();
		
		System.out.println(myString.toCharArray());
		for(int i = 0; i < myString.length(); i++){
		    // Print each sequential character on the same line
		    System.out.print(myCharArray[i]); 
		}
		// Print a newline
		System.out.println("?");
		Scanner scan=new Scanner(System.in);
		scan.nextLine();
	}
}
