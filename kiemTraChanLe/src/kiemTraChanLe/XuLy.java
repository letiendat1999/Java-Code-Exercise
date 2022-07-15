package kiemTraChanLe;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static boolean kiemTra(int number) {
		boolean kQua;
		if(number % 2 ==0) {
			kQua = true;
		}
		else {
			kQua = false;
		}
		return kQua;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * B1: khai báo biến numbe
		 * B2: nhập vào số number
		 * B3: viết hàm kiểm tra số này chẳn hay lẻ
		 * B4: gọi hàm này ở hàm main và xuất ra màn hình
		 * */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Mời nhập vào 1 số: ");
		int number = Integer.parseInt(scan.nextLine());
	
		if(kiemTra(number)) {
			System.out.println("Đây là số chẵn");
		}
		else {
			System.out.println("Đây là số lẻ");
		}
		
		
	}

}
