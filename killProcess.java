package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class killProcess {

	public static List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
		
		Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
		
		int index = 0;
		for (Integer _ppid : ppid) {
			if(map.get(_ppid) == null){
				Set<Integer> s = new HashSet<>();
				s.add(pid.get(index));
				map.put(_ppid, s);
			}else{
				map.get(_ppid).add(pid.get(index));
			}
			index++;
		}
		
		Set<Integer> resultSet = new HashSet<>();
		resultSet.add(kill);
		Set<Integer> set = map.get(kill);
		if(set!=null){
			resultSet.addAll(set);
			for (Integer s1 : set) {
				if(null != map.get(s1))
					resultSet.addAll(map.get(s1));
				else{
					resultSet.add(s1);
				}
			}
		}
		
		
		
		func(map, kill, resultSet);
		List<Integer> l = new ArrayList<>();
		for (Integer x : resultSet) {
			l.add(x);
		}
		return l;
	}
	
	public static void func(Map<Integer, Set<Integer>> map, Integer kill, Set<Integer> resultSet){
		
		Set<Integer> set = map.get(kill);
		if(set != null){
			resultSet.addAll(set);
			for (Integer killChild : set) {
				func(map,killChild, resultSet);
			}
		}
		else{
			resultSet.add(kill);
		}
	}
	
	

	public static void main(String[] args) {
		
		Integer[] a  = {1, 3, 10, 5};
		Integer[] b = {3, 0, 5 , 3};
		int kill = 0;
		List<Integer> pid = Arrays.asList(a);
		List<Integer> ppid = Arrays.asList(b);
		List<Integer> res = killProcess(pid,ppid,kill);
		System.out.println(res.toString());
	}
}
