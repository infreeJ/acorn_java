package test.name;

public class MainClass02 {
	public static void main(String[] args) {
		// 1. 콘솔창에 "main 메소드가 시작되었습니다." 를 출력해보세요
		System.out.println("main 메소드가 시작되었습니다.");
		
		int kor = 95;
		int eng = 100;
		double avg;
		avg = (kor + eng) / 2d;
		System.out.println(avg); // 97.5
		
		// 원하는 format의 문자열 만들기
		String info = "평균:"+avg;
		String info2 = "국어" + kor + "  영어" + eng + "  평균" + avg;
		
		System.out.println(info);
		System.out.println(info2);
	}
}
