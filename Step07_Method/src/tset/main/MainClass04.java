package tset.main;

import test.myPac.Post;

public class MainClass04 {
	public static void main(String[] args) {
		
		sendPost(new Post());
		
		sendPost(new Post(0, "제목", "작성자"));
		
		Post p1 = new Post();
		p1.setId(1);
		p1.setTitle("제목1");
		p1.setAhthor("작성자1");
		sendPost(p1);
		
		System.out.println("-----------");
		
		Post p2 = new Post(2, "제목2", "작성자2");
		sendPost(p2);
		
		System.out.println("-----------");
		
		Post p3 = new Post(3, "제목3", "작성자3");
		sendPost(p3);
	}
	
	
	public static void sendPost(Post post) {
		System.out.println("글을 전송했습니다.");
		System.out.println(post.getId());
		System.out.println(post.getTitle());
		System.out.println(post.getAuthor());
	}
}