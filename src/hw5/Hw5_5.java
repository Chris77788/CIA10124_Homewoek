package hw5;

public class Hw5_5 {
	public void genAuthCode() {
		String s1 = "asdfghjklqwertyuiopzxcvbnmASDFGHJKLQWERTYUIOPZXCVBNM1234567890";
		for(int i = 0; i < 8; i++) {
			System.out.print(s1.charAt((int)(Math.random()*62)));
		}
	}
	public static void main(String[] args) {
		Hw5_5 h1 = new Hw5_5();
		h1.genAuthCode();
	}

}
