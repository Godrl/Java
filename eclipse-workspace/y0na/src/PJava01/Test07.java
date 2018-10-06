package PJava01;
/*
	Arrays.toString() --> for문 없모든 배열을 나열해줌
	System.arraycopy() --> 배열 복사
	clone(); --> 복사
*/
import java.util.Arrays;

public class Test07 {
	public static void main(String args[]){
		int[] array = {10, 20, 30, 40};
		System.out.println(Arrays.toString(array));
		
		String[] SArray = new String[5];
		SArray = new String[]{"y0na", "Striker", "Bible", "Laughter", "me"};
		String[] sArray = new String[10];
		System.arraycopy(SArray, 0, sArray, 0, SArray.length);
		System.out.println(Arrays.toString(SArray));
		String[] cArray = new String[SArray.length];
		cArray = SArray.clone();
		System.out.println(Arrays.toString(cArray));

	}
}

