package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		int[] nums = {10, 20, 30, 40, 50};
		
		String[] names = { "김구라", "해골", "원숭이", "주뎅이", "덩어리" };
		
		for(int i = 0; i < nums.length; i++ ) {
			System.out.println(nums[i]);
		}
		
		for(int i = 0; i < names.length; i++ ) {
			System.out.println(names[i]);
		}
		
	}
}
