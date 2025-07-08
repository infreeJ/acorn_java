package test.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메서드 시작");
		// 1btye 처리 스트림
		InputStream kdb = System.in;
		
		// 2byte 처리 스트림
		var isr = new InputStreamReader(kdb);
		System.out.println("입력 : ");
		
		try {
			// InputStreamReader 객체로 입력한 문자의 code 값 읽어내기
			int code = isr.read();
			System.out.println("code : " + code);
			char ch = (char)code;
			System.out.println("char : " + ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
