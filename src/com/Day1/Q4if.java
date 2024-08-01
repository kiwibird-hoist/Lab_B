package com.Day1;

public class Q4if {

	public static void main(String[] args) {
		
		// 因為上過js，所以語言一些基礎用法就跳過
		// 相對的，老師會著重於介紹語言差異的部分
		
		// api -> java.lang -> math -> 底下Method Summary，都有static
		// 和物件無關，直接使用
		// static double	random()，範圍為0<=數值<1，傳回的是double
		double temp = Math.random();
		
		// 使用 (int) 強制轉型；且為了避免轉型完才*101，需要把運算括起來
		// 這個運算的意義是：從0開始的101個數字
		// 如果以後程式有數字，希望大家都能夠把數字的意義搞清楚
		// 而不是只為了設置出當前狀況的數字
		int score = (int)(temp*101)+0	;		// 0~100
		System.out.println(score);
		if ( score >= 60 ) {
			System.out.println("pass");
		}else {
			System.out.println("Down");
		}
		// 先試著使用if巢狀結構
		// 看出 if 就是做一個二分法
		// 而 if 以前也學過，若只有一道敘述句，可以拿掉大括號
		// 逐一拿掉else的大括號，並排版
		// 就發現其實if else 是這樣變來的
		// 以後使用 if敘述時，因為程式逐一往下執行，最上面的判斷可以解決最多狀況
		System.out.print("評價標準為：");
//		if ( score >= 90 ) {
//			System.out.println("A");
//		}else {
//			if ( score >= 80 ) {
//				System.out.println("B");
//			}
//			else {
//				if ( score >= 70 ) {
//					System.out.println("C");
//				}
//				else {
//					if ( score >= 60 ) {
//						System.out.println("D");
//					}
//					else {
//						System.out.println("E");
//					}
//				}
//			}
//		}
		if ( score >= 90 ) {
			System.out.println("A");
		}else if ( score >= 80 ) {
			System.out.println("B");
		}
		else if ( score >= 70 ) {
			System.out.println("C");
		}
		else if ( score >= 60 ) {
			System.out.println("D");
		}
		else {
			System.out.println("E");
		}
	}

}
