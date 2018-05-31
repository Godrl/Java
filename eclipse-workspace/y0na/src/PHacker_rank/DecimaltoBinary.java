package PHacker_rank;
//	십진법을 이진법으로 전환 
//	and 이진법중 1이 연속된 숫자 (최대)

import java.util.ArrayList; 
import java.util.Scanner;

public class DecimaltoBinary {
	public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        ArrayList arr = new ArrayList();
        int b;
        int c = 0;
        int max = 0;
        while(a >= 1) {
        	b = a%2;
        	a = a/2;
        	arr.add(b);
        }
        System.out.println(arr);
        for(int i = 0; i < arr.size();i++) {
        	if ((int) arr.get(i) == 1) {
        		c += 1;
           		if(max <= c) {
          			max = c;
        		}        		
        	} 
        	else {
        		c = 0;
        	}
        }
        System.out.println(max);
	}
}
