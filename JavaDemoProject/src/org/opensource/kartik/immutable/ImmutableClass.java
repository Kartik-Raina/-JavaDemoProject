package org.opensource.kartik.immutable;

import java.util.ArrayList;
import java.util.List;

public final class ImmutableClass {

	private String str1;
	private String str2;
	private List<String> stringList;
	
	public ImmutableClass(String str1, String str2, List<String> stringList) {
		this.str1 = str1;
		this.str2 =  str2;
		this.stringList = new ArrayList<>();
		for (String string : stringList) {
			this.stringList.add(string);
		}
		//this.stringList = stringList;
	}

	public String getStr1() {
		return str1;
	}

	public String getStr2() {
		return str2;
	}

	public List<String> getStringList() {
		return stringList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((str1 == null) ? 0 : str1.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ImmutableClass other = (ImmutableClass) obj;
		if (str1 == null) {
			if (other.str1 != null)
				return false;
		} else if (!str1.equals(other.str1))
			return false;
		return true;
	}
	
	
}
