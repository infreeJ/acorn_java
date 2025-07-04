package test.myPac;

public class Triple<A, B, C> {
	private A first;
	private B second;
	private C third;
	
	public A getFirst() {
		return first;
	}
	
	public B getSecond() {
		return second;
	}
	
	public C getThird() {
		return third;
	}
	
	public void setFirst(A item) {
		this.first = item;
	}
	
	public void setSecond(B item) {
		this.second = item;
	}
	
	public void setThird(C item) {
		this.third = item;
	}
}