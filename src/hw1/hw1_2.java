package hw1;

public class hw1_2 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int i = 1;
	    int sum = 0;
		while (i <= 1000) {
			if(1000 % i == 0) {
			sum += i;
			}
			i++;
		}
		System.out.println(sum);
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int sumj = 1;
		for (int j = 1; j <= 10; j++)
			sumj *= j;
		System.out.println(sumj);
//		• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int x = 1;
		int sumx = 1;
		while (x <= 10) {
			sumx *= x;
			x++;
		}
		System.out.println(sumx);
//		• 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
		int y = 1;
		int sumy;
		while (y <= 10) {
			sumy = y * y;
			System.out.println(sumy);
			y++;
		}
			
		
	}

	


}
