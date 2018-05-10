package PHacker_rank;
/*
 *	제목과 저자와 가격을 입력하면 출력하는 함수 - 추상함수를 이용(extends)
 * 
*/

import java.util.*;

abstract class Book {
    String title;
    String author;
    
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    abstract void display();
}

//Declare your class here. Do not use the 'public' access modifier.
// Declare the price instance variable

/**   
*   Class Constructor
*   
*   @param title The book's title.
*   @param author The book's author.
*   @param price The book's price.
**/
// Write your constructor here
	class MyBook extends Book{
		int price;
		MyBook(String title, String author,int price){
			super(title, author);
			this.price=price;
			this.title=title;
			this.author=author;
		}

		@Override
		void display() {			
			System.out.println("Title: "+title);
			System.out.println("Author: "+author);
			System.out.println("Price: "+price);
			
		}

	}
		
	
	
/**   
*   Method Name: display
*   
*   Print the title, author, and price in the specified format.
**/
// Write your method here

//End class

public class AbstractClasses {
	   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}