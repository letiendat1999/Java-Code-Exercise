package xoaPhanTuMang;

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
		System.out.println("\nNhập phần tử muốn xóa x = ");
		int x = Integer.parseInt(scan.nextLine());
		
		xoaPhanTuMang(a, x);
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
	
	public static void xoaPhanTuMang(int a[], int x) {
		int count = 0;
		int j =0;
		int b[] = new int[a.length];
		
		for(int i=0; i< a.length; i++) {
			if(a[i] != x) {
				b[j] = a[i];
				j++;
			}
			else {
				count++;	//count là số phẩn tử x trong mảng
			}
		
		}
		
		if(count>0) {
			System.out.println("\nMảng sau khi xóa các phần tử x là: ");
			for(int i=0; i< j; i++) {
				System.out.print(b[i]+ "\t");
			}
		}
		else {
			System.out.println("\nKhông có phần tử x nào cả");
		}
		
		
	}

}
