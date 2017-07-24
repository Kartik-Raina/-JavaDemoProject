package org.opensource.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class NewClass1{

	private int i;

	private String s = "Kartik"; 
	
	NewClass1(int i) {
		this.i = i;
	}

	NewClass1(String s){
		this.s = s;
	}
	
	NewClass1() {
		i = 10;
	}

	int getVal() {
		return i;
	}

	void setVal(int i) {
		this.i = i;
	}
	
	String getS(){
		return this.s;
	}
}

public class MyClass extends NewClass1  implements Serializable {

	private String s;
	//private NewClass1 n;

	MyClass(int s) {
		super(s);
	}
	
	MyClass(String s) {
		super(s);
		this.s = s;
		setVal(20);
	}

	public String toString() {
		return s + " " + getVal() +"  "+getS();
	}

	public static void main(String args[]) {
		MyClass m = new MyClass("aaa");
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serial.txt"));
			oos.writeObject(m); // writing current state
			oos.flush();
			oos.close();
			System.out.println(m); // display current state object value
		} catch (IOException e) {
			System.out.print(e);
		}
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial.txt"));
			MyClass o = (MyClass) ois.readObject(); // reading saved object
			ois.close();
			System.out.println(o); // display saved object state
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}
