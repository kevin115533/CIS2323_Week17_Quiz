package library;

public class NonFiction extends Book {
	private Double price = 0.0;
	private String title = "";
	
	public NonFiction(){
		setPrice();
	}
	
	@Override
	public void setPrice(){
		price = 37.99;
	}
}
