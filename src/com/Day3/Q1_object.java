package com.Day3;

import com.object.Car;
import com.object.Scooter;

public class Q1_object {

	public static void main(String[] args) {
			
		// 9-1.
		// 所以現在知道了，new後面的其實就是物件的建構式
		// 用new產生實體後，使用後面的建構式初始化
		// 但以前我們產生Bike時
		// Bike mybike = new Bike();
		// 我們沒有建立 Bike() 建構式?
		// 另外，若Scooter裡面使用到 super.方法()
		// 沒有建立Bike物件，只有建立Scooter物件，但Scooter還是可以使用 super叫出來?
		
		// 現在我們到Bike製作一個建構式
		// 到Scooter給兩個建構式加上sysout
		// 製作一個Car類別，除了extends Scooter以外內容什麼都不要放
		Car myCar = new Car();
		// 會呼叫 Bike物件() 和 Scooter物件()
		// 所以
		// 當物件建立後，祖孫八代都在
		// 所以從不會說 Java效能很好
		
		
		// 9-2.
		// 註解掉Scooter物件的空參數建構式
		// Scooter s1 = new Scooter(); 和 Car 都會跳錯
		// 註解掉Scooter物件的String參數建構式
		// Scooter s2 = new Scooter("red"); 只有她會跳錯
		
		// **在 Java裡面，所有的類別class一定都會有建構式
		// **只差在你有沒有定義他
		// 如果你沒定義，且有extends，編譯器就會送父母的"無參數的建構式"給你使用
		// 如果你有定義，無論是無參數、單參數、...，只要有一個建構式
		// **建構式第一道敘述句要呼叫父母的建構式(Java的規定)
		// **系統會隱含 super()
		// 若你自己打 super 來呼叫父母，就一定要放在第一行
		
		// 若沒有使用 extends 其他父母類別
		// 系統會隱含一個 extends Object
		// api / java.lang / object
		// 可以看到有自己的建構式 object()
		
		// java.lang.Object -> Java裡面所有的源頭，Java的天父
		// **關鍵整理
		// 1. 所有類別一定有建構式
		//	  ->如果你沒有，編譯器會從父母那裏拿一個無參數的給你使用
		// 2. 建構式	a.祖先全部完成初始化
		//			  ->依靠super()
		//			b.自己初始化
		System.out.println("-------");
		Car myCar2 = new Car("");
		
		
	}

}
