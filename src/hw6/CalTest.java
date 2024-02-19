package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) throws CalException {
		Scanner sc = new Scanner(System.in);

		int a = 0;
		while (a < 1) {

			try {

				int x, y;

				Calculator c2 = new Calculator();

				while (true) {
					System.out.println("請輸入x值");

					if (sc.hasNextInt()) {
						x = sc.nextInt();
						break;

					} else
						throw new IllegalArgumentException("格式不正確");

				}
				System.out.println("請輸入y值");
				y = sc.nextInt();

				c2.setY(y);
				if (y < 0)
					throw new ArithmeticException("次方為負值，結果回傳不為整數");

				Calculator c1 = new Calculator();
				c1.powerXY(x, y);
				a += 1;

			} catch (CalException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				sc.next();
				e.printStackTrace();

			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}
	}

}
