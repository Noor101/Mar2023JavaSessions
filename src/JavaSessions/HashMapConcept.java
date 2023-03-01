package JavaSessions;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {


		//key-value

		HashMap<String, String> empMap = new HashMap<String, String>();
		empMap.put("A", "Raji");
		empMap.put("B", "Hector");
		empMap.put("C", "Prince");
		empMap.put("D", "Rani");

		System.out.println(empMap);
		System.out.println(empMap.get("C"));

		System.out.println(empMap.size());


		//To iterate we are using lambs ->
		empMap.forEach((k, v) -> System.out.println(k+ " : " + v));
		
		HashMap<Integer, String> stuMap = new HashMap<Integer, String>();
		
		stuMap.put(101, "Lisa");
		stuMap.put(102, "Rahman");
		stuMap.put(103, "Raj");
		stuMap.put(104, "Ina");
		stuMap.put(105, "Rachael");
		
		System.out.println(stuMap.get(105));
	}

}
