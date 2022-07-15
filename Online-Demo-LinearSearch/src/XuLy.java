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
		int n = nhapN(scan);
		int a[] = taoMang(n);
		xuatMang(a);
		// soAmDauTien(a);
		int index = soChanCuoiCung(a);
		if (index == -1) {
			System.out.println("\nko có số chẵn");
		} else {
			System.out.println("\nSố chẵn cuối cùng là: " + a[index]+" tại vị trí "+index);
		}
		// System.out.println("\nNhập vào phần tử cần tìm kiếm x = ");
		// int x = Integer.parseInt(scan.nextLine());
		// int index = binarySearch1(a, x);
//		int index = linearSearch1(a, x);
//		boolean found = binarySearch(a, x);
//		if (found) {
//			System.out.println("Tìm thấy trong mảng");
//		} else {
//			System.out.println("không tìm thấy trong mảng");
//		}

//		if (index != -1) {
//			System.out.println("Tìm thấy x = " + x + " trong mảng tại ví trí " + index);
//		} else {
//			System.out.println("Không tìm thấy x = " + x + " trong mảng");
//		}

	}

	public static int soChanCuoiCung(int a[]) {
		int index = -1;
		for (int i = a.length-1; i >= 0; i--) {
			if (a[i] % 2 == 0) {
				index = i;
				break;
			}
		}
		return index;
	}

	public static void soAmDauTien(int a[]) {
		int soAm = 0;
		int index[] = new int[a.length];
		int indexFirst = 0;
		int j = 0;
		int min = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				soAm = a[i];
				indexFirst = i;
				break;
			}
		}
		if (soAm == 0) {
			System.out.println("\nKhông có số âm trong mảng");
		} else {
			min = a[j];
			for (int i = indexFirst; i < a.length; i++) {
				if (a[i] < min) {
					min = a[i];

				}

			}

			for (int i = indexFirst; i < a.length; i++) {
				if (min == a[i]) {
					index[j] = i;
					j++;

				}

			}

			System.out.println("\nSố âm nhỏ nhất là: " + min + " xuất hiện tại vị trí: ");
			for (int i = 0; i < j; i++) {
				System.out.print(index[i] + "\t");
			}
		}

	}

	public static boolean linearSearch(int a[], int x) {
		int i = 0;

		while (i < a.length && a[i] != x) {
			i++;
		}
		if (i == a.length) {
			return false;
		} else {
			return true;
		}
	}

	/* Binary search */
	public static boolean binarySearch(int a[], int x) {
		int left = 0;
		int right = a.length - 1;
		int mid;
		do {
			mid = (left + right) / 2;
			if (a[mid] == x) {
				return true;
			} else if (a[mid] < x) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		} while (left <= right);
		return false;
	}

	public static int binarySearch1(int a[], int x) {
		int left = 0;
		int right = a.length - 1;
		int mid;
		do {
			mid = (left + right) / 2;
			if (a[mid] == x) {
				return mid;
			} else if (a[mid] < x) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		} while (left <= right);
		return -1;
	}

	/* End */
	public static int linearSearch1(int a[], int x) {
		int index = -1; // chưa tìm thấy
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				index = i;
				break;
			}
		}
		return index; // ko tìm thấy
	}

	public static int nhapN(Scanner scan) {
		int n;
		do {
			System.out.println("Nhập n > 1 ");
			n = Integer.parseInt(scan.nextLine());
		} while (n < 1);
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
		System.out.println("\nXuất mảng cách 1: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");

		}
	}

}
