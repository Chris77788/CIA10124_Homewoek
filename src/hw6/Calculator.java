package hw6;

public class Calculator {
	private int x;
	private int y;

	public Calculator() {
	}

	public Calculator(int x, int y) throws CalException {
		this.x = x;
		setY(y);
	}

	public int getY() {
		return y;
	}

	public void setY(int y) throws CalException {
		if (x == 0) {
			if (y == 0)
				throw new CalException("0的0次方沒有意義");
			else
				this.y = y;
		} else
			this.y = y;
	}

	public void powerXY(int x, int y) {
		double z = Math.pow(x, y);
		System.out.println(x + "的" + y + "次方等於" + z);
	}

}
