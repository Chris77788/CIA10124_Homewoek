package hw1;

public class hw1_1 {
	public static void main(String[] args) {
//		請設計一隻Java程式,計算12,6這兩個數值的和與積
		int x = 12, y = 6;
		System.out.println(x + "+" + y + "=" + (x + y));
		System.out.println(x + "*" + y + "=" + x * y);
//		• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int eggs = 200 / 12;
		int egg = 200 % 12;
		System.out.println(eggs + "打" + egg + "顆");
//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int day = 256559 / 86400;
		int hour = 256559 / 3600;
		int minute = 256559 / 60;
		int second = 256559;
		System.out.println(day + "天" + hour + "時" + minute + "分" + second + "秒");
//		• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		int ax = 5;
		double cn = ax * ax * PI;
		double cm = (ax * 2) * PI;
		System.out.println("圓面積" + "=" + cn);
		System.out.println("圓周長" + "=" + cm);
//		• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)
		int bn = 1500000;
		double  bi = 1.02;
		for (int yr = 1; yr <= 10; yr++)
			bn *= bi;
		System.out.println(bn);
//		• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
		System.out.println("5" + "+" + "5");
		System.out.println("5" + "+" + "'5'");
		System.out.println("5" + "+" + '\"' + "5" +'\"');
		
			
					 
		
			
	}

}
