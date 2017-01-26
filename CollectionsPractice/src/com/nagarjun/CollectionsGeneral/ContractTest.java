package com.nagarjun.CollectionsGeneral;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContractTest {

	public static void main(String[] args) {
		//Map<EmployeeKey, String> cache = loadEmpCache();
		EmployeeKey ek1 = new EmployeeKey("101", "10101986");
		EmployeeKey ek2 = new EmployeeKey("102", "10101987");
		EmployeeKey ek3 = new EmployeeKey("103", "10101988");
		EmployeeKey ek4 = new EmployeeKey("103", "10101988");
		EmployeeKey ek5 = new EmployeeKey("105", "10101990");
		
		Set<EmployeeKey> set = new HashSet<EmployeeKey>();
		set.add(ek1);
		set.add(ek2);
		set.add(ek3);
		set.add(ek4);
		set.add(ek5);
		
		System.out.println(set);
		/*String empName = cache.get(lookupKey);
		System.out.println(empName);*/
	}
	
	
	/*logic for the hashmap impl..!*/
	/*static Map<EmployeeKey, String> loadEmpCache(){
		EmployeeKey ek1 = new EmployeeKey("100", "10101985");
		EmployeeKey ek2 = new EmployeeKey("101", "10101986");
		EmployeeKey ek3 = new EmployeeKey("102", "10101987");
		Map<EmployeeKey, String> cache = new HashMap<EmployeeKey, String>();
		cache.put(ek1, "Bob");
		cache.put(ek2, "steve");
		cache.put(ek3, "robert");
		return cache;
	}*/
}

