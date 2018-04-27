package PTest;

public class Operator {
		public static void main(String args[]) { 
			char a = 'a';
			char b = 'd';

			char zero = '0';
			char two  = '2';

			System.out.printf("'%c' - '%c' = %d%n", b, a, b - a); // 'd' - 'a' = 3
			System.out.printf("'%c' - '%c' = %d%n", two, zero, two - zero);
			System.out.printf("'%c'=%d%n", a, (int)a);
			System.out.printf("'%c'=%d%n", b, (int)b);
			System.out.printf("'%c'=%d%n", zero, (int)zero);
			System.out.printf("'%c'=%d%n", two,  (int)two);
			
			System.out.println();
			
			System.out.printf("10 == 10.0f  \t %b%n", 10==10.0f);
			System.out.printf("'0'== 0      \t %b%n", '0'== 0);
			System.out.printf("'\\0'== 0    \t %b%n", '\0'== 0);

			System.out.println();
			
			float  f  = 0.1f;
			double d  = 0.1;
			double d2 = (double)f;

			System.out.printf("0.1==0.1f    %b%n",  0.1==0.1f);
			System.out.printf("f =%19.17f%n", f);
			System.out.printf("d =%19.17f%n", d);
			System.out.printf("d2=%19.17f%n", d2);
			System.out.printf("d==f   %b%n", d==f);
			System.out.printf("d==d2  %b%n", d==d2);
			System.out.printf("d2==f  %b%n", d2==f);
			System.out.printf("(float)d==f  %b%n", (float)d==f);


		}
}
