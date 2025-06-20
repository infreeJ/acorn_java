package test.main;

import test.mypac.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		
		MemberDto dto1 = new MemberDto();
		dto1.setNum(5);
		dto1.setName("hi");
		dto1.setAddr("bye");
		// 매개변수가 없는 생성자로 객체 생성 시
		
		MemberDto dto2 = new MemberDto(5, "hi", "bye");
		// 매개변수를 가진 생성자로 객체 생성 시
	}
}
