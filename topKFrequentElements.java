package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class topKFrequentElements {

	public static List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		List<Integer> arrList = new ArrayList<Integer>();
		int len = nums.length, count = 0;
		for (int i = 0; i < len; i++) {
			if (hMap.get(nums[i]) == null)
				hMap.put(nums[i], 1);
			else
				hMap.put(nums[i], hMap.get(nums[i]) + 1);
		}
		Set<Entry<Integer, Integer>> set = hMap.entrySet();
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
			public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
				return (o2.getValue()).compareTo(o1.getValue());
			}
		});

		for (Map.Entry<Integer, Integer> entry : list) {
			if (count == k)
				break;
			else {
				arrList.add(entry.getKey());
				count++;
			}
		}

		return arrList;
	}

	public static void main(String[] args) {
		int[] arr = { 1,1,1, 3, 2, 3 };
		List<Integer> res = topKFrequent(arr, 2);
		System.out.println(res);
	}
}
