package com.Day1;

public class Q7multiple99 {

	public static void main(String[] args) {
		// 命令列就像印表機，一行一行輸出，不會回頭的
		// 寫 code要依照順序
		// 1. 輸出第一列 2*1=2	3*1=3	4*1=4	5*1=5，有四個(行)數字
		// 2. 發現中間變化固定，使用for來輸出
		// 3. 輸出第一列9次(*1~*9)，一樣可以使用for
		// 4. 沒有換行就自己加換行
		// 5. 現在要重複一段，只是從2345變成6789的乘法，用for
		// 6-1. 控制2~5變成6~9，改變起始位置，是由i控制，i的變化從何而來? 因為一行有"4個"數字的乘法
		// 6-2. 給i做變化，每次變化為+4，變化的控制又是從k而來
		// 6-3. 自創newi來取代原本的 i
		// 7-1. 無法更改的常數，加上final
		// 7-2. 讓乘法表限於9，代表要更多次新的一行新的+4，把新增行數也設成變數ROWS
		// 7-3. 用新的變數ROWS取代原本段數控制的上限
		// 8-1. 開始取代其他變數 -> k=0，起始不重要，注意和條件的距離
		//		            -> j=1 和 j=9，九九乘法表為*1~9，不需要額外設置
		// 					-> i=2 為乘法表的起始數字，有的為1有的為2，是可以管理的 -> 設置變數 START
		//					-> i<6 為乘法表第一列的結尾數字，是起始數字+行個數，一列幾行數字能被控制 -> 設置變數 COLS
		
		final int ROWS = 5;
		final int COLS = 4;
		final int START = 2;

		for (int k = 0; k < ROWS; k++) {
			for (int j = 1; j <= 9; j++) {
				for (int i = START; i < COLS+START; i++) {
					int newi = i + COLS*k;
					int product = newi*j;
					System.out.printf("%d * %d = %d\t",newi,j,product);
				}
				System.out.println();
			}
			System.out.println("-----------");
		}
		
		

	}

}
