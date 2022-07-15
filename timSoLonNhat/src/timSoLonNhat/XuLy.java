package timSoLonNhat;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	
	public static float timSoLonNhat(float x, float y, float z) {
		float max=x;
		if(y>max) {
			max = y;
		}
		if(z>max) {
			max =z;
		}
		
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * B1: khai báo 3 biến a,b,c,max
		 * B2: nhập a,b,c
		 * B3: cho max = a
		 * nếu max < b hay c
		 * thì gán max = b hay c
		 * B4: xuất max
		 * */
		
		float a;
		float b;
		float c;
		float max;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Mời nhập số thứ 1: ");
		a = Float.parseFloat(scan.nextLine());
		
		System.out.print("Mời nhập số thứ 2: ");
		b = Float.parseFloat(scan.nextLine());
		
		System.out.print("Mời nhập số thứ 3: ");
		c = Float.parseFloat(scan.nextLine());
		
		max = timSoLonNhat(a, b, c);
		
		System.out.println("Số lớn nhất là: " + max);
	}

}
