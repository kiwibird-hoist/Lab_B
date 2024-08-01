package com.Day1;

import java.util.Scanner;

public class Q5ifYear {

	public static void main(String[] args) {
		// 閏年
		// 公元年份非4的倍數，為365天平年。
		// 公元年份為4的倍數但非100的倍數，為366天閏年。
		// 公元年份為100的倍數但非400的倍數，（1700年、1800年及1900年）為平年。
		Scanner ScIn = new Scanner(System.in);
		System.out.print("想要查詢年份為：");
		int y = ScIn.nextInt();
		boolean tag;
		if ( y%4 == 0 ) {
			if ( y%100 == 0 ) {
				if ( y%400 == 0) {
					tag = true;
				}else {
					tag = false;
				}
			}else {
				tag = true;
			}
		}else {
			tag = false;
		}
		System.out.printf("%d年為%s年",y,tag?"閏":"平");
		
		// 網路有人會寫 if((year%4)==0 && (year%100)!=0 || (year%400) ==0) 一行解決
		// 但老師不喜歡，因為最多出現的判斷，上面老師寫的只要一次，但這一行解決的寫法卻要判斷兩次
		// code不是越短越好，效能才是重要的，再來是維護性高不高，以及擴展性的彈性

		// switch 跟 js 差異不了太多，乾脆不寫了，後面遇到再玩
	}

}
