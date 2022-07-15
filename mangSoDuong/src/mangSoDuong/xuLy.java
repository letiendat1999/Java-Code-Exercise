package mangSoDuong;

import java.util.Scanner;

public class xuLy {

	public xuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n;

		do {
			System.out.println("Nhập số phần tử n = ");
			n = Integer.parseInt(scan.nextLine());

		} while (n <= 0);

		int a[] = nhapMang(n, scan);
		xuatMang(a);
		xuatViTriSoDuongNhoNhat(a);
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

	public static void xuatViTriSoDuongNhoNhat(int a[]) {
		int min = 4;
		int j = 0;
		int count = 0;

		// tìm số dương nhỏ nhất
		for (int i = 0; i < a.length; i++) {
			if (min > a[i] && a[i] > 0) {
				min = a[i];
				j = i;
			} else {
				count++;
			}
		}

		if (count == a.length) {
			System.out.println("\nMảng không có phần tử dương");
		} else {
			System.out.println("\nSố dương nhỏ nhất đầu tiên là: " + min);
			System.out.println("\nCác vị trí chứa số dương nhỏ nhất là: ");
			for (int i = j + 1; i < a.length; i++) {
				if (a[i] == min) {
					System.out.println(i + "\t");
				}
			}
		}

	}

}
