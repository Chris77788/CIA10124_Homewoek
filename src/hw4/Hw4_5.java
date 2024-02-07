package hw4;

import java.util.Scanner;

public class Hw4_5 {
//	• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//
//	例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//
//	(提示1:Scanner,陣列)
//	(提示2:需將閏年條件加入)
//	(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入日期");

		int s1, s2, s3;
		int[] a1 = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int[] a2 = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("請輸入年分");
		s1 = sc.nextInt();
		System.out.println("請輸入月份");
		while (true) {
			s2 = sc.nextInt();
			if (s2 > 12) {
				System.out.println("資料有誤");
				continue;
			} else
				break;
		}
        
		System.out.println("請輸入日期");
		int m1 = s2 - 1;
		while (true) {

			s3 = sc.nextInt();
			if (s1 % 4 == 0) {
				if (s3 > a1[m1]) {
					System.out.println("資料有誤");
					continue;
				} else
					break;
			} else 
				if (s3 > a2[m1]) {
				System.out.println("資料有誤");
				continue;

			} else
				break;

		}

		int total = 0;
		if (s1 % 4 == 0) {
			for (int i = 0; i < m1; i++) {
				total += a1[i];
			}
		} else
			for (int j = 0; j < m1; j++) {
				total += a2[j];
			}

		total += s3;
		System.out.println("總天數:" + total);


	}

}
