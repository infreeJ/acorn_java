package test.mypac;

public class Post {
	public int id;
	public String content;
	public String author;
	
	public void printData() {
		String.format("번호:%d 이름:%s 주소:%s", this.id, this.content, this.author);
	}
}
