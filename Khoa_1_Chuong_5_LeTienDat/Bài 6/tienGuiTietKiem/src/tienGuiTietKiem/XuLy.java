package tienGuiTietKiem;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soTienGui = nhapSoTienGui(scan);
		int laiSuat = nhapLaiSuat(scan);
		int soTienMongMuon = nhapSoTienMongMuon(scan);
		
		int thoiGianCho = thoiGianCho(soTienGui, laiSuat, soTienMongMuon);
		
		System.out.println("Thời gian chờ để từ số vốn "+soTienGui+" anh X có thể có "+soTienMongMuon+" là: "+thoiGianCho+" năm");
	}
	
	public static int nhapSoTienGui(Scanner scan) {
		System.out.println("Nhập số tiền muốn gửi tiết kiệm ban đầu: ");
		int soTienGui = Integer.parseInt(scan.nextLine());
		return soTienGui;
	}
	
	public static int nhapLaiSuat(Scanner scan) {
		System.out.println("Nhập lãi suất theo năm: ");
		int laiSuat = Integer.parseInt(scan.nextLine());
		return laiSuat;
	}
	
	public static int nhapSoTienMongMuon(Scanner scan) {
		System.out.println("Nhập số tiền mong muốn có để mua xe: ");
		int soTienMongMuon = Integer.parseInt(scan.nextLine());
		return soTienMongMuon;
	}
	
	public static int thoiGianCho(int soTienGui, int laiSuat, int soTienMongMuon) {
		int soNam = (soTienMongMuon-soTienGui)/(soTienGui*laiSuat/100);
		return soNam;
	}
}
