package javaimplementation;

public class strings {
	// PROGRAM TO FIND THE LONGEST COMMON  PREFFIX IN A ARRAY OF STRINGS
	public static String longestcommonprefix(String[] strs){
		// to check wheather the string is empty or not
		if(strs==null || strs.length==0){
			return " ";
		}
		//string checker prefix initialised with first element of the array 
		String prefix = strs[0];
		//loop for the traversal of the string 
		for(int i=1;i<strs.length;i++){
			/*loop to check the prefix in consicutive array elements
			 *eg starting from arr[0] and arr[1]
			*/
			while(strs[i].indexOf(prefix)!=0){ 							/*indexOf(prefix): This method call checks the position at which the prefix starts within the string strs[i].
												 						If prefix is a substring of strs[i] that starts at the beginning, indexOf will return 0*/
				prefix=prefix.substring(0,prefix.length()-1); /*
																		 prefix is shortened by one character from the end in each iteration using prefix = prefix.substring(0, prefix.length() - 1)
																		flower and flow will give flow and then flow and flight will give fl														
																		*/
				if(prefix.isEmpty()){
					return "";
				}
			}
		}
		return prefix;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str ={"flower","flow","flight"};
		System.out.println(longestcommonprefix(str));
	}

}
