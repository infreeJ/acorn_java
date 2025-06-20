package test.mypac;

public class MemberInfo {
	public int num;
	public String name;
	public String addr;
	
	public void printData() {
		String data = "번호:"+this.num+" 이름:"+this.name+" 주소:"+this.addr;
		System.out.println(data);
	}
}
