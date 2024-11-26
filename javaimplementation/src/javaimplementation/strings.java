package javaimplementation;

public class strings {

	//Program to check whether the entered string is pallindrome or not 
	public static boolean pallindrome(String str){
		for(int i =0;i<str.length();i++){
			int n = str.length();
			if(str.charAt(i)!=str.charAt(n-i-1)){
				return false;
			}
		}
		return true;
	}
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

	// program to find the shortest path between the two points string:"WNEENESENNN"
	/*
	 N=Y++;
	 S=Y--;
	 W=X--;
	 E=X++;
	 */
	public static float Sp(String str){
		int x=0;
		int y =0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='N'){
				y++;
			}
			else if(str.charAt(i)=='E'){
				x++;
			}
			else if(str.charAt(i)=='W'){
				x--;
			}
			else{
				y--;
			}
		}
		return (float)Math.sqrt(((x*x)+(y*y)));
	}
	//Program to convert each first letter of every word to uppercase
	public static String uppercaseconv(String str){
		StringBuilder sb = new StringBuilder("");
		Character ch = Character.toUpperCase(str.charAt(0));
		sb.append(ch);
		for(int i=1; i<str.length();i++){
			if(str.charAt(i)==' '&& i<str.length()-1){
				sb.append(str.charAt(i));
			
			i++;
			sb.append(Character.toUpperCase(str.charAt(i)));
			}
			else{
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();

	}

	//program to return the compressed string 
	//abbcccdddd - ab2c3d4
	public static String StrCmprs(String str){
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<str.length();i++){
			int count =1;
			
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
				count++;
				i++;
			}
			sb.append(str.charAt(i));
			if(count>1){
			sb.append(count);}

		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str ={"flower","flow","flight"};
		//System.out.println(longestcommonprefix(str));
		String Name ="Harsh";
		String Name2 ="naman";
		// for(int x =0;x<Name.length();x++){
		// 	System.out.println(Name.charAt(x));
		// }
		//String strq ="NS";
		//System.out.println(pallindrome(Name2));
		//System.out.println(Sp(strq));

		// String str1="i am bhardwaj";
		// System.out.println(uppercaseconv(str1));
		String str2="abbcccdddd";
		System.out.println(StrCmprs(str2));
	}

}
