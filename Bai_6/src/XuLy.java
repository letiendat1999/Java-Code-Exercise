import java.util.Scanner;

public class XuLy {
	final static int MIN = -1000;
	final static int MAX = 1000;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		float a[] = taoMang(n);
		xuatMang(a);
		float tong = tongSoDuong(a);
		System.out.println("\nTổng các số dương là: "+tong);
		

	}

	public static float tongSoDuong(float a[]) {
		float sum =0;
		for(int i=0; i< a.length; i++) {
			if(a[i]>0) {
				sum += a[i];
			}
		}
		return sum;
	}
		

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập n > 2 ");
			n = Integer.parseInt(scan.nextLine());
		} while (n <= 2);
		return n;
	}

	public static int[] nhapMang(int n, Scanner scan) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("a[" + i + "] = ");
			a[i] = Integer.parseInt(scan.nextLine());
		}

		return a;
	}

	public static float[] taoMang(int n) {
		float a[] = new float[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (float) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void xuatMang(float a[]) {
		System.out.println("\nXuất mảng: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
	}

}
