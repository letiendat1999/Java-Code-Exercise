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
		inSLPTGiongNhau(a);
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
	
	public static int[] demPhanTu(int a[]) {
		int b[] = new int[a.length];
		for(int i=0; i< a.length; i++) {
			b[i] = 0;
			for(int j=0; j< a.length; j++) {
				if(a[i] == a[j]) {
					if(j<i) {
						break;
					}else {
						b[i]++;
					}
				}
			}
		}
		return b;
		
	}
	
	public static void inSLPTGiongNhau(int a[]) {
		int b[] = demPhanTu(a);
		System.out.println("\nSo luong phan tu giong nhau la: ");
		for(int i = 0; i<a.length;i++) {
			if(b[i]!=0) {
				System.out.print(a[i] + "["+b[i]+"]"+"\t");
			}
		}
	}

}
