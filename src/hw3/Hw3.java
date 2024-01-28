package hw3;

import java.util.Scanner;

public class Hw3 {
	public static void main(String[] args) {
//	• 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形,如圖示結果:(進階直角三角形)
	    int[] aq = new int[3];
		Scanner sc = new Scanner(System.in);
	    System.out.println("請輸入三個整數");
	    if(sc.hasNextInt()) {
	    aq[0] = sc.nextInt();
	    aq[1] = sc.nextInt();
	    aq[2] = sc.nextInt();
	    	
	    if (aq[0]*aq[1]*aq[2] != 0) {
	    	if (aq[0] == aq[1] && aq[1] == aq[2]) {
	    		System.out.println("正三角形");
	    	}
	    	else if (aq[0] == aq[1] || aq[1] == aq[2] || aq[0] == aq[2]) {
	    		System.out.println("等腰三角形");
	    	}else if(Math.pow(aq[0], 2)+Math.pow(aq[1], 2) == Math.pow(aq[2], 2)
	    			|| Math.pow(aq[1], 2) + Math.pow(aq[2], 2) == Math.pow(aq[0], 2)
	    			|| Math.pow(aq[0], 2) + Math.pow(aq[2], 2) == Math.pow(aq[1], 2)) {
	    		System.out.println("直角三角形");
	    	}else if ((aq[0] + aq[1]) > aq[2]
	    			&& (aq[1] + aq[2]) > aq[0]
	    			&& (aq[0] + aq[2] > aq[1])) {
	    		System.out.println("其它三角形");
	    	}else 
	    		System.out.println("不是三角形");
	      }	
	    }
	}
}
