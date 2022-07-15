package keoBuaBao;

import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String computer;
		String human;
		int so;
		
		do {
			
			human = human(scan);
			computer = computer();
			System.out.println("Bạn đã chọn: "+human);
			System.out.println("Máy tính đã chọn: "+computer);
			
			if(human=="Kéo" ) {
				if(computer == "Bao") {
					System.out.println("Chúc mừng bạn đã thắng");
				}
				else if(computer == "Búa") {
					System.out.println("Rất tiếc bạn đã thua");
				}
				else {
					System.out.println("Bạn hòa với máy");
				}
			}else if(human == "Búa") {
				if(computer == "Bao") {
					System.out.println("Rất tiếc bạn đã thua");
				}
				else if(computer == "Búa") {
					System.out.println("Bạn hòa với máy");
				}
				else {
					System.out.println("Chúc mừng bạn đã thắng");
				}
			}else if(human == "Bao") {
				if(computer == "Bao") {
					System.out.println("Bạn hòa với máy");
				}
				else if(computer == "Búa") {
					System.out.println("Chúc mừng bạn đã thắng");
				}
				else {
					System.out.println("Rất tiếc bạn đã thua");
				}
			}
			System.out.println("Nhập 1 số khác 0 để chơi tiếp");
			System.out.println("Nếu muốn dừng cuộc chơi nhập số 0");
			so = Integer.parseInt(scan.nextLine());
			
			
		}while(so!=0);
		
		
	}
	
	public static String computer() {
		int max = 2;
		int min = 0;
		int computer = (int)((Math.random()) * ((max - min) + 1) + min);
		String computerString="1";
		
		
		if(computer==0) {
			computerString = "Kéo";
		}
		else if(computer==1) {
			computerString = "Búa";
		}
		else if(computer==2) {
			computerString = "Bao";
		}
		return computerString;
	}
	
	public static String human(Scanner scan) {
		String humanString="1";
		
		System.out.println("Vui lòng nhập vào: ");
		System.out.println("1. Kéo");
		System.out.println("2. Búa");
		System.out.println("3. Bao");
		int human = Integer.parseInt(scan.nextLine());
		
		if(human==1) {
			humanString = "Kéo";
		}
		else if(human==2) {
			humanString = "Búa";
		}
		else if(human==3) {
			humanString = "Bao";
		}
		return humanString;
	}
	
	
	
	
}
