package com.Day1;

import java.util.Scanner;

public class Q2scanner {

	public static void main(String[] args) {
		// api -> java.util -> scanner,
		// 看底下的建構式Constructor
		
		// 除了system所在的java.lang以外，其他都要import
		// 打初頭幾個字後按下 alt+/ ，選擇後會自動import
		// 產生一個物件實體，使用 new 關鍵字
		
		// input
		Scanner ScIn = new Scanner(System.in);
		// console上面功能列最左邊有一個icon為terminate
		// 亮紅色代表程式運行中，無程式運行就變灰色
		int a = ScIn.nextInt();
		int b = ScIn.nextInt();
		System.out.println(a);
		System.out.println(b);
		
		// op..
		int ans1 = a+b;
		
		// output
		System.out.println(ans1);
		
		// 有了核心功能，重新修飾
		// print，不會換行
		// printf，格式化輸出
		// %d，十進位的
		// \n，換行
		System.out.print("x = ");
		int x = ScIn.nextInt();
		System.out.print("y = ");
		int y = ScIn.nextInt();
		int ans2 = x+y;
		System.out.printf("%d + %d = %d\n",x,y,ans2);
		
		// 題目、
		// 10+3=13、10-3=7、10*3=30、10/3=3...1
		System.out.print("數字一是：");
		int p1 = ScIn.nextInt();
		System.out.print("數字二是：");
		int p2 = ScIn.nextInt();
		System.out.printf("%d + %d = %d\n",p1,p2,p1+p2);
		System.out.printf("%d - %d = %d\n",p1,p2,p1-p2);
		System.out.printf("%d * %d = %d\n",p1,p2,p1*p2);
		System.out.printf("%d / %d = %d ... %d",p1,p2,p1/p2,p1%p2);
	
	
	}

}
