package hw3;

import java.util.Scanner;

public class Hw3_3 {
	public static void main(String[] args) {
//• 阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
		
		int x, i, j;
		int total = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入討厭的數字");
		x = sc.nextInt();
		
		for (i = 0; i < 5; i++) {
			if(i == x) {
				continue;
			}else
				for(j = 0; j < 10; j ++) {
					if(j == x) {
						continue;
					}
					else if(i == 0 && j != 0) {
						System.out.print("\t" + j);
						total += 1;
					}
					else if(i != 0) {
						System.out.print("\t" + i + j );
						total += 1;
					}
				}
			System.out.println();
			
		}
		System.out.print("Total =" + total);
	
	

			

       
      
      
		

	}

}
