package hw5;

public class Hw5_2 {
//	• 請設計一個方法為randAvg(),
//	從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
	public void randAvg() {
		double sum = 0;
		System.out.println("本次亂數結果:");
		for(int i = 0; i < 10; i++) {
			int j = (int)(Math.random()*101);
			System.out.print(j + " ");
			sum += j;
		}
		System.out.println("");
		double avg = sum / 10;
		System.out.println(avg);
	}
	public static void main(String[] args) {
		Hw5_2 h1 = new Hw5_2();
		h1.randAvg();
	}

}
