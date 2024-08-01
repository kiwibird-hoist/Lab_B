package com.Day3;

import com.object.Bike;
import com.object.MytoString;

public class Q3_String {

	public static void main(String[] args) {
		
		// 1. api / java.lang / String
		// 可以注意到是寫public final class String，final代表為絕子絕孫，不會有其他類別來extends
		
		// 2. 使用第一個無參數建構式
		String s1 = new String();

		// 3.
		// String 和 陣列一樣，長度是固定的
		// 陣列是用 .length，以屬性來得知，因為建立時就知道
		// String 是用 .length()，以方法來得知，他是用一個一個算的
		System.out.println(s1.length());
		
		System.out.println("----------");
		// 4. 
		// s2是字串物件，bike是腳踏車物件，都是print物件，但出來不同的東西
		// 一般物件列出的是： package 下的 class 的物件實體在 @...的記憶體位置
		// 那為什麼字串可以印出內容呢?
		// 到object 的方法裡面可以看到	toString()
		// 回到String 的方法裡面又可以看到一樣的 toString()
		// 所以其實 String物件把這個方法給覆蓋了新功能
		byte[] b1 = { 97, 98, 99, 100};
		String s2 = new String(b1);
		System.out.println(s2.length());
		System.out.println(s2);
		System.out.println(new Bike());
		
		System.out.println("----------");
		// 5.
		// 新創一個 MytoString 物件，裡面 overwrite toString() 方法
		System.out.println(new MytoString());
		
		System.out.println(new Object());
		
		System.out.println("----------\n字串'=='");
		// 6.
		// 雙引號，會自動把他創建出來後放在一個特殊區域： String pool
		// 為了避免「重覆字串」在使用上的浪費
		// 這時存取的位置是指向字串池
		// 而 new 是指向在新創的記憶體位置
		// 以雙引號創造的內容會在字串池中比對，看是否有一樣的
		// 若一樣就直接引用，所以 s3 == s4
		// new則是在記憶體不同位置，所以 s5 != s4 、 s5 != s6
		String s3 = "Hi";
		System.out.println(s3);
		String s4 = "Hi";
		System.out.println(s3 == s4);
		String s5 = new String("Hi");
		String s6 = new String("Hi");
		System.out.println(s5 == s4);
		System.out.println(s5 == s6);
		
		System.out.println("----------\n'字串.equals'");
		// 7.
		// 但明明內容是一樣的，這樣怎麼辦呢?
		// object 的方法裡面的 	equals(obj)，其實在 String 的方法裡面重寫了
		System.out.println(s3.equals(s4));
		System.out.println(s5.equals(s4));
		System.out.println(s5.equals(s6));
	}

}
