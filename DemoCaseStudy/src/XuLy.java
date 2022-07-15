import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * B1: Khai báo các biến tenPhim, giaVeLon,
	 * giaVeNho, soVeLon, soVeNho, phanTramTuThien,
	 * tongThu, tuThien, conLai
	 * B2: Thông báo nhập tên Phim
	 * B3: lấy dữ liệu nhập vào biến tên phim
	 * B4: Thông báo nhập giá vé người lớn
	 * B5: Lấy dữ liệu nhập vào biến giá vé người lớn
	 * B6: Thông báo nhập giá vé trẻ em
	 * B7: Lấy dữ liệu nhập vào biến giá vé trẻ em
	 * B8: Thông báo nhập số vé người lớn đã bán
	 * B9: Lấy dữ liệu nhập cho biến số vé người lớn đã bán
	 * B10: Thông báo nhập số vé trẻ em đã bán
	 * B11: Lấy dữ liệu nhập cho biến số vé trẻ em đã bán
	 * B12: Thông báo nhập % tiền làm từ thiện
	 * B13: Lấy dữ liệu nhập % tiền từ thiện
	 * B14: Tính tổng tiền thu được
	 * B15: Tính tiền cho từ thiện
	 * B16: Tính tiền còn lại sau khi trừ đi tiền từ thiện
	 * B17: xuất kq
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int  NUM_CHAR_PADD_LEFT = -100;
		
		String tenPhim;
		int giaVeLon;
		int giaVeNho;
		int soVeLon;
		int soVeNho;
		int phanTramTuThien;
		float tongThu;
		float tuThien;
		float conLai;
		
		Scanner nhap = new Scanner(System.in);
		
		//nhập tên phim
		System.out.print("Vui lòng nhập tên phim: ");
		tenPhim = nhap.nextLine();
		
		//nhập giá vé người lớn
		System.out.print("Vui lòng nhập giá vé người lớn: ");
		giaVeLon = Integer.parseInt(nhap.nextLine());
		
		//nhập giá vé trẻ em
		System.out.print("Vui lòng nhập giá vé trẻ em: ");
		giaVeNho = Integer.parseInt(nhap.nextLine());
		
		//nhập số vé người lớn
		System.out.print("Vui lòng nhập số vé người lớn: ");
		soVeLon = Integer.parseInt(nhap.nextLine());
		
		//nhập số vé trẻ em
		System.out.print("Vui lòng nhập số vé trẻ em: ");
		soVeNho = Integer.parseInt(nhap.nextLine());
		
		//nhập % từ thiện
		System.out.print("Vui lòng nhập phần trăm làm từ thiện: ");
		phanTramTuThien = Integer.parseInt(nhap.nextLine());
		
		tongThu = giaVeLon*soVeLon + giaVeNho*soVeNho;
		tuThien = tongThu*(((1.0f)*phanTramTuThien)/100);
		conLai = tongThu - tuThien;
		
		String text;	//khai báo text
		
		//xuất ra tên phim		 
		text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s", "Tên-phim:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + tenPhim);
		
		//xuất ra số vé đã bán
		text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s", "Số-vé-đã-bán:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + (soVeLon+soVeNho));
		
		//xuất ra tổng thu
		text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s", "Doanh-thu:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + tongThu);
		
		//xuất ra phần trăm từ thiện
		text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s", "Trích-phần-trăm-từ-thiện:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + phanTramTuThien+"%");
		
		//xuất ra tổng tiền trích từ thiện
		text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s", "Tổng-tiền-trích-từ-thiện:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + tuThien);
		
		//xuất ra tổng tiền còn lại
		text = String.format("%1$" + NUM_CHAR_PADD_LEFT + "s", "Tổng-tiền-thu-được-sau-khi-trừ:").replace(' ', '.').replace('-', ' ');
		System.out.println(text + conLai);
		
		
		
	}

}
