package tinhTongDungVongLap;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int x = nhapX(scan);
		int tong = tinhTong(n, x);
		
		System.out.println("Tổng là: " + tong);
	}
	
	public static int nhapN(Scanner scan) {
		int n; 
		do {
			System.out.println("Nhập n = ");
			n = Integer.parseInt(scan.nextLine());
		}while(n<=0);
		
		return n;
	}
	
	public static int nhapX(Scanner scan) {
		int x; 
		
		System.out.println("Nhập x = ");
		x = Integer.parseInt(scan.nextLine());
		
		
		return x;
	}
	
	public static int tinhTong(int n, int x) {
		int tong = 0;
		for(int i=1; i<=n; i++) {
			tong+=Math.pow(x, i);
		}
		return tong;
	}
}
