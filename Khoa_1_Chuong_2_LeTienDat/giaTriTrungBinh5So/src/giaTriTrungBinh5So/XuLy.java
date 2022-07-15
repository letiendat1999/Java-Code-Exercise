package giaTriTrungBinh5So;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * B1: Khai báo các biến so1, so2, so3, so4, so5, trungBinh
	B2: Thông báo nhập vào biến số 1
	B3: Nhập giá trị cho biến số 1 và gán vào biến so1
	B4: Thông báo nhập vào biến số 2
	B5: Nhập giá trị cho biến số 2 và gán vào biến so2
	B6: Thông báo nhập vào biến số 3
	B7: Nhập giá trị cho biến số 3 và gán vào biến so3
	B8: Thông báo nhập vào biến số 4
	B9: Nhập giá trị cho biến số 4 và gán vào biến so4
	B10: Thông báo nhập vào biến số 5
	B11: Nhập giá trị cho biến số 5 và gán vào biến so5
	B12: Khai báo biến hằng số NUM_AVER = 5
	B13: Tính trung bình 5 số bằng cách
		trungBinh = (1.0f)*(so1 + so2 +so3 + so4 + so5)/NUM_AVER
	B14: In ra màn hình giá trị trung bình
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int so1;
		int so2;
		int so3;
		int so4;
		int so5;
		float trungBinh;
		
		final int NUM_AVER = 5;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Vui lòng nhập vào số thứ 1: ");
		so1 = Integer.parseInt(scan.nextLine());
		
		System.out.print("Vui lòng nhập vào số thứ 2: ");
		so2 = Integer.parseInt(scan.nextLine());
		
		System.out.print("Vui lòng nhập vào số thứ 3: ");
		so3 = Integer.parseInt(scan.nextLine());
		
		System.out.print("Vui lòng nhập vào số thứ 4: ");
		so4 = Integer.parseInt(scan.nextLine());
		
		System.out.print("Vui lòng nhập vào số thứ 5: ");
		so5 = Integer.parseInt(scan.nextLine());
		
		trungBinh = (1.0f)*(so1 + so2 + so3 + so4 + so5)/NUM_AVER;
		
		System.out.println("Giá trị trung bình của 5 số vừa nhập là: " + trungBinh);

	}

}
