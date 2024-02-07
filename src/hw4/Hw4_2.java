package hw4;

import java.util.Scanner;

public class Hw4_2 {
//	• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
//	(提示:String方法,陣列)

	public static void main(String[] args) {

		int i;
		String x;
		Scanner name = new Scanner(System.in);
		System.out.println("請輸入文字");
		
		x = name.nextLine();
		i = x.length() - 1;
		while(i >= 0) {
			System.out.print(x.charAt(i));
			i--;
		}
	}

}
