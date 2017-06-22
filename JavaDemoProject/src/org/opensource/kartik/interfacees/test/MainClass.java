package org.opensource.kartik.interfacees.test;

public class MainClass implements Interface1, Interface2 {

	public static void main(String[] args) {
		int i = 5;
		calculateHalf(i);
		
		Interface1 inter1 = new MainClass();
		System.out.println(inter1.testString());
		Interface1.staticTestString();
	}

	@Override
	public String testString() {
		// TODO Auto-generated method stub
		return Interface1.super.testString();
	}
	
	public static void calculateHalf(Integer i){
		Object ii = i/2;
		System.out.println(ii);
		//calculateHalf(ii);
		
	}
}
