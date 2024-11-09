package tns.ifet.dayeight.array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArray {

	public static void main(String[] args) {
		int r,c;
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		c=sc.nextInt();
		int[][] a = new int[r][c];
		for (int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		sc.close();
//		for(int i=0;i<r;i++) {
//			for(int j=0;j<c;j++) {
//				System.out.print(a[i][j]+" ");
//			}
//		}
		//use of user define method
//		MLArray.printArray(a);
//		//using toString method
//		System.out.println(Arrays.toString(a));
	}

}
