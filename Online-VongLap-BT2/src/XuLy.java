import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Mời nhập n = ");
		int n = Integer.parseInt(scan.nextLine());
		
		inFibonacci(n);
		
	}
	public static void inFibonacci(int n) {
		System.out.println(n + " chữ số đầu tiên trong dãy Fibonacci");
		for(int i=0; i<n; i++) {
			int ai = fibonacci(i);
			System.out.print(ai + "\t");
		}
	}
	public static int fibonacci(int x) {
		int a0 = 0;
		int a1 = 1;
		int an = 1;
		int kq=0;
		
		if(x<0) {
			kq = -1;
		}else if(x==0 || x==1) {
			kq = x;
		}else if(x>1) {
			for(int i=2; i<x; i++) {
				a0 = a1;
				a1 = an;
				an = a0 + a1;
			}
			kq = an;
			
		}
		
		return kq;
		
	}

}
