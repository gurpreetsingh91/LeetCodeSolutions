package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class minIndexSumOfTwoLists {

	public static String[] findRestaurant(String[] list1, String[] list2) {

		int len1 = list1.length, len2 = list2.length, min = Integer.MAX_VALUE, sum;
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		List<String> lst = new ArrayList<String>();

		for (int i = 0; i < len1; i++) {
			map1.put(list1[i], i);
		}

		for (int j = 0; j < len2; j++) {
			if (map1.containsKey(list2[j])) {
				sum = j + map1.get(list2[j]);

				if (sum < min) {
					lst.clear();
					lst.add(list2[j]);
					min = sum;
				} else if (sum == min) {
					lst.add(list2[j]);
				}
			}

		}
		
		int lenFinal = lst.size();
		String[] res = new String[lenFinal];
		for(int k=0;k<lenFinal ;k++){
			res[k] = lst.get(k);
		}

		return res;
	}

	public static void main(String[] args) {

		String[] strArr1 = {"Shogun", "Tapioca Express", "Burger King", "KFC" };
		String[] strArr2 = { "KFC", "Shogun", "Burger King"};
		String[] res = findRestaurant(strArr1, strArr2);
		for(int i=0;i<res.length;i++){
			System.out.println(res[i]);
		}

	}
}
