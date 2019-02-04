package com.java.algos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueEmails {
	
	public static Set<String> getUniqueEmails(List<String> emailList){
		Set<String> set = new HashSet<>();
		for(String email : emailList) {
			int indexOf = email.indexOf("@");
			if(indexOf > 0) {
				String firstPart = email.substring(0, indexOf);
				int plusIndex = firstPart.indexOf("+");
				if(plusIndex > 0) {
					firstPart = firstPart.substring(0, plusIndex);
				}
				firstPart = firstPart.replace(".", "");
				firstPart = firstPart.concat(email.substring(indexOf, email.length()));
				set.add(firstPart);
			}
		}
		return set;
	}
	
	public static void main(String[] args) {
		List<String> emails = new ArrayList<>();
		emails.add("fan.li@gmail.com");
		emails.add("fan.li@yahoo.com");
		emails.add("fan.li+01@gmail.com");
		emails.add("fanli+02@gmail.com");
		Set<String> uniqueEmails = getUniqueEmails(emails);
		for(String email : uniqueEmails) {
			System.out.println(email);
		}
	}
}
