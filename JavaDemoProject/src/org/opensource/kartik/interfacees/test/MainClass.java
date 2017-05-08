package org.opensource.kartik.interfacees.test;

public class MainClass implements Interface1, Interface2 {

	public static void main(String[] args) {
		Interface1 inter1 = new MainClass();
		System.out.println(inter1.testString());
		Interface1.staticTestString();
	}
}
