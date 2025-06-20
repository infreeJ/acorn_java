package test.mypac;

public class PostDto {
	private int id;
	private String content;
	private String author;
	
	public PostDto(int id, String content, String author) {
		this.id = id;
		this.content = content;
		this.author = author;
	}

	public void Print() {
		System.out.println("----");
		System.out.println(id);
		System.out.println(content);
		System.out.println(author);
		System.out.println("----");
		System.out.println("");
	}
}
