package test.main;

import test.myPac.SkyWeapon;
import test.myPac.WaterWeapon;
import test.myPac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		Weapon w1 = new SkyWeapon();
		w1.attack();
		
		
		/*
		 *  해상 공격을 하는 Weapon type 객체를 만들어서 .attack() 메서드를 호출했을 때
		 *  해상공격이 되도록 구현해보세요
		 */
		
		Weapon w2 = new WaterWeapon();
		w2.attack();
	}
}
