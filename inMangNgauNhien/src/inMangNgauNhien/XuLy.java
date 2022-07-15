package inMangNgauNhien;

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
			
		}while(n%2!=0 || n<=0);
		
		int a[] = taoMangRandom(n);
		xuatMang(a);
		xuatMangTrongKhoang(a, scan);
	}

	public static int[] taoMangRandom(int n) {
		int a[] = new int[n];
		int dau = -100;
		int cuoi = 100;
		System.out.println("Mảng được tạo ngẫu nhiên");
		for (int i = 0; i < n; i++) {
			a[i] = dau + (int) (Math.random() * ((cuoi - dau) + 1));
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		System.out.println("Xuất mảng: ");
		for (int pt : a) {
			System.out.print(pt + "\t");
		}
	}

	public static void xuatMangTrongKhoang(int a[], Scanner scan) {
		System.out.println("\nNhập vào khoảng cho trước [x,y]: ");
		System.out.print("x = ");
		int x = Integer.parseInt(scan.nextLine());
		System.out.print("y = ");
		int y = Integer.parseInt(scan.nextLine());

		int j = 0;
		int b[] = new int[a.length];
		int count =0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] >= x && a[i] <= y) {
				b[j] = a[i];
				j++;
				count++;

			}
			
		}
		System.out.println("Các phần tử từ " + x + " đến " + y + " là: ");
		for (int i=0; i<count; i++) {
			System.out.print(b[i] + "\t");
		}

	}

}
