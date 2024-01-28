package hw3;

import java.util.Scanner;

public class Hw3_2 {
	public static void main(String[] args) {
//		• 請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
		
		int i = (int)(Math.random()*10);
		int[] j = new int[] {0,1,2,3,4,5,6,7,8,9,10};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧");
		while(true) {
		if (sc.hasNextInt()) {
			j[0] = sc.nextInt();
			if (j[0] == i) {
				System.out.println("正確");
				break;
			}else
				System.out.println("猜錯了");
		  }
		}
		System.out.println("====================進階");
		
		int x = (int)(Math.random()*101);
		int y;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("開始猜數字吧");
		while(true) {
		if(sc2.hasNextInt()) {
			y = sc2.nextInt();
			if (y == x) {
				System.out.println("正確");
				break;
			}else if(y > x) {
				System.out.println("大於正確答案");
			}else if(y < x) {
				System.out.println("小於正確答案");
			}
		}
		
		
		}

	}

	
}
