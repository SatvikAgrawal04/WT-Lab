package LAB5;

import java.util.Scanner;

public class q4 {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		obj.close();
		int[][] x = new int[n][n];
		System.out.println("Enter the elements of the matrix:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				Scanner obj1 = new Scanner(System.in);
				int y = obj1.nextInt();
				obj1.close();
				x[i][j] = y;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(x[i][j] + " ");
			}
			System.out.println(" ");
		}

	}
}