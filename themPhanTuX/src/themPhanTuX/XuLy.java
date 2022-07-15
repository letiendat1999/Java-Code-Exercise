package themPhanTuX;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int x;
		int k;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Nhập số phần tử n = ");
			n = Integer.parseInt(scan.nextLine());

		} while (n <= 0);

		int a[] = nhapMang(n, scan);
		xuatMang(a);
		System.out.println("\nNhap phan tu x = ");
		x = Integer.parseInt(scan.nextLine());

		do {
			System.out.println("\nNhap vi tri k = ");
			k = Integer.parseInt(scan.nextLine());
		} while (k < 0 || k > n);

		themPhanTuX(a, x, k);

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

	public static void themPhanTuX(int a[], int x, int k) {
		// 0 1 2 3 4
		// 0 1 100 2 3 4
		int b[] = new int[a.length + 1];
		int j = 0;

		for (int i = 0; i <= a.length; i++) {
			if (i < k) {
				b[i] = a[i];
			} else if (i == k) {
				b[i] = x;
			} else {
				b[i] = a[i - 1];
			}
		}
		System.out.println("\nMang sau khi them x o vi tri k la: ");
		for (int i = 0; i <= a.length; i++) {
			System.out.print(b[i] + "\t");
		}

	}

}
