package org.opensource.kartik.multithread.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MultiThreadCollectionTest {

	public static void main(String[] args) {
		
		int num = 1000;
		List<String> dummyList = new CopyOnWriteArrayList<>();
		Collections.synchronizedList(dummyList);
		Runnable task1 = () -> {
			dummyList.add(String.valueOf(Math.random()));
		};
		
		for(int i = 0; i <= num; i++){
			new Thread(task1).start();
		}


		for (String string : dummyList) {
			System.out.println(string);
		}
	}

}
