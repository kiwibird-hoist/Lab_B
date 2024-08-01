package com.Day2;

import com.object.Bike;
import com.object.Scooter;

public class Q6_object {

	public static void main(String[] args) {
		
		// 物件導向
		//  │
		//  └ 類別 class ┬─ 屬性，物件的重點
		//           　　└─ 方法
		
		
		// 設計物件導向的腳踏車
		// 另外設計一個包，裡面放入腳踏車的屬性或方法
		
		// 1.
		// 想要玩腳踏車，所以就需要腳踏車這個物件
		// 打 Bi後使用alt /，應該就會看到剛剛創建的物件(public class)
		// 因為在不同package，上面也會多出一行import com.object.Bike;
		Bike mybike = new Bike();
		
		// 2.
		// 這時候打 mybike. ，卻發現清單裡面找不到 speed 可以選?
		// 因為剛剛設計的變數 double speed; ， 缺乏了修飾字
		// 回去Bike裡面給變數加上修飾字public
		System.out.println(mybike.getspeed());
		
		// 3.
		// 使用剛剛創建的加速、減速方法
		mybike.upspeed();
		mybike.upspeed();
		mybike.upspeed();
//		mybike.downspeed();
		System.out.println(mybike.getspeed());
		System.out.println("----------");
		
		// 4.
		// 但是這樣 Bike裡的速度是應該可以讓人隨意存取的嗎?
		// 使用者自己設定了9999 ，所以腳踏車就瞬間飆到9999 -> 明顯不應該
//		mybike.speed = 9999;
		// 到Bike裡面把屬性加上修飾字 private，使外面的使用者無法更動屬性
		// 識別字 private ，範圍就只有在本類別(class)中裡面才	能存取更改
		// 再創一個方法 getspeed() 來獲取 speed
		// 在現實生活、工作中，這就是 "封裝" 的概念
		// 屬性幾乎都不會讓設計者以外的人碰到
		// 外面的人只能依靠設計者設計的方法，對屬性造成變化
		// 所以設計者可以利用自己設計的，控制屬型只會在自己想要的範圍內變化
		
		// 5.
		// 現在，新創一個小摩托車Scooter物件
		// extends 擴展，代表 Scooter 要把 Bike 給發揚光大
		// 而這個發揚擴展的動作，剛好形成了 "繼承" 的概念
		// 可以使用Bike原本的功能
		Scooter s1 = new Scooter();
		s1.changeGear(1);
		s1.upspeed();
		s1.upspeed();
		s1.downspeed();
		System.out.println(s1.getspeed());
		// 6.
		// 但這樣只有以前的功能，哪來的改善或發揚光大呢?
		// 到Scooter裡面新增屬性方法，這裡我們新增一個同名的加速方法
		// 同名就會把原本 Bike的加速方法取代掉
		// 這就是 Scooter自己更新的加速方法，這就是發揚光大
		
		// 三種修飾字 + 無修飾字 的4個範圍
		// 大 	public		全部範圍
		// │	protected	子 + 相同package
		// ↓	[沒寫]		相同package
		// 小	private		class裡面
		// 這修飾字會用來使用 成員 member 和 建構子 constructor 
		// 建構後面會再說
		// 而類別，只有 public 和 沒寫，兩種而已
		
		// 7.
		// 第六點是製作屬於Scooter的加速方法(功能)
		// 現在來設計屬於Scooter的屬性
		// 我們就給他換檔
		System.out.println("----------\n換檔為0");
		s1.changeGear(2);
		s1.upspeed();
		s1.upspeed();
		System.out.println(s1.getspeed());
		
		// 8.
		// 建構式，就是物件的初始化動作
		// 建構式永遠不會有回傳值
		// 建構式不是產生物件實體，是在進行物件初始化
		// new才是產生物件實體
		System.out.println("----------\n獲得顏色");
		System.out.println(s1.getcolor());
		// 不同的參數使用到不同的建構式
		Scooter s2 = new Scooter("red");
		System.out.println(s2.getcolor());
		
	
	}

}
