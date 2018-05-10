package PHacker_rank;
import java.util.HashMap;
import java.util.Scanner;
public class HashMapMethod {
	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        HashMap map=new HashMap();	       
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            // Write code here 	      
	            map.put(name, phone);
//	            map.put ===> map안에 key값과 value값을 넣는 함수
	        }	     
	        while(in.hasNext()){
	            String s = in.next();
	            // Write code here
	            if(map.containsKey(s)){
//	            map.containsKey(값) ====> map안에 값이 존재하는지 구하는 함수
	            	System.out.println(s+"="+map.get(s));
//	            map.get(값) ====> map안에 값(key)에 해당하는 value값을 얻는 함수
	            }
	            else {
	            	System.out.println("Not found");
	            }	    
	        }
	        in.close();
	    }
}
	    
	    
