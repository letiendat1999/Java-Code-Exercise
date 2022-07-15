import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		SinhVien sv1 = new SinhVien();
	
		sv1.setHoTen("Le Tien Dat");
		sv1.setEmail("letiendat22071999@gmail.com");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập họ tên sinh viên: ");
		String ten = scan.nextLine();
		System.out.println("Nhập email sinh viên: ");
		String email = scan.nextLine();
		
		SinhVien sv2 = new SinhVien(ten, email);
		
		System.out.println("Vui lòng nhập điểm toán: ");
		float toan = Float.parseFloat(scan.nextLine());
		
		System.out.println("Vui lòng nhập điểm lý: ");
		float ly = Float.parseFloat(scan.nextLine());
		
		System.out.println("Vui lòng nhập điểm hóa: ");
		float hoa = Float.parseFloat(scan.nextLine());
		
		sv2.setDiemToan(toan);
		sv2.setDiemLy(ly);
		sv2.setDiemHoa(hoa);
		sv2.tinhDiemTB();
		
		System.out.println("Tên: "+sv1.getHoTen()+" - Email: "+sv1.getEmail());
		System.out.println("Tên: "+sv2.getHoTen()+" - Email: "+sv2.getEmail() + " - điểm TB: "+sv2.getDiemTB());
		
		
	}
	
	
}
