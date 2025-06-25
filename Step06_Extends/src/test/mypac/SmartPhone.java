package test.mypac;

public class SmartPhone extends HandPhone{
	public SmartPhone() {
		System.out.println("SmartPhone() 생성자 호출됨");
	}
	
	public void doInternet() {
		System.out.println("인터넷을 해요!");
	}
	@Override // 재정의한 메서드임을 표시하는 어노테이션, 생략이 가능하지만 보통 생략하지 않는다.
	public void takePicture() {
//		super.takePicture();
		System.out.println("1억 화소의 사진을 찍어요~");
	}
	
}
