package test.mypac;

import test.auto.Car;

public class MemberDto {
	private int num;
	private String name;
	private String addr;
	
	public MemberDto() {
		System.out.println("MemberDto 클래스의 생성자가 호출됨!");
	}
	
	public MemberDto(int num, String name, String addr) {
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}

	
