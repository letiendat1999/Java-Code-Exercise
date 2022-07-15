import java.util.Scanner;

public class XuLy {
	final static int MIN = -100;
	final static int MAX = 100;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		float a[] = taoMang(n);
		xuatMang(a);
		xoaMang(a);
		xuatMang(a);
		

	}

	public static void xoaMang(float a[]) {
		float max = a[0];
		int pos = 0;

		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
				pos = i;
			}
		}
		
		int n = a.length;
		if (pos < 0) {
			pos = 0;
		} else if (pos >= n) {
			pos = n - 1;
		}

		for (int i = pos; i < n - 1; i++) {
			a[i] = a[i + 1];
		}
		--n;
	}

	

	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}

		return a;
	}

	public static float[] taoMang(int n) {
		float a[] = new float[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (float) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void xuatMang(float a[]) {
		System.out.println("\nXuất mảng: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
	}
	
	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập n > 0 ");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 0);
		return n;
	}

}
