package PTest;

import java.util.Scanner;
public class Test{
	public static void main(String[] args) {
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";
		Scanner scan = new Scanner(System.in);
		
		int a=scan.nextInt()+4;
		System.out.println(a);
		
		double b=scan.nextDouble()+4.0;
		System.out.println(b);
		
		String c=scan.next()+"is the best place to learn and practice coding!";
		System.out.println(c);
	}
}