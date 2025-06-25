package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		SmartPhone p1 = new SmartPhone();
		p1.call();
		p1.mobilecall();
		p1.takePicture();
		p1.doInternet();
		
		System.out.println("----------------");
		
		HandPhone p2 = new SmartPhone();
		p2.takePicture();
		
		System.out.println("----------------");
		
		HandPhone p3 = new HandPhone();
		p3.takePicture();
		
		
	}
	
}
