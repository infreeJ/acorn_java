package test.main;

import test.myPac.AirConditioner;
import test.myPac.RemoteControl;
import test.myPac.Tv;

public class MainClass01 {
	public static void main(String[] args) {
		RemoteControl tv1 = new Tv();
		tv1.turnOn();
		tv1.turnOff();
		
		RemoteControl air1 = new AirConditioner();
		air1.turnOn();
		air1.turnOff();
	}
}
