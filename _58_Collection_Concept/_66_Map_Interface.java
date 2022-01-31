package com.Concepts.Collection_Concept;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class _66_Map_Interface {

	public static void main(String[] args) {

//                                            Map Interface
// In Map Interface we can give only key and value (key, value).
// Key will define what kind of value that is.
// key can't repeat , values can repeat.
		
//                                         HashMap in Map Interface
// HashMap will not give values in Sequence.
		/*
		Map<String, String> values= new HashMap<>();  // HashMap implements Map open Declaration of HashMap
		values.put("MyName", "Raja");  
		values.put("Actor", "Vijay");  // values.put(key, value);
		values.put("Dish", "Chicken");
		values.put("Games", "ClashOfClans");
		
		System.out.println(values);
		*/
		/*
		output:
		{MyName=Raja, Actor=Vijay, Games=ClashOfClans, Dish=Chicken}
		 */
		
		/*
		Map<String, String> values= new HashMap<>();  // HashMap implements Map
		values.put("MyName", "Raja");
		values.put("Actor", "Vijay");  // values.put(key, value);
		values.put("Dish", "Chicken");
		values.put("Games", "ClashOfClans");
		
		System.out.println(values.get("MyName"));
		System.out.println(values.get("Actor2")); // there is no key for "Actor2" then it will "null"
		*/
		/*
		output:
		Raja
		null	
		 */
		
//                                      key can't repeat , values can repeat.
		
		Map<String, String> values= new HashMap<>();  // HashMap implements Map open Declaration of HashMap
		values.put("MyName", "Ajith");
		values.put("Actor", "Vijay");  // values.put(key, value);
		values.put("Dish", "Chicken");
		values.put("Games", "ClashOfClans");
		values.put("Actor", "Ajith"); 
		
		Set<String> keys= values.keySet();
		
		for(String key:keys) {
			System.out.println(key + " "+values.get(key));
		}
		
		/*
		output:
		MyName Ajith
        Actor Ajith  // key can't repeat , values can repeat.
		Games ClashOfClans
		Dish Chicken
		 */
		
//                                             HashTable in Map Interface
// HashTable is Synchronized.
// HashMap is not Synchronized.
		/*
		Map<String, String> values= new Hashtable<>();  // Hashtable also implements Map open Declaration of Hashtable
		values.put("MyName", "Ajith");
		values.put("Actor", "Vijay");  // values.put(key, value);
		values.put("Dish", "Chicken");
		values.put("Games", "ClashOfClans");
		values.put("Actor", "Ajith"); 
		
		Set<String> keys= values.keySet();
		
		for(String key:keys) {
			System.out.println(key + " "+values.get(key));
		}*/
		
		/*
		output:
		Actor Ajith
		MyName Ajith
		Games ClashOfClans
		Dish Chicken
		 */
	}
}
