package test.main;

import test.mypac.MemberDto;

public class MainClass06 {
	public static void main(String[] args) {
		
		MemberDto dto1 = new MemberDto();
		dto1.setNum(1);
		dto1.setName("김구라");
		dto1.setAddr("노량진");
		
		MemberDto dto2 = new MemberDto(2, "해골", "행신동");
		MemberDto dto3 = new MemberDto(3, "원숭이", "동물원");
		
		MemberDto[] members = {dto1, dto2, dto3};
		
		int num = members[0].getNum();
		String name = members[0].getName();
		String addr = members[0].getAddr();
	}
}
