package test.main;

import test.myPac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {
		
		
		class SpaceWeapon extends Weapon {
			@Override
			public void attack() {
				this.prepare();
				System.out.println("우주 공격");
			}
		}
		
//		Weapon w1 = new SpaceWeapon();
//		w1.attack();
		new SpaceWeapon().attack();
	}
}
