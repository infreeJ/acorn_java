package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass14 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// 파일로 부터 byte 알갱이를 읽을 객체
			fis=new FileInputStream("c:/playground/Spring.png");
			// byte 알갱이를 파일에 출력할 객체 생성
			fos=new FileOutputStream("c:/playground/copied3.png");
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
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) fos.close();
				if (fis != null) fis.close();
			} catch (Exception e) {}
		}
	}
}