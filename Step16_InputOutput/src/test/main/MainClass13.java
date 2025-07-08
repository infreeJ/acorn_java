package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass13 {
	public static void main(String[] args) {
		try {
			// 파일로 부터 byte 알갱이를 읽을 객체
			var fis=new FileInputStream("c:/playground/Spring.png");
			// byte 알갱이를 파일에 출력할 객체 생성
			var fos=new FileOutputStream("c:/playground/copied2.png");
			// byte 알갱이 1024개를 한 번에 읽을 수 있는 배열 객체 생성
			byte[] buffer = new byte[1024];
			
			// 반복문 돌면서
			while(true) {
				// byte[] 객체를 전달하면 배열에서 몇 byte를 읽었는지 리턴 받는다.
				int readedCount = fis.read(buffer);
				// 더이상 읽을 byte가 없다면 반복문 탈출
				if(readedCount == -1) break;
				fos.write(buffer, 0, readedCount);
				fos.flush();
			}
			System.out.println("파일을 copy 했습니다");
			fos.close();
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}






