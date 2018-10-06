package PHacker_rank;

import java.util.*;
import java.io.*;

class Node01{
	Node01 left,right;
	int data;
	Node01(int data){
		this.data=data;
		left=right=null;
	}
}

class BST_Level_Order_Traversal_23{
	static void levelOrder(Node01 root){
		//Write your code here
		      
	}
	public static Node01 insert(Node01 root,int data){
		if(root==null){
			return new Node01(data);
		}
		else{
			Node01 cur;
			if(data<=root.data){
				cur=insert(root.left,data);
				root.left=cur;
			}
			else{
				cur=insert(root.right,data);
				root.right=cur;
			}
			return root;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		Node01 root=null;
		while(T-->0){
			int data=sc.nextInt();
			root=insert(root,data);
		}
		levelOrder(root);
	}
}

