package soNguyenDuongN;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Để 1+2+...+n>1000 với n nhỏ nhất thì: ");
		timSoNguyenDuongN();
	}
	/*
	 * nếu tổng > 1000 thì thoát, tìm số i gần nhất
	 * */
	
	public static void timSoNguyenDuongN() {
		int n;
		int i = 1;
		float tong=0;
		do {
			tong+=i;
			if(tong>1000) {
				System.out.println("n = "+i);
			}
			i++;
		}while(tong<=1000);
	
		
	}

}
