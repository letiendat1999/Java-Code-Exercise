import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời nhập số a");
		float a = Integer.parseInt(scan.nextLine());
		
		System.out.println("Mời nhập số b");
		float b = Integer.parseInt(scan.nextLine());
		
		xuLyMenu(scan, a, b);
		

	}

	public static void inMenu() {
		System.out.println("Chương trình các phép tính đơn giản");
		System.out.println("Mời chọn theo các chức năng");
		System.out.println(" 1. Tính tổng");
		System.out.println(" 2. Tính hiệu");
		System.out.println(" 3. Tính tích");
		System.out.println(" 4. Tính thương");
		System.out.println(" 0. Thoát");
	}

	public static void xuLyMenu(Scanner scan, float a, float b) {
		boolean flag = true;
		int chon;
		do {
			inMenu();
			System.out.print("Mời chọn >>");
			chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 1:
				float tong = a+b;
				System.out.println("Tổng 2 số a,b (" + a + "," + b + ") là: " + tong);
				break;
			case 2:
				float hieu = a-b;
				System.out.println("Hiệu 2 số a,b (" + a + "," + b + ") là: " + hieu);
				break;
			case 3:
				float tich = a*b;
				System.out.println("Tích 2 số a,b (" + a + "," + b + ") là: " + tich);
				break;
			case 4:
				if(b==0) {
					System.out.println("b phải khác 0");
				}
				else {
					float thuong = a/b;
					System.out.println("Thương 2 số a,b (" + a + "," + b + ") là: " + thuong);
				}
				
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Vui lòng chọn từ 0 đến 4");
			}

		} while (flag);
	}

}
