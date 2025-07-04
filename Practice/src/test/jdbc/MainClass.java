package test.jdbc;

import java.util.List;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		SqlClass sc = new SqlClass();
		
		// SELECT ALL문
//		List<MemberDto> list = sc.selectAll();
//		list.forEach((item) -> {
//			System.out.println(item.getNum() + " | " + item.getName() + " | " + item.getAddr());
//		});
		
		// SELECT NUM문
//		MemberDto dto = sc.selectNum(4);
//		System.out.println(dto.getNum() + " | " + dto.getName() + " | " + dto.getAddr());
		
//		 INSERT문
		MemberDto dto = new MemberDto();
		dto.setName("ammm");
		dto.setAddr("gg");
		boolean isSuccess = sc.insert(dto);
		if(isSuccess) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
		
		
		// UPDATE문
//		MemberDto dto = new MemberDto();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("변경할 멤버의 num 입력 : ");
//		dto.setNum(scan.nextInt());
//		scan.nextLine();
//		System.out.println("변경할 name 입력 : ");
//		dto.setName(scan.nextLine());
//		System.out.println("변경할 addr 입력 : ");
//		dto.setAddr(scan.nextLine());
//		
//		boolean isSuccess = sc.update(dto);
//		if(isSuccess) {
//			System.out.println("성공");
//		} else {
//			System.out.println("실패");
//		}
		
		
		// DELETE문
//		boolean isSuccess = sc.delete(6);
//		if(isSuccess) {
//			System.out.println("성공");
//		} else {
//			System.out.println("실패");
//		}
		
		
	}
}















