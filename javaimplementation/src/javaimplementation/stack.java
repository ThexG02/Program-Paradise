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
public static void main(String[] args) {
Stack <Integer> s = new Stack<>();
s.push(1);
s.push(2);
s.push(3);
pushbtm(s,4);
// while(!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();

// }
System.out.println(strrev("dog"));
	}

}
