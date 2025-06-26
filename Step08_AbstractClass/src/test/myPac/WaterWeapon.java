package test.myPac;

public class WaterWeapon extends Weapon{
	public void attack() {
		this.prepare();
		System.out.println("해상 공격");
	}
}
