package org.opensource.kartik.statics;

import java.util.Comparator;

import org.opensource.kartik.pack1.Class1;

public class StaticInnerClass implements Comparator<Class1>{

	static String str1 = "Kartik";

	

	static class StatInnerClass {
		static String str3 = "Amar";

		public void staticInnerClass() {
			System.out.println(str1);
		}
		
			public static class cccc{
				public void a(){
					System.out.println(str3);
				}
			}

	}
	
	class InnerClass {
		String str2 = "Raina";

		public void innerTest() {
			System.out.println(str2 + str1);
			System.out.println(StatInnerClass.str3);

		}

		public class aaa {

		} 
	}

	public static void main(String[] args) {
		StaticInnerClass class1 = new StaticInnerClass();

		StaticInnerClass.InnerClass inner = class1.new InnerClass();
		System.out.println(inner.str2);

		StaticInnerClass.StatInnerClass statInn = new StaticInnerClass.StatInnerClass();
		StaticInnerClass.StatInnerClass.cccc aaaa = new StaticInnerClass.StatInnerClass.cccc();
	}

	@Override
	public int compare(Class1 o1, Class1 o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
