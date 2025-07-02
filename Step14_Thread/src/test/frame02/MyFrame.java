package test.frame02;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("Thread 테스트");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton startBtn = new JButton("작업시작");
		var startBtn2 = new JButton("작업시작2");
		
		add(startBtn);
		add(startBtn2);
		
		startBtn.addActionListener((e) -> {
			// 이곳은 main Thread가 실행
			System.out.println("10초 걸리는 작업 시작");
			try {
				Thread.sleep(1000*10); // main Thread는 10초간 sleep 상태가 된다.
			} catch(InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println("작업 종료");
		});
		
		startBtn2.addActionListener((e) -> {
			new Thread(new WorkRunnable()).start();
			// Thread 객체를 생성하면서 runnable type을 전달하고
			// 해당 객체의 start() 메서드를 호출하면 새로운 스레드가 시작
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// 메인 스레드에서 MyFrame 객체를 생성하고 스레드는 사용자의 입력을 처리하기 위해 어디선가 대기중
		new MyFrame();
	}
}
