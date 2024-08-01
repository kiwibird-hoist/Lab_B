package com.object;

public class Bike {
	
	// 9-1. Bike的建構式
	public Bike() {
		System.out.println("Bike物件()");
	}
	
	// 1. 設計一個 speed 變數為屬性
//	double speed;
	
	// 2. 給變數新增一個 public 修飾字
//	public double speed;
	
	// 4. 給變數換成一個 private 修飾字
//	private double speed;
	
	// 6. 給變數換成一個 protect 修飾字
	protected double speed;
	
	// 3. 設計給腳踏車使用的方法：加速、減速
	
	// 這個方法要給外面使用 -> 加上 public 
	// 這個方法不需要回傳值 -> 使用 void關鍵字
	public void upspeed() {
		speed += 4;			
		if ( speed > 10 ) {
			speed = 10;	
		}
	}
	public void downspeed() {
		speed -= 5;
		if ( speed < 0 ) {
			speed = 0;
		}
	}
	
	// 4. 要得到speed就透過方法
	public double getspeed() {
		return speed;
	}
	
	
}
