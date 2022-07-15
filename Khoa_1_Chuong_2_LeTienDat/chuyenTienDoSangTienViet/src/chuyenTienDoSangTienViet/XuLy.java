package chuyenTienDoSangTienViet;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	
	/*
	 * B1: Khai báo các biến tienDo, tienViet, hằng số TI_GIA = 23 500
	B2: Thông báo nhập tiền USD
	B3: Nhập vào tiền USD và gán cho biến tienDo
	B4: Tính tiền VND 
	tienViet = tienDo * TI_GIA
	B5: In thông báo xuất ra tiền VND là biến tienViet
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tienDo;
		float tienViet;
		final float TI_GIA = 23500;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Vui lòng nhập tiền USD: ");
		tienDo = Integer.parseInt(scan.nextLine());
		
		tienViet = tienDo*TI_GIA;
		System.out.println("Đổi sang tiền VND là: " + tienViet);
	}

}
