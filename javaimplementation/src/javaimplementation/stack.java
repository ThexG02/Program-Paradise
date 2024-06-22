package javaimplementation;
import java.util.*;


public class stack {

//program to push an element into a stack at the bottom 
public static void pushbtm(Stack<Integer> s, int data) {
	if(s.isEmpty()) {
		s.push(data);
		return;
	}
	int top=s.pop();
	pushbtm(s,data);
	s.push(top);
}

/*program to reverse a stack
data type integer
*/ 

public static void revstack(Stack<Integer> s){
if(s.isEmpty()){
return ;
}
int top =s.pop();
revstack(s);
pushbtm(s, top);
}
//program to reverse a string using  stack
public static String strrev(String str){
	Stack<Character> s = new Stack<>();
	int idx =0;
	while (idx<str.length()) {
		s.push(str.charAt(idx));
		idx++;
	}
	StringBuilder res = new StringBuilder();
	while (!s.isEmpty()) {
		char curr = s.pop();
		res.append(curr);
	}
	str= res.toString();
	return str;
}

// STOCK SPAN PROBLEM
public static void stockspan(int[] stocks, int[]span){
	Stack<Integer> s = new Stack<>();
	span[0]=1;
	s.push(0);
	for(int i=1; i<span.length;i++){
		int currprice =stocks[i];
		while(!s.empty()&& currprice>stocks[s.peek()]){
			s.pop();
		}
		if(s.isEmpty()){
			span[i]=i+1;  // for the last element
		}
		else{
			int prevhigh=s.peek();
			span[i]= i-prevhigh;
		}
		s.push(i);
	}

}
//program to find the next greater element in the right side using stack
public static void nextgtr(int[] arr, int[] nextgtr){
	Stack<Integer> s= new Stack<>();   //new stack 
	  
	for(int i=arr.length-1;i>=0;i--){ /*  loop starts from end to begining because  it will have a track of all the right hand 
										   side values of the next greater*/
		while(!s.isEmpty() && arr[s.peek()]<=arr[i]){ //compare top of stack and the current ith index value of array
			s.pop();
		}
		if(s.isEmpty()){
			nextgtr[i]=-1;				// for the last element of the array
		}
		else{
			nextgtr[i]=arr[s.peek()];			/*assigning the value of the next greater element
												 for the ith elem5t in the array*/
		}
		s.push(i);								//pushing the ith element index to the stack

	}
	for(int i=0;i<nextgtr.length;i++){
		System.out.print(nextgtr[i]+" ");			// printing the nextgreater array
	}
}

// program for the valin parinthesis using stack
public static boolean validparenthesis(String str){
	Stack<Character> s= new Stack<>();
	for(int i=0;i<str.length();i++){
		Character ch =str.charAt(i);
		//opening
		if(ch=='['|| ch=='('||ch=='{'){
			s.push(ch);
		}
		else{
			//closing
			if(s.isEmpty()){
				return false;
			}
			if((ch==']'&&s.peek()=='[')||(ch=='}'&&s.peek()=='{')||(ch==')'&&s.peek()=='(')){
				s.pop();
			}
			else{
				return false;
			}	
		}}
		//to check the string valid with help of stack 
	if(s.isEmpty()){
		return true;
	}
	else{
		return false;
	}
}
public static void main(String[] args) {
Stack <Integer> s = new Stack<>();
s.push(1);
s.push(2);
s.push(3);
//pushbtm(s,4);
// while(!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();

// }
//System.out.println(strrev("dog"));
// System.out.println(s);
// revstack(s);
// System.out.println(s);
// int stock[]={100,80,60,70,60,85,100};
// int span[] = new int[stock.length];
// stockspan(stock, span);
// for(int i =0; i<span.length;i++){
// 	System.out.print(span[i]);
// }
// }
// int []arr ={5,8,0,1,10,7};
// int gtr[]= new int[arr.length]; 
// nextgtr(arr, gtr);
String str ="({[()]}())";
System.out.println(validparenthesis(str));
}
}
