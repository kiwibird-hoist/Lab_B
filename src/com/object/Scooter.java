package com.object;

// 5. 使用 extends，代表 Scooter 要接替 Bike 發揚光大
public class Scooter extends Bike {
	
	// 7. 製作Scooter自己的屬性，也就是Bike沒有、Scooter才有換檔
	private int gear;
	// 7. 給屬性製作對應方法操作
	public void changeGear( int gear ) {
		// 使用的(if判斷式內的) gear變數，要參考最近的初始化，即參數的gear
		// 在Eclipse裡面，滑鼠點擊對應變數，會把相同變數做相同的背景顏色來提醒
		if ( gear>= 0 && gear<=3 ) {
			// 若想要指名使用本類別class內的變數，使用 this. 指名
			this.gear = gear;
		}
	}
	
	// 8. 建構式結構： public 類別名稱() { ... }
	// 可以設置多個建構式，差異在於參數的不同
	// 這種做法就是 overload
	// 不同於6.，那是重寫 override
	// 多載(overload) 是在一個類裡面，方法名字相同，而參數不同。
	// 後面會更詳細介紹 override 和 overload
	public Scooter() {
		// 9-1.
		System.out.println("Scooter物件()");
		gear = 0;
		color = "yellow";
	}
	public Scooter(String color) {
		// 9-1.
		System.out.println("Scooter物件(String)");
		gear = 0;
		this.color = color;
	}
	
	
	public String getcolor() {
		return color;
	}
	private String color;
	
	
	// 6. 用相同的方法名稱，更新了Bike的加速功能為Scooter自己的加速功能
	// 結果發現無法存取到 Bike的屬性speed!?
	// 因為使用是private修飾字，所以才存取不到，到Bike把它改成protected修飾字
	public void upspeed() {
		speed += 10*gear;			
		if ( speed > 100 ) {
			speed = 100;	
		}
	}
}
