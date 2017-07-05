package org.opensource.kartik.collection;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionTest {

	
	
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		Set<Employee> empSet = new HashSet<>();
		List<Employee> emplList = new ArrayList<>();
		
		emp.setName("Kartik Raina");
		emp.setEmployeeId(5);
		emp.setIsActive(true);
		
		empSet.add(emp);
		emplList.add(emp);
		
		emp = new Employee();
		emp.setName("Vikram Singh");
		emp.setEmployeeId(2);
		emp.setIsActive(false);
		
		empSet.add(emp);
		emplList.add(emp);
		
		emp = new Employee();
		emp.setName("kartik raina");
		emp.setEmployeeId(12);
		emp.setIsActive(false);
		
		empSet.add(emp);
		emplList.add(emp);
		
		System.out.println(empSet.size());
		
		Collections.sort(emplList, new EmployeeCompatator());
		
		System.out.println(emplList.size());
		for (Employee employee : emplList) {
			System.out.println(employee.getName());
		}
		
		String number1 = "112212558474521345815343847866313584314398136584138734386476834364676476";
		String number2 = "112384736143818973896987698718716894163187689179879636514387875456413581";
		
		BigInteger bigInteger1 = new BigInteger(number1.getBytes());
		BigInteger bigInteger3 = new BigInteger(number2.getBytes());
		System.out.println(bigInteger1.add(bigInteger3).toString());
		
		String randonString = "CAE2W3@D#";
		char[] charArraya = randonString.toCharArray();
		Set<Character> testHashSet = new HashSet<>();
		StringBuilder stringBuilderLetter = new StringBuilder();
		StringBuilder stringBuilderDigit = new StringBuilder();
		StringBuilder stringBuilderSc = new StringBuilder();
		
		for (int i = 0; i < charArraya.length; i++) {
			if(Character.isLetter(charArraya[i])){
				stringBuilderLetter.append(charArraya[i]);
			}else if(Character.isDigit(charArraya[i])){
				stringBuilderDigit.append(charArraya[i]);
			}else{
				stringBuilderSc.append(charArraya[i]);
			}
		}
		
		charArraya = stringBuilderLetter.toString().toCharArray();
		Arrays.sort(charArraya);
		int j = 0;
		
		for (int i = 0; i < stringBuilderDigit.length(); i++) {
			j = j + Integer.parseInt(String.valueOf(stringBuilderDigit.charAt(i)));
		}
		System.out.println(new String(charArraya)+String.valueOf(j)+stringBuilderSc.toString());
		//testHashSet.addAll();
		
		/*List<String> testList = new ArrayList<>();
		testList.add("KARTIK");
		testList.add("Raina");
		testList.add("Amar");
		
		ListIterator<String> li = testList.listIterator();
		
		while(li.hasNext()){
			li.next();
			//System.out.println();
			li.remove();
			System.out.println(testList.toString());
		}*/
	}
}
