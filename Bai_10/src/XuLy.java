import java.util.Scanner;

public class XuLy {
	final static int MIN = -1000;
	final static int MAX = 1000;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		float a[] = taoMang(n);
		xuatMang(a);
		System.out.println("\nNhập x = ");
		int x = Integer.parseInt(scan.nextLine());
		float tong = tong(a, x);
		System.out.println("\nTrung bình cộng các số nguyên tố là: " + tong);

	}

	public static float tong(float a[], int x) {
		float sum = 0;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > x) {
				sum += a[i];
				count++;
			}
		}
		if (count == 0) {
			return 0;
		} else {
			sum /= count;
		}

		return sum;
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập n > 2 ");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 2);
		return n;
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

}
