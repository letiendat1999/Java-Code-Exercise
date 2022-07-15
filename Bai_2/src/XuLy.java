import java.util.Scanner;

public class XuLy {
	final static int MIN = -100;
	final static int MAX = 100;
	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = nhapN(scan);
		int a[] = nhapMang(n, scan);
		xuatMang(a);
		lietKe(a);

	}

	public static void lietKe(int a[]) {
		int min = Math.abs(a[0] - a[1]); 
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if(Math.abs(a[i] - a[j]) < min) {
					min = Math.abs(a[i] - a[j]);
				}
			}
		}
		
		for(int i=0; i< a.length-1; i++) {
			for(int j=i+1; j< a.length; j++) {
				if(Math.abs(a[i] - a[j]) == min){
					System.out.print("\nCac cap gia tri gan nhau la: ("+a[i]+","+a[j]+")"+"\t");
				}
			}
		}
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

	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		System.out.println("\nXuất mảng: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
	}

}
