import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class leetcode1452_FavouriteCompanies {

    public List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {
        boolean found =false;
        String str;
        int size_i, size_j, listSize = 0;
        List<Integer> indices = new ArrayList<>();
        List<Set<String>> set = new ArrayList<>();
        for(List<String> fav: favoriteCompanies) {
            set.add(new HashSet<>(fav));
        }

        listSize = favoriteCompanies.size();
        for(int i=0;i<listSize;i++) {
            found =false;
            for(int j=0; j<listSize;j++) {
                size_i = set.get(i).size();
                size_j = set.get(j).size();

                if(i != j && size_j >= size_i) {

                    if(set.get(j).containsAll(set.get(i))) {
                        found = true;
                        break;
                    }

                }
            }
            if(found == false)
                indices.add(i);
        }

        System.out.println(indices);
        return indices;
    }

    public static void main(String[] args) {
        leetcode1452_FavouriteCompanies obj = new leetcode1452_FavouriteCompanies();
        List<List<String>> list = new ArrayList<>();
        list.add(0, Arrays.asList("leetcode","google","facebook"));
        list.add(1, Arrays.asList("google","microsoft"));
        list.add(2, Arrays.asList("google","facebook"));
        list.add(3, Arrays.asList("google"));
        list.add(4, Arrays.asList("amazon"));
        obj.peopleIndexes(list);

    }

}
