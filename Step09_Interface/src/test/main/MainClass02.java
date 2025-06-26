package test.main;

import test.myPac.MyRemocon;
import test.myPac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		Object r1 = new MyRemocon();
		Remocon r2 = new MyRemocon();
		MyRemocon r3 = new MyRemocon();
		
		useRemocon(r3);
		useRemocon(r2);
		useRemocon((Remocon)r1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
