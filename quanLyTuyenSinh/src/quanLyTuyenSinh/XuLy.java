package quanLyTuyenSinh;

import java.util.Scanner;

public class XuLy {
	
	static final float khuVucA = 2f;
	static final float khuVucB = 1f;
	static final float khuVucC = 0.5f;
	static final float khuVucX = 0f;
	
	static final float doiTuong0 = 0f;
	static final float doiTuong1 = 2.5f;
	static final float doiTuong2 = 1.5f;
	static final float doiTuong3 = 1f;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*BÀI 1:
		 * Đầu vào: 
		 * - Điểm chuẩn hội đồng
		 * - Điểm 3 môn thí sinh
		 * - Khu vực
		 * - Đối tượng
		 *
		 * B1: khai báo các biến diemChuan, diemMon1, diemMon2, diemMon3, khuVuc, dau, tongDiem, diemUuTien
		 * B2: tạo các hàm thông báo và nhập vào điểm chuẩn, điểm 3 môn và khu vực
		 * B3: Tạo hàm tính điểm ưu tiên
		 * nếu ko thuộc khu vực hoặc đối tượng thì diemUuTien =0
		 * Nếu thuộc đối tượng hay khu vực thì cộng theo bảng 
		 * B4: tạo hàm tính điểm tổng
		 * tongDiem = diemMon1 + diemMon2 + diemMon3 + diemUuTien
		 * B5: Tạo hàm xem xét đậu hay rớt
		 * Nếu tongDiem >= diemChuan thì đậu
		 * ngược lại thì rớt
		 * 
		 * Đầu ra:
		 * - Đậu hay rớt
		 * - Tổng số điểm đạt được
		 * 
		 * 
		 * BÀI 2:
		 * Đầu vào:
		 * - Họ tên
		 * - Tổng thu nhập năm
		 * - Số người phụ thuộc
		 * 
		 * B1: Khai báo các biến hoTen, tongThuNhapNam, soNguoiPhuThuoc, thuNhapChiuThue, thueSuat
		 * B2: thông báo và nhập vào họ tên, tổng thu nhập năm, số người phụ thuộc
		 * B3: viết hàm tính thu nhập chịu thuế
		 * B4: viết hàm tính thuế suất
		 * B5: Xuất ra màn hình
		 * 
		 * 
		 * Đầu ra:
		 * - Họ Tên
		 * - Thu nhập chịu thuế (triệu)
		 * - Thuế suất (%)
		 * */
		
		
		//hàm main bài 1
		Scanner scan = new Scanner(System.in);
		//nhập điểm chuẩn và điểm 3 môn thi
		float diemChuan = nhapDiemChuan(scan);
		float diemMon1 = nhapDiem1(scan);
		float diemMon2 = nhapDiem2(scan);
		float diemMon3 = nhapDiem3(scan);
		
		//nhập khu vực và đối tượng
		String khuVuc = nhapKhuVuc(scan);
		int doiTuong = nhapDoiTuong(scan);
		float diemUuTien = tinhDiemUuTien(khuVuc, doiTuong);
		float diemTong = tinhTong(diemMon1, diemMon2, diemMon3, diemUuTien);
		System.out.println("Điểm tổng của thí sinh là: "+ diemTong);
		dauHayRot(diemChuan, diemTong);
		
		//hàm main bài 2
		
