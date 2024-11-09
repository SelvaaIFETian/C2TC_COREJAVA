package tns.ifet.dayeight.array;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDimArray {

	public static void main(String[] args) {
		int r;
		Scanner sc=new Scanner(System.in);
		r=sc.nextInt();
		int[] a = new int[r];
		for (int i=0;i<r;i++) {
				a[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<r;i++) {
				System.out.print(a[i]+" ");
		}
		//using toString method
		System.out.println(Arrays.toString(a));
	}

}
