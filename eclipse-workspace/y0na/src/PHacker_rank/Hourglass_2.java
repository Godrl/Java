package PHacker_rank;

import java.util.Scanner;

/*
 * 	하나씩 다 for문 돌림 (16개) 매우 비효율적 ==> hourglass_1 참고
*/

public class Hourglass_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[6][6];
        int sum=0;
        int max=0;
        for( int i = 0 ; i < 6; i++){
            for( int j = 0 ; j < 6; j++){
                arr[i][j] = in.nextInt();
                
            }
        }
        
        for( int i = 0 ; i < 3 ; i++) {
        	for( int j = 0 ; j < 3 ; j++) {
        		if(i != 1) {
        			sum+=arr[i][j];        
        		}
        	}        	
        }
        sum+=arr[1][1];
        
        max=sum;
        sum=0;
        

        for( int i = 0 ; i < 3 ; i++) {
        	for( int j = 1 ; j < 4 ; j++) {
        		if(i != 1) {
        			sum+=arr[i][j];
        		}        
        	}        		
        }
        sum+= arr[1][2];
        if(sum>=max) {
        	max=sum;
        	sum=0;
        }
        else{
        	sum = 0;
        }
        
        for(int i=0;i<3;i++) {
        	for(int j=2;j<5;j++) {
        		if(i!=1) {
        			sum+=arr[i][j];
        		}        
        	}
        }
        sum+=arr[1][3];    
        
        if(sum>=max) {
        	max = sum;
        	sum = 0;
        }
        else{
        	sum = 0;
        }
        
        for(int i=0;i<3;i++) {
        	for(int j=3;j<6;j++) {
        		if(i!=1) {
        			sum+=arr[i][j];
        		}        
        	}
        }
        sum+=arr[1][4];
        
        if(sum>=max) {
        	max=sum;
        	sum=0;
        }
        else{
        	sum = 0;
        }
        
        System.out.println(max);

        for(int i=1;i<4;i++) {
        	for(int j=0;j<3;j++) {
        		if(i != 2) {
        			sum+=arr[i][j];
        		}        
        	}
        }
        sum+=arr[2][1];
        
        if(sum>=max) {
        	max=sum;
        	sum=0;
        }
        else{
        	sum = 0;
        }
        
        for(int i=1;i<4;i++) {
        	for(int j=1;j<4;j++) {
        		if(i != 2) {
        			sum+=arr[i][j];
        		}        
        	}
        }
        sum+=arr[2][2];
        
        if(sum>=max) {
        	max=sum;
        	sum=0;
        }
        else{
        	sum = 0;
        }
        
        for(int i=1;i<4;i++) {
        	for(int j=2;j<5;j++) {
        		if(i !=2 ) {
        			sum+=arr[i][j];
        		}        
        	}
        }
        sum+=arr[2][3];
        
        if(sum>=max) {
        	max=sum;
        	sum=0;
        }
        else{
        	sum = 0;
        }
        
        for(int i=1;i<4;i++) {
        	for(int j=3;j<6;j++) {
        		if(i != 2) {
        			sum+=arr[i][j];
        		}        
        	}
        }
        sum+=arr[2][4];
        
        if(sum>=max) {
        	max=sum;
        	sum=0;
        }
        else{
        	sum = 0;
        }
        
        System.out.println(max);
//        
//        
//        
//        
//        
        
        for(int i=2;i<5;i++) {
        	for(int j=0;j<3;j++) {
        		if(i != 3) {
        			sum+=arr[i][j];
        		}        
        	}
        }
        sum+=arr[3][1];
        
        if(sum>=max) {
        	max=sum;
        	sum=0;
        }
        else{
        	sum = 0;
        }
        
        for(int i=2;i<5;i++) {
        	for(int j=1;j<4;j++) {
        		if(i != 3) {
        			sum+=arr[i][j];
        		}        
        	}
        }
        sum+=arr[3][2];
        
        if(sum>=max) {
        	max=sum;
        	sum=0;
        }
        else{
        	sum = 0;
        }
        
        for(int i=2;i<5;i++) {
        	for(int j=2;j<5;j++) {
        		if(i != 3) {
        			sum+=arr[i][j];
        		}        
        	}
        }
        sum+=arr[3][3];
        
        if(sum>=max) {
        	max=sum;
        	sum=0;
        }
        else{
        	sum = 0;
        }
        
        for(int i=2;i<5;i++) {
        	for(int j=3;j<6;j++) {
        		if(i != 3) {
        			sum+=arr[i][j];
        		}        
        	}
        }
        sum+=arr[3][4];
        
        System.out.println(max);
        
        if(sum>=max) {
        	max=sum;
        	sum=0;
        }
        else{
        	sum = 0;
        }
        
        for(int i=3;i<6;i++) {
        	for(int j=0;j<3;j++) {
        		if(i != 4) {
        			sum+=arr[i][j];
        		}        
        	}
        }
        sum+=arr[4][1];
        
        if(sum>=max) {
        	max=sum;
        	sum=0;
        }
        else{
        	sum = 0;
        }
        
        for(int i=3;i<6;i++) {
        	for(int j=1;j<4;j++) {
        		if(i != 4) {
        			sum+=arr[i][j];
        		}        
        	}
        }
        sum+=arr[4][2];
        
        if(sum>=max) {
        	max=sum;
        	sum=0;
        }
        else{
        	sum = 0;
        }
        
        for(int i=3;i<6;i++) {
        	for(int j=2;j<5;j++) {
        		if(i != 4) {
        			sum+=arr[i][j];
        		}        
        	}
        }
        sum+=arr[4][3];
        
        if(sum>=max) {
        	max=sum;
        	sum=0;
        }
        else{
        	sum = 0;
        }
        
        for(int i=3;i<6;i++) {
        	for(int j=3;j<6;j++) {
        		if(i != 4) {
        			sum+=arr[i][j];
        		}        
        	}
        }
        sum+=arr[4][4];
        
        if(sum>=max) {
        	max=sum;
        	sum=0;
        }
        else{
        	sum = 0;
        }
        
        System.out.println(max);
    }
}

