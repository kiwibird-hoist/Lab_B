package com.Day2;

public class Q5_1_poker {

	public static void main(String[] args) {
		// 撲克牌特性：52張無重複
		// 洗牌

		// v1.
		// 非本科的洗牌演算法
		// 1. 先製作一個0~51的亂數丟至poker陣列，重複到poker陣列滿為止
		// -> 數字會重複
		// 2. 用一個檢查機制去除重複的可能
		// 3. 設定對於重複與否的不同反應
		// 4. 看這段程式的消耗時間，實際上也快快的
		
		int[] poker = new int[52];
		
//		long start = System.currentTimeMillis();
//		for (int i = 0; i < poker.length; i++) {
//			int temp = (int) (Math.random() * 52);
//
//			// 檢查機制
//			boolean isRepeat = false;
//			for (int j = 0; j < i; j++) {
//				if (temp == poker[j]) {
//					// 重複了
//					isRepeat = true;
//					break;
//				}
//			}
//			if ( !isRepeat ) {
//				poker[i] = temp;
//				System.out.println(poker[i]);
//			}else {
//				i--;
//			}
//		}
//		
//		System.out.println("----------");
//		System.out.println(System.currentTimeMillis()-start);
		
		
		// v2.		
		// code review，程式太過醜陋噁心，來改善他
		// 使用 do-while，相較於while迴圈，保證先執行一次迴圈內容才開始while的條件判定

		
		// 把 isRepeat 和 temp 拉出來避免重複宣告
		long start = System.currentTimeMillis();
		boolean isRepeat;
		int temp;
		for (int i = 0; i < poker.length; i++) {
			
			do {
				temp = (int) (Math.random() * 52);
				// 檢查機制
				isRepeat = false;
				for (int j = 0; j < i; j++) {
					if (temp == poker[j]) {
						// 重複了
						isRepeat = true;
						break;
					}
				}
				
			} while ( isRepeat );

			poker[i] = temp;
			System.out.println(poker[i]);
		}
		System.out.println("----------");
		System.out.println(System.currentTimeMillis()-start);
		


		// 發牌

		// 攤牌 + 理排

	}

}
