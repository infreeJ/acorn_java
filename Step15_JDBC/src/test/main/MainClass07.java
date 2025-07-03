package test.main;

import java.sql.Connection;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnector;

	// member 테이블에 회원 한 명의 정보를 추가하는 메서드
public class MainClass07 {
	
	public static boolean insert(MemberDto dto) { // MemberDto 객체를 인자로 받음
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		// 변화된 row의 개수를 담을 변수 선언하고 0으로 초기화
		int rowCount = 0;
		
		try {
			conn = new DBConnector().getConn();
			String sql = """
					INSERT INTO member(num, name, addr)
					VALUES (member_seq.NEXTVAL, ?, ?)
					""";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName()); // getter 메서드로 데이터를 받음
			pstmt.setString(2, dto.getAddr()); // getter 메서드로 데이터를 받음
			rowCount = pstmt.executeUpdate();
			
			if(rowCount > 0) {
				System.out.println(rowCount + "개 작업 성공");
			} else {
				System.out.println("작업 실패");
			}
			
		}	catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		if(rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}


	public static void main(String[] args) {
		String name = "누구게";
		String addr = "어디게";
		// DB에 추가할 정보
		
		MemberDto dto = new MemberDto(); // MemberDto 객체 생성
		
		dto.setName("누구게"); // Name 설정
		dto.setAddr("어디게"); // addr 설정
		
		boolean isSuccess = insert(dto); // 값이 들어있는 dto 객체를 전달하며 insert() 메서드 호출
	}
}
