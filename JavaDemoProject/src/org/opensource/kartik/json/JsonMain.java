package org.opensource.kartik.json;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.opensource.kartik.json.pojo.Address;
import org.opensource.kartik.json.pojo.User;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonMain {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		// Ignore properties that have null values
		mapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
		// Ignore properties that doesn't match
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		//mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
		

		User user = new User();
		List<Address> addressList = new ArrayList<>();
		Address address = new Address();
		address.setHouseNo(171);
		address.setPinCode(134113);
		address.setStreet("sector 12A");

		addressList.add(address);
		
		address = new Address();
		address.setHouseNo(330);
		address.setPinCode(134112);
		address.setStreet("sector 12");
		
		addressList.add(address);
		
		user.setName("Kartik");
		user.setId(1);
		user.setAddresses(addressList);

		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user));

		/*
		 * String data = "{\n" + "  \"id\" : 1,\n" +
		 * "  \"name\" : \"Kartik\",\n" + "  \"address\" : {\n" +
		 * "    \"houseNo\" : 171,\n" + "    \"street\" : \"sector 12A\",\n" +
		 * "    \"pinCode\" : 134113\n" + "  }\n" + "}";
		 */

		String data = "{\n" + "  \"id\" : 1,\n" + "  \"name\" : \"Kartik\",\n" + "  \"address\" : \"\"" + "}";
		;
		user = mapper.readValue(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user), User.class);
		System.out.println(
				mapper.writerWithDefaultPrettyPrinter().writeValueAsString(mapper.readValue(data, User.class)));

	}

}
