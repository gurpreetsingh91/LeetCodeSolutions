package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class groupAnagrams {

	public static List<List<String>> groupAnagrams(String[] strs) {

		Map<String, List<String>> hMap = new HashMap<String, List<String>>();
		List<List<String>> mainlst = new ArrayList<List<String>>();
		Iterator<List<String>> itr;
		Iterator<String> itr1;

		for (String str : strs) {
			String tempStr = str;
			char[] chars = tempStr.toCharArray();
			Arrays.sort(chars);
			String sorted = new String(chars);

			if (hMap.get(sorted) == null) {

				List<String> subList = new ArrayList<String>();
				subList.add(tempStr);
				hMap.put(sorted, subList);
			} else {
				hMap.get(sorted).add(tempStr);
			}

		}

		Iterator it = hMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			// System.out.println(pair.getKey() + " = " + pair.getValue());
			mainlst.add((List<String>) pair.getValue());
			it.remove(); // avoids a ConcurrentModificationException
		}

		return mainlst;
	}

	public static void main(String[] args) {
		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };
		List<List<String>> res = groupAnagrams(str);

	}
}
