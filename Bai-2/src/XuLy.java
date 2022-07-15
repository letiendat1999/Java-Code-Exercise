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
		int sum = tongPhanTuChan(a, soCot, soDong);
		if (sum != 0) {
			System.out.println("\nTong phan tu chan la: " + sum);

		} else {
			System.out.println("\nKo có phần tử chẵn ");
		}

	}

	public static int tongPhanTuChan(int a[][], int soCot, int soDong) {

		int sum = 0;
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {

				if (a[i][j] % 2 == 0) {
					sum+=a[i][j];
				}
			}

		}
		return sum;

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
