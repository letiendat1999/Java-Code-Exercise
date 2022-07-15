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
		int a[] = taoMang(n);
		xuatMang(a);
		inRa(a);

	}

	public static void inRa(int a[]) {
		int count = 0;
		System.out.println("\nCác phần tử có toàn số lẻ là: ");
		for (int i = 0; i < a.length; i++) {
			
			if (check(a[i])) {
				System.out.print(a[i] + "\t");
				count++;
			}
		}
		if (count == 0) {
			System.out.println("\nKhông tồn tại giá trị có toàn chữ số lẻ");
		}
	}

	public static boolean check(int n) {
		n = Math.abs(n);
		do {
			int temp = n % 10;
			if (n % 2 == 0) {
				return false;
			}
			n /= 10;
		} while (n > 0);
		return true;
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
