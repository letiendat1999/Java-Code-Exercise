package dayOfWeek;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * B1: tạo biến day, month, year, dayOfWeek, top, flag
	 * B2: nhập vào day, month, year
	 * B3: Xét year, nếu year < 1582 thì không hợp lệ, flag = false
	 * B4: Xét month nếu month < 1, hoặc month > 12 flag = false
	 * B5: cần biết người dùng nhập vào tháng mấy và tính ra top bao nhiêu của tháng đó
	 * Chú ý năm nhuận để tìm số ngày tối đa của tháng 2
	 * B6: tính dayOfWeek theo công thức Zeller
	 * B7: Xét dayOfWeek và in ra thứ tương ứng
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d;
		int m;
		int y;
		int top; //số ngày tối đa trong tháng
		int dayOfWeek;
		boolean flag = true; //bật hợp lệ
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Vui lòng nhập ngày: ");
		d = Integer.parseInt(scan.nextLine());
		
		System.out.println("Vui lòng nhập tháng: ");
		m = Integer.parseInt(scan.nextLine());
		
		System.out.println("Vui lòng nhập năm: ");
		y = Integer.parseInt(scan.nextLine());
		
		//xét năm
		if(y < 1582) {
			flag = false;	//năm ko hợp lệ
		}
		//xét tháng
		if(m < 1 || m >12) {
			flag = false;	//tháng ko hợp kệ
		}
		switch(m) {
		case 4:
		case 6:
		case 9:
		case 11:
			top = 30;
			break;
		case 2:
			if(((y%4==0) && (y%100!=0)) || (y%400==0)) {	//là năm nhuận
				top = 29;

			}
			else {
				top = 28;
			
			}
			break;
		default: 
			top = 31;
		}
		
		//kiểm tra ngày có hợp lệ hay không
		if(d<1 || d>top) {
			flag = false;
		}
		
		if(!flag) {
			System.out.println("Không hợp lệ");
		}
		else {
			int a = (14 - m)/12;
			y -= a;
			m += 12*a -2;
			dayOfWeek = (d + y + y/4 - y/100 + y/400 + (31*m)/12)%7;
			if(dayOfWeek==0) {
				System.out.println("Chủ nhật");
			}
			else {
				System.out.println("Thứ " + (dayOfWeek+1));
				}
		}
	}
}


