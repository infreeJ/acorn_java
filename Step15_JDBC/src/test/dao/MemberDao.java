package test.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;
import test.util.DBConnector;

/*
 * 	Data Access Object 객체를 생성할 클래스 정의하기
 * - DB에 insert, update, delete, select 작업을 하는 코드 작성
 */

public class MemberDao {
	
	public MemberDto getByNum(int num) {
		
		MemberDto dto = null;
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			conn = new DBConnector().getConn();
			String sql = """
					SELECT name, addr
					FROM member
					WHERE num = ?
					""";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, num);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				dto = new MemberDto();
				dto.setNum(num);
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
	
	public List<MemberDto> selectAll() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<MemberDto> list = new ArrayList<>();

		try {
			conn = new DBConnector().getConn();
			String sql = """
					SELECT num, name, addr
					FROM member
					ORDER BY num ASC
					""";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while (rs.next()) {
				MemberDto dto = new MemberDto();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAddr(rs.getString("addr"));
				list.add(dto);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return list;
	}
	
	public boolean update(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		int rowCount = 0;

		try {
			conn = new DBConnector().getConn();
			String sql = """
					UPDATE member
					SET name = ?, addr = ?
					WHERE num = ?
					""";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			pstmt.setInt(3, dto.getNum());

			rowCount = pstmt.executeUpdate();

			if (rowCount > 0) {
				System.out.println(rowCount + "개 작업 성공");
			} else {
				System.out.println("작업 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean deleteByNum(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		int rowCount = 0;

		try {
			conn = new DBConnector().getConn();
			String sql = """
					DELETE FROM member
					WHERE num = ?
					""";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			rowCount = pstmt.executeUpdate();

			if (rowCount > 0) {
				System.out.println(rowCount + "개 작업 성공");
			} else {
				System.out.println("작업 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}

	// 회원 한명의 정보를 DB에 저장하고 성공 여부를 리턴하는 메서드
	public boolean insert(MemberDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		int rowCount = 0;

		try {
			conn = new DBConnector().getConn();
			String sql = """
					INSERT INTO member(num, name, addr)
					VALUES(member_seq.NEXTVAL, ?, ?)
			""";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getAddr());
			rowCount = pstmt.executeUpdate();

			if (rowCount > 0) {
				System.out.println(rowCount + "개 작업 성공");
			} else {
				System.out.println("작업 실패");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if (rowCount > 0) {
			return true;
		} else {
			return false;
		}
	}
}
