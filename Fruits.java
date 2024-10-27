package javaProject;

public class Fruits {
	private String Name;
	private int id;
	private int price;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Fruits(String name, int id, int price) {
		super();
		Name = name;
		this.id = id;
		this.price = price;
	}
	
	

}
