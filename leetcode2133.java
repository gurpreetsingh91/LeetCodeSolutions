package Java8;

import java.util.HashSet;
import java.util.Set;

public class leetcode2133 {

    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> hashSetTemp = new HashSet<>();
        for (int k = 1; k <= n; k++) {
            hashSet.add(k);
        }

        for (int j = 0; j < n; j++) {
            hashSetTemp.addAll(hashSet);
            for (int m = 0; m < n; m++) {
                hashSetTemp.remove(matrix[j][m]);
            }
            if (hashSetTemp.size() != 0)
                return false;
        }

        for (int p = 0; p < n; p++) {
            hashSetTemp.addAll(hashSet);
            for (int s = 0; s < n; s++) {
                hashSetTemp.remove(matrix[s][p]);
            }
            if (hashSetTemp.size() != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        leetcode2133 obj = new leetcode2133();
        int[][] matrix = {{1, 1, 1}, {1, 2, 3}, {1, 2, 3}};
        boolean ans = obj.checkValid(matrix);
        System.out.println(ans);
    }
}
