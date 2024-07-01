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

	// Program to find the number of distinct element in an array
	public static int diselearr(int[] arr){
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}
		return set.size();
	}

	// program to find the intersection of two array
	public static void intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<>();
	   Set<Integer> set2 = new HashSet<>();
	   
	   for (int num : nums1) {
		   set1.add(num);
	   }
	   
	   for (int num : nums2) {
		   set2.add(num);
	   }
	   
	   set1.retainAll(set2);
	   
	   
	   int[] result = new int[set1.size()];
	   int index = 0;
	   for (int num : set1) {
		   result[index++] = num;
	   }
	   
	  for(int i=0;i<result.length;i++){
		System.out.print(result[i]);
	  }
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

		int arr[] ={1,3,2,5,1,3,1,5,1};
		// majorele(arr);
		// String s="MANAN";
		// String t ="NAMAN";
		// System.out.println(isanagram(s, t));


		//Hashset : unique values , can store null values, implemented using hashmap
		HashSet<String> citites = new HashSet<>();
		citites.add("delhi"); 
		citites.add("bengaluru"); 
		citites.add("gurugram"); 
		citites.add("hydrabad"); 
		Iterator it = citites.iterator();
		// while(it.hasNext()){
		// 	System.out.print(it.next()+" ");
		// }
		//System.out.println();
		//Treeset : unique values , can store null values , implemented using treemap self balancing
		TreeSet<String> cars =new TreeSet<>();
		cars.add("BMW");
		cars.add("PORCHE");
		cars.add("MAHINDRA");
		cars.add("SKODA");
		Iterator<String> cr= cars.iterator();
		// while (cr.hasNext()) {
		// 	System.out.print(cr.next()+" ");
		// }
		
		//System.out.println();
		//Linked hashset :unique , store null values , implemented using linked hashmap , uses linked list , sorted
		LinkedHashSet<String> bikes = new LinkedHashSet<>();
		bikes.add("yamaha");
		bikes.add("honda");
		bikes.add("aprillia");
		bikes.add("kawasaki");
		Iterator<String> bk = bikes.iterator();
		// while(bk.hasNext()){
		// 	System.out.print(bk.next()+" ");
		// }
		//System.out.println(diselearr(arr));
		int nums1[]={7,3,9};
		int nums2[]={6,3,9,2,9,4};
		intersection(nums1, nums2);

	}

}
