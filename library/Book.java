package library;

public abstract class Book {
	private String title = "";
	private Double price = 0.0;
	public abstract void setPrice();
	
	Book(){
		
	}
	
	public String getTitle(){
		return title;
	}
	
	
	public double getPrice(){
		return price;
	}
}
