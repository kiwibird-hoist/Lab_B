package com.Day2;

public class Q1array {

	public static void main(String[] args) {
		// 陣列也是強型別
		// Java陣列比較特殊，一旦宣告陣列內的元素個數，之後一定要剛好
		// 不能多也不能少
		// 除了昨天說的八大基本型別，可以直接給值
		// 其他都是物件，包括 Scanner、現在要寫的陣列，甚至連字串也是
		
		// 第一次給值就是初始化
		// 任何一個變數沒有初始化就存取，就會報錯
		// The local variable a may not have been initialized
//		int a;
//		System.out.println(a);
		
		// Java 陣列的初始化 -> 配置元素個數
		// 整數都是0、浮點數是0.0、浮點數是false、字元是\u0000
		
		// int陣列初始化後已經有int值：0
		int[] ary1;
		// new的時候在記憶體配置連續三個int空間，第一個空間在記憶體的起始位置就丟到ary1
		ary1 = new int[3];
		// 看中括號內的數字，決定有幾個偏移量。這也是陣列從0開始的原因。
		System.out.println(ary1[0]);
		System.out.println(ary1[1]);
		System.out.println(ary1[2]);
		System.out.println("-------\nbyte");
		
		byte[] ary2;
		ary2 = new byte[3];
		System.out.println(ary2[0]);
		System.out.println("-------\nshort");
		short[] ary3;
		ary3 = new short[3];
		System.out.println(ary3[0]);
		System.out.println("-------\nlong");
		long[] ary4;
		ary4 = new long[3];
		System.out.println(ary4[0]);
		System.out.println("-------\nfloat");
		float[] ary5;
		ary5 = new float[3];
		System.out.println(ary5[0]);
		System.out.println("-------\ndouble");
		double[] ary6;
		ary6 = new double[3];
		System.out.println(ary6[0]);
		System.out.println("-------\nboolean");
		boolean[] ary7;
		ary7 = new boolean[3];
		System.out.println(ary7[0]);
		System.out.println("-------\nchar");
		char[] ary8;
		ary8 = new char[3];
		System.out.println(ary8[0]);
		System.out.println("-------");
		
		// 使用.length得知陣列長度
		System.out.println(ary1.length);
		System.out.println("-------");
		// 編譯時的錯誤：compiler error
		// 執行時的例外：runtime exception
		
		// 陣列內的數字只要 >= 0 ，編譯就不會報錯
		ary1[1] = 100;
		ary1[2] = 123;
//		ary1[3] = 44;
		// for 敘述句來尋訪陣列
		for (int i = 0; i < ary1.length; i++) {
			System.out.println(ary1[i]);
		}
		System.out.println("-------");
		// 元素型別變數
		for (int c : ary1) {
			System.out.println(c);
		}
		

	}

}
