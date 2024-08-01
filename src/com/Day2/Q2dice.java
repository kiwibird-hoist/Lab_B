package com.Day2;

public class Q2dice {

	public static void main(String[] args) {
		// 擲骰子100次，紀錄各點數出現次數，且不要使用陣列
		int p1, p2, p3, p4, p5, p6;
		p1 = p2 = p3 = p4 = p5 = p6 = 0;
		
		// 考慮到如果出現1~6以外的值，這就是出錯
		// 老師設置 default狀況，以及一個變數p0，來存取是否有異常數值出現的狀況
		int p0;
		p0 = 0;
		for (int i = 0; i < 100; i++) {
			int point = (int)(Math.random()*6)+1;
			switch ( point ) {
			case 1: p1++;	break;
			case 2: p2++;	break;
			case 3: p3++;	break;
			case 4: p4++;	break;
			case 5: p5++;	break;
			case 6: p6++;	break;
			default: p0++;
			}
		}
		if (p0 > 0 ) {
			System.out.println("Error");
		}else {
			System.out.println("點數一出現次數為："+p1);
			System.out.println("點數二出現次數為："+p2);
			System.out.println("點數三出現次數為："+p3);
			System.out.println("點數四出現次數為："+p4);
			System.out.println("點數五出現次數為："+p5);
			System.out.println("點數六出現次數為："+p6);
		}

		
	}

}
