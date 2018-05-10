package PHacker_rank;

import java.util.Scanner;

//	숫자 차를 구한뒤 절대값을 구하여 가장 큰 수를 구하는 함
class Difference {
  	private int[] elements;  
  	public int maximumDifference;
  	
  	
  	Difference(int[] elements){
  		this.elements=elements;
  	}

/*  계산 함수
 * 	a[] 배열 크기가 2일때는 ==> 	a[0] - a[1]
 * 
  	a[] 배열 크기가 3일때는 ==> 	a[0] - a[1] / a[0]- a[2] / a[1] - a[2]
  	
  	a[] 배열 크기가 4일때는 ==> 	a[0] - a[1] / a[0]- a[2] / a[0] - a[3] / a[1] - a[2] / a[1] - a[3] / a[2] - a[3]
  	
	a[] 배열 크기가 5일때는 ==> 	a[0] - a[1] / a[0]- a[2] / a[0] - a[3] / a[0] - a[4] / a[1] - a[2] / a[1] - a[3] / a[1] - a[4]
  							a[2] - a[3] / a[2] - a[4] / a[3] - a[4]
  	*/
  	void computeDifference(){
  		this.maximumDifference=0;
  		System.out.println(elements.length);
  		for(int i = 0; i < elements.length-1; i++) {   
  			for(int j = i+1; j < elements.length; j++) {
  				int gap=Math.abs(elements[i] - elements[j]);
  				if(gap > this.maximumDifference) {
  					this.maximumDifference=gap;
  			  	}		
  			}
  		}
  	}   	

}
 

public class Scope_14 {

  	    public static void main(String[] args) {
  	        Scanner sc = new Scanner(System.in);
  	        int n = sc.nextInt();
  	        int[] a = new int[n];
  	        for (int i = 0; i < n; i++) {
  	            a[i] = sc.nextInt();
  	        }
  	        sc.close();
  	        Difference difference = new Difference(a);
  	        difference.computeDifference();
  	        System.out.print(difference.maximumDifference);
  	    }
  	}
