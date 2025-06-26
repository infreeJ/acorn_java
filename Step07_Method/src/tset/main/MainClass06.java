package tset.main;

import test.myPac.ZzangGu;

/*
 *  ZzangGu 객체 3개를 생성해서 배열에 담고
 *  반복문으로 배열에 담긴 ZzangGu 객체의 dance() 메서드를 모두 호출하세요
 */

public class MainClass06 {
	public static void main(String[] args) {
		
		ZzangGu z1 = new ZzangGu();
		ZzangGu z2 = new ZzangGu();
		ZzangGu z3 = new ZzangGu();
		
		ZzangGu[] ZzangGus = {z1, z2, z3};
		
		for(int i = 0; i < ZzangGus.length; i++) {
			ZzangGus[i].dance();
		}
		
		
		for(ZzangGu tem : ZzangGus) {
			tem.dance();
		}
	}
}
