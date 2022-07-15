package tinhGiaiThua;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = nhapN(scan);
		int giaiThua = tinhGiaiThua(n);
		System.out.println("Giai thừa của "+n+" là: "+giaiThua);
	}
	
	public static int nhapN(Scanner scan) {
		int n; 
		do {
			System.out.println("Nhập n = ");
			n = Integer.parseInt(scan.nextLine());
		}while(n<0);
		
		return n;
	}
	
	public static int tinhGiaiThua(int n) {
		int giaiThua = 1;
		
		if(n==0 || n ==1) {
			giaiThua = 1;
		}else {
			for(int i=1; i<=n; i++) {
				giaiThua *= i;
			}
		}
		return giaiThua;
	}

}
