package test.main;

import test.myPac.Warmer;

public class MainClass06 {
	public static void main(String[] args) {
		Warmer w1 = new Warmer() {
			@Override
			public void warm(String target) {
				System.out.println(target+"을(를) 따뜻하게 해요");
			}
		};
		w1.warm("손");
		
		// 매개변수에 인자 전달
		Warmer w2 = (String target) -> {
			System.out.println(target+"을(를) 뜨겁게 해요");
		};
		
		// 전달할 인자의 타입 생략 가능
		Warmer w3 = (t) -> {
			System.out.println(t+"에 불을 붙여요");
		};
		useWarmer(w3);
		
		
	}
	public static void useWarmer(Warmer w) {
		w.warm("손");
	};
}
