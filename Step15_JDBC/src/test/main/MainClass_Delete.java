package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass_Delete {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			conn = DriverManager.getConnection(url, "scott", "TIGER");
			System.out.println("Oracle DB 접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		PreparedStatement pstmt = null;
		
		try {
			String sql = """
					DELETE FROM dept
					WHERE deptno = 50
					""";
			pstmt = conn.prepareStatement(sql);
			int rowCount = pstmt.executeUpdate();
			
			System.out.println(rowCount + "개의 행 삭제");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
