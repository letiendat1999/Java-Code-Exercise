package xuatViTriSoAm;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;

		do {
			System.out.println("Nhập số phần tử n = ");
			n = Integer.parseInt(scan.nextLine());

		} while (n % 2 != 0 || n <= 0);

		int a[] = nhapMang(n, scan);
		xuatMang(a);
		xuatViTriSoAm(a);
	}

//	public static int[] taoMangRandom(int n) {
//		int a[] = new int[n];
//		int dau = -100;
//		int cuoi = 100;
//		System.out.println("Mảng được tạo ngẫu nhiên");
//		for (int i = 0; i < n; i++) {
//			a[i] = dau + (int) (Math.random() * ((cuoi - dau) + 1));
//		}
//		return a;
//	}

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

	public static void xuatViTriSoAm(int a[]) {
		int soAmDauTien = 0;
		boolean flag = true;
		int j = 1;
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				soAmDauTien = a[i];
				j = i;
				break;
			} else {
				count++;
			}
		}

		if (count < a.length) {
			System.out.println("\nCác số âm bằng số âm đầu tiên có vị trí là: ");
			for (int i = j + 1; i < a.length; i++) {
				if (soAmDauTien == a[i]) {

					System.out.print(i + "\t");
				}
			}
		} else {
			System.out.println("\nMảng này không có số âm");
		}

	}

}
