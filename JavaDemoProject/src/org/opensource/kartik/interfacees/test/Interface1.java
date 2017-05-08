package org.opensource.kartik.interfacees.test;

public interface Interface1 {

	default String testString(){
		return "test1";
	}
	
	static String staticTestString(){
		return "static String";
	}
}
