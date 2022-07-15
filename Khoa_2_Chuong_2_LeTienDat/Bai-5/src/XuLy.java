import java.util.Scanner;

public class XuLy {
	final static int MAX = 50;
	final static int MIN = -50;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soDong = nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] = taoMang(soDong, soCot);
		xuatMang(a, soDong, soCot);
		int kq = timSoNguyenToDauTien(a, soCot, soDong);
		if (kq == 0) {
			System.out.println("\nko có số nguyên tố ");

		} else {
			System.out.println("\nSố nguyên tố đầu tiên là: " + kq);
		}

	}

	public static boolean soNguyenTo(int n) {
		int count = 0;
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				count++;
			}
		}
		if (count == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static int timSoNguyenToDauTien(int a[][], int soCot, int soDong) {
		int kq = 0;
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (soNguyenTo(a[i][j])) {
					kq = a[i][j];
					continue;
				}
			}
		}
		return kq;
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập vào giá trị n > 1: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 1);
		return n;
	}

	public static int[][] taoMang(int soDong, int soCot) {
		int a[][] = new int[soDong][soCot];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {

				a[i][j] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
			}
		}

		return a;
	}

	public static void xuatMang(int a[][], int soDong, int soCot) {
		System.out.println("\nXuat mang: ");
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");

			}
			System.out.println("\n");
		}
	}

}
