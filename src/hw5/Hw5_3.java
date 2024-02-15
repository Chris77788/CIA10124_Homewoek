package hw5;

public class Hw5_3 {
	
	public int maxElement(int x[][]) {
		int max = 0;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				if(x[i][j] > max)
					max = x[i][j];
			}
		}
		return max;
	}
	public double maxElement(double x[][]) {
		double max = 0;
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				if(x[i][j] > max)
					max = x[i][j];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[][] ix = {
				{1, 6, 3},
				{9, 5, 2}
		};
		double[][] dx = {
				{1.2, 3.5, 2.2},
				{7.4, 2.1, 8.2}
		};
		Hw5_3 h = new Hw5_3();
		System.out.println(h.maxElement(ix));
		System.out.println(h.maxElement(dx));
	}

}
