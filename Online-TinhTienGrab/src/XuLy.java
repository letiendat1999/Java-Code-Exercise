import java.util.Scanner;

public class XuLy {

	static final int GRAB_CAR_1KM = 8000;
	static final int GRAB_SUV_1KM = 9000;
	static final int GRAB_BLACK_1KM = 10000;

	static final int GRAB_CAR_1TO_19 = 7500;
	static final int GRAB_SUV_1TO_19 = 8500;
	static final int GRAB_BLACK_1TO_19 = 9500;

	static final int GRAB_CAR_UPPER_19 = 7000;
	static final int GRAB_SUV_UPPER_19 = 8000;
	static final int GRAB_BLACK_UPPER_19 = 9000;

	static final int GRAB_CAR_WAIT = 2000;
	static final int GRAB_SUV_WAIT = 3000;
	static final int GRAB_BLACK_WAIT = 3500;

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int loaiGrab = chonGrab(scan);
		float soKm = nhapSoKm(scan);
		int thoiGianCho = nhapThoiGianCho(scan);
		
		float tienTra = tinhTienTra(loaiGrab, thoiGianCho, soKm);
		
		System.out.println("Số tiền cần trả là: "+tienTra);
		inChiTiet(loaiGrab, soKm, thoiGianCho);

	}
	
	public static float nhapSoKm(Scanner scan) {
		float soKm;
		System.out.println("Vui lòng nhập vào số Km: ");
		soKm = Float.parseFloat(scan.nextLine());
		return soKm;
		
	}
	
	public static int nhapThoiGianCho(Scanner scan) {
		int thoiGianCho;
		System.out.println("Vui lòng nhập vào thời gian chờ: ");
		thoiGianCho = Integer.parseInt(scan.nextLine());
		return thoiGianCho;
		
	}
	
	public static int chonGrab(Scanner scan) {
		int loai;

		System.out.println("Vui lòng chọn loại grab: ");
		System.out.println("1. Grab car");
		System.out.println("2. Grab SUV");
		System.out.println("3. Grab black");
		loai = Integer.parseInt(scan.nextLine());
		return loai;
	}

	public static float tinhTienKmDauTien(int loaiGrab) {
		float tien = 0;
		if (loaiGrab == 1) {
			tien = GRAB_CAR_1KM;
		} else if (loaiGrab == 2) {
			tien = GRAB_SUV_1KM;
		} else {
			tien = GRAB_BLACK_1KM;
		}
		return tien;
	}

	public static float tinhTienKm1Den19(int loaiGrab, float soKm) {
		float tien = 0;
		if (loaiGrab == 1) {
			tien = GRAB_CAR_1KM + (soKm - 1) * GRAB_CAR_1TO_19;
		} else if (loaiGrab == 2) {
			tien = GRAB_SUV_1KM + (soKm - 1) * GRAB_SUV_1TO_19;
		} else {
			tien = GRAB_BLACK_1KM + (soKm - 1) * GRAB_BLACK_1TO_19;
		}
		return tien;
	}

	public static float tinhTienKmTren19(int loaiGrab, float soKm) {
		float tien = 0;
		if (loaiGrab == 1) {
			tien = GRAB_CAR_1KM + 18 * GRAB_CAR_1TO_19 + (soKm - 19) * GRAB_CAR_UPPER_19;
		} else if (loaiGrab == 2) {
			tien = GRAB_SUV_1KM + 18 * GRAB_SUV_1TO_19 + (soKm - 19) * GRAB_SUV_UPPER_19;
		} else {
			tien = GRAB_BLACK_1KM + 18 * GRAB_BLACK_1TO_19 + (soKm - 19) * GRAB_BLACK_UPPER_19;
		}
		return tien;
	}

	public static float tinhTienCho(int loaiGrab, int thoiGianCho) {
		float tien = 0;
	
		if (thoiGianCho >= 3) {
			int soLanTinh = Math.round((thoiGianCho*1.0f)/3);
			if(loaiGrab==1) {
				tien = soLanTinh*GRAB_CAR_WAIT;
			}
			else if(loaiGrab==2) {
				tien = soLanTinh*GRAB_SUV_WAIT;
			}
			else {
				tien = soLanTinh*GRAB_BLACK_WAIT;
			}
		}
		
		return tien;
		
	}
	
	public static float tinhTienTra(int loaiGrab, int thoiGianCho, float soKm) {
		float tienTra = 0;
		if(soKm<=1) {
			tienTra = tinhTienKmDauTien(loaiGrab) + tinhTienCho(loaiGrab, thoiGianCho);
		}
		else if(soKm>1 && soKm<19) {
			tienTra = tinhTienKm1Den19(loaiGrab, soKm) + tinhTienCho(loaiGrab, thoiGianCho);
		}
		else {
			tienTra = tinhTienKmTren19(loaiGrab, soKm) + tinhTienCho(loaiGrab, thoiGianCho);
		}
		return tienTra;
	}
	
	public static void inDongKm1(int loaiGrab, float soKm) {
		int donGia;
		if(loaiGrab==1) {
			donGia = GRAB_CAR_1KM;
		}
		else if(loaiGrab==2) {
			donGia = GRAB_SUV_1KM;
		}
		else {
			donGia = GRAB_BLACK_1KM;
		}
		
		if(soKm < 1) {
			System.out.println("Số Km đầu tiên \t\t" + soKm + "\t\t" + donGia + "\t\t\t"+ donGia );
		}
		else {
			System.out.println("Số Km đầu tiên \t\t" + 1 + "\t\t" + donGia + "\t\t\t"+ donGia );
		}
	}
	public static void inDongKm1Den19(int loaiGrab, float soKm) {
		int donGia;
		if(loaiGrab==1) {
			donGia = GRAB_CAR_1TO_19;
		}
		else if(loaiGrab==2) {
			donGia = GRAB_SUV_1TO_19;
		}
		else {
			donGia = GRAB_BLACK_1TO_19;
		}
		
		inDongKm1(loaiGrab, soKm);
		if(soKm<19) {
			System.out.println("Từ 2 đến "+(soKm-1) + "\t\t" + (soKm-1) + "\t\t" + donGia + "\t\t\t" + donGia*(soKm-1));
		}
		else {
			System.out.println("Từ 2 đến "+ 18 + "\t\t" + 18 + "\t\t" + donGia + "\t\t\t" + donGia*18);
		}
	
	}
	public static void inDongKmTren19(int loaiGrab, float soKm) {
		int donGia;
		if(loaiGrab==1) {
			donGia = GRAB_CAR_UPPER_19;
		}
		else if(loaiGrab==2) {
			donGia = GRAB_SUV_UPPER_19;
		}
		else {
			donGia = GRAB_BLACK_UPPER_19;
		}
		inDongKm1Den19(loaiGrab,soKm);
		System.out.println("Từ 19 đến " + soKm + "\t\t" + (soKm - 19) + "\t\t" + donGia + "\t\t\t" + donGia*(soKm-19));
		
	}
	
	public static void inThoiGianCho(int loaiGrab, int thoiGianCho) {
		int donGia;
		if(loaiGrab==1) {
			donGia = GRAB_CAR_WAIT;
		}
		else if(loaiGrab==2) {
			donGia = GRAB_SUV_WAIT;
		}
		else {
			donGia = GRAB_BLACK_WAIT;
		}
		
		float tienCho = tinhTienCho(loaiGrab, thoiGianCho);
		System.out.println("Thời gian chờ \t\t"+thoiGianCho+"\t\t"+donGia+"\t\t\t"+tienCho);
	}
	
	public static void inChiTiet(int loaiGrab, float soKm, int thoiGianCho) {
		System.out.println("*********************************** CHI TIẾT HÓA ĐƠN **********************");
		System.out.println("CHI TIẾT \t\t SỬ DỤNG  \t ĐƠN GIÁ (1000đ)\t THÀNH TIỀN (1000đ)");
		if(soKm<1) {
			inDongKm1(loaiGrab, soKm);
		}
		else if(1<soKm && soKm <19) {
			inDongKm1Den19(loaiGrab, soKm);
		}
		else {
			inDongKmTren19(loaiGrab, soKm);
		}
		
		inThoiGianCho(loaiGrab, thoiGianCho);
		float tongTien = tinhTienTra(loaiGrab, thoiGianCho, soKm);
		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t\t" + tongTien);
	}

}
