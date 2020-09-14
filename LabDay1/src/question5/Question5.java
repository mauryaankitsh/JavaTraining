package question5;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		int n;
		System.out.print("Enter the number of rows of pascal Triangle :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.close();
		int[][] a = new int[n][n];for(
		int i = 0;i<n;i++)
		{
			for (int j = 0; j <= i; j++) {
				if (j == 0 || j == i) {
					a[i][j] = 1;
				} else {
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
				}
			}
		}
		for(int i = 0;i<n;i++)
		{
			for (int j = 0; j <= i; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
