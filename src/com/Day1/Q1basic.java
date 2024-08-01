package com.Day1;

public class Q1basic {

	public static void main(String[] args) {
		// 整數：byte ,short ,int ,long
		byte var1;	// 2^8 => -128~127
		// Type mismatch: cannot convert from int to byte
		// 錯誤訊息：無法把int轉成byte型別
		// var1 = -185;
		
		// Duplicate local variable var1
		// 錯誤訊息：重複宣告
		// byte var1;
		
		// Java 變數命名規則
		// 區分大小寫、不能使用保留字
		// [a-zA-z$_][a-zA-Z0-9$_]*
		// 正規表示法，中括號表示從內取一[]，米字號表示不限數量取用*
		// 雖然開頭使用$、_ 合法，但不要使用，會有特殊用途
		byte $_$ = 7;
		System.out.println($_$);
		
		// 跳黃底線是提醒，這裡是提醒你未使用變數
		// 2^16 => 
		short var3 = 1000;
		// 2^32
		int var4 = 123;
		// 2^64
		long var5 = 456;
		
		// 平常最常見 int，避免換來換去
		// 第二常使用 byte，用於網路資料傳遞
	}

}
