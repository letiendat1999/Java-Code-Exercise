package test;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{3,2,1},{1,2,3}};
		int value = 0;
		
		for (int row = 1; row < arr.length; row++) {
			for (int col = 1; col < arr[0].length; col++) {
				if (arr[row][col] % 2 == 1) {
					arr[row][col] = arr[row][col]+1;
				}
				if(arr[row][col] % 2 == 0) {
					arr[row][col] = arr[row][col]*2;
				}
			}
		}

		for (int row = 1; row < arr.length; row++) {
			for (int col = 1; col < arr[0].length; col++) {
				System.out.print(arr[row][col] + "\t");
			}
		}
	}

}
