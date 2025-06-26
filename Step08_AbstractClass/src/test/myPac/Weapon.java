package test.myPac;

public abstract class Weapon {
	// 무기 작동을 준비하는 메서드
	
	public void prepare() {
		System.out.println("무기 작동을 준비합니다.");
	}
	
	// 공격하는 메서드
	public abstract void attack();
}
