
public class Book {

	private String title;

	private float price;

	public Book(String title, Float price) {
		this.title = title;
		this.price = price;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getPrice() {
		return this.price;
	}

	public String getTitle() {
		return title;
	}

	public void Display() {
		System.out.println(title + "" + price);
	}

}
