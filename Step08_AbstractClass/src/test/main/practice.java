package test.main;

abstract class Test {
	public void a() {
		System.out.println("첫번째 메서드");
	}
	public abstract void b();
}



public class practice {
	public static void main(String[] args) {
		
		Test t1 = new Test() {
			public void b() {
				a();
				System.out.println("두번째 메서드");
			}
		};
		t1.b();
		
		
		System.out.println("-----------------");
		
		
		new Test () {
			public void b() {
				a();
				System.out.println("세번째 메서드");
			}
		}.b();
	}
}
