package test.main;

import java.util.Scanner;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		String name = scan.nextLine();
		
		System.out.println("주소 입력 : ");
		String addr = scan.nextLine();
		
		// MemberDao 객체를 이용해서 DB에 저장하려면?
		
		MemberDto dto = new MemberDto();
		dto.setName(name);
		dto.setAddr(addr);
		MemberDao dao = new MemberDao();
		boolean success = dao.insert(dto);
		if(success) {
			System.out.println("insert 성공");
		} else {
			System.out.println("insert 실패");
		}
	}
}
