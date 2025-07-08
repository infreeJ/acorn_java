package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MainClass10 {
	public static void main(String[] args) {
		File f = new File("memo.txt");
		try {
			// 파일의 문자열을 읽을 수 있는 객체 생성
			var fr = new FileReader(f);
			
			// 더 좋은 기능을 가진 객체
			var br = new BufferedReader(fr);
			
			// 무한 루프 돌면서
			while(true) {
				// 한 줄씩 읽는다.
				String line = br.readLine();
				// 읽은 문자열 출력
				System.out.println(line);
				// 읽을 문자열이 없으면 탈출
				if(line == null) { // 읽을 문자열이 없다면 readLine은 null 리턴
					break;
				}
			}
		} catch(IOException ie) {
			ie.printStackTrace();
		}
	}
}











