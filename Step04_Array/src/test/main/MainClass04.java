package test.main;

import test.mypac.MemberInfo;

public class MainClass04 {
	public static void main(String[] args) {
		MemberInfo m1 = new MemberInfo();
		m1.num = 1;
		m1.name = "김구라";
		m1.addr = "노량진";
		
		MemberInfo m2 = new MemberInfo();
		m2.num = 2;
		m2.name = "해골";
		m2.addr = "행신동";
		
		MemberInfo m3 = new MemberInfo();
		m3.num = 3;
		m3.name = "원숭이";
		m3.addr = "동물원";
		
//		int[] nums = {m1.num, m2.num, m3.num};
//		String[] names = {m1.name, m2.name, m3.name};
//		String[] addrs = {m1.addr, m2.addr, m3.addr};
		
		MemberInfo[] mbInfo = {m1, m2, m3};
		
		
		MemberInfo[] mbInfo2 = new MemberInfo[3];
		mbInfo2[0] = m1;
		mbInfo2[1] = m2;
		mbInfo2[2] = m3;
	}
}
