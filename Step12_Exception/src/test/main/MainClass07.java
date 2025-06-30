package test.main;

import test.myPac.WowException;
import test.myPac.myUtil;

public class MainClass07 {
	public static void main(String[] args) {
		System.out.println("main 메서드 시작");
		
		try {
			myUtil.generate();
		} catch (WowException we) {
			System.out.println("예외 메시지 : " + we.getMessage());
		}
		
		System.out.println("main 메서드 종료");
	}
}