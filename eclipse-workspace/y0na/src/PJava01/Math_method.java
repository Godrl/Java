package PJava01;
/*
	(int)(Math.random() * (큰수 - 작은수 + 1) + 작은수);	 ==> 큰수~작은수 중 랜덤으로 숫자 출력
	Math.round() ==> 소숫점 첫째 자리에서 반올림
	Math.ceil(double) ==>  소숫점 첫째 자리에서 올림
	Math.sqrt() ==> 제곱근 구하기
	Math.pow() ==> 거듭제곱 구하기
*/

public class Math_method{
	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=(int)(Math.random() * (100 - 10 + 1) + 1);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		System.out.println(Math.rint(-5.5));
		System.out.println(Math.round(-5.5));
		System.out.println(Math.pow(5,2));
	}
}