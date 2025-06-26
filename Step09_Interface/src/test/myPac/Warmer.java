package test.myPac;


// 함수 형태로 쓰기 위한 어노테이션 (메서드 1개가 강제된다.)
@FunctionalInterface
public interface Warmer {
	public void warm(String target);
}
