package org.opensource.core.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationMain {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		TestClass testClass = new TestClass();
		testClass.setIntValue(10);
		testClass.setStringValue("Kartik");
		//testClass.setStarticStringValue("Kumar");
		//testClass.setStarticStringValue("Raina");

		File f= new File("f.txt");
		f.createNewFile();
	
		
		FileOutputStream fout = new FileOutputStream(f);
		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(testClass);
		out.flush();
		System.out.println("success");
		TestClass.starticStringValue = "Verma";
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(f));
		TestClass s = (TestClass) in.readObject();
		System.out.println(s.toString());
		System.out.println(TestClass.starticStringValue);
		
		in.close();
		f.delete();
	}

}

class TestClass implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4698629381052465814L;
	int intValue;
	String stringValue;
	static String starticStringValue;
	final String finalStringValue = "Kartik";

	public TestClass(){
		System.out.println("1111111");
	}
	public int getIntValue() {
		return intValue;
	}

	public void setIntValue(int intValue) {
		this.intValue = intValue;
	}

	public String getStringValue() {
		return stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

	public static String getStarticStringValue() {
		return starticStringValue;
	}

	public static void setStarticStringValue(String starticStringValue) {
		TestClass.starticStringValue = starticStringValue;
	}

	public String getFinalStringValue() {
		return finalStringValue;
	}

	/*@Override
	public String toString() {
		return "TestClass [intValue=" + intValue + ", stringValue=" + stringValue +"]";
	}*/
	
	@Override
	public String toString() {
		return "TestClass [intValue=" + intValue + ", stringValue=" + stringValue + ", finalStringValue="
				+ finalStringValue + ", starticStringValue=" + starticStringValue + "]";
	}

}
