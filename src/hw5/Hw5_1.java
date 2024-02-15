package hw5;

import java.util.Scanner;

public class Hw5_1 {
//	• 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
//	圖:
	public void starSquare(int w, int h) {
		for(int i = 0; i < h; i++) {
			for(int j = 0; j < w; j++)
				System.out.print("*");
			System.out.println(" ");
		}
	}
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int w, h;
		System.out.println("請輸入寬度");
		while(true) {
			w = s1.nextInt();
			if(w > 0)
				break;
			else
				System.out.println("資料錯誤");
		}
		System.out.println("請輸入高度");
		while(true) {
			h = s1.nextInt();
			if(h > 0)
				break;
			else
				System.out.println("資料錯誤");
		}
		Hw5_1 h1 = new Hw5_1();
		h1.starSquare(w, h);
		
		
		
	}
	

}


