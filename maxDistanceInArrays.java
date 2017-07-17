package LeetCode;

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class maxDistanceInArrays {

	public static int maxDistance(List<List<Integer>> arrays) {

		int len = arrays.size();
		int min = arrays.get(0).get(0), max = arrays.get(0).get(0);
		int arrNum = 0;

		for (int i = 0; i < len; i++) {

			List<Integer> temp = arrays.get(i);
			int tmpLen = temp.size();

			for (int j = 0; j < tmpLen; j++) {

				if (temp.get(j) > max && arrNum != i){
					max = temp.get(j);
					arrNum = !
				}
					

				if (temp.get(j) < min)
					min = temp.get(j);
			}

		}

		return max - min;
	}

	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list2.add(4);
		list2.add(5);
		list3.add(1);
		list3.add(2);
		list3.add(3);
		list.add(list1);
		list.add(list2);
		list.add(list3);

		int res = maxDistance(list);
		System.out.println(res);

	}
}
