import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		

		do {
			System.out.println("Nhập số phần tử n = ");
			n = Integer.parseInt(scan.nextLine());

		} while (n <= 0);

		int a[] = nhapMang(n, scan);
		xuatMang(a);
		xuatSoTrongMang(a);
	}

	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}

		return a;
	}

	public static void xuatMang(int a[]) {
		System.out.println("Xuất mảng: ");
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
	}

	public static boolean kiemTraSoLeDauTien(int a) {
		int soDauTien = 0;
		boolean flag;

		if (a == 100 || a == -100) {
			soDauTien = a / 100;
		} else if ((a >= -99 && a <= -10) || (a >= 10 && a <= 99)) {
			soDauTien = a / 10;
		} else if (a >= -9 && a <= 9) {
			soDauTien = a;
		}

		if (soDauTien % 2 != 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	public static void xuatSoTrongMang(int a[]) {
		System.out.println("\nCác chữ số có số đầu tiên là số lẻ trong mảng là: ");
		for (int i = 0; i < a.length; i++) {
			if (kiemTraSoLeDauTien(a[i])) {
				System.out.print(a[i] + "\t");
			}

		}
	}

}
