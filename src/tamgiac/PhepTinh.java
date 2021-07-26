package tamgiac;

public class PhepTinh {
	public int cong(int a, int b) {
		return a + b;
	}

	public int tru(int a, int b) {
		return a - b;
	}

	public int nhan(int a, int b) {
		return a * b;
	}
	
	public int chia(int a, int b) {
		return a / b;
	}
	public static void main(String args[]) {
		PhepTinh f = new PhepTinh();
		System.out.println(f.cong(5, 2));
		System.out.println(f.cong(4, 7));
		System.out.println(f.cong(6, 5));
	}
}
