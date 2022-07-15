import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float tong = tinhTongKhongAmCach1(scan);
		System.out.println("Tổng các số dương là: " + tong);
		
		float tong_2 = tinhTongKhongAmCach2(scan);
		System.out.println(tong_2);

	}

	// tính tổng các số dương
	public static float tinhTongKhongAmCach1(Scanner scan) {
		float tong = 0; // tạo biến tích lũy ngoài vòng lặp
		int nhap = 1;

		while (nhap > 0) {
			System.out.println("Hãy nhập vào một số > 0. Nhập <=0 để dừng");
			nhap = Integer.parseInt(scan.nextLine());
			if (nhap > 0) {
				tong += nhap;
			}
		}
		

		return tong;

	}
	
	public static float tinhTongKhongAmCach2(Scanner scan) {
		float tong = 0;
		boolean flag = true;
	
		
		while(flag) {
			System.out.println("Hãy nhập vào một số > 0. Nhập <=0 để dừng");
			int nhap = Integer.parseInt(scan.nextLine());
			if(nhap > 0) {
				tong += nhap;
			}
			else {
				flag = false;
			}
		}
		return tong;
	}

}
