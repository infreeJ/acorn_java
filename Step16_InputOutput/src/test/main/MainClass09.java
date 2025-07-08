package test.main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass09 {
	public static void main(String[] args) {
		File f = new File("memo.txt");
		try {
			// 파일의 문자열을 읽을 수 있는 객체 생성
			var fr = new FileReader(f);
			// 무한 루프 돌면서
			while(true) {
				// 한 글자씩 읽기
				int code = fr.read();
				char ch = (char)code; // 문자로 변환
				System.out.println(ch); // 출력
				// 더 이상 읽을 문자가 없다면
				if(code == -1) {
					break; // 반복문 탈출
				}
			}
			
		} catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}
