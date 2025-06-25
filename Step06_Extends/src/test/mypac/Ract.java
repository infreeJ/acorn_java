package test.mypac;

//Shape 클래스를 상속받아서
//rect(정사각형) 클래스를 만들어보세요

/*
* 아래의 코드가 동작할 수 있도록 new Rect(x 좌표, y 좌표, 한 변의 길이)
* Rect r1 = new Rect(100, 200, 50);
* r1.printArea(); // 사각형의 넓이가 출력되면 된다.
* r1.printInfo(); // 사각형의 좌표, 한 변의 길이가 출력되면 된다.
*/

public class Ract extends Shape{
	private int z;
	
	public Ract(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public void printArea() {
		System.out.println("넓이는 : "+ this.z*this.z);
	}
	
	@Override
		public void printInfo() {
			super.printInfo();
			System.out.println("한 변의 길이 : " + z);
		}
	
}
