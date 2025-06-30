package test.main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import test.myPac.MemberDto;

public class MainClass05 {
	public static void main(String[] args) {
		
		// MemberDto 객체를 저장할 수 있는 ArrayList 객체 생성
		// 참조값을 List 인터페이스 type으로 받아서 사용하는 경우가 많다.
		List<MemberDto> list = new ArrayList<>();
		// 1번 회원의 정보
		MemberDto dto1 = new MemberDto();
		dto1.setNum(1);
		dto1.setName("김구라");
		dto1.setAddr("노량진");
		
		MemberDto dto2 = new MemberDto(2, "해골", "행신동");
		MemberDto dto3 = new MemberDto(3, "원숭이", "동물원");
		
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		
		for(MemberDto tmp:list) {
			String info = String.format("번호:%d, 이름:%s, 주소:%5", tmp.getNum(), tmp.getName(), tmp.getAddr());
			System.out.println(info);
		}
		
		
		System.out.println("-----------------------");
		
		
		list.forEach((item) -> {
			String info = String.format("번호:%d, 이름:%s, 주소:%5", item.getNum(), item.getName(), item.getAddr());
			System.out.println(info);
		});
	}
}
