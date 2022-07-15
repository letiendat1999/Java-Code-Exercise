package xepLoaiHocLuc;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * Đầu vào:họ tên, điểm môn toán, lý, hóa
	 * B1: Khai bái các biến hoTen, toan, ly, hoa, diemTrungBinh, NUM_AVER = 3, xepLoai
	 * B2: thông báo nhập họ tên
	 * B3: Nhập họ tên
	 * B4: thông báo nhập điểm toán
	 * B5: nhập điểm toán
	 * B6: thông báo nhập điểm lý
	 * B7: nhập điểm lý
	 * B8: thông báo nhập điểm hóa
	 * B9: nhập điểm hóa
	 * B10: tính điểm trung bình
	 * diemTrungBinh = (toan+ly+hoa)/NUM_AVER
	 * B11: nếu diemTrungBinh >= 8.5 thì
	 * thông báo loại giỏi
	 * B12: nếu điểm trung bình >= 6.5 và <8.5 thì
	 * thông báo loại khá
	 * B13: nếu điểm tb <6.5 và >=5 thì
	 * thông báo loại tb
	 * B14: nếu điểm tb <5 thì
	 * thông báo loại yếu
	 * Đầu ra: học lực dựa vào điểm TB
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hoTen;
		float toan;
		float ly;
		float hoa;
		float diemTrungBinh;
		final float NUM_AVER = 3.0f;
		final float loaiGioi = 8.5f;
		final float loaiKha = 6.5f;
		final float loaiTB = 5f;
		String xepLoai;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Vui lòng nhập họ tên: ");
		hoTen = scan.nextLine();
		
		System.out.print("Vui lòng nhập điểm toán: ");
		toan = Float.parseFloat(scan.nextLine());
		
		System.out.print("Vui lòng nhập điểm lý: ");
		ly = Float.parseFloat(scan.nextLine());
		
		System.out.print("Vui lòng nhập điểm hóa: ");
		hoa = Float.parseFloat(scan.nextLine());
		
		diemTrungBinh = (toan+ly+hoa)/NUM_AVER;
		if(diemTrungBinh>=loaiGioi) {
			xepLoai = "Loại Giỏi";
		}
		else if(diemTrungBinh>=loaiKha) {
			xepLoai = "Loại Khá";
		}
		else if(diemTrungBinh>=loaiTB) {
			xepLoai = "Loại Trung Bình";
		}
		else {
			xepLoai = "Loại Yếu";
		}
		System.out.println("Họ tên: " + hoTen +"\tĐiểm Trung Bình: " + diemTrungBinh + "\tXếp loại học lực: " + xepLoai);
	}

}
