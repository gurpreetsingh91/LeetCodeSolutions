package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class summaryRanges {

	public static List<String> summaryRanges(int[] nums) {

		List<String> ls = new ArrayList<String>();
		String tmp = "";
		int len = nums.length;
		if(len == 0)
			return ls;
		
		if (len == 1) {
			tmp = Integer.toString(nums[0]);
			ls.add(""+'"'+tmp+'"');
			return ls;
		}
		
		tmp = '"'+ Integer.toString(nums[0]);
		
		boolean flag = true;
		for (int i = 1; i < len; i++) {
			
			if(nums[i] == nums[i-1]+1){
				continue;
				//tmp = tmp.concat("->"+nums[i]);
			}
			else if(nums[i] != nums[i-1]+1){
				tmp = tmp.concat("->"+nums[i-1]+'"');
				ls.add(tmp);
				tmp = "";
				tmp  = '"'+ Integer.toString(nums[i]);
			}
			
		}
		if(tmp.equals(""+'"'+nums[len-1]))
		  tmp = tmp.concat(""+'"');
		else if(!tmp.equals('"'+nums[len-1]))
			tmp = tmp.concat("->"+nums[len-1]+'"');
		ls.add(tmp);
		
		return ls;
	}

	public static void main(String[] args) {

		int[] arr = { -1 };
		List<String> res = summaryRanges(arr);
		for (int i = 0; i < res.size(); i++) {

			System.out.print(res.get(i) + " ");
		}
	}
}
