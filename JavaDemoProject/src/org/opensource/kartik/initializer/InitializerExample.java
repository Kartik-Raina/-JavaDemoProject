package org.opensource.kartik.initializer;

public class InitializerExample {

	static int count;
	int i;
	
	static{
		System.out.println("Static Initializers");
		System.out.println("Count when static Initializer is run is "+count);
	}
	
	{
		count++;
		System.out.println("When Instance Initializer is called");
		System.out.println("Count when Instance Initializer is run is "+count);
	}
	
	public InitializerExample() {
		count++;
		System.out.println("When Constructor is called");
		System.out.println("Count when Constructor is run is "+count);
	}
	
	public static void main(String[] args){
		InitializerExample a = new InitializerExample();
		InitializerExample b = new InitializerExample();
		InitializerExample c = new InitializerExample();
	}
}
