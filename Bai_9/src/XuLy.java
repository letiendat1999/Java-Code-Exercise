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
		int a[] = taoMang(n);
		xuatMang(a);
		int tong = tong(a);
		System.out.println("\nTrung bình cộng các số nguyên tố là: " + tong);

	}

	public static int tong(int a[]) {
		int sum = 0;
		int count = 0;
		int dem=0;
		for (int i = 0; i < a.length; i++) {
			if (soNguyenTo(a[i])) {
				sum += a[i];
				count++;

			}else {
				dem++;
			}
		}
		if(dem==a.length) {
			return 0;
		}else {
			sum /= count;
		}
		
		return sum;
	}

	public static boolean soNguyenTo(int n) {
		int count = 0;

		if (n < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					count++;
				}
			}
		}
		if (count == 0) {
			return true;
		} else {
			return false;
		}
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

	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		System.out.println("\nXuất mảng: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
	}

}
