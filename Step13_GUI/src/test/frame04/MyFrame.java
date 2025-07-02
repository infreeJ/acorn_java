package test.frame04;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	int num = 0;
	
	public MyFrame() {
		setTitle("나의 프레임");
		setBounds(100, 100, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
		setLayout(layout);
		JButton countBtn = new JButton("0");
		add(countBtn);
		setVisible(true);
		
		
		countBtn.addActionListener((e) -> {
			
			
//			String number = ++num + "";
			
			String number = String.valueOf(++num);
			
			countBtn.setText(number);
		});
	}
	public static void main(String[] args) {
		new MyFrame();
	}
	
}
