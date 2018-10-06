package PEtc;
/*
 * 길이가 n인 배열에 1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는지를 확인하려고 합니다.
	1부터 n까지 숫자가 중복 없이 한 번씩 들어 있는 경우 true를, 아닌 경우 false를 반환하도록 함수 solution을 완성해주세요.
*/
public class KakaoTest {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = new int[]{4,3,1};
		sol.solution(arr);		
	}
}

class Solution {
    public boolean solution(int[] arr) {
        boolean answer = true;
        int[] num = new int[arr.length];
        for(int i = 1; i < num.length+1; i++) {
        	num[i-1] = i;        	
        }                
        
        for(int i = 0; i < arr.length-1; i++) {
        	if(arr[i] > arr[i+1]) {
        		int temp = arr[i];
        		arr[i] = arr[i+1];
        		arr[i+1] = temp;        		        		
        	}        	
        }
        
        for(int i = 0; i < arr.length; i++) {
        	if(arr[i] == num[i]) {
            	answer = true;
            }
            else {
            	answer = false;
            }

        }
        System.out.println(answer);
        return answer;
                
    }
}

