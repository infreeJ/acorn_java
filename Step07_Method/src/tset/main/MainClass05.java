package tset.main;

import test.myPac.Messenger;
import test.myPac.Post;

public class MainClass05 {
	public static void main(String[] args) {
		// Messenger type 객체의 sendPost() 메서드를 호출해보세요
		// 실행했을 때 Exception이 발생하지 않아야 합니다.
		
		Post p1 = new Post(1, "제목", "작성자");
		
		Messenger m1 = new Messenger();
		m1.sendPost(p1);;
	}
}