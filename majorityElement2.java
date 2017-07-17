package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class majorityElement2 {

	public static List<Integer> majorityElement(int[] nums) {

		int len = nums.length, factor;
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		List<Integer> list = new ArrayList<Integer>();
		factor = len / 3;
		for (int i = 0; i < len; i++) {
			if (hMap.get(nums[i]) == null) {
				hMap.put(nums[i], 1);
			} else
				hMap.put(nums[i], hMap.get(nums[i]) + 1);
		}

		// iterating the hashMap
		Iterator it = hMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			if ((int) pair.getValue() > factor) {
				list.add((int) pair.getKey());
			}
			//System.out.println(pair.getKey() + " = " + pair.getValue());
			it.remove(); // avoids a ConcurrentModificationException
		}
		return list;
	}

	public static void main(String[] args) {

		int[] arr = { 7, 3, 4, 5, 3, 3, 7, 2, 3, 7, 7, 8 };
		List<Integer> res = majorityElement(arr);
		Iterator it = res.iterator();
		while(it.hasNext()){
			System.out.println(it.next() + " ");
		}

	}
}
