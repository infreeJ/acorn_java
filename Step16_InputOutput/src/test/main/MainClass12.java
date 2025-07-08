package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass12 {
	public static void main(String[] args) {
		try {
			// 파일로 부터 byte 알갱이를 읽을 객체
			var fis=new FileInputStream("c:/playground/Spring.png");
			// byte 알갱이를 파일에 출력할 객체 생성
			var fos=new FileOutputStream("c:/playground/copied.png");
			// 반복문 돌면서
			while(true) {
				// 1byte 씩 읽고
				int readedByte=fis.read();
				System.out.println(readedByte); // byte 알갱이 출력
				// 더이상 읽을게 없다면 반복문 탈출
				if(readedByte == -1)break;
				//읽은 byte 를 출력
				fos.write(readedByte);
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






