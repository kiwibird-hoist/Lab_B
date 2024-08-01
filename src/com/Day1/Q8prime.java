package com.Day1;

import java.util.Scanner;

public class Q8prime {

	public static void main(String[] args) {
		Scanner ScIn = new Scanner(System.in);
		System.out.print("想要查詢數字為：");
		int a = ScIn.nextInt();
		int f1=1;
		boolean tag = true;
		for (int i = 2; i < Math.sqrt(a); i++) {
			if ( a%i == 0 ) {
				tag = false;
				f1 = i;
			}
		}
		System.out.printf("%d 為%s\n",a,tag?"質數":"非質數");
		if ( tag == false ) {
			System.out.println("第一個非1因數為："+f1);
		}
		
		

	}

}
