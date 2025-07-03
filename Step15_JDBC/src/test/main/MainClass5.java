package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnector;

public class MainClass5 {
	public static void main(String[] args) {
		int minSal = 2000;
		int maxSal = 3000;
		// 위의 범위의 sal을 받는 사원들의 empno, ename, sal을 SELECT해서
		// sal에 대해서 오름차순 정렬해서 콘솔창에 출력하기
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			conn = new DBConnector().getConn();
			
			String sql = """
					SELECT empno, ename, sal
					FROM emp
					WHERE sal BETWEEN ? AND ?
					ORDER BY sal ASC
					"""; // ?는 바인딩 변수를 받을 곳
			
			// SQL을 미리 컴파일하고 실행할 준비를 마친 객체를 pstmt 변수에 저장
			pstmt = conn.prepareStatement(sql);
			
			// ?에 필요한 값 바인딩하기
			pstmt.setInt(1, minSal); // 1번째 ?에 minSal 바인딩
			pstmt.setInt(2, maxSal); // 2번째 ?에 maxSal 바인딩
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				int sal = rs.getInt("sal");
				System.out.println(empno + " | " + ename + " | " + sal);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
