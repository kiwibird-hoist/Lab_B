package com.Day1;

public class Q6for {

	public static void main(String[] args) {
		
		// for三個敘述和內容的執行順序跟 js 一樣
		// 老師不會叫 for 為迴圈，而是稱 for敘述，因為他不只有迴圈
		// 宣告在哪裡，活在哪裡 => 變數的生命週期
		int i = 0;
		for ( printBrad() ; i<10 ; printLine() ) {
			System.out.println(i++);
		}
		//System.out.println("----");
		System.out.println(i);
	}
	
	// 因為跟物件無關，所以設static
	// 這就像是 js 的 function
	static void printBrad() {
		System.out.println("Brad");
		printLine();
	}
	static void printLine() {
		System.out.println("---");
	}
	
	// 未來要朝應用
	// 知道網際網路，例如通訊協定
	// 知道檔案IO和作業系統
	// 知道SQL，尤其要熟悉select的各種技巧；SQL能做到的工作，就不要讓Java做，否則效率只會變低

}
