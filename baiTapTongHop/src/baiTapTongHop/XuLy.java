package baiTapTongHop;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui lòng nhập vào n = ");
		int n = Integer.parseInt(scan.nextLine());
		xuLySo(n);
		
	}
	
	
	public static void xuLySo(int n) {
		int soBanDau = n; //tạo bản sao của n để xử lý
		int soDangTach; //tách dần theo thứ tự hàng đơn vị trở về trước
		int tongCacSo = 0;
		int dem = 0;
		
		do {
			soDangTach = soBanDau%10;
			dem++;
			tongCacSo+=soDangTach;
			soBanDau /= 10;
			
			
		}while(soBanDau != 0);
		
		System.out.println("Số "+n+" có "+dem+" chữ số");
		System.out.println("Chữ số cuối cùng là: "+ n%10);
		System.out.println("Chữ số đầu tiên là: "+ soDangTach);
		System.out.println("Tổng các chữ số: "+tongCacSo);
		
		//đảo ngược số n
		System.out.print("Số đảo ngược của "+n+" là: ");
		//loại bỏ các số 0
		while(n%10==0) {
			n/=10;
		}
		//đảo ngược n
		do{
			System.out.print(""+n%10);	//tách từ hàng đơn vị
			n/=10; //tách hàng chục trăm 
		}while(n!=0);
	}

}
