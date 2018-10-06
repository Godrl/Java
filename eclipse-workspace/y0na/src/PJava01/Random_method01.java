package PJava01;
/*
 * random.nextInt() ==> int범위 안에서 랜덤한 수 뽑기
 * random.nextInt(int i) ==> 0~i 까지 안에서 랜덤한 수 뽑기
 * Random() / Random(int seed) ==> 랜덤으로 수 뽑기(종자값을 설정하면 같은 값을 얻을 수 있음)
*/
import java.util.Random;

public class Random_method01{
    public static void main(String[] args) {       
    	Random rand  = new Random(3);
		Random rand2 = new Random(1);

		System.out.println("= rand =");
		for(int i=0; i < 5; i++)
			System.out.println(i + ":" + rand.nextInt());

		System.out.println();
		System.out.println("= rand2 =");
		for(int i=0; i < 5; i++)
			System.out.println(i + ":" + rand2.nextInt());
		
		
    
    }
}