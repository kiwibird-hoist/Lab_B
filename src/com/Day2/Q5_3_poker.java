package com.Day2;

import java.util.Arrays;

public class Q5_3_poker {
	public static void main(String[] args) {

		// v3.
		// Fisher–Yates shuffle 洗牌演算法
		// nums為洗牌的牌數量
		final int nums = 52;
		int[] poker = new int[nums];

		long start = System.currentTimeMillis();
		// 給
		for (int i = 0; i < poker.length; i++) {
			poker[i] = i;
		}
		int temp;
		for (int i = nums - 1; i >= 0; i--) {

			// poker[隨機] <-> poker[最後一張]
			// 隨機數產生範圍為 0~末(n)、0~末-1(n-1)；對應*n+1、(n-1)+1
			// 若寫成Math.random() * i：這樣最後一格永遠必定會動
			int exchange = (int) (Math.random() * (i + 1));
			temp = poker[i];
			poker[i] = poker[exchange];
			poker[exchange] = temp;

		}
		for (int card : poker) {
			System.out.println(card);
		}
		System.out.println("----------");
		System.out.println(System.currentTimeMillis() - start);
		System.out.println("----------");

		// 開始發牌

		// 二維陣列，第一個代表玩家數，第二個代表每個玩家被發到牌數
		int[][] players = new int[4][13];
		for (int i = 0; i < nums; i++) {

			// 正常發牌 -> 每位玩家發一張牌後，再新發一輪每人一張，持續到牌發完
			// 解決下面這行的兩個問號，就等於發牌完成了
//			players[?][?] = poker[i];

			// 發給哪一位玩家? -> 牌數除於玩家數的餘數
			// 發給玩家的是第幾張牌? -> 牌數除於玩家數的商數
			players[i % 4][i / 4] = poker[i];
		}

		// 攤牌
		// 把每個玩家的牌列成一列
		// 四個玩家有四個橫列
//		for (int[] player : players) {
//			for (int card : player) {
//				System.out.print(card+"\t");
//			}
//			System.out.println();
//		}

		// 理牌
		// 需要先定義出牌的特性：
		// │ 黑桃 │ 紅心 │ 方塊 │ 梅花 │
		// │ 0 1 2 ... 12 │ 13 14 ... 25 │ 26 27 ... 38 │ 39 40 ... 51 │
		// │ A 1 2 ... K  │ A 1 ... K    │ A 1 ... K    │ A 1 ... K    │
		String[] suit = { "黑桃", "紅心", "方塊", "梅花" };
		String[] val = { "A ", "2 ", "3 ", "4 ", "5 ", "6 ", "7 ", "8 ", "9 ", "10", "J ", "Q ", "K " };

//		for (int[] player : players) {
//
//			// 直接使用 api / java.util / Arrays.sort
//			Arrays.sort( player );
//
//			for (int card : player) {
//				
//				System.out.printf("%s%s  ",suit[card/13],val[card%13]);
//			}
//			System.out.println();
//		}
		for (int[] player : players) {

			// 直接使用 api / java.util / Arrays.sort
			Arrays.sort(player);

			for (int card : player) {
				
				System.out.printf("%s%s  ", suit[card % 4], val[card / 4]);
			}
			System.out.println();
		}

	}
}
