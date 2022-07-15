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
		int a[] = taoMang(n);
		
		xuatMang(a);
		inMaxRun(a);

	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập n > 1 ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
		return n;
	}

	public static int[] taoMang(int n) {
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
		}
		return a;
	}

	public static void xuatMang(int a[]) {
		System.out.println("\nXuất mảng cách 1: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
	}
	
	public static void inMaxRun(int a[]) {
		int head = 0;
		int maxHead = 0;
		int maxLen = 0;
		
		do {
			int i;
			int len = 1;
			for(i=head; i<a.length-1 && a[i]<a[i+1]; i++) {
				len++;
			}
			
			if(len>maxLen) {
				maxLen=len;
				maxHead=head;
			}
			head = i+1;
		}while(head<a.length);
		
		System.out.println("\nRun dài nhất là: ");
		for(int i=0; i<maxLen;i++) {
			System.out.print(a[maxHead+i]+"\t");
		}
	}
}
