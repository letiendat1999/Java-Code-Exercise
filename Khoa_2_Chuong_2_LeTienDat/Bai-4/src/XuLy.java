import java.util.Scanner;

public class XuLy {
	final static int MAX = 50;
	final static int MIN = -50;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soDong = nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] = taoMang(soDong, soCot);
		xuatMang(a, soDong, soCot);
		int soAmDauTien = timSoAmDauTien(a, soCot, soDong);
		int kq = timSoAmLonNhat(a, soCot, soDong, soAmDauTien);
		if (kq < 0) {
			System.out.println("\nGiá trị âm lớn nhất là: " + kq);

		} else if (kq == 0) {
			System.out.println("\nKo có phần tử âm");
		}

	}
	public static int timSoAmDauTien(int a[][], int soCot, int soDong) {

		int kq = 0;
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {

				if (a[i][j] < 0) {
					kq = a[i][j];
					continue;
				}
			}

		}
	
		return kq;
		
		

	}

	public static int timSoAmLonNhat(int a[][], int soCot, int soDong, int soAmDauTien) {
		int max = soAmDauTien;
		int count = 0;
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {

				if (a[i][j] < 0 && a[i][j]>max) {
					max = a[i][j];
					count++;	//số phần tử âm
				}
			}

		}
		if(count==0) {
			return 0;
		}
		else {
			return max;
		}

		
		

	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập vào giá trị n > 1: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 1);
		return n;
	}

	public static int[][] taoMang(int soDong, int soCot) {
		int a[][] = new int[soDong][soCot];
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {

				a[i][j] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
			}
		}

		return a;
	}

	public static void xuatMang(int a[][], int soDong, int soCot) {
		System.out.println("\nXuat mang: ");
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");

			}
			System.out.println("\n");
		}
	}

}
