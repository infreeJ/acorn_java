package test.myPac;

public class Zoo {
	
	// 내부 클래스
	public class Monkey {
		public void say() {
			System.out.println("나는 원숭이");
		}
	}
	
	// 내부 클래스
	public class Tiger {
		public void roar() {
			System.out.println("어흥");
		}
	}
	
	// 메서드 (호출되면 Monkey 객체를 생성해서 리턴)
	public Monkey getMonkey() {
		return new Monkey();
	}
	
	// 메서드 (호출되면 Tiger 객체를 생성해서 리턴)
	public Tiger getTiger() {
		return new Tiger();
	}
}
