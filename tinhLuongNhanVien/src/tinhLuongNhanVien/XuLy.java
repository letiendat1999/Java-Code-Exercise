package tinhLuongNhanVien;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * B1: Khai báo các biến rate, hours, payment
	 * B2: thông báo người dùng nhập vào số giờ làm
	 * B3: Nhập số giờ làm và gán cho biến hours
	 * B4: thông báo người dùng nhập vào lương mỗi giờ
	 * B5: nhập lương theo giờ và gán cho biến rate
	 * B6: nếu hours > 40 thì thanh toán theo công thức
	 * 		payment = 40*rate + (hours - 40)*1.5*rate;
	 * B7: nếu ngược lại thì tính theo công thức
	 * 		payment = hours * 1.5;
	 * B8: xuất kết quả
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float rate;
		float hours;
		float payment;
		final float NUM_OT = 1.5f;
		final int STANDARD_HOURS = 40;

		Scanner scan = new Scanner(System.in);

		System.out.print("Vui lòng nhập vào số giờ làm: ");
		hours = Float.parseFloat(scan.nextLine());

		System.out.print("Vui lòng nhập vào lương theo giờ: ");
		rate = Float.parseFloat(scan.nextLine());

		if (hours > STANDARD_HOURS) {
			payment = STANDARD_HOURS * rate + (hours - STANDARD_HOURS) * NUM_OT * rate;
		} else {
			payment = hours * rate;
		}

		System.out.print("Số tiền trả cho nhân viên trong 1 tuần là: " + payment);

	}

}
