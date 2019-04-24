
public class BookDemo {

	
	public static void main(String[] args) {
		Author author=new Author("Test"," ok");
		 
		 
		 author.setFirstName("Russel");
		 System.out.println(author.getFirstName());
		 
		 
		
		 author.setLastName("Winderand");
		 System.out.println(author.getLastName());
		
		
		String title = "title1";
		
		float price = 452.5f;
		
		Book book=new Book(title,price);
		
		book.setTitle("Developing java software");
		System.out.println(book.getTitle());
		
		book.setPrice(76.55f);
		System.out.println(book.getPrice());
		
}
	}


