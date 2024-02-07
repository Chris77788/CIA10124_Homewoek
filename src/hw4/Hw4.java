package hw4;

public class Hw4 {
//	• 有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	(提示:陣列,length屬性)
	public static void main(String[] args) {
		int[] a1 = {29 , 100, 39, 41, 50, 8, 66, 77, 95, 15};
		double sum = 0;
		for(int i = 0; i < a1.length; i++) {
			sum += a1[i];
		}
		double avg = sum / a1.length;
		System.out.println("平均 =" + avg);
		int j = 0;
		while(j < 10) {
			if(a1[j] >= avg) {
			System.out.println(a1[j]);
			j++;
			}else j++;
		}
	}


}
