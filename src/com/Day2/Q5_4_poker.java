package com.Day2;

import java.util.ArrayList;
import java.util.Collections;

public class Q5_4_poker {

	public static void main(String[] args) {

		// v4.
		// 直接使用api
		// java.util / Collections / static void	shuffle(List<?> list)
		
		int nums = 52;
		ArrayList<Integer> poker = new ArrayList<Integer>();
		for (int i = 0; i < nums; i++) poker.add(i);
		Collections.shuffle(poker);
		
		for (Integer card : poker) {
			System.out.println(card);
		}

	}

}
