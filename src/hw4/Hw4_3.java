package hw4;

public class Hw4_3 {
//	• 有個字串陣列如下 (八大行星):
//	{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//	(提示:字元比對,String方法)
	public static void main(String[] args) {
		int A =0, E = 0, I = 0, O = 0, U = 0;
		String[] s1 = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		for(int i = 0; i < 8; i++) {
			int j = s1[i].length() - 1;
			while(j >= 0) {
				switch(s1[i].charAt(j)) {
				case 'a':
					A += 1;
					j--;
					break;
				case 'e':
					E += 1;
					j--;
					break;
				case 'i':
					I += 1;
					j--;
					break;
				case 'o':
					O += 1;
					j--;
					break;
				case 'u':
					U += 1;
					j--;
					break;
				default:
					j--;
					continue;
				}
			}
		}
		System.out.println("a =" + A + " " + "e =" + E + " " + "i =" + I + " " + "o =" + O + " " + "u =" + U);
		
	
	}

}
