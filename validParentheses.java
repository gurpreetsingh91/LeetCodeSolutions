package LeetCode;

import java.util.Stack;

public class validParentheses {

	public static boolean isValid(String s) {
     
		int len = s.length();
		Stack<Character> stck = new Stack<Character>();
		
		if(len == 0)
			return true;
		
		if(s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')
			return false;
		
		stck.push(s.charAt(0));
		
		for(int i=1;i<len;i++){
			
			if(s.charAt(i) == ')'){
				if(stck.empty())
					return false;
				if(stck.peek() == '(')
					stck.pop();
				else if(stck.peek() == '{')
					return false;
				else if(stck.peek() == '[')
					return false;
			}
			if(s.charAt(i) == '}'){
				if(stck.empty())
					return false;
				if(stck.peek() == '{')
					stck.pop();
				else if(stck.peek() == '(')
					return false;
				else if(stck.peek() == '[')
					return false;
			}
			if(s.charAt(i) == ']'){
				if(stck.empty())
					return false;
				if(stck.peek() == '[')
					stck.pop();
				else if(stck.peek() == '(')
					return false;
				else if(stck.peek() == '{')
					return false;
			}
			
			if(s.charAt(i) == '(')
				stck.push('(');
			else if(s.charAt(i) == '{')
				stck.push('{');
			else if(s.charAt(i) == '[')
				stck.push('[');
		}
		
		if(stck.isEmpty())
			return true;
		else
			return false;
    }
	public static void main(String[] args) {
		String str = "([)]";	
		boolean res = isValid(str);
		System.out.println(res);
	}
}
