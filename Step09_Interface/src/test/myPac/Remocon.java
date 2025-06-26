package test.myPac;

public interface Remocon {
	
	// 추상메서드만 정의할 수 있다. (abstract 예약어 생략 가능)
	public abstract void up();
	public void down();
	
	// final 상수는 관례상 대문자로 작성(static, final 예약어 생략 가능)
	public String COMPNAY = "LG";
}
