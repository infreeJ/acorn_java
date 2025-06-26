package test.main;

import test.myPac.MyWeapon;
import test.myPac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		Weapon w1 = null;
		
		Weapon w2 = new MyWeapon();
		w2.prepare();
		w2.attack();
	}
}
