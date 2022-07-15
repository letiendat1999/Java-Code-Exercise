import java.util.Scanner;

public class XuLy {
	final static int MAX = 10;
	final static int MIN = -10;

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
		System.out.println("\t");
		int b[][] = taoMang(soDong, soCot);
		xuatMang(b, soDong, soCot);
		System.out.println("\t");
		int c[][] = tongMaTran(a, b, soDong, soCot);
		xuatMang(c, soDong, soCot);

	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập vào giá trị n > 1: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
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
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");

			}
			System.out.println("\n");
		}
	}

	public static int[][] tongMaTran(int a[][], int b[][], int soDong, int soCot) {
		int c[][] = new int[soDong][soCot];

		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
}
