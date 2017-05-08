package org.opensource.kartik.immutable;

import java.util.ArrayList;
import java.util.List;

public class ImmutableClassMain {
	public static void main(String[] args) {
		String str1 = "Kartik";
		String str2 = "Raina";
		List<String> stringList = new ArrayList<>();
		stringList.add("Vikram");
		stringList.add("Singh");
		
		ImmutableClass imm = new ImmutableClass(str1, str2, stringList);
		
		System.out.println("String 1: "+imm.getStr1());
		System.out.println("String 2: "+imm.getStr2());
		for (String string : imm.getStringList()) {
			System.out.println(string);
		}
		
		str1 = "aaaaa";
		str2 = "bbbbb";
		stringList.add("Amar");
		stringList.add("Singh");
		
		System.out.println("String 1: "+imm.getStr1());
		System.out.println("String 2: "+imm.getStr2());
		for (String string : imm.getStringList()) {
			System.out.println(string);
		}
		
	}
}
