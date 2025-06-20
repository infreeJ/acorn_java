package test.auto;

// class의 역할

// 1. 객체의 설계도 역할
// - 객체는 heap 영역(사물함)에 들어 있는 물건이라고 생각하면 된다.
// - class를 이용해서 객체를 원하는 시점에 원하는 갯수만큼 만들어낼 수 있다.
// - 만들어진 객체가 어떤 저장소와 어떤 기능을 가지게 할지 class로 설계할 수 있다.

// 2. data type 역할

// 3. static 필드와 메소드를 포함하는 역할

public class Car {
	public String name;
	public void drive() {
		System.out.println(this.name+"이(가) 달려요!");
	}
}
