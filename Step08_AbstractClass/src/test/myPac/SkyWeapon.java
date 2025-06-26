package test.myPac;

public class SkyWeapon extends Weapon {
	public void attack() {
		this.prepare();
		System.out.println("공중 공격");
	}
}
