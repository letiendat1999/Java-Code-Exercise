import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int edge1;	//cạnh góc vuông 1
		int edge2;	//cạnh góc vuông 2
		Scanner nhap = new Scanner(System.in);
		System.out.println("Vui lòng nhập vào cạnh 1: ");
		edge1 = Integer.parseInt(nhap.nextLine());
		System.out.println("Vui lòng nhập vào cạnh 2: ");
		edge2 = Integer.parseInt(nhap.nextLine());
		double edge3 = Math.sqrt(edge1*edge1 + edge2*edge2);
		System.out.println("Cạnh huyền là: " + edge3);
	}

}
