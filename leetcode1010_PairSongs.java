import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class leetcode1010_PairSongs {

    public int numPairsDivisibleBy60(int[] time) {

        int totalPairs=0;
        int[] timeReduced = new int[time.length];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for(int i=0;i<time.length;i++){
            timeReduced[i] = time[i]%60;
            if(map.get(timeReduced[i]) == null){
                map.put(timeReduced[i],new ArrayList<>());
                map.get(timeReduced[i]).add(i);
            }
            else
               map.get(timeReduced[i]).add(i);
        }

        for(int i=0;i<timeReduced.length;i++){


            int tmp = 60-timeReduced[i];
            if(map.get(tmp) != null){
                ArrayList list = map.get(tmp);
                for(int j=0;j<list.size();j++){
                    if((int)list.get(j) > i){
                        totalPairs++;
                    }
                }

            }

            if((tmp == 60 ||tmp == 0) && map.get(0) != null){
                ArrayList list = map.get(0);
                for(int j=0;j<list.size();j++){
                    if((int)list.get(j) > i){
                        totalPairs++;
                    }
                }
            }
        }

        System.out.println(totalPairs);

        return totalPairs;
    }

    public static void main(String[] args) {
        int[] num = {60,60,60};
        leetcode1010_PairSongs obj = new leetcode1010_PairSongs();
        obj.numPairsDivisibleBy60(num);
    }
}
