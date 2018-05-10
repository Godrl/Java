package PHacker_rank;

import java.util.Scanner;
/*
 *	겁나 쉬운 풀이 ( 하나씩 풀어서 그림먼저 그린다음에 푸니까 겁나 쉬움 )
*/
public class Hourglass_1 {
	public static void main(String args[]) {
		 Scanner in = new Scanner(System.in);
	        int[][] arr = new int[6][6];
	        int sum=0;
	        int max=-1000;
	        for( int i = 0 ; i < 6; i++){
	            for( int j = 0 ; j < 6; j++){
	                arr[i][j] = in.nextInt();
	                
	            }
	        }
	        
	        for(int i = 0 ; i < 4 ; i++) {
	        	for(int j = 0 ; j < 4 ; j++) {
	        		sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
//	        		밑에 식을 그저 옮기니까 끝
	        		if(sum >= max) {
	        			max = sum;
	        			sum = 0;
	        		}
	        	}
	        }
	        
	        System.out.println(max);
	        
/*	sum+=arr[0][0] + arr[0][1] + arr[0][2] + arr[1][1] + arr[2][0] + arr[2][1] + arr[2][2];
	sum+=arr[0][1] + arr[0][2] + arr[0][3] + arr[1][2] + arr[2][1] + arr[2][2] + arr[2][3];
	sum+=arr[0][2] + arr[0][3] + arr[0][4] + arr[1][3] + arr[2][2] + arr[2][3] + arr[2][4];
	sum+=arr[0][3] + arr[0][4] + arr[0][5] + arr[1][4] + arr[2][3] + arr[2][4] + arr[2][5];
	        
	sum+=arr[1][0] + arr[1][1] + arr[1][2] + arr[2][1] + arr[3][0] + arr[3][1] + arr[3][2];
	sum+=arr[1][1] + arr[1][2] + arr[1][3] + arr[2][2] + arr[3][1] + arr[3][2] + arr[3][3];
	sum+=arr[1][2] + arr[1][3] + arr[1][4] + arr[2][3] + arr[2][1] + arr[2][2] + arr[2][3];
	sum+=arr[1][3] + arr[1][4] + arr[1][5] + arr[2][4] + arr[2][1] + arr[2][2] + arr[2][3];	   
	...
*/     	     
	        
/*
 * [0,0] [0,1] [0,2] [0,3] [0,4] [0,5]
 * [1,0] [1,1] [1,2] [1,3] [1,4] [1,5]
 * [2,0] [2,1] [2,2] [2,3] [2,4] [2,5]
 * [3,0] [3,1] [3,2] [3,3] [3,4] [3,5]
 * [4,0] [4,1] [4,2] [4,3] [4,4] [4,5]
 * [5,0] [5,1] [5,2] [5,3] [5,4] [5,5]
 * 
 * 
*/

	}
}
