package tset.main;

public class MainClass02 {
	public static void main(String[] args) {
		MainClass02 m1 = new MainClass02();
		m1.sendMessage("안녕?");
		m1.sendMessage("'ㅅ'");
		
		String str = "kimgura";
		m1.sendMessage(str);
		
	}
	
	public void sendMessage(String msg) {
		System.out.println("메시지 전송 " + msg);
	}
}