package javaimplementation;
import java.util.*;

public class hashmaps {

	//Program to find the majority element
	public static void majorele(int [] arr){
		HashMap<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<arr.length;i++){
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
		}
		for(Integer key : map.keySet()){
			if(map.get(key)>arr.length/3){
				System.out.println(key);
			}
		}
	} 

	//Program to check wheather two strings are valid anagram of each other or not
	public static boolean isanagram(String s ,String t){
		HashMap<Character, Integer> map =new HashMap<>();
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(int i=0;i<t.length();i++){
			char ch = t.charAt(i);
			if(map.get(ch)!=null){
				if(map.get(ch)==1){
					map.remove(ch);
				}
				else{
					map.put(ch, map.getOrDefault(ch, 0)-1);
				}
			}
			else{
				return false;
			}
		}
		return map.isEmpty();
	} 

	public static void main(String[] args) {
		//HashMap : the key value insertion is in random order
		HashMap<String,Integer> hm = new HashMap<>(); 
		hm.put("harsh", 1);
		hm.put("sahil", 2);
		hm.put("aastha", 3);
		hm.put("divyansh", 4);
		//System.out.println(hm.entrySet());
		//Set<String> keys= hm.keySet();
		// for (String k : keys) {
		// 	System.out.println(k+","+hm.get(k));
			
		// }

		//Linked HashMap :the key value insertion is in ordered manner
		LinkedHashMap<String,Integer> lm = new LinkedHashMap<>();
		lm.put("A", 1); 
		lm.put("B", 59); 
		lm.put("C", 4); 
		lm.put("D", 10); 
		//Set<String> keyslm=lm.keySet();
		//System.out.println(lm.entrySet());
		// for(String k: keyslm){
		// 	System.out.println(k+","+lm.get(k));
		// }


		/*Tree-Map : key value insertion is ordered manner or in sorted manner ,
		 hence these are self balancing hashmaps*/ 
		TreeMap<String,Integer> tm = new TreeMap<>();
		tm.put("a", 69);
		tm.put("b", 4);
		tm.put("c", 1000);
		tm.put("d", 45);
		//System.out.println(tm.entrySet());	
		//Set<String> keytm = tm.keySet();
		// for(String k: keystm){
		// 	System.out.println(k+","+lm.get(k));
		// }

		// int arr[] ={1,3,2,5,1,3,1,5,1};
		// majorele(arr);
		String s="MANAN";
		String t ="NAMAN";
		System.out.println(isanagram(s, t));
		
	}

}
