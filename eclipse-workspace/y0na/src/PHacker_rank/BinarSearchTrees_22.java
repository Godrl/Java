package PHacker_rank;
import java.util.*;
import java.io.*;

class Noded{
    Noded left,right;
    int data;
    Noded(int data){
        this.data=data;
        left=right=null;
    }
}

public class BinarSearchTrees_22 { 
	public static int getHeight(Noded root){
	      //Write your code here
		    if (root==null) {
		    	return -1;
		    }
		    else{
		    	System.out.println(root.left);
		    	System.out.println(root.right);
		    	return Math.max(1+getHeight(root.left),1+getHeight(root.right));
		    }
	}
	
	
    public static Noded insert(Noded root,int data){
        if(root == null){
            return new Noded(data);
        }
        else{
            Noded cur;
            if(data <= root.data){
                cur = insert(root.left,data);
                root.left = cur;
            }
            else{
                cur = insert(root.right,data);
                root.right = cur;
            }
            return root;
        }
    }
    
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
	        int T=sc.nextInt();
	        Noded root=null;
	        while(T-- > 0){
	            int data=sc.nextInt();
	            root=insert(root,data);
	        }
	        int height=getHeight(root);
	        System.out.println(height);
	    }
	}