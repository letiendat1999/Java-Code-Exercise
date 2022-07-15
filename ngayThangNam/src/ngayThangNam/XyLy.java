package ngayThangNam;

import java.util.Scanner;

public class XyLy {

	public XyLy() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * B1: khai báo các biến d, m, y, dayOfWeek
	 * B2: thông báo nhập ngày
	 * B3: nhập ngày gán cho biến day
	 * B4: thông báo nhập tháng
	 * B5: nhập tháng gán cho biến month
	 * B7: thông báo nhập năm
	 * B8: nhập năm gán cho biến year
	 * B9: Kiểm tra thứ trong tuần của ngày nhập vào
	 * m = m + 12*d - 2
	 * a = (14-m)/12
	 * y = y-a
	 * dayOfWeek = (d + y + y/4 - y/100 + y/400 + (31*m)/12)%7
	 * B10: Kiểm tra năm nhuận hay không nhuận
	 * nếu năm đó từ 1582 trở về sau thì
	 * kiểm tra năm đó nhuận hay ko nhuận bằng cách
	 * nếu năm đó chia hết cho 4 và không chia hết cho 100 hoặc chia hết cho 400
	 * thì năm đó nhuận, ngược lại năm đó không nhuận
	 * B11: nếu 1582 trở về trước thì năm nhập vào không hợp lệ
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d;
		int m;
		int y;
		int dayOfWeek;
		boolean flag = true;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Vui lòng nhập vào ngày: ");
		d = Integer.parseInt(scan.nextLine());
		
		System.out.print("Vui lòng nhập vào tháng: ");
		m = Integer.parseInt(scan.nextLine());
		
		System.out.print("Vui lòng nhập vào năm: ");
		y = Integer.parseInt(scan.nextLine());
		
		if(y<1582) {
			flag = false;
		}
	}

}
