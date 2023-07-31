package com.JavaCoBan.domain;

public class Test {
	public static void main(String[] args) {
		int [] mang = {1,2};
		try {
			System.out.println(mang[1]);
		} catch (Exception e) {
			System.out.println("loi");
		} finally {
			System.out.println("finally");
		}
		System.out.println("ket thuc");
	}
}