		String hoTen = nhapHoTen(scan);
		float tongThuNhapNam = nhapTongThuNhapNam(scan);
		int soNguoiPhuThuoc = nhapSoNguoiPhuThuoc(scan);
		float thuNhapChiuThue = tinhThuNhapChiuThue(tongThuNhapNam, soNguoiPhuThuoc);
		int thueSuat = thueSuat(thuNhapChiuThue);
		System.out.println("Họ Tên: "  + hoTen + "\t\t\t\tThuế suất là: " + thueSuat);
		
		
	}
	
	
	//Các hàm con bài 1 
	
	//hàm nhập điểm chuẩn
	public static float nhapDiemChuan(Scanner scan) {
		float diemChuan;
		System.out.println("Vui lòng nhập điểm chuẩn hội đồng: ");
		diemChuan = Float.parseFloat(scan.nextLine());
		return diemChuan;
	}
	//hàm nhập điểm môn 1
	public static float nhapDiem1(Scanner scan) {
		float diemMon1;
		System.out.println("Vui lòng nhập điểm môn 1: ");
		diemMon1 = Float.parseFloat(scan.nextLine());
		return diemMon1;
	}
	//hàm nhập điểm môn 2
	public static float nhapDiem2(Scanner scan) {
		float diemMon2;
		System.out.println("Vui lòng nhập điểm môn 2: ");
		diemMon2 = Float.parseFloat(scan.nextLine());
		return diemMon2;
	}

	// hàm nhập điểm môn 3
	public static float nhapDiem3(Scanner scan) {
		float diemMon3;
		System.out.println("Vui lòng nhập điểm môn 3: ");
		diemMon3 = Float.parseFloat(scan.nextLine());
		return diemMon3;
	}
	//hàm nhập khu vực
	public static String nhapKhuVuc(Scanner scan) {
		String khuVuc;
		System.out.println("Vui lòng nhập khu vực: ");
		System.out.println("X. Không thuộc khu vực ưu tiên");
		System.out.println("A. Khu vực A");
		System.out.println("B. Khu vực B");
		System.out.println("C. Khu vực C");
		khuVuc = scan.nextLine();
		return khuVuc;
	}
	//hàm nhập đối tượng
	public static int nhapDoiTuong(Scanner scan) {
		int doiTuong;
		System.out.println("Vui lòng nhập đối tượng: ");
		System.out.println("0. Không thuộc đối tượng ưu tiên");
		System.out.println("1. Đối tượng 1");
		System.out.println("2. Đối tương 2");
		System.out.println("3. Đối tượng 3");
		doiTuong = Integer.parseInt(scan.nextLine());
		return doiTuong;
	}
	public static float tinhDiemUuTien(String khuVuc, int doiTuong) {
		float diemUuTien=0;
		float diemKhuVuc=0;
		float diemDoiTuong=0;
		String doiTuongA = "A";
		String doiTuongB = "B";
		String doiTuongC = "C";
		String doiTuongX = "X";
		
		if(khuVuc.compareTo(doiTuongA)==0) {
			diemKhuVuc=khuVucA;
		}
		if(khuVuc.compareTo(doiTuongB)==0) {
			diemKhuVuc=khuVucB;
		}
		if(khuVuc.compareTo(doiTuongC)==0){
			diemKhuVuc=khuVucC;
		}
		if(khuVuc.compareTo(doiTuongX)==0){
			diemKhuVuc= khuVucX;
		}
		
		if(doiTuong==0) {
			diemDoiTuong =  doiTuong0;
		}
		if(doiTuong==1) {
			diemDoiTuong= doiTuong1;
		}
		if(doiTuong==2) {
			diemDoiTuong=  doiTuong2;
		}
		if(doiTuong==3) {
			diemDoiTuong =  doiTuong3;
		}
		diemUuTien = diemDoiTuong+diemKhuVuc;
		return diemUuTien;
		
	}
	
	//hàm tính điểm tổng
	public static float tinhTong(float diemMon1, float diemMon2, float diemMon3, float diemUuTien) {
		float diemTong = diemMon1+diemMon2+diemMon3+diemUuTien;
		return diemTong;
	}
	public static void dauHayRot(float diemChuan, float diemTong) {
		if(diemTong>=diemChuan) {
			System.out.println("Thí sinh đủ điểm để qua được kỳ tuyển sinh");
		}
		else {
			System.out.println("Thí sinh không đủ điểm và rớt kỳ thi tuyển sinh");
		}
	}
	
	//Các hàm con bài 2
	public static String nhapHoTen(Scanner scan) {
		System.out.println("Vui lòng nhập họ tên: ");
		String hoTen = scan.nextLine();
		return hoTen;
	}
	public static float nhapTongThuNhapNam(Scanner scan) {
		System.out.println("Vui lòng nhập tổng thu nhập năm theo đơn vị triệu: ");
		float tongThuNhapNam = Float.parseFloat(scan.nextLine());
		return tongThuNhapNam;
	}
	
	public static int nhapSoNguoiPhuThuoc(Scanner scan) {
		System.out.println("Vui lòng nhập số người phụ thuộc: ");
		int soNguoiPhuThuoc = Integer.parseInt(scan.nextLine());
		return soNguoiPhuThuoc;
	}
	public static float tinhThuNhapChiuThue(float tongThuNhapNam, int soNguoiPhuThuoc) {
		float thuNhapChiuThue = tongThuNhapNam - 4 - soNguoiPhuThuoc*1.6f;
		return thuNhapChiuThue;
	}
	public static int thueSuat(float thuNhapChiuThue) {
		int thueSuat;
		if(thuNhapChiuThue<=60) {
			thueSuat = 5;
		}else if(thuNhapChiuThue>60 && thuNhapChiuThue<=120) {
			thueSuat = 10;
		}else if(thuNhapChiuThue>120 && thuNhapChiuThue<=210) {
			thueSuat = 15;
		}else if(thuNhapChiuThue>210 && thuNhapChiuThue<=384) {
			thueSuat = 20;
		}else if(thuNhapChiuThue>384 && thuNhapChiuThue<=624) {
			thueSuat = 25;
		}else if(thuNhapChiuThue>624 && thuNhapChiuThue<=960) {
			thueSuat = 30;
		}
		else {
			thueSuat = 35;
		}
		return thueSuat;
	}
}
