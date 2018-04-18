package PTest;

public class Test02 {
	private int age;
	public Test02(int initialAge) {
		age=initialAge;
	}

	public void amIOld() {
		if(age<0) {
			System.out.println("Age is not valid, setting age to 0.");
			System.out.println("You are young.");
			age=0;
		}
		else if(age<13){
            System.out.println("You are young.");    
        }
        else if(age>=13 & age<18){
            System.out.println("You are a teenager.");    
        }
        else{
            System.out.println("You are old.");    
        }
	}

	public void yearPasses() {
  		age++;
	}
	
	public static void main(String[] args) {
		int T = 2;
		for (int i = 0; i < T; i++) {
			int age =-5;
			Test02 p = new Test02(age);
			p.amIOld();
				for (int j = 0; j < 3; j++) {
					p.yearPasses();	
				}
			p.amIOld();
			System.out.println();
        }
    }
}

