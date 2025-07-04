package test.main;

import test.myPac.Button;

public class MainClass_button {
	public static void main(String[] args) {
		Button b1 = new Button() {
			public void onPress() {
				System.out.println("버튼 눌림");
			}
			public void onRelease() {
				System.out.println("버튼 뗌");
			}
		};
		b1.onPress();
		b1.onRelease();
		
		
		
		useButton(new Button() {
			public void onPress() {
				System.out.println("버튼 눌림2");
			}
			public void onRelease() {
				System.out.println("버튼 똄2");
			}
		});
	}
	
	public static void useButton(Button b) {
		b.onPress();
		b.onRelease();
	}
}
