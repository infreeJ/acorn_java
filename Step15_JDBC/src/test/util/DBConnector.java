package test.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnector { // Conn 클래스
	public Connection getConn() { // DB에 연결하고 객체를 반환하는 메서드
		
			Connection conn = null; // DB에 접속해서 작업할 객체 변수 선언
			
			try {
				// 오라클 드라이버 로딩(ojdbc...jar 파일이 있어야 아래의 코드가 동작)
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// 접속할 DB 의 정보 @아이피주소:port번호:db이름
				String url="jdbc:oracle:thin:@localhost:1521:xe";
				// DB정보, 계정, 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
				conn=DriverManager.getConnection(url, "scott", "TIGER");
				System.out.println("Oracle DB 접속 성공"); // 접속 성공 시 출력
					
			} catch (Exception e) { // 접속 실패 시
				e.printStackTrace();
			}
			
			return conn; // conn 반환
	}
}
