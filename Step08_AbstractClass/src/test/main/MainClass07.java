package test.main;

import test.myPac.Weapon;

public class MainClass07 {
	public static void main(String[] args) {
		
//		Weapon w1 = new Weapon() {
//			
//			public void attack() {
//				System.out.println("공격");
//			}
//		};
		

		Weapon w1 = new Weapon() {
			public void attack() {
				System.out.println("공격");
			}
		};
		useWeapon(w1);
		
	}
	
	public static void useWeapon(Weapon w) {
		w.attack();
	}
	
	
}
