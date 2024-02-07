package hw4;

public class Hw4_6 {
//	• 班上有8位同學,他們進行了6次考試結果如下:
//
//		請算出每位同學考最高分的次數
//		(提示:二維陣列)
	public static void main(String[] args) {
		int[][] s1 = new int[6][8];
		int a;
		s1[0] = new int[] {10,35,40,100,90,85,75,70};
		s1[1] = new int[] {37,75,77,89,64,75,70,95};
		s1[2] = new int[] {100,70,79,90,75,70,79,90};
		s1[3] = new int[] {77,95,70,89,60,75,85,89};
		s1[4] = new int[] {98,70,89,90,75,90,89,90};
		s1[5] = new int[] {90,80,100,75,50,20,99,75};
		int[] s2 = new int[8];
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 8; j ++) {
				a = 0;
				for(int x = 0; x < 8; x++) {
					if(s1[i][j] > s1[i][x]) {
						a += 1;
						if(a == 7) {
							s2[j] += 1;
						}
					}
				}
			}
		}
		System.out.println("學生一 :" + s2[0]);
		System.out.println("學生二 :" + s2[1]);
		System.out.println("學生三 :" + s2[2]);
		System.out.println("學生四 :" + s2[3]);
		System.out.println("學生五 :" + s2[4]);
		System.out.println("學生六 :" + s2[5]);
		System.out.println("學生七 :" + s2[6]);
		System.out.println("學生八 :" + s2[7]);
	}
 
}
