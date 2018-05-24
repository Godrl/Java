package PHacker_rank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Exception_StringtoInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String S = in.next();
         
        try{
        	Integer.parseInt(S);
        	System.out.println(S);
        }
        catch(Exception e) {
        	System.out.println("Bad String");
        }
	}

}
