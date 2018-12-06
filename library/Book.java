package library;

public abstract class Book {
	private String title = "";
	private Double price = 0.0;
	public abstract void setPrice();
	
	Book(String x){
		setTitle(x);
	}
	
	public void setTitle(String x){
		title = x;
	}
	
	public String getTitle(){
		return title;
	}
	
	
	
	public double getPrice(){
		return price;
	}
}
