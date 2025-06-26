package test.myPac;

public class Post {
	private int id;
	private String title;
	private String author;
	
	public Post () {
		
	};

	public Post(int id, String title, String author) {
		this.id = id;
		this.title = title;
		this.author = author;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAhthor(String author) {
		this.author = author;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
}
