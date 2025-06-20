package test.main;

import test.mypac.MemberInfo;

public class MainClass09 {
	public static void main(String[] args) {
		MemberInfo m1 = new MemberInfo();
		m1.num = 101;
		m1.name = "박두철";
		m1.addr = "월미도";
		
		m1.printData();
	}
}
