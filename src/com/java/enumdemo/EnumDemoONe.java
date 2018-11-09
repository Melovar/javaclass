package com.java.enumdemo;

public class EnumDemoONe {
	public static void main(String[]args) {
		Countries code= Countries.CANADA;
		System.out.println(code.getCountryCode());
		
		Countries code1= Countries.USA;
		System.out.println(code1.getCountryCode());
	}

}
