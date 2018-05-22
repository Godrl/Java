package PTest;

public class Test07 {
	public static void main(String args[]){
		int a=5;
		Node node=new Node(a);
		 

	}
}

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
}