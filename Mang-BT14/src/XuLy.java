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
		
		if(ktDoiXung(a)) {
			System.out.println("\nMang nay doi xung");
		}else {
			System.out.println("\nMang ko doi xung");
		}
		a = xoayTrai(a, scan);
		xuatMang(a);
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
	
	public static boolean ktDoiXung(int a[]) {
		for(int i=0; i< a.length; i++) {
			if(a[i] != a[a.length-1-i]) {
				return false;
			}
		}
		return true;
	}
	
	public static int[] xoayTrai(int a[], Scanner scan) {
		int k;
		int tam;
		
		do {
			System.out.println("\nVui long nhap k>0 ");
			k = Integer.parseInt(scan.nextLine());
			
		}while(k<0);
		
		k %= a.length;
		
		for(int i=0; i<k; i++) {
			//tao bien tam luu tru a[0]
			tam = a[0];
			for(int j=0; j<a.length-1;j++) {
				a[j]=a[j+1];
			}
			a[a.length-1] = tam;
		}
		return a;
	}
	

}
