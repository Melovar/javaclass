package com.java.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexzipcode {
	
	public static void main(String[]args) {
		List<String> zipa=new ArrayList();
		//Valis Zip codes
		zips.add("12345");
		zips.add("12345-6789");
		
		//Invalid ZIP codes
		zips.add("123456");
		zips.add("1234");
		zips.add("12345-678");
		zips.add("12345-6789");
		
		
		String regex="^[0-9] {5}(?:-[0-9] {4})?$";
		
		Pattern pattern =Pattern.compile(regex);
		for (String aip:zips);
		{
			Matcher matcher=pattern.matcher(zip);
			System.out.println(zip+""+matcher.matches));
			
		}
	}

}
