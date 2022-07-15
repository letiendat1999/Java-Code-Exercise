package demSoPhanTuThoaDK;

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

		} while (n <= 0);
		int a[] = nhapMang(n, scan);
		xuatMang(a);
		demSoPhanTu(a);
		thayCacPhanTuLe(a);
		
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
		System.out.println("Xuất mảng cách 1: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
	}

	public static void demSoPhanTu(int a[]) {
		int count = 0;
		int b[] = new int[a.length];
		int j =0;
		
		for(int i=0; i<a.length; i++) {
			b[j] = Math.abs(a[i]);
			j++;
			
			if(b[i]%4==0 && b[i]%10==6) {
					count++;
			}
			
		}
		System.out.println("\nSố phần tử chia hết cho 4 và có số tần cùng là 6 là: "+count);
	}

	public static void thayCacPhanTuLe(int a[]) {
		

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				a[i] = a[i] * 2;
			}
		}

		System.out.println("\nMảng sau khi thay các phần tử lẻ là: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

}
