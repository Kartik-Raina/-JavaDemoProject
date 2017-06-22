package org.opensource.core;

import org.opensource.core.exception.CustomExceptionClass;

public class ExceptiomMain {

	public static void main(String[] args) {

		try {
			throw new CustomExceptionClass("Exception Message");
		} catch (CustomExceptionClass e) {
			System.out.println(e.getLocalizedMessage());
			e.printStackTrace();
		}
	}

}
