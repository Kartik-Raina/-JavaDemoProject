package org.opensource.kartik;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.opensource.kartik.AnotherTestClass;

public class DemoTestClass {
    final String a;
    
    static{
    	//a = "aaaa";
    }
    {
    		a = "test";
    }
     public DemoTestClass() {
		//a = "one";
	}
	public static void main(String[] args) {
		try {
			List<Integer> doubleList = new ArrayList<>();
			/*PojoClass pojoClass = new PojoClass();
			
			List<String> strList = new ArrayList<>();
			strList.add("1");
			pojoClass.setList(strList);
			
			AnotherTestClass anotherTestClass = new AnotherTestClass();
			DemoTestClass demoTestClassObj = new DemoTestClass();
			File file = new File("complex.xsl");
			System.out.println(file.getCanonicalPath());
			System.out.println(file.getAbsolutePath());
			
			String yes = "true";
			String no = "false";
			System.out.println(Boolean.parseBoolean(yes) +" ----- "+Boolean.getBoolean(no));
			demoTestClassObj.someMethod();
			strList.add("2");
			
			System.out.println(pojoClass.getList().size()+"--------------------");*/
			
			int i = 0;
			while(true){
				Integer d = ThreadLocalRandom.current().nextInt(0, 10);
				Thread.sleep(1000);
				if(doubleList.contains(d)){
					System.out.println("The number repeated is "+d+" and it has come after "+i+" iterations");
					i=0;
				}else{
					System.out.println(d);
					doubleList.add(d);
				}
				i++;
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void someMethod(){
		System.out.println("1");
		{
			System.out.println("2");
		}
		System.out.println("3");
	}

}
