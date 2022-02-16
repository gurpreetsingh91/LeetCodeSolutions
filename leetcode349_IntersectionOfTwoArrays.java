import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class leetcode349_IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        int temp[], temp2[];
        HashMap<Integer,Integer> hMap = new HashMap<>();
        List<Integer> intersectionList = new ArrayList<>();

        if(nums1.length <= nums2.length) {
            temp = nums2;
            temp2 = nums1;
        }
        else {
            temp = nums1;
            temp2 = nums2;
        }

        for(int i=0;i<temp.length;i++) {
            if(hMap.get(temp[i]) == null) {
               hMap.put(temp[i],1);
            }
            else {
                hMap.put(temp[i], hMap.get(temp[i])+1);
            }
        }

        for(int j=0;j<temp2.length;j++) {

            if(hMap.containsKey(temp2[j]) && hMap.get(temp2[j]) > 0 ){
                intersectionList.add(temp2[j]);
                hMap.put(temp2[j], 0 );
            }

        }

        //tranfering the items from list to Array
        int[] intersectionListArray = new int[intersectionList.size()];
        for (int i =0 ; i < intersectionList.size() ; i++) {
            intersectionListArray[i] = intersectionList.get(i);
        }

        return intersectionListArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1},  nums2 = {2,2};

        leetcode349_IntersectionOfTwoArrays obj = new leetcode349_IntersectionOfTwoArrays();
        int[] res = obj.intersection(nums1,nums2);

    }
}
