package test.box;


public class FruitBox<T> {
	
	private T item;
	
	public void pack(T item) {
		this.item = item;
	}
	
	public T unPack() {
		return item;
	}
}
