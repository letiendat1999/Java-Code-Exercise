package tongSoLeNguyenDuong;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int tong  = tongCacSoLeNguyenDuong(n);
		System.out.println("Tổng các số lẻ là: "+tong);
	}
	
	public static int nhapN(Scanner scan) {
		int n; 
		do {
			System.out.println("Nhập n = ");
			n = Integer.parseInt(scan.nextLine());
		}while(n<=0);
		
		return n;
	}
	
	public static int tongCacSoLeNguyenDuong(int n) {
		int tong = 0;
		for(int i=0; i<n; i++) {
			if(i%2 != 0) {
				tong+=i;
			}
		}
		return tong;
	}

}
