package text.main;

public class MainClass03 {
	public static void main(String[] args) {
		
//		for( int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
		
//		for(int i = 9; i >= 0; i--) {
//			System.out.println(i);
//		}
		
		String[] coffees = {
				"아메리카노",
				"카페라떼",
				"아인슈페너"
		};
		
		String[] process = {
				"커피 수확",
				"로스팅",
				"추출",
				"서빙"
		};
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println(coffees[i]);
				System.out.println(process[j]);
			}
		}
		
	}
}
