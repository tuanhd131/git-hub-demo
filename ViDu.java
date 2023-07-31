package com.JavaCoBan.domain;

import java.util.Scanner;

public class ViDu {
	static Scanner scan = new Scanner(System.in);

	public static boolean snt(int n) {

		if (n < 2) {
			return false;
		}
		int a = (int) Math.sqrt(n);
		for (int b=2; b <= a; b++) {
			if (n % b == 0) {
				return false;
			}
		}
		return true;

		// System.out.print(n + " ");
	}

	public static void main(String[] args) {
		System.out.print("Nhap s= ");
		int s = scan.nextInt();
		System.out.printf("so nguyen to dau tien la: \n", s);
		int x = 0;
		int i = 2;
		while (x < s) {
			if (snt(i)) {
				System.out.print(i + " ");
				x++;
			}
			i++;
		}

	}
}
