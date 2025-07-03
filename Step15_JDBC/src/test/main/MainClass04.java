package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import test.util.DBConnector;

public class MainClass04 {
	public static void main(String[] args) {
		
		// SELECT 작업을 위해서 필요한 객체를 담을 지역변수 미리 만들기
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = new DBConnector().getConn(); // DBConnector 객체 생성 후 메서드 호출 결과를 conn에 저장
			// 실행할 SQL문 미리 준비하기
			String sql = """
				SELECT e.empno, e.ename, e.deptno, d.dname
				FROM emp e JOIN dept d ON e.deptno = d.deptno
			""";
			
			// SQL문을 전달하면서 PreparedStatement 객체의 참조값 얻어내기
			pstmt = conn.prepareStatement(sql);
			
			// SELECT문을 실행하고 결과를 ResultSet 객체로 얻어내기
			rs = pstmt.executeQuery();
			
			// 반복문 돌면서
			while(rs.next()) { // 다음 cursor 위치에 데이터가 있다면 true
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				
				String info = String.format("사원번호:%d 사원이름:%s, 부서번호:%d 부서명:%s",
						empno, ename, deptno, dname);
				System.out.println(info);
				
				// 현재 cursor가 위치한 곳의 데이터 출력
//				System.out.println(empno + " | " + ename + " | " + deptno + " | " + dname);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}























