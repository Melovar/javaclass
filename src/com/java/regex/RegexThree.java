package com.java.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexThree {

	public static void main(String[]args) {
		
		List emails = new ArrayList();
		emails.add("user@domain.com");
		emails.add("user@domain.com.in");
		emails.add("user1@domain.com");
		emails.add("user.name@domain.com");
		emails.add("user1@domain.co.jp");
		emails.add("user@domain.com");
		
		emails.add("user#domain.com");
		emails.add("@yahoo.com");
		
		String regex="^(.+)@(.+)$";
		
		
		Pattern patterns=Pattern.compile(regex);
		for(String email:emails) {
			Matcher matcher= pattern.matcher(email);
			System.out.println(email+""+ matcher.matches());
			
		}
	}
	
	
}