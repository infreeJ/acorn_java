package test.main;

import test.myPac.Remocon;

public class MainClass04 {
	public static void main(String[] args) {
		// 인터페이스도 익명의 InnerClass를 이용해서 구현 객체를 만들 수 있다.
		Remocon r1 = new Remocon() {
			
			@Override
			public void up() {
				System.out.println("채널을 올려요");
			}
			
			@Override
			public void down() {
				System.out.println("채널을 내려요");
				
			}
		};
		useRemocon(r1);
		
		
		
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("채널을 올려요");
			}
			
			@Override
			public void down() {
				System.out.println("채널을 내려요");				
			}
		});
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
