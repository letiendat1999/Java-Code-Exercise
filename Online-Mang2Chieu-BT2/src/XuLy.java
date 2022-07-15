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
		inTatCaPhanTuMax(a, soDong, soCot);
		inDongCoGiaTriChan(a, soDong, soCot);
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập vào giá trị n > 1: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
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
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j] + "\t");

			}
			System.out.println("\n");
		}
	}

	public static void inTatCaPhanTuMax(int a[][], int soDong, int soCot) {
		// tìm max thật sự trong mảng trước

		int dongMax = 0;
		int cotMax = 0;
		int max = a[dongMax][cotMax];
		for (int i = 0; i < soDong; i++) {

			for (int j = 0; j < soCot; j++) {
				max = a[dongMax][cotMax];
				if (a[i][j] > max) {
					dongMax = i;
					cotMax = j;
				}
			}
		}
		// quét lại mảng 2 chiều và in ra các con số max
		System.out.println("Giá trị max = " + max + " tại các phần tử: ");
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				if (a[i][j] == max) {
					System.out.println("(" + i + ", " + j + ")" + "\t");
				}
			}
		}
	}
	
	public static void inDongCoGiaTriChan(int a[][], int soDong, int soCot) {
		boolean flag = false;
		for (int i = 0; i < soDong; i++) {
			flag = false;	//dòng chưa có phần tử chẵn
			for (int j = 0; j < soCot; j++) {
				if(a[i][j] % 2 ==0) {
					flag = true;
					break;
				}
			}
			if(flag) {
				System.out.println("Dòng "+i+" có chứa phần tử chẵn");
			}
		}
		
	}

}
