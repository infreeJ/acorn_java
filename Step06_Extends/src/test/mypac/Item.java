package test.mypac;

public class Item {
	private String name; // 상품명
	private int price; // 가격
	private String madeBy; // 제조사
	
	public void setItem(String name, int price, String madeBy) {
		this.name = name;
		this.price = price;
		this.madeBy = madeBy;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setMadeBy(String madeBy) {
		this.madeBy = madeBy;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getMadeBy() {
		return madeBy;
	}
}