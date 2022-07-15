import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * B1: tạo các biến n, unit, ten, hundred, sum
	 * B2: In thông báo nhập vào số n
	 * B3: Tìm số hàng trăm
	 * 		hundred = n/100
	 * B4: Tìm số hàng chục
	 * 		ten = (n%100)/10
	 * B5: Tìm số hàng đơn vị
	 * 		unit = n%10
	 * B6: Cộng 3 ký số lại với nhau
	 * 		sum = hundred + ten + unit
	 * B7: In sum ra màn hình
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int unit;
		int ten;
		int hundred;
		int sum;
		
		System.out.print("Nhập vào số nguyên dương n: ");
		Scanner nhap = new Scanner(System.in);
		n = Integer.parseInt(nhap.nextLine());
		
		hundred = n/100;
		ten = (n%100)/10;
		unit = n%10;
		sum = hundred + ten + unit;
		System.out.println("Tổng của 3 ký số của n = " + n + "\t là: " + sum);
	}

}
