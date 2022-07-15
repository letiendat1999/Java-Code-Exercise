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
		int a[] = nhapMang(n, scan);
		xuatMang(a);
		inRa(a);

	}

	public static int timSoDauTien(int n) {
		int temp = Math.abs(n);
		int max;
		int count = 0;
		do {
			max = temp % 10;
			count++;
			if (count == 2) {
				break;
			}
		} while ((temp /= 10) > 0);
		return max;
	}

	public static void inRa(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (timSoDauTien(a[i]) == 5) {
				sum += a[i];
			}
		}
		System.out.println("\nTổng các chữ số đó là: " + sum);
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
