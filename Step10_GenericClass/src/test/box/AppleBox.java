package test.box;

import test.fruit.Apple;

public class AppleBox {
	private Apple item;
	
	public void pack(Apple item) {
		this.item = item;
	}
	
	public Apple unPack() {
		return item;
	}

}
