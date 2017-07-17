package LeetCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class keyboardRow {

	public static String[] findWords(String[] words) {
		
		int len = words.length;
		Set<Character> hSet1 = new HashSet<Character>();
		Set<Character> hSet2 = new HashSet<Character>();
		Set<Character> hSet3 = new HashSet<Character>();
		List<String> lst = new ArrayList<String>();
		
		
		//Set 1
		hSet1.add('Q');hSet1.add('q');
		hSet1.add('W');hSet1.add('w');
		hSet1.add('E');hSet1.add('e');
		hSet1.add('R');hSet1.add('r');
		hSet1.add('T');hSet1.add('t');
		hSet1.add('Y');hSet1.add('y');
		hSet1.add('U');hSet1.add('u');
		hSet1.add('I');hSet1.add('i');
		hSet1.add('O');hSet1.add('o');
		hSet1.add('P');hSet1.add('p');
		
		
		//Set 2
		hSet2.add('A');hSet2.add('a');
		hSet2.add('S');hSet2.add('s');
		hSet2.add('D');hSet2.add('d');
		hSet2.add('F');hSet2.add('f');
		hSet2.add('G');hSet2.add('g');
		hSet2.add('H');hSet2.add('h');
		hSet2.add('J');hSet2.add('j');
		hSet2.add('K');hSet2.add('k');
		hSet2.add('L');hSet2.add('l');
		
		//Set 3
		hSet3.add('Z');hSet3.add('z');
		hSet3.add('X');hSet3.add('x');
		hSet3.add('C');hSet3.add('c');
		hSet3.add('V');hSet3.add('v');
		hSet3.add('B');hSet3.add('b');
		hSet3.add('N');hSet3.add('n');
		hSet3.add('M');hSet3.add('m');
		
		
		for(int i=0;i<len;i++){
			
			int count =0,done=0;
			String str = words[i];
			
			//checking for Set 1
			for(int j=0;j<str.length();j++){
				
				if(!hSet1.contains(str.charAt(j))){
					break;
				}
				count++;
				if(count == str.length()){
					lst.add(str);
					done =1;
				}
			}
			
			count =0;
			
			//checking for Set 2
			if(done == 0)
			for(int j=0;j<str.length();j++){
				
				if(!hSet2.contains(str.charAt(j))){
					break;
				}
				count++;
				if(count == str.length()){
					lst.add(str);
					done =1;
				}
			}
			
			count =0;
			//checking for Set 3
			if(done == 0)
			for(int j=0;j<str.length();j++){
				
				if(!hSet3.contains(str.charAt(j))){
					break;
				}
				count++;
				if(count == str.length()){
					lst.add(str);
					done =1;
				}
			}
			
		}
		
		String[] finalArr = new String[lst.size()];
		for(int k=0;k<lst.size();k++){
			finalArr[k] = lst.get(k);
		}
		return finalArr;
    }
	public static void main(String[] args) {
		String[] arr = {"Hello", "Alaska", "Dad", "Peace"};
		String[] res = findWords(arr);
		for(int i=0;i<res.length;i++){
			
			System.out.println(res[i]);
		}
	}
}
