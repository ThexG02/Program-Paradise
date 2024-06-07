
package javaimplementation;
import java.util.*;

public class hashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hm = new HashMap<>(); 
		hm.put("harsh", 1);
		hm.put("sahil", 2);
		hm.put("aastha", 3);
		hm.put("divyansh", 4);
		System.out.println(hm.entrySet());
		Set<String> keys= hm.keySet();
		for (String k : keys) {
			System.out.println(k+","+hm.get(k));
			
		}
		
	}

}
