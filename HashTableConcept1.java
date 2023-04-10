package PracticeCollections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept1 {

	public static void main(String[] args) {
		
		Hashtable hs= new Hashtable();
		hs.put(1, "Lothar");
		hs.put(2, "Mitul");
		hs.put(3, "Naveen");
		
		System.out.println(hs.get(2));
		
		Hashtable hs1= new Hashtable();
		hs1=(Hashtable)hs.clone();
		
		System.out.println("Print all the values from hs"+ hs);
		System.out.println("Print all the values from hs1"+hs1);
		
		hs.clear();
		
		System.out.println("Print all the values from hs"+ hs);
		System.out.println("Print all the values from hs1"+hs1);
		
		
		Hashtable hs2= new Hashtable();
		hs2.put("A","SANDY");
		hs2.put("B", "Prashant");
		hs2.put("C", "Sonia");
		
		if(hs2.contains("SANDY"));
		System.out.println("Value has been found");
		
		Enumeration e= hs2.elements();
		System.out.println("Print the values from hs2");
		
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		System.out.println("Print out all the values using entry set");
		
		Set s=hs2.entrySet();
		System.out.println(s);
		
		
		Hashtable hs3= new Hashtable();
		hs3.put("A","SANDY");
		hs3.put("B", "Prashant");
		hs3.put("C", "Sonia");
		
		if(hs2.equals(hs3)) {
			System.out.println("Both are equal ");
		}
		
		System.out.println(hs2.get("A"));
		
		
		System.out.println("Print has code value of "+hs2.hashCode());
		
		
		
				
		
		
		
		
		
		
		
		
	

	}

}
