import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * B1: Tạo biến creditCardBalance, payment, balance, penalty
	 * B2: In thông báo nhập số dư thẻ tín dụng
	 * B3: Cho ng dùng nhập số dư và gán creditCardBalance
	 * B4: In thông báo nhập tiền trả trong tháng
	 * B5: Cho người dùng nhập tiền trả và gán payment
	 * B6: tạo biến balance lưu kết quả tiền chưa thanh toán
	 * B7: xét điều kiện balance > 0
	 * B8: tính tiền phạt nếu bước 7 xảy ra và gán cho penalty
	 * B9: Xuất kết quả
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float creditCardBalance;
		float payment;
		float balance;
		float penalty=0;
		final float PEN_FEE = 0.015f;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vui lòng nhập số dư thẻ tín dụng");
		creditCardBalance = Float.parseFloat(scan.nextLine());
		
		System.out.println("Vui lòng nhập số tiền trả trong tháng");
		payment = Float.parseFloat(scan.nextLine());
		
		balance = creditCardBalance - payment;
		
		if(balance>0) {
			penalty = balance * PEN_FEE;
		}
		
		System.out.println("Phí phạt là: " + penalty);
	}

}
