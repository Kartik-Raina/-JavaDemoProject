package org.opensource.kartik;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AnotherTestClass {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("test");
		list.add("test");
		list.add("kartik");
		// System.out.println(list.indexOf("test"));

		/*
		 * list.removeIf(item -> { if(item.equals("kartik")){ return true; }
		 * return false; });
		 */
		list.stream().forEach(System.out::println);
		list.removeAll(list.stream().filter((s) -> s.startsWith("t")).collect(Collectors.toList()));

		System.out.println(list);
		Integer a = 9;
		int b = 9;

		if (a.equals(b)) {
			System.out.println("equals");
		}

		if (a == b) {
			System.out.println(" == ");
		}
		TestFinalClass testFinalClass = new TestFinalClass();
		testFinalClass.a = 10;
		System.out.println(testFinalClass);
		
		TestFinalClass testFinalClass1 = new TestFinalClass();
		System.out.println(testFinalClass1);
		testReturn();
		// System.out.println(+"11");
	}

	@SuppressWarnings("finally")
	public static int testReturn() {
		try {
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			return 3;
		}
	}
}


