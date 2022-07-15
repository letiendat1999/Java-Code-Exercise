package tinhGiaDonHang;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	/*
	 * B1: khai báo các biến name, amount, price, payment
	 * B2: thông báo nhập tên đơn hàng
	 * B3: nhập tên đơn hàng
	 * B4: thông báo nhập số lượng đơn hàng
	 * B5: nhập số lượng đơn hàng
	 * B6: thông báo nhập giá đơn hàng
	 * B7: nhập giá đơn hàng
	 * B8: nếu amount >= 50 và amount <=100
	 * payment = amount *price - amount*price*8%
	 * B9: nếu amount > 100 
	 * payment = amount*price - amount*price*12%
	 * B10: còn ngược lại thì
	 * payment = amount * price
	 * B11: xuất kết quả
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int amount;
		float price;
		float payment;
		final int AMOUNT_1 = 50;
		final int AMOUNT_2 = 100;
		final float DISCOUNT_1 = 0.92f;
		final float DISCOUNT_2 = 0.88f;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Vui lòng nhập tên đơn hàng: ");
		name = scan.nextLine();
		
		System.out.print("Vui lòng nhập số lượng đơn hàng: ");
		amount = Integer.parseInt(scan.nextLine());
		
		System.out.print("Vui lòng nhập giá đơn hàng: ");
		price = Float.parseFloat(scan.nextLine());
		
//		payment = ((amount>=AMOUNT_1) && (amount <=AMOUNT_2)) 	//vd amount = 60
//				?(AMOUNT_1*price + (amount-AMOUNT_1)*price*DISCOUNT_1) 
//				:((amount > AMOUNT_2) ?(AMOUNT_2*price + (amount-AMOUNT_2)*price*DISCOUNT_2) :(amount*price));
//		System.out.println("Tên: " + name + "\nSố lượng: " + amount 
//				+ "\nĐơn giá: " + price + "\nThành tiền: ");
		
		if(amount >= AMOUNT_2) {
			payment = AMOUNT_2*price + (amount - AMOUNT_2)*price*DISCOUNT_2;
		}
		else if((amount < AMOUNT_2) && (amount > AMOUNT_1)) {
			payment = AMOUNT_1*price + (amount-AMOUNT_1)*price*DISCOUNT_1;
		}
		else {
			payment = amount*price;
		}
		System.out.println("Tên: " + name + "\tSố lượng: " + amount + "\tĐơn giá: " + price + "\tThành tiền: "+ payment);
	}

}
