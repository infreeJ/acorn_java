package test.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel{
	//필요한 필드 정의
	Image backImage, missImage;
	
	int unitX;
	int unitY;
	
	// 배경1, 2의 Y좌표
	int back1Y = 0, back2Y = -800;
	
	// Missile 객체를 누적시킬 ArrayList 객체
	List<Missile> missList = new ArrayList<>();
	
	// 드래곤 Image 객체를 저장할 배열 객체 미리 준비
	Image[] unitImgs = new Image[2];
	
	// 드래곤 이미지 인덱스
	int unitIndex = 0;
	
	// 메서드 호출 횟수를 누적할 필드
	int count;
	
	
	//생성자
	public GamePanel() {
		//무언가 준비 작업 ...
		
		// Panel 의 크기 설정  width:500, height:800
		setPreferredSize(new Dimension(500, 800));
		
		// src/images/unit1.png 파일의 위치를 URL 객체로 얻어내기 
		URL url=getClass().getResource("/images/unit1.png");
		
		// src/images/unit1.png 파일을 로딩해서 Image 객체로 만들기
//		unitImage = new ImageIcon(url).getImage();
		unitImgs[0] = new ImageIcon(getClass().getResource("/images/unit1.png")).getImage();
		unitImgs[1] = new ImageIcon(getClass().getResource("/images/unit2.png")).getImage();
		
		backImage = new ImageIcon(getClass().getResource("/images/backbg.png")).getImage();
		missImage = new ImageIcon(getClass().getResource("/images/mi2.png")).getImage();

		

		
		// 마우스 움직임을 처리하기 위한 code
		MouseMotionAdapter adapter = new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				unitX = e.getX();
				unitY = e.getY();
				
			}
		};
		// Panel 위에서 마우스 움직임 처리
		addMouseMotionListener(adapter);
		
		// panel이 포커스를 받을 수 있도록(key event 처리를 위해)
		setFocusable(true);
		requestFocusInWindow();
		
		// 키보드 입력 처리
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				// Missile 객체를 생성해서 현재 unit의 좌표에 담은 다음 List에 누적시키기
				Missile m = new Missile(unitX, unitY);
				missList.add(m);
			}
		});
		
		// panel이 10/1000초마다 다시 그려지게 하기 위한 타이머 설정
		Timer timer = new Timer(10, (e) -> {
			// panel 객체의 repaint() 메서드 호출(결과적으로 paintComponent() 메서드가 다시 호출된다.
			repaint();
		});
		timer.start();
	}
	
	// Panel 에 무언가를 그릴때 호출되는 메소드 
	// Panel 이 초기화 될때 한번 호출되고 그다음에는 repaint() 라는 메소드가 호출될때 마다 다시 호출된다.
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// 메서드 호출 시 카운트 증가 시키기
		count++;
		
		// 배경 이미지 그리기
		g.drawImage(backImage, 0, back1Y, 500, 800, this);
		g.drawImage(backImage, 0, back2Y, 500, 800, this);
		
		// 반복문 돌면서 미사일 이미지 그리기
		for(int i = 0; i < missList.size(); i++) {
			Missile tmp = missList.get(i);
			g.drawImage(missImage, tmp.getX()-15, tmp.getY()-20, 30, 40, this);
		}
		
		g.setColor(Color.YELLOW);
		g.drawString("Missile:"+missList.size(), 10, 20);
		
		if(count % 30 == 0) {
			unitIndex++;
			if(unitIndex == 2) {
				unitIndex = 0;
			}
		}
		
		
		
		// 모든 미사일의 y좌표를 감소시켜서 미사일이 위로 이동하도록 한다.
		for(Missile tmp : missList) {
			// 현재 y 좌표에서 10 감소시킨 값을 얻어내서
			int resultY = tmp.getY()-10;
			// 해당 객체에 다시 넣어준다.
			tmp.setY(resultY);
			// 만일 위쪽으로 화면을 벗어난 미사일 객체라면
			if(tmp.getY() <= -20) {
				tmp.setRemove(true);
			}
		}
		
		// List에서 제거할 missile 객체는 제거한다.
		for(int i = 0; i<missList.size(); i++) {
			// i번째 Missile 객체
			Missile tmp = missList.get(i);
			// 만일 i 번쨰 미사일 객체가 제거할 대상이라면
			if(tmp.isRemove()) {
				missList.remove(i);
				
				System.out.println(missList.size());
			}
		}
		
		//메소드의 매개변수에 전달되는 Graphics 객체를 Panel 에 그림을 그릴수 있는 도구이다.
		// 현재 마우스의 위치값을 실시간으로 그리고 있다.
		g.drawImage(unitImgs[unitIndex], unitX-50, unitY-50, 100, 100, this);
		back1Y += 2;
		back2Y += 2;
		if(back1Y >= 800) {
			back1Y -= 1600;
		}
		if(back2Y >= 800) {
			back2Y -= 1600;
		}
	}
}



















