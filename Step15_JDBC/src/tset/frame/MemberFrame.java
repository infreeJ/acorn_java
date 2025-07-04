package tset.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MemberFrame extends JFrame{
	//필요한 필드 정의하기
	JTextField inputName, inputAddr;
	// 표 형식으로 정보를 출력할 UI
	JTable table;
	// JTable에 정보를 출력할 data를 곡급해줄 모델 객체
	DefaultTableModel model;
	MemberDao dao = new MemberDao();
	
	//생성자
	public MemberFrame() {
		var dto = new MemberDto();
		//레이아웃 설정
		setLayout(new BorderLayout());
		//JLable 2개
		JLabel label1=new JLabel("이름");
		JLabel label2=new JLabel("주소");
		//JTextField 1개
		inputName=new JTextField(10);
		inputAddr=new JTextField(10);
		// JButton
		JButton insertBtn = new JButton("저장");
		JButton deleteBtn = new JButton("삭제");
		
		// 버튼의 동작
		insertBtn.addActionListener((e) -> {
			// 입력한 이름과 주소를 읽어와서
			var name = inputName.getText();
			var addr = inputAddr.getText();
			// MemberDto 객체에 이름과 주소를 담는다
			
			dto.setName(name);
			dto.setAddr(addr);
			
			
			var isSuccess = dao.insert(dto);
			if(isSuccess) {
				// this는 나의 참조값 (나 => MemberFrame 객체 => Conponent type이기도 하다)
				JOptionPane.showMessageDialog(this, "추가했습니다");
			} else {
				JOptionPane.showMessageDialog(this, "추가 실패");
			}
		});
		
		// 삭제 버튼을 눌렀을 때 실행할 함수 등록
		deleteBtn.addActionListener((e) -> {
			// 선택된 row의 index 값을 읽어온다.
			int selectedRow = table.getSelectedRow();
			// 선택된 row가 없다면
			if(selectedRow == -1) {
				JOptionPane.showMessageDialog(this, "삭제할 row를 선택해주세요");
				return; // 메서드를 종료
			}
			// 삭제할 회원의 번호를 읽어와서
			int deleteNum = (int)model.getValueAt(selectedRow, 0);
			boolean isSuccess = dao.deleteByNum(deleteNum);
			// 다시 selectAll
			printMember();
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "삭제 성공");
			} else {
				JOptionPane.showMessageDialog(this, "삭제 실패");
			}
			
			// DB에서 삭제한다
		});
		//페널에 UI 배치
		JPanel panel=new JPanel();
		panel.add(label1);
		panel.add(inputName);
		panel.add(label2);
		panel.add(inputAddr);
		panel.add(insertBtn);
		panel.add(deleteBtn);
		//페널의 배경색 설정 
		panel.setBackground(Color.orange);
		//페널을 프레임의 위쪽에 배치
		add(panel, BorderLayout.NORTH);
		inputName.getText();
		
		// 회원목록을 출력할 테이블
		table = new JTable();
		// 테이블의 칼럼명을 배열로 미리 준비한다.
		String[] colNames = {"번호", "이름", "주소"};
		// 테이블에 연결할 모델 객체
		model = new DefaultTableModel();
		// 모델에 칼럼명을 전달한다.
		model.setColumnIdentifiers(colNames);
		model.setRowCount(0); // 처음에는 row가 없도록
		// 모델을 테이블에 연결
		table.setModel(model);
		// row가 많은 경우 스크롤이 가능하도록 테이블에 scroll 기능을 부여
		JScrollPane scroll = new JScrollPane(table);
		// 테이블을 품고 있는 JScrollpane을 프레임의 가운데에 배치하기
		add(scroll, BorderLayout.CENTER);
		
		
		
		// sample data를 table에 출력하기
//		Object[] row1 = {10, "sample name", "sample addr"};
//		model.addRow(row1);
		// MemberDao 객체를 이용해서 회원목록을 얻어온 다음 실제 회원 목록을 table에 반복문 돌면서 출력
		printMember();
	}

	
	// 회원 목록을 출력하는 메서드
	public void printMember() {
		// 기존에 출력된 내용을 모두 삭제하고
		model.setRowCount(0);
		List<MemberDto> list = dao.selectAll();
		for(MemberDto tmp:list) {
			// MemberDto 객체 하나당 하나의 Object[]를 만들어서
			Object[] row = {tmp.getNum(), tmp.getName(), tmp.getAddr()};
			// 추가하기
			model.addRow(row);
			
			table.setModel(model);
			table.getTableHeader().setFont(new Font("Sans-serif", Font.BOLD, 18)); 
			table.setFont(new Font("Sans-serif", Font.PLAIN, 16)); // 데이터 글자 크기 14
			table.setRowHeight(25); // 각 행의 높이를 조정
		}
	}
	
	public static void main(String[] args) {
		MemberFrame f=new MemberFrame();
		f.setTitle("회원 정보");
		f.setBounds(100, 100, 800, 500);
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}



















