package test.main;

import test.mypac.PostDto;

public class MainClass14_test {
	public static void main(String[] args) {
		PostDto dto1 = new PostDto(12, "노인과바다", "헤밍웨이");
		PostDto dto2 = new PostDto(13, "데미안", "헤르만");
		PostDto dto3 = new PostDto(14, "폭풍의언덕", "에밀리");
		
		dto1.Print();
		dto2.Print();
		dto3.Print();
	}
	
	
}
