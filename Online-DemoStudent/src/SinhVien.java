/*
 * Mục đích: Xử lý nghiệp vụ liên quan đến sinh viên
 * Người tạo: Lê Tiến Đạt
 * Ngày tạo: 20/4/2020
 * Version: 1.0
 * */
public class SinhVien {

	private String hoTen;
	private String email;
	private float diemToan;
	private float diemHoa;
	private float diemLy;
	private float diemTB;
	
	//phương thức khởi tạo mặc định không tham số
	public SinhVien() {
		
	}
	
	//Phương thức khởi tạo sử dụng 2 tham số để
	//truyền dữ liệu cho thuộc tính
	public SinhVien(String hoTen, String email) {
		this.hoTen = hoTen;
		this.email = email;
	}
	//phương thức truy xuất các thuộc tính thành viên
	public String getHoTen() {
		return this.hoTen;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	//phương thức thiết lập giá trị các thuộc tính thành viên
	public void setHoTen(String ten) {
		this.hoTen = ten;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public float getDiemToan() {
		return this.diemToan;
	}
	
	public float getDiemHoa() {
		return this.diemHoa;
	}
	
	public float getDiemLy() {
		return this.diemLy;
	}
	
	public void setDiemToan(float toan) {
		this.diemToan = toan;
	}
	
	public void setDiemHoa(float hoa) {
		this.diemHoa = hoa;
	}
	
	public void setDiemLy(float ly) {
		this.diemLy = ly;
	}
	
	public float getDiemTB() {
		return this.diemTB;
	}
	public void tinhDiemTB() {
		this.diemTB = (this.diemToan + this.diemLy + this.diemHoa)/3;
	}

}
