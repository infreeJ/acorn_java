package test.main;

import test.mypac.MemberInfo;

public class MainClass10 {
	public static void main(String[] args) {
		MemberInfo m1 = new MemberInfo();
		MemberInfo m2 = new MemberInfo();
		MemberInfo m3 = new MemberInfo();
		
		m1.num = 2486;
		m1.name = "곽두팔";
		m1.addr = "시드니";
		
		m2.num = 3614;
		m2.name = "홍만식";
		m2.addr = "제주도";
		
		m3.num = 4715;
		m3.name = "신문철";
		m3.addr = "후쿠오카";
		
		m1.printData();
		m2.printData();
		m3.printData();
	}
}
