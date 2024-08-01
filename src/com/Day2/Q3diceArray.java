package com.Day2;

import java.util.Iterator;

public class Q3diceArray {

	public static void main(String[] args) {
		// 擲骰子100次，紀錄各點數出現次數
		// 改成陣列版

		// 可兩句縮減成一句
//		int[] p;
//		p = new int[100];
		int[] p = new int[7];

		for (int i = 0; i < 100; i++) {
			// 老師表示，實際上做遊戲，為了賺錢和利益，不會完全公平
			// 這裡就要給 4、5、6 加鉛
			// 實際骰子會骰到1~9，而7~9會對應到4~6
			int point = (int) (Math.random() * 9) + 1;

			if (point >= 1 && point <= 9) {
				p[point > 6 ? point - 3 : point]++;
			} else {
				p[0]++;
			}

		}

		if (p[0] > 0) {
			System.out.println("Error");
		} else {
			for (int i = 1; i < p.length; i++) {
				System.out.printf("%d出現了 %d 次\n", i, p[i]);
			}
		}

		if (p[0] == 0) {
			for (int i = 1; i < p.length; i++) {
				System.out.printf("%d出現了 %d 次\n", i, p[i]);
			}
		} else {
			System.out.println("Error");
		}

	}

}
