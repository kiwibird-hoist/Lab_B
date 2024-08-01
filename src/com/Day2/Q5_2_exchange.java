package com.Day2;

public class Q5_2_exchange {

	public static void main(String[] args) {
		int a = 10 , b = 3;
		
		// 使用第三個變數
//		int temp = a;
//		a = b;
//		b= temp;
		
		// 使用數學 (限制整數)
//		a = a + b;	// a = 13
//		b = a - b; 	// b = 10
//		a = a - b;	// a = 3
		
		// 使用xor  a=110 	b=011
		a = a ^ b;	// a=101
		b = a ^ b;	// b=110
		a = a ^ b;	// a=011
		
		System.out.printf("a = %d, b = %d",a,b);

	}

}
