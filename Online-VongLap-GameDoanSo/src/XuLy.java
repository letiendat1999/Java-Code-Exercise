import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		doanSo(scan);
		
	}
	
	public static void doanSo(Scanner scan) {
		int soBiMat = (int) (Math.random()*99 +1);
		int nhap;
		
		do {
			System.out.println("Vui lòng nhập vào một số");
			nhap = Integer.parseInt(scan.nextLine());
			if(nhap<soBiMat) {
				System.out.println("Vui lòng nhập vào số lớn hơn");
			}
			else {
				System.out.println("Vui lòng nhập vào số nhỏ hơn");
			}
			
		}while(soBiMat!=nhap);
		System.out.println("chúc mừng chiến thắng");
	}

}
