package nhapXuatMang;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập số phần tử n  = ");
		int n = Integer.parseInt(scan.nextLine());
		int a[] = nhapMang(n, scan);
		xuatMang(a);
		xuatMangForEach(a);
		
		System.out.println("\nTổng các số chẵn dùng for: "+tongCacSoChan(a));
		System.out.println("Tổng các số chẵn dùng for each: "+ tongCacSoChanForEach(a));	
		System.out.println("Có "+demSoAm(a)+" số âm dùng for");
		System.out.println("Có "+demSoAmForEach(a)+" số âm dùng for each");
		System.out.println("Tổng các số âm dùng for: "+ tongCacSoAm(a));
		System.out.println("Tổng các số âm dùng for each: "+ tongCacSoAmForEach(a));
		

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

	public static void xuatMangForEach(int a[]) {
		System.out.println("\nXuất mảng cách 2");
		for (int item : a) {
			System.out.print(item + "\t");
		}
	}

	public static int tongCacSoChan(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				sum += a[i];
			}
		}
		return sum;
	}

	public static int tongCacSoChanForEach(int a[]) {
		int sum = 0;
		for (int item : a) {
			if (item % 2 == 0) {
				sum += item;
			}
		}
		return sum;
	}
	
	public static int demSoAm(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				count++;
			}
		}
		return count;
	}

	public static int demSoAmForEach(int a[]) {
		int count = 0;
		for (int item : a) {
			if (item < 0) {
				count++;
			}
		}
		return count;
	}
	
	public static int tongCacSoAm(int a[]) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				sum += a[i];
			}
		}
		return sum;
	}

	public static int tongCacSoAmForEach(int a[]) {
		int sum = 0;
		for (int item : a) {
			if (item < 0) {
				sum += item;
			}
		}
		return sum;
	}
	
	

}
