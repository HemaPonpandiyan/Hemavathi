package org.projects;

import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Collections_Map {
public static void main(String[] args) {
	Map<Object,Object> m=new LinkedHashMap<Object,Object>();
	
	m.put(1, 3);
	m.put(1, "Dhanu");
	m.put(2, "Dhanvin");
	m.put(0, "Dhanvin");
	System.out.println(m);
	//put(key,value)   ---here key-not allow dup values but value allow dup values
	
	
	System.out.println(m.get(1));  //get the value using index
	System.out.println(m.keySet());   //return only keys and keys not allow dups
	System.out.println(m.values());    //retrun values and value allow dups
	
	
	//to print the key with values in random order
	Set<java.util.Map.Entry<Object, Object>> et=m.entrySet();
			for (java.util.Map.Entry<Object, Object> e:et) {
				System.out.println(e);
			}
}
}
