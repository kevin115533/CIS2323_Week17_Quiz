package library;
public class Fiction extends Book {
	private Double price = 0.0;
	private String title = "";
	
	public Fiction(){
		setPrice();
	}
	
	@Override
	public void setPrice(){
		price = 24.99;
	}
}
