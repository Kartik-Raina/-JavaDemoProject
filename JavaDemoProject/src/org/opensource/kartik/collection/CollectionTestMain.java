package org.opensource.kartik.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionTestMain {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("Kartik", "Raina");
		
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		List<Employee> empList =  new ArrayList<>();
		empList.add(new Employee("Kartik", 1, true));
		empList.add(new Employee("Vikram", 2, true));
		empList.add(new Employee("Robin", 3, false));
		System.out.println(empList.toString());
		
		// get the iterator
		Iterator<String> it = list.iterator();

		// manipulate list while iterating
		while (it.hasNext()) {
			System.out.println("list is:" + list);
			String str = it.next();
			System.out.println(str);
			if (str.equals("2"))
				list.remove("5");
			if (str.equals("3"))
				list.add("3 found");
			//System.out.println("list is:" + list);
			// below code don't throw ConcurrentModificationException
			// because it doesn't change modCount variable of list
			if (str.equals("4"))
				list.set(1, "4");
		}
		
		System.out.println("list is:" + list);

	}

}
