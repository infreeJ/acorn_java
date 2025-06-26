package test.main;

import test.myPac.MyRemocon;
import test.myPac.Remocon;

public class MainClass01 {
	public static void main(String[] args) {
		
		Remocon r1 = null;
		
		Remocon r2 = new MyRemocon();
		r2.up();
		r2.down();
		
		System.out.println(Remocon.COMPNAY);
		
	}
}
