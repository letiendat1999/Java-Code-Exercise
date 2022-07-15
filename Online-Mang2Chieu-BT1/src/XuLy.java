import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soDong = nhapN(scan);
		int soCot = nhapN(scan);
		int a[][] = nhapMang(soDong, soCot, scan);
		xuatMang(a, soDong, soCot);
		int tong = tongPhanTu(a, soDong, soCot);

		System.out.println("\nTổng các phần tử trong ma trận 2 chiều là: " + tong);
		inDongCoGiaTriGiamDan(a, soDong, soCot);

	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập vào giá trị n > 1: ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[][] nhapMang(int soDong, int soCot, Scanner scan){
		int a[][] = new int[soDong][soCot];
		for(int i=0; i< soDong; i++) {
			for(int j=0; j<soCot; j++) {
				System.out.print("a["+i+"]"+"["+j+"] = ");
				a[i][j] = Integer.parseInt(scan.nextLine());
			}
		}
		
		return a;
	}

	public static void xuatMang(int a[][], int soDong, int soCot) {
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				System.out.print(a[i][j]+"\t");
				

			}
			System.out.println("\n");
		}
	}

	public static int tongPhanTu(int a[][], int soDong, int soCot) {
		int tong = 0;
		for (int i = 0; i < soDong; i++) {
			for (int j = 0; j < soCot; j++) {
				tong += a[i][j];

			}
		}
		return tong;
	}
	
	public static void inDongCoGiaTriGiamDan(int a[][], int soDong, int soCot) {
		boolean flag = true;
		
		for (int i = 0; i < soDong; i++) {
			flag = true;	//dòng có phần tử giảm dần
			for(int j = 0; j < soCot-1; j++) {
				if(a[i][j] < a[i][j+1]) {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("Dòng "+i+" có chứa phần tử giảm dần");
			}
		}
		
	}

}
