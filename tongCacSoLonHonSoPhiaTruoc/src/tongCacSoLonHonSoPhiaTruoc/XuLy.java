package tongCacSoLonHonSoPhiaTruoc;

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
		tongCacSo(a);
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

	public static void tongCacSo(int a[]) {
		//int sum = 0;
		int tong = 0;

		for (int i = 1; i < a.length - 1; i++) {

			if (a[i - 1] < a[i]) {
				
				tong += a[i];
			}

		}
		System.out.println("\nGía trị tổng là: " + tong);
	}

}
