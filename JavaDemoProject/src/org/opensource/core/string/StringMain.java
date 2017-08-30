package org.opensource.core.string;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;

public class StringMain {
	public static void main(String[] args) throws ParseException {
		StringMain main = new StringMain();

		Date now = new Date();

		DateFormat df = new SimpleDateFormat("yyyy-MM");
		df.setTimeZone(TimeZone.getTimeZone("GMT"));
		System.out.println("Current date and time in GMT: " + df.format(now));

		df.setTimeZone(TimeZone.getTimeZone("IST"));
		System.out.println("Current date and time in IST: " + df.format(now));
	}

	/*
	 * public void findDuplicates(String str) { char[] charArray =
	 * str.toCharArray(); Set<Character> charSet = new HashSet<>();
	 * StringBuilder stringBuilder = new StringBuilder();
	 * 
	 * for (int i = 0; i < charArray.length; i++) {
	 * if(!charSet.add(charArray[i]) && stringBuilder.indexOf(charArray[i]) >
	 * 0){ stringBuilder.append(charArray[i]);
	 * 
	 * }else{ charSet.add(charArray[i]); } } }
	 */
}
