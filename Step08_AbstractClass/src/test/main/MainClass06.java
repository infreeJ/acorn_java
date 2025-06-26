package test.main;

import test.myPac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		
		
		Weapon w1 = new Weapon() {
			
			@Override
			public void attack() {
				prepare();
				System.out.println("사이버 공격");
			}
		};
		w1.attack();
		
		
		/*
		 *  익명의 Local Inner Class를 이용해서
		 *  Weapon type 객체를 생성해서 공격할 예정인데
		 *  1번 공격할 예정
		 *  위 처럼 w1 변수를 만들지 않으려면?
		 */
		
		new Weapon() {
			@Override
			public void attack() {
				prepare();
				System.out.println("가상공간 공격");
			}
		}.attack();
		
	}
}
