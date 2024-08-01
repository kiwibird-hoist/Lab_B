package com.Day1;

public class Q3type {

	public static void main(String[] args) {
		// float 、 double
		
		// 數值10 ，列印出來也是10.0
		float var1 = 10;
		System.out.println(var1);
		
		// Type mismatch: cannot convert from double to float
		// 輸入的數字會是 double型態，無法轉成 float型別
		// float var2 = 10.1;
		float var2 = 10.1f;
		double var3 = 10.1;
		
		// Java的 boolean 就是 True 或 False
		// 不像js是透過 0 或 非0
		boolean var4 = true;
		
		// Java的雙引號就是字串，單引號就是字元
		// 2^16 0~65535 ，字元沒有負數
		char c1 = 'a';
		char c2 = 97;
		char c3 = 65;
		char c4 = '資';
		System.out.printf("c1： "+c1+"\nc2: "+c2+"\nc3: "+c3+"\nc4:"+c4);
		
		// 此為 Java 的八大型別：整數四種、浮點數兩種、布林、字元
		

	}

}
