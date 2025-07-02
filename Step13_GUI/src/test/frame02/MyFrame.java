package test.frame02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;


/*
 *  Graphic User Interface를 만들 수 있는 클래스 설계하기
 *  
 *  1. JFrame을 상속받는다.
 *  2. 생성자에서 필요한 초기화 작업을 한다.
 *  3. main() 메서드에서 이 클래스로 객체를 생성하면 프레임(window)가 만들어진다.
 */

public class MyFrame extends JFrame {
	public MyFrame() {
		// 프레임의 제목 설정
		this.setTitle("나의 프레임");
		
		// 프레임의 위치와 크기 설정
		setBounds(100, 100, 500, 500);
		
		// 종료(x) 버튼을 눌렀을 때 프로세스 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 레이아웃 매니저 객체 생성
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		
		// 프레임의 레이아웃 매니저 설정
		setLayout(layout);
		
		// JButton 객체 생성
		JButton btn1 = new JButton("버튼1");
		JButton btn2 = new JButton("버튼1");
		JButton btn3 = new JButton("버튼1");
		
		// 프레임의 add() 메서드를 호출하면서 JButton 객체의 참조값을 전달하면 프레임에 버튼이 배치된다.
		add(btn1);
		add(btn2);
		add(btn3);
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼1 클릭");
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼2 클릭");
			}
		});
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("버튼3 클릭");
			}
		});
		
		// 화면상에 보이게 한다.
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new MyFrame();
		
	}
	
}
















