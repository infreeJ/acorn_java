package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass06 {
	public static void main(String[] args) {
		// 콘솔창에 출력할 수 있는 객체의 참조값 얻어내기
		PrintStream ps = System.out;
		
		// PrintStream 객체의 참조값을 부모 type 변수에 담기
		OutputStream os = ps;
		var osw = new OutputStreamWriter(os);
		
		// 더 많은 문자열과 개행기호를 출력하는 BufferedWriter
		var bw = new BufferedWriter(osw);
		
		try {
			bw.write("하나");
			bw.newLine();
			bw.write("두울");
			bw.newLine();
			bw.write("세엣");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
