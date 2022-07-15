package xacDinhDiemMTrenDuongTron;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * B1: Khai báo các biến banKinh, xC, yC, xM, yM, khoangCach
	B2: Thông báo nhập vào bán kính
	B3: Nhập vào bán kính và gán cho biến banKinh
	B4: Thông báo nhập vào tọa độ xC, yC của tâm đường tròn
	B5: Nhập vào tọa độ x của tâm đường tròn,
	gán cho biến xC và nhập vào tọa độ y của tâm đường tròn,
	gán cho biến yC
	B6: Thông báo nhập vào tọa độ xM, yM của điểm M
	B7: Nhập vào tọa độ x của điểm M, gán cho biến xM và nhập vào 
	tọa độ y của điểm M, gán cho biến yM
	B8: tính khoảng cách từ điểm C đến M bằng công thức
	khoangCach = Math.sqrt((xM-xC)*(xM-xC)+(yM-yC)*(yM-yC))
	B9: So sánh khoảng cách khoangCach với bán kính banKinh
	nếu khoangCach < banKinh thì M nằm trong đường tròn
	nếu khoangCach = banKinh thì M nằm trên đường tròn
	nếu khoangCach > banKinh thì M nằm ngoài đường tròn
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float banKinh;
		float xC, yC;
		float xM, yM;
		double khoangCach;

		Scanner scan = new Scanner(System.in);

		System.out.print("Vui lòng nhập vào bán kính của đường tròn R = ");
		banKinh = Float.parseFloat(scan.nextLine());

		System.out.println("Vui lòng nhập vào tọa độ tâm C (xC, yC): ");
		xC = Float.parseFloat(scan.nextLine());
		yC = Float.parseFloat(scan.nextLine());

		System.out.println("Vui lòng nhập vào tọa độ điểm M (xM, yM): ");
		xM = Float.parseFloat(scan.nextLine());
		yM = Float.parseFloat(scan.nextLine());

		khoangCach = Math.sqrt((xM - xC) * (xM - xC) + (yM - yC) * (yM - yC));

		if (khoangCach < banKinh) {
			System.out.println("M nằm trong đường tròn");
		} else if (khoangCach == banKinh) {
			System.out.println("M nằm trên đường tròn");
		} else {
			System.out.println("M nằm ngoài đường tròn");
		}
	}

}
