package com.Day3;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Q2_contact extends JFrame{
	
	// 3. 製作按鈕
	private JButton btn1,btn2,btn3;
	
	// 2. 製作建構式
	public Q2_contact() {
		
		// 3.
		btn1 = new JButton("B1");
		btn2 = new JButton("B2");
		btn3 = new JButton("B3");
		
		// 4.
		setLayout(new FlowLayout());
		add(btn1);add(btn2);add(btn3);
		
		// 2.
		setSize( 640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		// 目標是設計出一個可被執行的視窗

		// 1. 製作一個物件實體，因為不是需要呼叫的，所以乾脆不賦值變數
		new Q2_contact();

	
	
	}

}
